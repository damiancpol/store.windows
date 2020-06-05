package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListMullionPatterns {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int idListMullionPatterns;
	@OneToMany
	Set<ListMullionPatternsAvailableColours> listMullionPatternsAvailableColours;
	String name;
	String artnr;
	public int getIdListMullionPatterns() {
		return idListMullionPatterns;
	}
	public void setIdListMullionPatterns(int idListMullionPatterns) {
		this.idListMullionPatterns = idListMullionPatterns;
	}
	public Set<ListMullionPatternsAvailableColours> getListMullionPatternsAvailableColours() {
		return listMullionPatternsAvailableColours;
	}
	public void setListMullionPatternsAvailableColours(
			Set<ListMullionPatternsAvailableColours> listMullionPatternsAvailableColours) {
		this.listMullionPatternsAvailableColours = listMullionPatternsAvailableColours;
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
