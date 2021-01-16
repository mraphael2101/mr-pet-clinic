package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.Owner;
import com.mrpetclinic.demo.model.Pet;
import com.mrpetclinic.demo.services.OwnerService;
import com.mrpetclinic.demo.services.PetService;
import com.mrpetclinic.demo.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;


// A concrete class
@Service    // this annotation makes the class a managed Spring bean so that it will be brought into the Spring context
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    // Set ids for Pet and PetType
    @Override
    public Owner save(Owner object) {
        if(object != null) {
            if (object.getPets() != null)
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null) {
                        // Persist PetType to Pet Object
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                    else
                        throw new RuntimeException("Pet Type is required");

                    if(pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            return super.save(object);
        }
        else
            return null;
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
