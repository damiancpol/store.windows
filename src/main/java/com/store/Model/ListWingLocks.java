package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListWingLocks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int idListWingLocks;
	@OneToMany(mappedBy = "listWingLocks")
	Set<ListWingLocksAvailableColours> listWingLocksAvailableColours;
	String name;
	String artnr;
	public int getIdListWingLocks() {
		return idListWingLocks;
	}
	public void setIdListWingLocks(int idListWingLocks) {
		this.idListWingLocks = idListWingLocks;
	}
	public Set<ListWingLocksAvailableColours> getListWingLocksAvailableColours() {
		return listWingLocksAvailableColours;
	}
	public void setListWingLocksAvailableColours(Set<ListWingLocksAvailableColours> listWingLocksAvailableColours) {
		this.listWingLocksAvailableColours = listWingLocksAvailableColours;
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
