package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;

@Entity
public  class  Skrzynia {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
    private int dlugoscSkrzyni;
    private int szerokoscSkrzyni;
    private int wysokoscSkrzyni;
private double powierzchniaSkrzyni;
private double objetoscSkrzyni;
private int ilosc;
@ManyToOne
private Projekt projekt;

    public Skrzynia(){}

         public Skrzynia(int dlugoscSkrzyni, int szerokoscSkrzyni, int wysokoscSkrzyni,int ilosc) {

        this.dlugoscSkrzyni = dlugoscSkrzyni;
        this.szerokoscSkrzyni = szerokoscSkrzyni;
        this.wysokoscSkrzyni = wysokoscSkrzyni;
        this.ilosc=ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Skrzynia(Long id, int dlugoscSkrzyni, int szerokoscSkrzyni, int wysokoscSkrzyni) {
    }

    public Long getId() {
        return id;
    }

public double PowierzchniaSkrzyni(int dlugoscSkrzyni, int szerokoscSkrzyni, int wysokoscSkrzyni){
             powierzchniaSkrzyni=2*(dlugoscSkrzyni*wysokoscSkrzyni)+2*(szerokoscSkrzyni*wysokoscSkrzyni)+2*(szerokoscSkrzyni*dlugoscSkrzyni);
             return powierzchniaSkrzyni;


   }
public double ObjetoscSkrzyni(int dlugoscSkrzyni,int szerokoscSkrzyni,int wysokoscSkrzyni){
         objetoscSkrzyni=wysokoscSkrzyni*dlugoscSkrzyni*szerokoscSkrzyni;
         return objetoscSkrzyni;
         }
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



