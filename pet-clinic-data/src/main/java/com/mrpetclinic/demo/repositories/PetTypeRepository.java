package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
