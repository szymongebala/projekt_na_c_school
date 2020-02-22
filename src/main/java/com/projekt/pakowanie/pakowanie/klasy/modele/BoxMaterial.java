package com.projekt.pakowanie.pakowanie.klasy.modele;

import com.projekt.pakowanie.pakowanie.klasy.type.BoxMaterialEnum;

import javax.persistence.*;

@Entity

public class BoxMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nazwa;
    @Column
    @Enumerated(EnumType.STRING)
    private BoxMaterialEnum boxMaterialEnum;

    public BoxMaterial() {

    }

    public BoxMaterial(String nazwa) {
        this.nazwa = nazwa;
    }

    public BoxMaterial(String nazwa, BoxMaterialEnum boxMaterialEnum) {
        this.nazwa = nazwa;
        this.boxMaterialEnum = boxMaterialEnum;
    }

    public Long getId() {
        return id;
    }

    public BoxMaterialEnum getBoxMaterialEnum() {
        return boxMaterialEnum;
    }

    public void setBoxMaterialEnum(BoxMaterialEnum boxMaterialEnum) {
        this.boxMaterialEnum = boxMaterialEnum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    @Override
    public int hashCode(){return 31;}
    @Override
    public String toString() {
        return "BoxMaterial{" +
                "id=" + id +
                ", name='" + nazwa + '\'' +
                "}";
}

@Override
    public boolean equals(Object o){
      if(this==o)return true;
      if(!(o instanceof BoxMaterial)) return false;
      BoxMaterial other=(BoxMaterial)o;
      return id!=null&&id.equals(other.getId());


}

}
