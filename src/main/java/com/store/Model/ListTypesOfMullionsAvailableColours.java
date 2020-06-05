package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListTypesOfMullionsAvailableColours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
	@ManyToOne
	@JoinColumn(name="idListTypesOfMullions")
	ListTypesOfMullions listTypesOfMullions;
	String artnr;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListTypesOfMullions getListTypesOfMullions() {
		return listTypesOfMullions;
	}
	public void setListTypesOfMullions(ListTypesOfMullions listTypesOfMullions) {
		this.listTypesOfMullions = listTypesOfMullions;
	}
	public String getArtnr() {
		return artnr;
	}
	public void setArtnr(String artnr) {
		this.artnr = artnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
