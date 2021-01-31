package com.mrpetclinic.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/* BaseEntity is a JPA concept that has specific annotations.
   Reminder: Serialization is a mechanism for converting an object into a byte stream.
   Deserialization is the reverse process where the byte stream is used to recreate the
   actual object in memory.
*/

// Establishes this class as a Base Class for JPA
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
