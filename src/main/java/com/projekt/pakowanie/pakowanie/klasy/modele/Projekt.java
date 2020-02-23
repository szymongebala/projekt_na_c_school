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

    public List<Skrzynia> getListaSkrzyn() {
        return listaSkrzyn;
    }

    public void setListaSkrzyn(List<Skrzynia> listaSkrzyn) {
        this.listaSkrzyn = listaSkrzyn;
    }

    public boolean isRysunki() {
        return rysunki;
    }

    public void setRysunki(boolean rysunki) {
        this.rysunki = rysunki;
    }

    public Double getKoszt() {
        return Koszt;
    }

    public void setKoszt(Double koszt) {
        Koszt = koszt;
    }




    @OneToMany(mappedBy="id",cascade = CascadeType.ALL,orphanRemoval = true)
    public List<Skrzynia> listaSkrzyn;//lista skrzyńs w projekcie
    boolean rysunki;//czy rysunki dostarczono
    Double Koszt;//koszt projektu


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





