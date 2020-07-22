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
public class InterPaneFramesAvailableColours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int idInterPaneFramesAvailableColours;
	String name;
	String artnr;
	@ManyToOne
	@JoinColumn(name = "idInterPaneFrame")
	InterPaneFrame interPaneFrame;

}
