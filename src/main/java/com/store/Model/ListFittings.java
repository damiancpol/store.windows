package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListFittings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListFittings;
	@OneToMany(mappedBy = "listFittings")
	Set<ListFittingsAvailableColours> listFittingsAvailableColours;
	String name;
	String artnr;
	public int getIdListFittings() {
		return idListFittings;
	}
	public void setIdListFittings(int idListFittings) {
		this.idListFittings = idListFittings;
	}
	public Set<ListFittingsAvailableColours> getListFittingsAvailableColours() {
		return listFittingsAvailableColours;
	}
	public void setListFittingsAvailableColours(Set<ListFittingsAvailableColours> listFittingsAvailableColours) {
		this.listFittingsAvailableColours = listFittingsAvailableColours;
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
