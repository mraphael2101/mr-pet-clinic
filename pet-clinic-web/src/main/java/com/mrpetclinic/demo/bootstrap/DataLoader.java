package com.mrpetclinic.demo.bootstrap;

import com.mrpetclinic.demo.model.Owner;
import com.mrpetclinic.demo.model.Vet;
import com.mrpetclinic.demo.services.OwnerService;
import com.mrpetclinic.demo.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    
    private final OwnerService ownerService;
    private final VetService vetService;

    // Constructor based dependency injection to Spring App Context - Inversion of Control
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Weston");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Joe");
        owner2.setLastName("Blogs");

        ownerService.save(owner2);
        System.out.println("Loaded owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessica");
        vet2.setLastName("Clement");

        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}
