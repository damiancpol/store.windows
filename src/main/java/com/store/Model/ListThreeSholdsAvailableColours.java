package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListThreeSholdsAvailableColours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
	@ManyToOne
	@JoinColumn(name="idListThreeSholds")
	ListThreeSholds listThreeSholds;
	String name;
	String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListThreeSholds getListThreeSholds() {
		return listThreeSholds;
	}
	public void setListThreeSholds(ListThreeSholds listThreeSholds) {
		this.listThreeSholds = listThreeSholds;
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
