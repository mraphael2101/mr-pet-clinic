package com.mrpetclinic.demo.services;

import com.mrpetclinic.demo.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
