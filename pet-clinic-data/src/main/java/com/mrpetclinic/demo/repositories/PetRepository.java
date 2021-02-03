package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
