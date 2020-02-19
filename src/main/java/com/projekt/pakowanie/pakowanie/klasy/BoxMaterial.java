package com.projekt.pakowanie.pakowanie.klasy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoxMaterial {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long id;
    public String nazwa;
    public enum rodzaj{solid,osb,plywood}
    public BoxMaterial(){}

}
