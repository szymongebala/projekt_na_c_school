package com.projekt.pakowanie.pakowanie.klasy;

import javax.persistence.*;
import java.util.List;
@Entity
public class Projekt {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    public Long id;
    @OneToOne
    @JoinColumn(name="nazwaIndtrukcji", referencedColumnName = "id")
    public Instrukcja nazwaInstrukcji; //nazwa instrukcji
    public String nazwaProjektu; //Nazwa projektu

    public Projekt(String nazwaProjektu, Instrukcja nazwaInstrukcji) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instrukcja getNazwaInstrukcji() {
        return nazwaInstrukcji;
    }

    public void setNazwaInstrukcji(Instrukcja nazwaInstrukcji) {
        this.nazwaInstrukcji = nazwaInstrukcji;
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

    public Projekt() {   }

    public Projekt(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
    }





}
