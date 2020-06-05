package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListExtensionAvailableColours {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@ManyToOne
@JoinColumn(name ="idListExtension")
ListExtension listExtension;
String name;
String artnr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public ListExtension getListExtension() {
	return listExtension;
}
public void setListExtension(ListExtension listExtension) {
	this.listExtension = listExtension;
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
