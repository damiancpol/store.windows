package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListHandlesAvailableColours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@ManyToOne
	@JoinColumn(name="idListHandles")
	ListHandles listHandles;
	String name;
	String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListHandles getListHandles() {
		return listHandles;
	}
	public void setListHandles(ListHandles listHandles) {
		this.listHandles = listHandles;
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
