package com.store.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id_client;
String shortName;
String name;
String city;
String street;
String zipCode;
String status;
String nip;
String regon;
String phone;
String bankAccount;
@OneToMany(mappedBy = "client")
Set<Orders> orders;
public Set<Orders> getOrders() {
	return orders;
}
public void setOrders(Set<Orders> orders) {
	this.orders = orders;
}
public int getId_client() {
	return id_client;
}
public void setId_client(int id_client) {
	this.id_client = id_client;
}
public String getShortName() {
	return shortName;
}
public void setShortName(String shortName) {
	this.shortName = shortName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getNip() {
	return nip;
}
public void setNip(String nip) {
	this.nip = nip;
}
public String getRegon() {
	return regon;
}
public void setRegon(String regon) {
	this.regon = regon;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getBankAccount() {
	return bankAccount;
}
public void setBankAccount(String bankAccount) {
	this.bankAccount = bankAccount;
}


}
