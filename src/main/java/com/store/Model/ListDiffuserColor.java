package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ListDiffuserColor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListDiffuserColor;
	String name;
	String artnr;
	public int getIdListDiffuserColor() {
		return idListDiffuserColor;
	}
	public void setIdListDiffuserColor(int idListDiffuserColor) {
		this.idListDiffuserColor = idListDiffuserColor;
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
