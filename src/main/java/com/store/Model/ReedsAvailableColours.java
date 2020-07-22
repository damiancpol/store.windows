package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class ReedsAvailableColours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idReedsAvailableColours;
	String name;
	String artnr;
	@ManyToOne()
	@JoinColumn(name = "idReed")
	Reed reed;


}
