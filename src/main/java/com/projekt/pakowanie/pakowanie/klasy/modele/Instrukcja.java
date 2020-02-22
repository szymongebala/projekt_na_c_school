package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;

@Entity

public class Instrukcja {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Long id;
@Column
    private String nazwaInstrukcji;


@ManyToOne
@JoinColumn(name="Preservation")
    private Preservation preservation;
@ManyToOne

    private BoxMaterial boxMaterial;

public Instrukcja(){}
    public Instrukcja(String nazwaInstrukcji) {
        this.nazwaInstrukcji = nazwaInstrukcji;
    }

    public Instrukcja(String nazwaInstrukcji, BoxMaterial rodzaj, Preservation rodzajPreservation) {
    }

    public String getNazwaInstrukcji() {
        return nazwaInstrukcji;
    }

    public Preservation getPreservation() {
        return preservation;
    }

    public void setPreservation(Preservation preservation) {
        this.preservation = preservation;
    }



    public BoxMaterial getBoxMaterial() {
        return boxMaterial;
    }

    public void setBoxMaterial(BoxMaterial boxMaterial) {
        this.boxMaterial = boxMaterial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Instrukcja)) return false;
     Instrukcja other=(Instrukcja) o;
        return id!=null&&id.equals(other.getId());


    }
    @Override
    public String toString() {
        return "Instrukcja{" +
                "id=" + id +
                ", name='" + nazwaInstrukcji + '\'' +
                "}";

    }
    @Override
    public int hashCode(){return 31;}
}

