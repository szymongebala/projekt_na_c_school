package com.projekt.pakowanie.pakowanie.klasy;

import javax.persistence.*;

@Entity
public class Instrukcja {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long id;
    public String nazwaInstrukcji;
    @OneToOne
    @JoinColumn(name="nazwa", referencedColumnName = "id")
    public Preservation preservation;
    @OneToOne
    @JoinColumn(name="nazwa", referencedColumnName = "id")
    public BoxMaterial boxMaterial;
   public  Boolean additional;
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

    public Boolean getAdditional() {
        return additional;
    }

    public void setAdditional(Boolean additional) {
        this.additional = additional;
    }

    public BoxMaterial getBoxMaterial() {
        return boxMaterial;
    }

    public void setBoxMaterial(BoxMaterial boxMaterial) {
        this.boxMaterial = boxMaterial;
    }
}
