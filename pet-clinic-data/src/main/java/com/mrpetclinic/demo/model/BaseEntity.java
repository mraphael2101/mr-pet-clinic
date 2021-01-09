package com.mrpetclinic.demo.model;

import java.io.Serializable;

/* Reminder: Serialization is a mechanism for converting an object into a byte stream.
   Deserialization is the reverse process where the byte stream is used to recreate the
   actual object in memory.

   BaseEntity is a JPA concept in where we have specific annotations */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
