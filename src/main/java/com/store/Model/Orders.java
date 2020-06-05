package com.store.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id_order;
long orderNumber;
//Cena netto
String netPrice;
//Cena brutto
String grossPrice;
public int getId_order() {
	return id_order;
}
public void setId_order(int id_order) {
	this.id_order = id_order;
}
public long getOrderNumber() {
	return orderNumber;
}
public void setOrderNumber(long orderNumber) {
	this.orderNumber = orderNumber;
}
public String getNetPrice() {
	return netPrice;
}
public void setNetPrice(String netPrice) {
	this.netPrice = netPrice;
}
public String getGrossPrice() {
	return grossPrice;
}
public void setGrossPrice(String grossPrice) {
	this.grossPrice = grossPrice;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Windows getWindows() {
	return windows;
}
public void setWindows(Windows windows) {
	this.windows = windows;
}
@ManyToOne
@JoinColumn(name="id_client")
Client client;
@ManyToOne
@JoinColumn(name="id_window")
Windows windows;
}
