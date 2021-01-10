package com.mrpetclinic.demo.services;

import com.mrpetclinic.demo.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
