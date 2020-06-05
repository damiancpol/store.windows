package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class ListInterPaneFrames {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idListInterPaneFrames;
	@OneToMany(mappedBy = "listInterPaneFrames")
	Set<ListInterPaneFramesAvailableColours> listInterPaneFramesAvailableColours;
	String name;
	String artnr;
	public int getIdListInterPaneFrames() {
		return idListInterPaneFrames;
	}
	public void setIdListInterPaneFrames(int idListInterPaneFrames) {
		this.idListInterPaneFrames = idListInterPaneFrames;
	}
	public Set<ListInterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours() {
		return listInterPaneFramesAvailableColours;
	}
	public void setListInterPaneFramesAvailableColours(
			Set<ListInterPaneFramesAvailableColours> listInterPaneFramesAvailableColours) {
		this.listInterPaneFramesAvailableColours = listInterPaneFramesAvailableColours;
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
