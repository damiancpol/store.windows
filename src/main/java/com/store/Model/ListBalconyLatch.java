package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListBalconyLatch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int idListBalconyLatch;
	@OneToMany(mappedBy = "listBalconyLatch")
	Set<ListBalconyLatchAvailableColours> listBalconyLatchAvailableColours;
	String name;
	String artnr;
public int getIdListBalconyLatch() {
		return idListBalconyLatch;
	}
	public void setIdListBalconyLatch(int idListBalconyLatch) {
		this.idListBalconyLatch = idListBalconyLatch;
	}
	public Set<ListBalconyLatchAvailableColours> getListBalconyLatchAvailableColours() {
		return listBalconyLatchAvailableColours;
	}
	public void setListBalconyLatchAvailableColours(
			Set<ListBalconyLatchAvailableColours> listBalconyLatchAvailableColours) {
		this.listBalconyLatchAvailableColours = listBalconyLatchAvailableColours;
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
