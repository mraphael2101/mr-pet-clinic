package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.PetType;
import com.mrpetclinic.demo.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service // Add this annotation to ensure that the class gets wired up into the Spring context
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
