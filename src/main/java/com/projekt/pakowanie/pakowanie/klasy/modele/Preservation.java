package com.projekt.pakowanie.pakowanie.klasy.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projekt.pakowanie.pakowanie.klasy.type.PreservationEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class Preservation {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
private String nazwa;
@Enumerated(EnumType.STRING)
private PreservationEnum preservationEnum;
@OneToMany(mappedBy="preservation")
@JsonIgnore
private List<Instrukcja> instrukcja;

    public List<Instrukcja> getInstrukcja() {
        return instrukcja;
    }

    public void setInstrukcja(List<Instrukcja> instrukcja) {
        this.instrukcja = instrukcja;
    }

    public Preservation(){}

    public Preservation(Long id) {
        this.id = id;
    }

    public Preservation(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PreservationEnum getPreservationEnum() {
        return preservationEnum;
    }

    public void setPreservationEnum(PreservationEnum preservationEnum) {
        this.preservationEnum = preservationEnum;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Preservation)) return false;
      Preservation other=(Preservation) o;
        return id!=null&&id.equals(other.getId());


    }
    @Override
    public String toString() {
        return "Preservation{" +
                "id=" + id +
                ", name='" + nazwa + '\'' +
                "}";

    }
    @Override
    public int hashCode(){return 31;}

}

