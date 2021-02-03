package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
