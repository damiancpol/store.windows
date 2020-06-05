package com.store.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
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
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Threshold> threshold;
	// wzmocnienie
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Reinforcement> reinforcement;
	// Listwa progowa
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<SillStrip> sillStrip;
	// Listwa podparapetowa
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<GlazingBead> glazingBead;
	// Okna
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Orders> orders;
//Kolor wewnetrzny
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<InternalColor> internalColor;
	// Kolor zewnetrzny
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<ExternalColor> externalColor;
	// Typ Okucia
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Fittings> fittings;
	// Kolor klamkki
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<DoorHandleColor> doorHandleColor;
	// Kolor os³onek okuc
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<ColorOfCasings> colorOfCasings;
//Funkcje otwierania
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<OpeningFunctions> openingFunctions;
//Klamka
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Handle> handle;
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
//Blokada skrzyd³a
	Set<WingLock> wingLock;
//Zatrzaska balkonowy
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<BalconyLatch> balconyLatch;
	// Kontrakton
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Reed> reed;
//Nawiewnik
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Ventilator> ventilator;
//Kolor nawiewnika
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<DiffuserColor> diffuserColor;
//Wype³nienie
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Fulfillment> fulfillment;
//Ramka miêdzyszybowa
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<InterPaneFrame> interPaneFrame;
//Kolor ramki
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<FrameColor> frameColor;
//Typ szprosu
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<TypeOfMullion> typeOfMullion;
//Wzór szprosu
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<MullionPattern> mullionPattern;
//Profil poprzeczki
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<CrossbarProfile> crossbarProfile;
//Poszerzenie
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<Extension> extension;
//Kszta³ty specjalne
	@OneToMany(mappedBy = "windows")
	@JsonIgnore
	Set<SpecialShapes> specialShapes;

	public long getId_window() {
		return id_window;
	}

	public void setId_window(long id_window) {
		this.id_window = id_window;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	public String getWindow_type() {
		return window_type;
	}

	public void setWindow_type(String window_type) {
		this.window_type = window_type;
	}

	public String getProfile_type() {
		return profile_type;
	}

	public void setProfile_type(String profile_type) {
		this.profile_type = profile_type;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Set<Threshold> getThreshold() {
		return threshold;
	}

	public void setThreshold(Set<Threshold> threshold) {
		this.threshold = threshold;
	}

	public Set<Reinforcement> getReinforcement() {
		return reinforcement;
	}

	public void setReinforcement(Set<Reinforcement> reinforcement) {
		this.reinforcement = reinforcement;
	}

	public Set<SillStrip> getSillStrip() {
		return sillStrip;
	}

	public void setSillStrip(Set<SillStrip> sillStrip) {
		this.sillStrip = sillStrip;
	}

	public Set<GlazingBead> getGlazingBead() {
		return glazingBead;
	}

	public void setGlazingBead(Set<GlazingBead> glazingBead) {
		this.glazingBead = glazingBead;
	}

	public Set<InternalColor> getInternalColor() {
		return internalColor;
	}

	public void setInternalColor(Set<InternalColor> internalColor) {
		this.internalColor = internalColor;
	}

	public Set<ExternalColor> getExternalColor() {
		return externalColor;
	}

	public void setExternalColor(Set<ExternalColor> externalColor) {
		this.externalColor = externalColor;
	}

	public Set<DoorHandleColor> getDoorHandleColor() {
		return doorHandleColor;
	}

	public void setDoorHandleColor(Set<DoorHandleColor> doorHandleColor) {
		this.doorHandleColor = doorHandleColor;
	}

	public Set<ColorOfCasings> getColorOfCasings() {
		return colorOfCasings;
	}

	public void setColorOfCasings(Set<ColorOfCasings> colorOfCasings) {
		this.colorOfCasings = colorOfCasings;
	}

	public Set<OpeningFunctions> getOpeningFunctions() {
		return openingFunctions;
	}

	public void setOpeningFunctions(Set<OpeningFunctions> openingFunctions) {
		this.openingFunctions = openingFunctions;
	}

	public Set<Handle> getHandle() {
		return handle;
	}

	public void setHandle(Set<Handle> handle) {
		this.handle = handle;
	}

	public Set<BalconyLatch> getBalconyLatch() {
		return balconyLatch;
	}

	public void setBalconyLatch(Set<BalconyLatch> balconyLatch) {
		this.balconyLatch = balconyLatch;
	}

	public Set<Reed> getReed() {
		return reed;
	}

	public void setReed(Set<Reed> reed) {
		this.reed = reed;
	}

	public Set<Ventilator> getVentilator() {
		return ventilator;
	}

	public void setVentilator(Set<Ventilator> ventilator) {
		this.ventilator = ventilator;
	}

	public Set<DiffuserColor> getDiffuserColor() {
		return diffuserColor;
	}

	public void setDiffuserColor(Set<DiffuserColor> diffuserColor) {
		this.diffuserColor = diffuserColor;
	}

	public Set<Fulfillment> getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Set<Fulfillment> fulfillment) {
		this.fulfillment = fulfillment;
	}

	public Set<InterPaneFrame> getInterPaneFrame() {
		return interPaneFrame;
	}

	public void setInterPaneFrame(Set<InterPaneFrame> interPaneFrame) {
		this.interPaneFrame = interPaneFrame;
	}

	public Set<FrameColor> getFrameColor() {
		return frameColor;
	}

	public void setFrameColor(Set<FrameColor> frameColor) {
		this.frameColor = frameColor;
	}

	public Set<TypeOfMullion> getTypeOfMullion() {
		return typeOfMullion;
	}

	public void setTypeOfMullion(Set<TypeOfMullion> typeOfMullion) {
		this.typeOfMullion = typeOfMullion;
	}

	public Set<MullionPattern> getMullionPattern() {
		return mullionPattern;
	}

	public void setMullionPattern(Set<MullionPattern> mullionPattern) {
		this.mullionPattern = mullionPattern;
	}

	public Set<CrossbarProfile> getCrossbarProfile() {
		return crossbarProfile;
	}

	public void setCrossbarProfile(Set<CrossbarProfile> crossbarProfile) {
		this.crossbarProfile = crossbarProfile;
	}

	public Set<Extension> getExtension() {
		return extension;
	}

	public void setExtension(Set<Extension> extension) {
		this.extension = extension;
	}

	public Set<SpecialShapes> getSpecialShapes() {
		return specialShapes;
	}

	public void setSpecialShapes(Set<SpecialShapes> specialShapes) {
		this.specialShapes = specialShapes;
	}

	public Set<Fittings> getFittings() {
		return fittings;
	}

	public void setFittings(Set<Fittings> fittings) {
		this.fittings = fittings;
	}

	public Set<WingLock> getWingLock() {
		return wingLock;
	}

	public void setWingLock(Set<WingLock> wingLock) {
		this.wingLock = wingLock;
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
}
