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
public class Windows {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id_window;
	// Typ okna
	String window_type;
	// Typ profulu
	String profile_type;
	// Wysokosc
	String width;
	// Szerokosc
	String height;
//Cena netto
	String netPrice;
//Cena brutto
	String grossPrice;
	// Próg
	String threshold;
	// wzmocnienie
	String reinforcement;
	// Listwa progowa
	String sillStrip;
	// Listwa podparapetowa
	String glazingBead;
	// Okna
	@ManyToOne
	@JoinColumn(name = "id_order")
	Orders orders;
//Kolor wewnetrzny
	String internalColor;
	// Kolor zewnetrzny
	String externalColor;
	// Typ Okucia
	String fittings;
	// Kolor klamkki
	String doorHandleColor;
	// Kolor os³onek okuc
	String colorOfCasings;
//Funkcje otwierania
	String openingFunctions;
//Klamka
	String handle;
//Blokada skrzyd³a
	String wingLock;
//Zatrzaska balkonowy
	String balconyLatch;
	// Kontrakton
	String reed;
//Nawiewnik
	String ventilator;
//Kolor nawiewnika
	String diffuserColor;
//Wype³nienie
	String fulfillment;
//Ramka miêdzyszybowa
	String interPaneFrame;
//Kolor ramki
	String frameColor;
//Typ szprosu
	String typeOfMullion;
//Wzór szprosu
	String mullionPattern;
//Profil poprzeczki
	String crossbarProfile;
//Poszerzenie
	String extension;
//Kszta³ty specjalne
	String specialShapes;

}
