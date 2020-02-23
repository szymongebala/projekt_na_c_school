package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;
import java.util.List;

@Entity

public class Instrukcja {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Long id;
@Column
private String nazwaInstrukcji;




@OneToMany(mappedBy="instrukcja")
private List<Projekt> projekty;












    public Instrukcja(){}
    public Instrukcja(String nazwaInstrukcji) {
        this.nazwaInstrukcji=nazwaInstrukcji;
    }

    public Instrukcja(String nazwaInstrukcji, BoxMaterial rodzaj, Preservation rodzajPreservation) {
   }

    public String getNazwaInstrukcji() {
        return nazwaInstrukcji;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Projekt> getProjekty() {
        return projekty;
    }

    public void setProjekty(List<Projekt> projekty) {
        this.projekty = projekty;
    }

    public void setNazwaInstrukcji(String nazwaInstrukcji) {
        this.nazwaInstrukcji = nazwaInstrukcji;
    }

    public Instrukcja(List <Projekt> projekty) {
        this.projekty = projekty;
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

