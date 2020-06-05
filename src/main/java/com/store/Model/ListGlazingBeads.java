package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListGlazingBeads {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int idListGlazingBeads;
	@OneToMany(mappedBy = "listGlazingBeads")
	Set<ListGlazingBeadsAvailableColours> listGlazingBeadsAvailableColours;
	String name;
	String artnr;
	public int getIdListGlazingBeads() {
		return idListGlazingBeads;
	}
	public void setIdListGlazingBeads(int idListGlazingBeads) {
		this.idListGlazingBeads = idListGlazingBeads;
	}
	public Set<ListGlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours() {
		return listGlazingBeadsAvailableColours;
	}
	public void setListGlazingBeadsAvailableColours(
			Set<ListGlazingBeadsAvailableColours> listGlazingBeadsAvailableColours) {
		this.listGlazingBeadsAvailableColours = listGlazingBeadsAvailableColours;
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
