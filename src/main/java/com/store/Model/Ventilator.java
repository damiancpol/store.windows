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
public class Ventilator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idVentilator;
	String name;
	@OneToMany(mappedBy = "ventilator")
	Set<VentilatorsAvailableColours> ventilatorsAvailableColours;
	String artnr;


}
