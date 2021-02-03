package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
