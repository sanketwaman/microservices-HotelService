package com.microservice.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "hotels")
public class Hotel {
    @Id
    private String id;
    private String name;
    private String  location;
    private String about;

}
