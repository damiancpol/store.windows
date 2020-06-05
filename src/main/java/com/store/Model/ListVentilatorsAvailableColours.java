package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListVentilatorsAvailableColours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
	@ManyToOne
	@JoinColumn(name="idListVentilators")
	ListVentilators listVentilators;
	String name;
	String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListVentilators getListVentilators() {
		return listVentilators;
	}
	public void setListVentilators(ListVentilators listVentilators) {
		this.listVentilators = listVentilators;
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
