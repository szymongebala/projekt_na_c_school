package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;

@Entity
public  class  Skrzynia {

    @Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column
private Long id;

    private int dlugoscSkrzyni;
    private int szerokoscSkrzyni;
    private int wysokoscSkrzyni;
    private int ilosc;

    public Skrzynia() {
    }

    public Skrzynia(int dlugoscSkrzyni,int szerokoscSkrzyni, int wysokoscSkrzyni,int ilosc) {
        this.dlugoscSkrzyni = dlugoscSkrzyni;
        this.szerokoscSkrzyni = szerokoscSkrzyni;
        this.wysokoscSkrzyni = wysokoscSkrzyni;
        this.ilosc=ilosc;

    }

    public Skrzynia(int dlugoscSkrzyni) {
        this.dlugoscSkrzyni = dlugoscSkrzyni;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Skrzynia(Projekt projekt) {
        this.projekt = projekt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDlugoscSkrzyni() {
        return dlugoscSkrzyni;
    }

    public void setDlugoscSkrzyni(int dlugoscSkrzyni) {
        this.dlugoscSkrzyni = dlugoscSkrzyni;
    }

    public int getSzerokoscSkrzyni() {
        return szerokoscSkrzyni;
    }

    public void setSzerokoscSkrzyni(int szerokoscSkrzyni) {
        this.szerokoscSkrzyni = szerokoscSkrzyni;
    }

    public int getWysokoscSkrzyni() {
        return wysokoscSkrzyni;
    }

    public void setWysokoscSkrzyni(int wysokoscSkrzyni) {
        this.wysokoscSkrzyni = wysokoscSkrzyni;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }

    @ManyToOne()
        private Projekt projekt;





    @Override
    public String toString() {
        return "Skrzynia{" +
                "id=" + id +
                ", dlugosc='" + dlugoscSkrzyni + " , szeroksoc= "+szerokoscSkrzyni+",wysokosc= "+wysokoscSkrzyni+'\'' +
                "}";

    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Skrzynia)) return false;
     Skrzynia other=(Skrzynia)o;
        return id!=null&&id.equals(other.getId());


    }

    @Override
    public int hashCode(){return 31;}
}



