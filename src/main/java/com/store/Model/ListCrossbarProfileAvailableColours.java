package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListCrossbarProfileAvailableColours {
	@Id
	@GeneratedValue()
	int id;
	@ManyToOne
	@JoinColumn(name="idListCrossbarProfile")
	ListCrossbarProfile listCrossbarProfile;
	String name;
	String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListCrossbarProfile getListCrossbarProfile() {
		return listCrossbarProfile;
	}
	public void setListCrossbarProfile(ListCrossbarProfile listCrossbarProfile) {
		this.listCrossbarProfile = listCrossbarProfile;
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
