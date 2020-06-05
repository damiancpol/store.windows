package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListSpecialShapes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListSpecialShapes;
@OneToMany(mappedBy = "listSpecialShapes")
Set<ListSpecialShapesAvailableColours> listSpecialShapesAvailableColours;
String name;
String artnr;
public int getIdListSpecialShapes() {
	return idListSpecialShapes;
}
public void setIdListSpecialShapes(int idListSpecialShapes) {
	this.idListSpecialShapes = idListSpecialShapes;
}
public Set<ListSpecialShapesAvailableColours> getListSpecialShapesAvailableColours() {
	return listSpecialShapesAvailableColours;
}
public void setListSpecialShapesAvailableColours(
		Set<ListSpecialShapesAvailableColours> listSpecialShapesAvailableColours) {
	this.listSpecialShapesAvailableColours = listSpecialShapesAvailableColours;
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
