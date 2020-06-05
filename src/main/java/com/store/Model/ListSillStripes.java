package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListSillStripes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListSillStripes;
@OneToMany(mappedBy = "listSillStripes")
Set<ListSillStripesAvailableColours> listSillStripesAvailableColours;
String name;
String artnr;
public int getIdListSillStripes() {
	return idListSillStripes;
}
public void setIdListSillStripes(int idListSillStripes) {
	this.idListSillStripes = idListSillStripes;
}
public Set<ListSillStripesAvailableColours> getListSillStripesAvailableColours() {
	return listSillStripesAvailableColours;
}
public void setListSillStripesAvailableColours(Set<ListSillStripesAvailableColours> listSillStripesAvailableColours) {
	this.listSillStripesAvailableColours = listSillStripesAvailableColours;
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
