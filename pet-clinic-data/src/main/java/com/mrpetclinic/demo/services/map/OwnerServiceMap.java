package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.Owner;
import com.mrpetclinic.demo.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;


// A concrete class
@Service    // this annotation makes the class a managed Spring bean so that it will be brought into the Spring context
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
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
