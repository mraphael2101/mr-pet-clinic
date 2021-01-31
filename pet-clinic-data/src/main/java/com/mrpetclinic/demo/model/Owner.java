package com.mrpetclinic.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners") // Sets up a table inside the database known as owner
public class Owner extends Person {

    @Column(name ="address")
    private String address;

    @Column(name ="city")
    private String city;

    @Column(name ="telephone")
    private String telephone;

    // Setting up a relationship. Cascade type means if I delete an owner it will delete their pets i.e., cascade down
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
