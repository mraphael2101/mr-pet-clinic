package com.mrpetclinic.demo.bootstrap;

import com.mrpetclinic.demo.model.Owner;
import com.mrpetclinic.demo.model.Pet;
import com.mrpetclinic.demo.model.PetType;
import com.mrpetclinic.demo.model.Vet;
import com.mrpetclinic.demo.services.OwnerService;
import com.mrpetclinic.demo.services.PetTypeService;
import com.mrpetclinic.demo.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {
    
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // Constructor based dependency injection to Spring App Context - Inversion of Control
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mark");
        owner1.setLastName("West");
        owner1.setAddress("3 Park Lane");
        owner1.setCity("London");
        owner1.setTelephone("0208 123 123");

        Pet marksPet = new Pet();
        marksPet.setPetType(savedDogPetType);
        marksPet.setOwner(owner1);
        marksPet.setBirthDate(LocalDate.now());
        marksPet.setName("Minty man");
        owner1.getPets().add(marksPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Read");
        owner2.setAddress("3 Grosvner Rd");
        owner2.setCity("Manchester");
        owner2.setTelephone("01593 200150");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedDogPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Hoover Junior");
        owner2.getPets().add(fionasCat);
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
