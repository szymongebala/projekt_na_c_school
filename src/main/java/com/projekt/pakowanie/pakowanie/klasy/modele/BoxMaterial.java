package com.projekt.pakowanie.pakowanie.klasy.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity

public class BoxMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String nazwa;


	@OneToMany(mappedBy = "boxMaterial")
	@JsonIgnore
	private List<Instrukcja> instrukcja;

	public List<Instrukcja> getInstrukcja() {
		return instrukcja;
	}

	public void setInstrukcja(List<Instrukcja> instrukcja) {
		this.instrukcja = instrukcja;
	}

	public BoxMaterial() {

	}

	public BoxMaterial(String nazwa) {
		this.nazwa = nazwa;
	}


	private Long getId() {
		return id;
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
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "BoxMaterial{" +
				"id=" + id +
				", name='" + nazwa + '\'' +
				"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BoxMaterial)) return false;
		BoxMaterial other = (BoxMaterial) o;
		return id != null && id.equals(other.getId());


	}

}
