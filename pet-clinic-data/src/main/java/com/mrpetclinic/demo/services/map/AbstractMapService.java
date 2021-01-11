package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    /* Generics has been used for T which could be any type of object for the Map's value attribute.
     * However, Long has been used for the Map's key attribute which is just a Wrapper class.  */
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    // Accepts type object as we do not know what is coming in
    T save(T object) {
        // By making a Generics object of type T extend BaseEntity you are able to access its methods
        if(object != null) {
            if(object.getId() == null)
                object.setId(getNextId());

            // Set the id to the next value
            map.put(object.getId(), object);
        }
        else
            throw new RuntimeException("Object cannot be null");

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    // Map.entrySet method returns a collection-view of the map, whose elements are of this class
    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId = null;

        try
        {
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException ex) {
            nextId = 1L;    // Will happen if map is empty and has not been initialised
        }
        return nextId;
    }

}
