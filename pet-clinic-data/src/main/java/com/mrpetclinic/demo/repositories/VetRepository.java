package com.mrpetclinic.demo.repositories;

import com.mrpetclinic.demo.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
