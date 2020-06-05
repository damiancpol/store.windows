package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListColorOfCasings {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idListColorOfCasings;
	@OneToMany(mappedBy = "listColorOfCasings") 
	Set<ListColorOfCasingsAvailableColours>listColorOfCasingsAvailableColours;
	String name;
	String artnr;
	public int getIdListColorOfCasings() {
		return idListColorOfCasings;
	}
	public void setIdListColorOfCasings(int idListColorOfCasings) {
		this.idListColorOfCasings = idListColorOfCasings;
	}
	public Set<ListColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours() {
		return listColorOfCasingsAvailableColours;
	}
	public void setListColorOfCasingsAvailableColours(
			Set<ListColorOfCasingsAvailableColours> listColorOfCasingsAvailableColours) {
		this.listColorOfCasingsAvailableColours = listColorOfCasingsAvailableColours;
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
