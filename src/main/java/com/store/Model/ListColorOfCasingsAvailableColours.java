package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListColorOfCasingsAvailableColours {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	@ManyToOne()
	@JoinColumn(name="idListColorOfCasings")
	ListColorOfCasings listColorOfCasings;
	String name;
	String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListColorOfCasings getListColorOfCasings() {
		return listColorOfCasings;
	}
	public void setListColorOfCasings(ListColorOfCasings listColorOfCasings) {
		this.listColorOfCasings = listColorOfCasings;
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