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


}
