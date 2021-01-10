package com.mrpetclinic.demo.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    // Accepts type object as we do not know what is coming in
    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    // Map.entrySet method returns a collection-view of the map, whose elements are of this class
    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
