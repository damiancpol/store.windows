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
public class Fittings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idFittings;
	String name;
	@OneToMany(mappedBy = "fittings")
	Set<FittingsAvailableColours> fittingsAvailableColours;
	String artnr;

}
