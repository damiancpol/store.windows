package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListTypesOfMullions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int idListTypesOfMullions;
	@OneToMany(mappedBy = "listTypesOfMullions")
	Set<ListTypesOfMullionsAvailableColours> ListTypesOfMullionsAvailableColours;
	String name;
	String artnr;
	public int getIdListTypesOfMullions() {
		return idListTypesOfMullions;
	}
	public void setIdListTypesOfMullions(int idListTypesOfMullions) {
		this.idListTypesOfMullions = idListTypesOfMullions;
	}
	public Set<ListTypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours() {
		return ListTypesOfMullionsAvailableColours;
	}
	public void setListTypesOfMullionsAvailableColours(
			Set<ListTypesOfMullionsAvailableColours> listTypesOfMullionsAvailableColours) {
		ListTypesOfMullionsAvailableColours = listTypesOfMullionsAvailableColours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtnr() {
		return artnr;
	}
	public void setArtnr(String artnr) {
		this.artnr = artnr;
	}
	
}
