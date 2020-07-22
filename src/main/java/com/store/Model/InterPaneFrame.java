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
public class InterPaneFrame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idInterPaneFrame;
	String name;
	@OneToMany(mappedBy = "interPaneFrame")
	Set<InterPaneFramesAvailableColours> interPaneFramesAvailableColours;
	String artnr;

}
