package com.projekt.pakowanie.pakowanie.klasy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preservation {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public String nazwa;
    public enum rodzajPreservation{VCI,ALU,NONE}
    public Preservation(){}
}
