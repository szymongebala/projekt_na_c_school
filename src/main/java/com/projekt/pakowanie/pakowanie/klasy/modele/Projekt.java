package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;
import java.util.List;

@Entity
public class Projekt {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;

    @Column
   private String nazwaProjektu; //Nazwa projektu


    public Instrukcja getInstrukcja() {
        return instrukcja;
    }

    public void setInstrukcja(Instrukcja instrukcja) {
        this.instrukcja = instrukcja;
    }

    @ManyToOne()
private Instrukcja instrukcja;


    public Projekt() {   }

    public Projekt(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
    }

    public Projekt(List<Skrzynia> skrzynia) {
        this.skrzynia = skrzynia;
    }

    public List<Skrzynia> getSkrzynia() {
        return skrzynia;
    }

    public void setSkrzynia(List<Skrzynia> skrzynia) {
        this.skrzynia = skrzynia;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNazwaProjektu() {
        return nazwaProjektu;
    }

    public void setNazwaProjektu(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
    }







    public int getKoszt() {
        return Koszt;
    }

    public void setKoszt(int koszt) {
        Koszt = koszt*1000;
    }

    @OneToMany(mappedBy="id",cascade = CascadeType.ALL,orphanRemoval = true)
    public List<Skrzynia> skrzynia;//lista skrzyńs w projekcie

int Koszt;


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + nazwaProjektu + '\'' +
                "}";

    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Projekt)) return false;
       Projekt other=(Projekt) o;
        return id!=null&&id.equals(other.getId());


    }
    @Override
    public int hashCode(){return 31;}
}





