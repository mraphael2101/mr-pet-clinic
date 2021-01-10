package com.mrpetclinic.demo.services;

import java.util.Set;

/* 1) This is a common interface that accepts a type using Java Generics and an id.
 * 2) Check the CrudRepository interface to see what is available.
 * 3) This CrudService is mimicking the Spring Data Repository for a sub-set of methods that we want.
 *    Now all our Service Interfaces are going to inherit these methods */


public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
