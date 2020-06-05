package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListExtension {
@Id
@GeneratedValue
int idListExtension;
@OneToMany(mappedBy = "listExtension")
Set<ListExtensionAvailableColours>  listExtensionAvailableColours;
String name;
String artnr;
public int getIdListExtension() {
	return idListExtension;
}
public void setIdListExtension(int idListExtension) {
	this.idListExtension = idListExtension;
}
public Set<ListExtensionAvailableColours> getListExtensionAvailableColours() {
	return listExtensionAvailableColours;
}
public void setListExtensionAvailableColours(Set<ListExtensionAvailableColours> listExtensionAvailableColours) {
	this.listExtensionAvailableColours = listExtensionAvailableColours;
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
