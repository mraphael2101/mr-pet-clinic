package com.mrpetclinic.demo.services.map;

import com.mrpetclinic.demo.model.Vet;
import com.mrpetclinic.demo.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

// A concrete class
@Service    // this annotation makes the class a managed Spring bean so that it will be brought into the Spring context
public class VetServiceMap  extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}