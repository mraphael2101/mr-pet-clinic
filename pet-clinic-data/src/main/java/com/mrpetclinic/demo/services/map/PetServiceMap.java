package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.Pet;
import com.mrpetclinic.demo.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

// A concrete class
@Service    // this annotation makes the class a managed Spring bean so that it will be brought into the Spring context
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
