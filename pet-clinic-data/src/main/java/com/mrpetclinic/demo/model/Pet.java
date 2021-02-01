package com.mrpetclinic.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "pets") // Sets up a table inside the database known as owner
public class Pet extends BaseEntity {

    @Column(name ="name")
    private String name;

    // A PetType has many Pets associated to it
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    // An Owner can have 1..* Pets associated to it
    // Informs Hibernate/JPA how to do the mapping i.e, At db level there will be an owner_id property on the pet record
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name ="birth_date")
    private LocalDate birthDate;

    // A Pet can VISIT a vet multiple times
    // Each visit will become an individual attribute of a pet
    // Setting up a relationship. Cascade type means if I delete a Pet the associated visit records for the pet will also get deleted i.e., cascade down
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
