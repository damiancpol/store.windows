package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ListFullfillmentsAvailableColours {
	
	@Id
	@GeneratedValue
      int id ;
      @ManyToOne      
      @JoinColumn(name="idListFullfillments")
      ListFullfillments listFullfillments; 
      String name;
      String artnr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ListFullfillments getListFullfillments() {
		return listFullfillments;
	}
	public void setListFullfillments(ListFullfillments listFullfillments) {
		this.listFullfillments = listFullfillments;
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
