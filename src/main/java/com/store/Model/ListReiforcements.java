package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListReiforcements {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
int idListReiforcements;
@OneToMany(mappedBy = "listReiforcements")
Set<ListReiforcementsAvailableColours> listReiforcementsAvailableColours;
String name;
String artnr;
public int getIdListReiforcements() {
	return idListReiforcements;
}
public void setIdListReiforcements(int idListReiforcements) {
	this.idListReiforcements = idListReiforcements;
}
public Set<ListReiforcementsAvailableColours> getListReiforcementsAvailableColours() {
	return listReiforcementsAvailableColours;
}
public void setListReiforcementsAvailableColours(
		Set<ListReiforcementsAvailableColours> listReiforcementsAvailableColours) {
	this.listReiforcementsAvailableColours = listReiforcementsAvailableColours;
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
