package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListCrossbarProfile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int idListCrossbarProfile;
@OneToMany(mappedBy = "listCrossbarProfile")
Set<ListCrossbarProfileAvailableColours> listCrossbarProfileAvailableColours;
String name;
String artnr;
public int getIdListCrossbarProfile() {
	return idListCrossbarProfile;
}
public void setIdListCrossbarProfile(int idListCrossbarProfile) {
	this.idListCrossbarProfile = idListCrossbarProfile;
}
public Set<ListCrossbarProfileAvailableColours> getListCrossbarProfileAvailableColours() {
	return listCrossbarProfileAvailableColours;
}
public void setListCrossbarProfileAvailableColours(
		Set<ListCrossbarProfileAvailableColours> listCrossbarProfileAvailableColours) {
	this.listCrossbarProfileAvailableColours = listCrossbarProfileAvailableColours;
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
