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
public class Handle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idHandle;
	String name;
	@OneToMany(mappedBy = "handle")
	Set<HandlesAvailableColours> handlesAvailableColours;
	String artnr;


}
