package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Reed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idReed;
	String name;
	@OneToMany(mappedBy = "reed")
	Set<ReedsAvailableColours> reedsAvailableColours;
	String artnr;



}
