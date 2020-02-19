package com.projekt.pakowanie.pakowanie.klasy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public  class  Skrzynia {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long id;
    public int dlugoscSkrzyni;
    public int szerokoscSkrzyni;
    public int wysokoscSkrzyni;
    public double powierzchniaSkrzyni;
    public double objetoscSkrzyni;

    public Skrzynia(){}

         public Skrzynia(int dlugoscSkrzyni, int szerokoscSkrzyni, int wysokoscSkrzyni) {

        this.dlugoscSkrzyni = dlugoscSkrzyni;
        this.szerokoscSkrzyni = szerokoscSkrzyni;
        this.wysokoscSkrzyni = wysokoscSkrzyni;

    }
   private double PowierzchniaSkrzyni(int dlugoscSkrzyni,int szerokoscSkrzyni,int wysokoscSkrzyni){
             powierzchniaSkrzyni=2*(dlugoscSkrzyni*wysokoscSkrzyni)+2*(szerokoscSkrzyni*wysokoscSkrzyni)+2*(szerokoscSkrzyni*dlugoscSkrzyni);
             return powierzchniaSkrzyni;


   }
   private double ObjetoscSkrzyni(int dlugoscSkrzyni,int szerokoscSkrzyni,int wysokoscSkrzyni){
         objetoscSkrzyni=wysokoscSkrzyni*dlugoscSkrzyni*szerokoscSkrzyni;
         return objetoscSkrzyni;
         }


}
