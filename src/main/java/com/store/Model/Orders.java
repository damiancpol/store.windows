package com.store.Model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_order;
	long orderNumber;
//Cena netto
	String netPrice;
//Cena brutto
	String grossPrice;
	@ManyToOne
	@JoinColumn(name = "id_client")
	Client client;
	@OneToMany(mappedBy = "orders")
	Set<Windows> windows;

}
