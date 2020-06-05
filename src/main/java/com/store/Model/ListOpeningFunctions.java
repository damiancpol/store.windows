package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListOpeningFunctions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int idListOpeningFunctions;
	@OneToMany(mappedBy = "listOpeningFunctions")
	Set<ListOpeningFunctionsAvailableColours> listOpeningFunctionsAvailableColours;
	String name;
	String artnr;
	public int getIdListOpeningFunctions() {
		return idListOpeningFunctions;
	}
	public void setIdListOpeningFunctions(int idListOpeningFunctions) {
		this.idListOpeningFunctions = idListOpeningFunctions;
	}
	public Set<ListOpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours() {
		return listOpeningFunctionsAvailableColours;
	}
	public void setListOpeningFunctionsAvailableColours(
			Set<ListOpeningFunctionsAvailableColours> listOpeningFunctionsAvailableColours) {
		this.listOpeningFunctionsAvailableColours = listOpeningFunctionsAvailableColours;
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
