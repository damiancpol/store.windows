package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListFullfillments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
      int idListFullfillments;
	@OneToMany(mappedBy = "listFullfillments")
	Set<ListFullfillmentsAvailableColours> listFullfillmentsAvailableColours;
	String name;
	String artnr;
	public int getIdListFullfillments() {
		return idListFullfillments;
	}
	public void setIdListFullfillments(int idListFullfillments) {
		this.idListFullfillments = idListFullfillments;
	}
	public Set<ListFullfillmentsAvailableColours> getListFullfillmentsAvailableColours() {
		return listFullfillmentsAvailableColours;
	}
	public void setListFullfillmentsAvailableColours(
			Set<ListFullfillmentsAvailableColours> listFullfillmentsAvailableColours) {
		this.listFullfillmentsAvailableColours = listFullfillmentsAvailableColours;
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
