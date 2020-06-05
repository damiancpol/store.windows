package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class ListVentilators {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int idListVentilators;
	@OneToMany(mappedBy = "listVentilators")
	Set<ListVentilatorsAvailableColours> listVentilatorsAvailableColours;
	String name;
	String artnr;
	public int getIdListVentilators() {
		return idListVentilators;
	}
	public void setIdListVentilators(int idListVentilators) {
		this.idListVentilators = idListVentilators;
	}
	public Set<ListVentilatorsAvailableColours> getListVentilatorsAvailableColours() {
		return listVentilatorsAvailableColours;
	}
	public void setListVentilatorsAvailableColours(Set<ListVentilatorsAvailableColours> listVentilatorsAvailableColours) {
		this.listVentilatorsAvailableColours = listVentilatorsAvailableColours;
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
