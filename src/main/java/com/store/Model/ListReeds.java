package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListReeds {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListReeds;
@OneToMany(mappedBy = "listReeds")
Set<ListReedsAvailableColours> ListReedsAvailableColours;
String name;
String artnr;
public int getIdListReeds() {
	return idListReeds;
}
public void setIdListReeds(int idListReeds) {
	this.idListReeds = idListReeds;
}
public Set<ListReedsAvailableColours> getListReedsAvailableColours() {
	return ListReedsAvailableColours;
}
public void setListReedsAvailableColours(Set<ListReedsAvailableColours> listReedsAvailableColours) {
	ListReedsAvailableColours = listReedsAvailableColours;
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
