package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListHandles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int idListHandles;
	@OneToMany(mappedBy = "listHandles")
	Set<ListHandlesAvailableColours> listHandlesAvailableColours;
	String name;
	String artnr;
	public int getIdListHandles() {
		return idListHandles;
	}
	public void setIdListHandles(int idListHandles) {
		this.idListHandles = idListHandles;
	}
	public Set<ListHandlesAvailableColours> getListHandlesAvailableColours() {
		return listHandlesAvailableColours;
	}
	public void setListHandlesAvailableColours(Set<ListHandlesAvailableColours> listHandlesAvailableColours) {
		this.listHandlesAvailableColours = listHandlesAvailableColours;
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
