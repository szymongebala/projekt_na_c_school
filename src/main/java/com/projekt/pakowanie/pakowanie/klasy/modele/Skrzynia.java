package com.projekt.pakowanie.pakowanie.klasy.modele;

import javax.persistence.*;

@Entity
public class Skrzynia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private Long Id;


	private Long dlugoscSkrzyni;
	private Long szerokoscSkrzyni;
	private Long wysokoscSkrzyni;
	private Long ilosc;


	@ManyToOne()
	private Projekt projekt;

	public Skrzynia() {
	}

	public Skrzynia(Long id) {
		Id = id;
	}

	public Skrzynia(Long dlugoscSkrzyni, Long szerokoscSkrzyni, Long wysokoscSkrzyni, Long ilosc) {
		this.dlugoscSkrzyni = dlugoscSkrzyni;
		this.szerokoscSkrzyni = szerokoscSkrzyni;
		this.wysokoscSkrzyni = wysokoscSkrzyni;
		this.ilosc = ilosc;
	}


	public Long getDlugoscSkrzyni() {
		return dlugoscSkrzyni;
	}

	public void setDlugoscSkrzyni(Long dlugoscSkrzyni) {
		this.dlugoscSkrzyni = dlugoscSkrzyni;
	}

	public Long getSzerokoscSkrzyni() {
		return szerokoscSkrzyni;
	}

	public void setSzerokoscSkrzyni(Long szerokoscSkrzyni) {
		this.szerokoscSkrzyni = szerokoscSkrzyni;
	}

	public Long getWysokoscSkrzyni() {
		return wysokoscSkrzyni;
	}

	public void setWysokoscSkrzyni(Long wysokoscSkrzyni) {
		this.wysokoscSkrzyni = wysokoscSkrzyni;
	}

	public Long getIlosc() {
		return ilosc;
	}

	public void setIlosc(Long ilosc) {
		this.ilosc = ilosc;
	}

	public Projekt getProjekt() {
		return projekt;
	}

	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	private Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Skrzynia{" +
				"id=" + Id +
				", dlugosc='" + dlugoscSkrzyni + " , szeroksoc= " + szerokoscSkrzyni + ",wysokosc= " + wysokoscSkrzyni + '\'' +
				"}";

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Skrzynia)) return false;
		Skrzynia other = (Skrzynia) o;
		return Id != null && Id.equals(other.getId());


	}

	@Override
	public int hashCode() {
		return 31;
	}
}



