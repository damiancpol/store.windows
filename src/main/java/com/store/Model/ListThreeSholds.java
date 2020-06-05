package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class ListThreeSholds {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListThreeSholds;
@OneToMany(mappedBy = "listThreeSholds")
Set<ListThreeSholdsAvailableColours> listThreeSholdsAvailableColours;
String name;
String artnr;
public int getIdListThreeSholds() {
	return idListThreeSholds;
}
public void setIdListThreeSholds(int idListThreeSholds) {
	this.idListThreeSholds = idListThreeSholds;
}
public Set<ListThreeSholdsAvailableColours> getListThreeSholdsAvailableColours() {
	return listThreeSholdsAvailableColours;
}
public void setListThreeSholdsAvailableColours(Set<ListThreeSholdsAvailableColours> listThreeSholdsAvailableColours) {
	this.listThreeSholdsAvailableColours = listThreeSholdsAvailableColours;
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
