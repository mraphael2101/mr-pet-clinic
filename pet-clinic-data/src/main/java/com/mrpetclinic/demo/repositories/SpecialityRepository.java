package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
