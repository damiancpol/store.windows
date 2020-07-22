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
public class Threshold {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idThreshold;
	String name;
	@OneToMany(mappedBy = "threshold")
	Set<ThreeSholdsAvailableColours> threeSholdsAvailableColours;
	String artnr;


}
