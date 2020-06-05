package com.store.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.DAO.WindowsDaoInterface;
import com.store.Model.BalconyLatch;
import com.store.Model.BalconyLatchAvailableColours;
import com.store.Model.Client;
import com.store.Model.ColorOfCasings;
import com.store.Model.ColorOfCasingsAvailableColours;
import com.store.Model.CrossbarProfile;
import com.store.Model.CrossbbarProfileAvaibleColors;
import com.store.Model.DiffuserColor;
import com.store.Model.DoorHandleColor;
import com.store.Model.Extension;
import com.store.Model.ExtensionAvailableColours;
import com.store.Model.ExternalColor;
import com.store.Model.Fittings;
import com.store.Model.FittingsAvailableColours;
import com.store.Model.FrameColor;
import com.store.Model.Fulfillment;
import com.store.Model.FullfillmentAvailableColours;
import com.store.Model.GlazingBead;
import com.store.Model.GlazingBeadsAvailableColours;
import com.store.Model.Handle;
import com.store.Model.HandlesAvailableColours;
import com.store.Model.InterPaneFrame;
import com.store.Model.InterPaneFramesAvailableColours;
import com.store.Model.InternalColor;
import com.store.Model.ListBalconyLatch;
import com.store.Model.ListBalconyLatchAvailableColours;
import com.store.Model.ListClient;
import com.store.Model.ListColorOfCasings;
import com.store.Model.ListColorOfCasingsAvailableColours;
import com.store.Model.ListCrossbarProfile;
import com.store.Model.ListCrossbarProfileAvailableColours;
import com.store.Model.ListDiffuserColor;
import com.store.Model.ListDoorHandleColor;
import com.store.Model.ListExtension;
import com.store.Model.ListExtensionAvailableColours;
import com.store.Model.ListExternalColor;
import com.store.Model.ListFittings;
import com.store.Model.ListFittingsAvailableColours;
import com.store.Model.ListFrameColors;
import com.store.Model.ListFullfillments;
import com.store.Model.ListFullfillmentsAvailableColours;
import com.store.Model.ListGlazingBeads;
import com.store.Model.ListGlazingBeadsAvailableColours;
import com.store.Model.ListHandles;
import com.store.Model.ListHandlesAvailableColours;
import com.store.Model.ListInterPaneFrames;
import com.store.Model.ListInterPaneFramesAvailableColours;
import com.store.Model.ListInternalColors;
import com.store.Model.ListMullionPatterns;
import com.store.Model.ListMullionPatternsAvailableColours;
import com.store.Model.ListOpeningFunctions;
import com.store.Model.ListOpeningFunctionsAvailableColours;
import com.store.Model.ListReeds;
import com.store.Model.ListReedsAvailableColours;
import com.store.Model.ListReiforcements;
import com.store.Model.ListReiforcementsAvailableColours;
import com.store.Model.ListSillStripes;
import com.store.Model.ListSillStripesAvailableColours;
import com.store.Model.ListSpecialShapes;
import com.store.Model.ListSpecialShapesAvailableColours;
import com.store.Model.ListThreeSholds;
import com.store.Model.ListThreeSholdsAvailableColours;
import com.store.Model.ListTypesOfMullions;
import com.store.Model.ListTypesOfMullionsAvailableColours;
import com.store.Model.ListVentilators;
import com.store.Model.ListVentilatorsAvailableColours;
import com.store.Model.ListWingLocks;
import com.store.Model.ListWingLocksAvailableColours;
import com.store.Model.MullionPattern;
import com.store.Model.MullionPatternsAvailableColours;
import com.store.Model.OpeningFunctions;
import com.store.Model.OpeningFunctionsAvailableColours;
import com.store.Model.Orders;
import com.store.Model.Reed;
import com.store.Model.ReedsAvailableColours;
import com.store.Model.ReiforcementsAvailableColours;
import com.store.Model.Reinforcement;
import com.store.Model.SillStrip;
import com.store.Model.SillStripesAvailableColours;
import com.store.Model.SpecialShapes;
import com.store.Model.SpecialShapesAvailableColours;
import com.store.Model.ThreeSholdsAvailableColours;
import com.store.Model.Threshold;
import com.store.Model.TypeOfMullion;
import com.store.Model.TypesOfMullionsAvailableColours;
import com.store.Model.Ventilator;
import com.store.Model.VentilatorsAvailableColours;
import com.store.Model.Windows;
import com.store.Model.WingLock;
import com.store.Model.WingLocksAvailableColours;

@Service
public class WindowsService implements WindowsServiceInterface {
	@Autowired
	WindowsDaoInterface windowsDaoInterface;

	@Transactional
	@Override
	public List<BalconyLatch> getListBalconyLatch() {
		return windowsDaoInterface.getListBalconyLatch();
	};

	@Transactional
	@Override
	public BalconyLatch getSingleBalconyLatch(long id) {
		return windowsDaoInterface.getSingleBalconyLatch(id);
	};

	@Transactional
	@Override
	public BalconyLatch saveBalconyLatch(BalconyLatch balconylatch) {
		return windowsDaoInterface.saveBalconyLatch(balconylatch);
	};

	@Transactional
	@Override
	public List<BalconyLatch> saveBalconyLatch(List<BalconyLatch> balconylatch) {
		return windowsDaoInterface.saveBalconyLatch(balconylatch);
	};

	@Transactional
	@Override
	public BalconyLatch updateBalconyLatch(BalconyLatch balconylatch) {
		return windowsDaoInterface.updateBalconyLatch(balconylatch);
	};

	@Transactional
	@Override
	public List<BalconyLatch> updateBalconyLatch(List<BalconyLatch> balconylatch) {
		return windowsDaoInterface.updateBalconyLatch(balconylatch);
	};

	@Transactional
	@Override
	public BalconyLatch delSingleBalconyLatch(long id) {
		return windowsDaoInterface.delSingleBalconyLatch(id);
	}

	@Transactional
	@Override
	public List<BalconyLatch> delBalconyLatch(List<BalconyLatch> balconylatch) {
		return windowsDaoInterface.delBalconyLatch(balconylatch);
	};

	@Transactional
	@Override
	public List<BalconyLatchAvailableColours> getListBalconyLatchAvailableColours() {
		return windowsDaoInterface.getListBalconyLatchAvailableColours();
	};

	@Transactional
	@Override
	public BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(long id) {
		return windowsDaoInterface.getSingleBalconyLatchAvailableColours(id);
	};

	@Transactional
	@Override
	public BalconyLatchAvailableColours saveBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		return windowsDaoInterface.saveBalconyLatchAvailableColours(balconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<BalconyLatchAvailableColours> saveBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		return windowsDaoInterface.saveBalconyLatchAvailableColours(balconylatchavailablecolours);
	};

	@Transactional
	@Override
	public BalconyLatchAvailableColours updateBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		return windowsDaoInterface.updateBalconyLatchAvailableColours(balconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		return windowsDaoInterface.updateBalconyLatchAvailableColours(balconylatchavailablecolours);
	};

	@Transactional
	@Override
	public BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(long id) {
		return windowsDaoInterface.delSingleBalconyLatchAvailableColours(id);
	}

	@Transactional
	@Override
	public List<BalconyLatchAvailableColours> delBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		return windowsDaoInterface.delBalconyLatchAvailableColours(balconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<Client> getListClient() {
		return windowsDaoInterface.getListClient();
	};

	@Transactional
	@Override
	public Client getSingleClient(long id) {
		return windowsDaoInterface.getSingleClient(id);
	};

	@Transactional
	@Override
	public Client saveClient(Client client) {
		return windowsDaoInterface.saveClient(client);
	};

	@Transactional
	@Override
	public List<Client> saveClient(List<Client> client) {
		return windowsDaoInterface.saveClient(client);
	};

	@Transactional
	@Override
	public Client updateClient(Client client) {
		return windowsDaoInterface.updateClient(client);
	};

	@Transactional
	@Override
	public List<Client> updateClient(List<Client> client) {
		return windowsDaoInterface.updateClient(client);
	};

	@Transactional
	@Override
	public Client delSingleClient(long id) {
		return windowsDaoInterface.delSingleClient(id);
	}

	@Transactional
	@Override
	public List<Client> delClient(List<Client> client) {
		return windowsDaoInterface.delClient(client);
	};

	@Transactional
	@Override
	public List<ColorOfCasings> getListColorOfCasings() {
		return windowsDaoInterface.getListColorOfCasings();
	};

	@Transactional
	@Override
	public ColorOfCasings getSingleColorOfCasings(long id) {
		return windowsDaoInterface.getSingleColorOfCasings(id);
	};

	@Transactional
	@Override
	public ColorOfCasings saveColorOfCasings(ColorOfCasings colorofcasings) {
		return windowsDaoInterface.saveColorOfCasings(colorofcasings);
	};

	@Transactional
	@Override
	public List<ColorOfCasings> saveColorOfCasings(List<ColorOfCasings> colorofcasings) {
		return windowsDaoInterface.saveColorOfCasings(colorofcasings);
	};

	@Transactional
	@Override
	public ColorOfCasings updateColorOfCasings(ColorOfCasings colorofcasings) {
		return windowsDaoInterface.updateColorOfCasings(colorofcasings);
	};

	@Transactional
	@Override
	public List<ColorOfCasings> updateColorOfCasings(List<ColorOfCasings> colorofcasings) {
		return windowsDaoInterface.updateColorOfCasings(colorofcasings);
	};

	@Transactional
	@Override
	public ColorOfCasings delSingleColorOfCasings(long id) {
		return windowsDaoInterface.delSingleColorOfCasings(id);
	}

	@Transactional
	@Override
	public List<ColorOfCasings> delColorOfCasings(List<ColorOfCasings> colorofcasings) {
		return windowsDaoInterface.delColorOfCasings(colorofcasings);
	};

	@Transactional
	@Override
	public List<ColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours() {
		return windowsDaoInterface.getListColorOfCasingsAvailableColours();
	};

	@Transactional
	@Override
	public ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(long id) {
		return windowsDaoInterface.getSingleColorOfCasingsAvailableColours(id);
	};

	@Transactional
	@Override
	public ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		return windowsDaoInterface.saveColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ColorOfCasingsAvailableColours> saveColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		return windowsDaoInterface.saveColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		return windowsDaoInterface.updateColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		return windowsDaoInterface.updateColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(long id) {
		return windowsDaoInterface.delSingleColorOfCasingsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ColorOfCasingsAvailableColours> delColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		return windowsDaoInterface.delColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<CrossbarProfile> getListCrossbarProfile() {
		return windowsDaoInterface.getListCrossbarProfile();
	};

	@Transactional
	@Override
	public CrossbarProfile getSingleCrossbarProfile(long id) {
		return windowsDaoInterface.getSingleCrossbarProfile(id);
	};

	@Transactional
	@Override
	public CrossbarProfile saveCrossbarProfile(CrossbarProfile crossbarprofile) {
		return windowsDaoInterface.saveCrossbarProfile(crossbarprofile);
	};

	@Transactional
	@Override
	public List<CrossbarProfile> saveCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		return windowsDaoInterface.saveCrossbarProfile(crossbarprofile);
	};

	@Transactional
	@Override
	public CrossbarProfile updateCrossbarProfile(CrossbarProfile crossbarprofile) {
		return windowsDaoInterface.updateCrossbarProfile(crossbarprofile);
	};

	@Transactional
	@Override
	public List<CrossbarProfile> updateCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		return windowsDaoInterface.updateCrossbarProfile(crossbarprofile);
	};

	@Transactional
	@Override
	public CrossbarProfile delSingleCrossbarProfile(long id) {
		return windowsDaoInterface.delSingleCrossbarProfile(id);
	}

	@Transactional
	@Override
	public List<CrossbarProfile> delCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		return windowsDaoInterface.delCrossbarProfile(crossbarprofile);
	};

	@Transactional
	@Override
	public List<CrossbbarProfileAvaibleColors> getListCrossbbarProfileAvaibleColors() {
		return windowsDaoInterface.getListCrossbbarProfileAvaibleColors();
	};

	@Transactional
	@Override
	public CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(long id) {
		return windowsDaoInterface.getSingleCrossbbarProfileAvaibleColors(id);
	};

	@Transactional
	@Override
	public CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		return windowsDaoInterface.saveCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
	};

	@Transactional
	@Override
	public List<CrossbbarProfileAvaibleColors> saveCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		return windowsDaoInterface.saveCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
	};

	@Transactional
	@Override
	public CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		return windowsDaoInterface.updateCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
	};

	@Transactional
	@Override
	public List<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		return windowsDaoInterface.updateCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
	};

	@Transactional
	@Override
	public CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(long id) {
		return windowsDaoInterface.delSingleCrossbbarProfileAvaibleColors(id);
	}

	@Transactional
	@Override
	public List<CrossbbarProfileAvaibleColors> delCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		return windowsDaoInterface.delCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
	};

	@Transactional
	@Override
	public List<DiffuserColor> getListDiffuserColor() {
		return windowsDaoInterface.getListDiffuserColor();
	};

	@Transactional
	@Override
	public DiffuserColor getSingleDiffuserColor(long id) {
		return windowsDaoInterface.getSingleDiffuserColor(id);
	};

	@Transactional
	@Override
	public DiffuserColor saveDiffuserColor(DiffuserColor diffusercolor) {
		return windowsDaoInterface.saveDiffuserColor(diffusercolor);
	};

	@Transactional
	@Override
	public List<DiffuserColor> saveDiffuserColor(List<DiffuserColor> diffusercolor) {
		return windowsDaoInterface.saveDiffuserColor(diffusercolor);
	};

	@Transactional
	@Override
	public DiffuserColor updateDiffuserColor(DiffuserColor diffusercolor) {
		return windowsDaoInterface.updateDiffuserColor(diffusercolor);
	};

	@Transactional
	@Override
	public List<DiffuserColor> updateDiffuserColor(List<DiffuserColor> diffusercolor) {
		return windowsDaoInterface.updateDiffuserColor(diffusercolor);
	};

	@Transactional
	@Override
	public DiffuserColor delSingleDiffuserColor(long id) {
		return windowsDaoInterface.delSingleDiffuserColor(id);
	}

	@Transactional
	@Override
	public List<DiffuserColor> delDiffuserColor(List<DiffuserColor> diffusercolor) {
		return windowsDaoInterface.delDiffuserColor(diffusercolor);
	};

	@Transactional
	@Override
	public List<DoorHandleColor> getListDoorHandleColor() {
		return windowsDaoInterface.getListDoorHandleColor();
	};

	@Transactional
	@Override
	public DoorHandleColor getSingleDoorHandleColor(long id) {
		return windowsDaoInterface.getSingleDoorHandleColor(id);
	};

	@Transactional
	@Override
	public DoorHandleColor saveDoorHandleColor(DoorHandleColor doorhandlecolor) {
		return windowsDaoInterface.saveDoorHandleColor(doorhandlecolor);
	};

	@Transactional
	@Override
	public List<DoorHandleColor> saveDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		return windowsDaoInterface.saveDoorHandleColor(doorhandlecolor);
	};

	@Transactional
	@Override
	public DoorHandleColor updateDoorHandleColor(DoorHandleColor doorhandlecolor) {
		return windowsDaoInterface.updateDoorHandleColor(doorhandlecolor);
	};

	@Transactional
	@Override
	public List<DoorHandleColor> updateDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		return windowsDaoInterface.updateDoorHandleColor(doorhandlecolor);
	};

	@Transactional
	@Override
	public DoorHandleColor delSingleDoorHandleColor(long id) {
		return windowsDaoInterface.delSingleDoorHandleColor(id);
	}

	@Transactional
	@Override
	public List<DoorHandleColor> delDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		return windowsDaoInterface.delDoorHandleColor(doorhandlecolor);
	};

	@Transactional
	@Override
	public List<Extension> getListExtension() {
		return windowsDaoInterface.getListExtension();
	};

	@Transactional
	@Override
	public Extension getSingleExtension(long id) {
		return windowsDaoInterface.getSingleExtension(id);
	};

	@Transactional
	@Override
	public Extension saveExtension(Extension extension) {
		return windowsDaoInterface.saveExtension(extension);
	};

	@Transactional
	@Override
	public List<Extension> saveExtension(List<Extension> extension) {
		return windowsDaoInterface.saveExtension(extension);
	};

	@Transactional
	@Override
	public Extension updateExtension(Extension extension) {
		return windowsDaoInterface.updateExtension(extension);
	};

	@Transactional
	@Override
	public List<Extension> updateExtension(List<Extension> extension) {
		return windowsDaoInterface.updateExtension(extension);
	};

	@Transactional
	@Override
	public Extension delSingleExtension(long id) {
		return windowsDaoInterface.delSingleExtension(id);
	}

	@Transactional
	@Override
	public List<Extension> delExtension(List<Extension> extension) {
		return windowsDaoInterface.delExtension(extension);
	};

	@Transactional
	@Override
	public List<ExtensionAvailableColours> getListExtensionAvailableColours() {
		return windowsDaoInterface.getListExtensionAvailableColours();
	};

	@Transactional
	@Override
	public ExtensionAvailableColours getSingleExtensionAvailableColours(long id) {
		return windowsDaoInterface.getSingleExtensionAvailableColours(id);
	};

	@Transactional
	@Override
	public ExtensionAvailableColours saveExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		return windowsDaoInterface.saveExtensionAvailableColours(extensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ExtensionAvailableColours> saveExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		return windowsDaoInterface.saveExtensionAvailableColours(extensionavailablecolours);
	};

	@Transactional
	@Override
	public ExtensionAvailableColours updateExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		return windowsDaoInterface.updateExtensionAvailableColours(extensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ExtensionAvailableColours> updateExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		return windowsDaoInterface.updateExtensionAvailableColours(extensionavailablecolours);
	};

	@Transactional
	@Override
	public ExtensionAvailableColours delSingleExtensionAvailableColours(long id) {
		return windowsDaoInterface.delSingleExtensionAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ExtensionAvailableColours> delExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		return windowsDaoInterface.delExtensionAvailableColours(extensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ExternalColor> getListExternalColor() {
		return windowsDaoInterface.getListExternalColor();
	};

	@Transactional
	@Override
	public ExternalColor getSingleExternalColor(long id) {
		return windowsDaoInterface.getSingleExternalColor(id);
	};

	@Transactional
	@Override
	public ExternalColor saveExternalColor(ExternalColor externalcolor) {
		return windowsDaoInterface.saveExternalColor(externalcolor);
	};

	@Transactional
	@Override
	public List<ExternalColor> saveExternalColor(List<ExternalColor> externalcolor) {
		return windowsDaoInterface.saveExternalColor(externalcolor);
	};

	@Transactional
	@Override
	public ExternalColor updateExternalColor(ExternalColor externalcolor) {
		return windowsDaoInterface.updateExternalColor(externalcolor);
	};

	@Transactional
	@Override
	public List<ExternalColor> updateExternalColor(List<ExternalColor> externalcolor) {
		return windowsDaoInterface.updateExternalColor(externalcolor);
	};

	@Transactional
	@Override
	public ExternalColor delSingleExternalColor(long id) {
		return windowsDaoInterface.delSingleExternalColor(id);
	}

	@Transactional
	@Override
	public List<ExternalColor> delExternalColor(List<ExternalColor> externalcolor) {
		return windowsDaoInterface.delExternalColor(externalcolor);
	};

	@Transactional
	@Override
	public List<Fittings> getListFittings() {
		return windowsDaoInterface.getListFittings();
	};

	@Transactional
	@Override
	public Fittings getSingleFittings(long id) {
		return windowsDaoInterface.getSingleFittings(id);
	};

	@Transactional
	@Override
	public Fittings saveFittings(Fittings fittings) {
		return windowsDaoInterface.saveFittings(fittings);
	};

	@Transactional
	@Override
	public List<Fittings> saveFittings(List<Fittings> fittings) {
		return windowsDaoInterface.saveFittings(fittings);
	};

	@Transactional
	@Override
	public Fittings updateFittings(Fittings fittings) {
		return windowsDaoInterface.updateFittings(fittings);
	};

	@Transactional
	@Override
	public List<Fittings> updateFittings(List<Fittings> fittings) {
		return windowsDaoInterface.updateFittings(fittings);
	};

	@Transactional
	@Override
	public Fittings delSingleFittings(long id) {
		return windowsDaoInterface.delSingleFittings(id);
	}

	@Transactional
	@Override
	public List<Fittings> delFittings(List<Fittings> fittings) {
		return windowsDaoInterface.delFittings(fittings);
	};

	@Transactional
	@Override
	public List<FittingsAvailableColours> getListFittingsAvailableColours() {
		return windowsDaoInterface.getListFittingsAvailableColours();
	};

	@Transactional
	@Override
	public FittingsAvailableColours getSingleFittingsAvailableColours(long id) {
		return windowsDaoInterface.getSingleFittingsAvailableColours(id);
	};

	@Transactional
	@Override
	public FittingsAvailableColours saveFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		return windowsDaoInterface.saveFittingsAvailableColours(fittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<FittingsAvailableColours> saveFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		return windowsDaoInterface.saveFittingsAvailableColours(fittingsavailablecolours);
	};

	@Transactional
	@Override
	public FittingsAvailableColours updateFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		return windowsDaoInterface.updateFittingsAvailableColours(fittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<FittingsAvailableColours> updateFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		return windowsDaoInterface.updateFittingsAvailableColours(fittingsavailablecolours);
	};

	@Transactional
	@Override
	public FittingsAvailableColours delSingleFittingsAvailableColours(long id) {
		return windowsDaoInterface.delSingleFittingsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<FittingsAvailableColours> delFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		return windowsDaoInterface.delFittingsAvailableColours(fittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<FrameColor> getListFrameColor() {
		return windowsDaoInterface.getListFrameColor();
	};

	@Transactional
	@Override
	public FrameColor getSingleFrameColor(long id) {
		return windowsDaoInterface.getSingleFrameColor(id);
	};

	@Transactional
	@Override
	public FrameColor saveFrameColor(FrameColor framecolor) {
		return windowsDaoInterface.saveFrameColor(framecolor);
	};

	@Transactional
	@Override
	public List<FrameColor> saveFrameColor(List<FrameColor> framecolor) {
		return windowsDaoInterface.saveFrameColor(framecolor);
	};

	@Transactional
	@Override
	public FrameColor updateFrameColor(FrameColor framecolor) {
		return windowsDaoInterface.updateFrameColor(framecolor);
	};

	@Transactional
	@Override
	public List<FrameColor> updateFrameColor(List<FrameColor> framecolor) {
		return windowsDaoInterface.updateFrameColor(framecolor);
	};

	@Transactional
	@Override
	public FrameColor delSingleFrameColor(long id) {
		return windowsDaoInterface.delSingleFrameColor(id);
	}

	@Transactional
	@Override
	public List<FrameColor> delFrameColor(List<FrameColor> framecolor) {
		return windowsDaoInterface.delFrameColor(framecolor);
	};

	@Transactional
	@Override
	public List<Fulfillment> getListFulfillment() {
		return windowsDaoInterface.getListFulfillment();
	};

	@Transactional
	@Override
	public Fulfillment getSingleFulfillment(long id) {
		return windowsDaoInterface.getSingleFulfillment(id);
	};

	@Transactional
	@Override
	public Fulfillment saveFulfillment(Fulfillment fulfillment) {
		return windowsDaoInterface.saveFulfillment(fulfillment);
	};

	@Transactional
	@Override
	public List<Fulfillment> saveFulfillment(List<Fulfillment> fulfillment) {
		return windowsDaoInterface.saveFulfillment(fulfillment);
	};

	@Transactional
	@Override
	public Fulfillment updateFulfillment(Fulfillment fulfillment) {
		return windowsDaoInterface.updateFulfillment(fulfillment);
	};

	@Transactional
	@Override
	public List<Fulfillment> updateFulfillment(List<Fulfillment> fulfillment) {
		return windowsDaoInterface.updateFulfillment(fulfillment);
	};

	@Transactional
	@Override
	public Fulfillment delSingleFulfillment(long id) {
		return windowsDaoInterface.delSingleFulfillment(id);
	}

	@Transactional
	@Override
	public List<Fulfillment> delFulfillment(List<Fulfillment> fulfillment) {
		return windowsDaoInterface.delFulfillment(fulfillment);
	};

	@Transactional
	@Override
	public List<FullfillmentAvailableColours> getListFullfillmentAvailableColours() {
		return windowsDaoInterface.getListFullfillmentAvailableColours();
	};

	@Transactional
	@Override
	public FullfillmentAvailableColours getSingleFullfillmentAvailableColours(long id) {
		return windowsDaoInterface.getSingleFullfillmentAvailableColours(id);
	};

	@Transactional
	@Override
	public FullfillmentAvailableColours saveFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		return windowsDaoInterface.saveFullfillmentAvailableColours(fullfillmentavailablecolours);
	};

	@Transactional
	@Override
	public List<FullfillmentAvailableColours> saveFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		return windowsDaoInterface.saveFullfillmentAvailableColours(fullfillmentavailablecolours);
	};

	@Transactional
	@Override
	public FullfillmentAvailableColours updateFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		return windowsDaoInterface.updateFullfillmentAvailableColours(fullfillmentavailablecolours);
	};

	@Transactional
	@Override
	public List<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		return windowsDaoInterface.updateFullfillmentAvailableColours(fullfillmentavailablecolours);
	};

	@Transactional
	@Override
	public FullfillmentAvailableColours delSingleFullfillmentAvailableColours(long id) {
		return windowsDaoInterface.delSingleFullfillmentAvailableColours(id);
	}

	@Transactional
	@Override
	public List<FullfillmentAvailableColours> delFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		return windowsDaoInterface.delFullfillmentAvailableColours(fullfillmentavailablecolours);
	};

	@Transactional
	@Override
	public List<GlazingBead> getListGlazingBead() {
		return windowsDaoInterface.getListGlazingBead();
	};

	@Transactional
	@Override
	public GlazingBead getSingleGlazingBead(long id) {
		return windowsDaoInterface.getSingleGlazingBead(id);
	};

	@Transactional
	@Override
	public GlazingBead saveGlazingBead(GlazingBead glazingbead) {
		return windowsDaoInterface.saveGlazingBead(glazingbead);
	};

	@Transactional
	@Override
	public List<GlazingBead> saveGlazingBead(List<GlazingBead> glazingbead) {
		return windowsDaoInterface.saveGlazingBead(glazingbead);
	};

	@Transactional
	@Override
	public GlazingBead updateGlazingBead(GlazingBead glazingbead) {
		return windowsDaoInterface.updateGlazingBead(glazingbead);
	};

	@Transactional
	@Override
	public List<GlazingBead> updateGlazingBead(List<GlazingBead> glazingbead) {
		return windowsDaoInterface.updateGlazingBead(glazingbead);
	};

	@Transactional
	@Override
	public GlazingBead delSingleGlazingBead(long id) {
		return windowsDaoInterface.delSingleGlazingBead(id);
	}

	@Transactional
	@Override
	public List<GlazingBead> delGlazingBead(List<GlazingBead> glazingbead) {
		return windowsDaoInterface.delGlazingBead(glazingbead);
	};

	@Transactional
	@Override
	public List<GlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours() {
		return windowsDaoInterface.getListGlazingBeadsAvailableColours();
	};

	@Transactional
	@Override
	public GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(long id) {
		return windowsDaoInterface.getSingleGlazingBeadsAvailableColours(id);
	};

	@Transactional
	@Override
	public GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		return windowsDaoInterface.saveGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<GlazingBeadsAvailableColours> saveGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		return windowsDaoInterface.saveGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		return windowsDaoInterface.updateGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		return windowsDaoInterface.updateGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(long id) {
		return windowsDaoInterface.delSingleGlazingBeadsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<GlazingBeadsAvailableColours> delGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		return windowsDaoInterface.delGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<Handle> getListHandle() {
		return windowsDaoInterface.getListHandle();
	};

	@Transactional
	@Override
	public Handle getSingleHandle(long id) {
		return windowsDaoInterface.getSingleHandle(id);
	};

	@Transactional
	@Override
	public Handle saveHandle(Handle handle) {
		return windowsDaoInterface.saveHandle(handle);
	};

	@Transactional
	@Override
	public List<Handle> saveHandle(List<Handle> handle) {
		return windowsDaoInterface.saveHandle(handle);
	};

	@Transactional
	@Override
	public Handle updateHandle(Handle handle) {
		return windowsDaoInterface.updateHandle(handle);
	};

	@Transactional
	@Override
	public List<Handle> updateHandle(List<Handle> handle) {
		return windowsDaoInterface.updateHandle(handle);
	};

	@Transactional
	@Override
	public Handle delSingleHandle(long id) {
		return windowsDaoInterface.delSingleHandle(id);
	}

	@Transactional
	@Override
	public List<Handle> delHandle(List<Handle> handle) {
		return windowsDaoInterface.delHandle(handle);
	};

	@Transactional
	@Override
	public List<HandlesAvailableColours> getListHandlesAvailableColours() {
		return windowsDaoInterface.getListHandlesAvailableColours();
	};

	@Transactional
	@Override
	public HandlesAvailableColours getSingleHandlesAvailableColours(long id) {
		return windowsDaoInterface.getSingleHandlesAvailableColours(id);
	};

	@Transactional
	@Override
	public HandlesAvailableColours saveHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		return windowsDaoInterface.saveHandlesAvailableColours(handlesavailablecolours);
	};

	@Transactional
	@Override
	public List<HandlesAvailableColours> saveHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		return windowsDaoInterface.saveHandlesAvailableColours(handlesavailablecolours);
	};

	@Transactional
	@Override
	public HandlesAvailableColours updateHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		return windowsDaoInterface.updateHandlesAvailableColours(handlesavailablecolours);
	};

	@Transactional
	@Override
	public List<HandlesAvailableColours> updateHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		return windowsDaoInterface.updateHandlesAvailableColours(handlesavailablecolours);
	};

	@Transactional
	@Override
	public HandlesAvailableColours delSingleHandlesAvailableColours(long id) {
		return windowsDaoInterface.delSingleHandlesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<HandlesAvailableColours> delHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		return windowsDaoInterface.delHandlesAvailableColours(handlesavailablecolours);
	};

	@Transactional
	@Override
	public List<InternalColor> getListInternalColor() {
		return windowsDaoInterface.getListInternalColor();
	};

	@Transactional
	@Override
	public InternalColor getSingleInternalColor(long id) {
		return windowsDaoInterface.getSingleInternalColor(id);
	};

	@Transactional
	@Override
	public InternalColor saveInternalColor(InternalColor internalcolor) {
		return windowsDaoInterface.saveInternalColor(internalcolor);
	};

	@Transactional
	@Override
	public List<InternalColor> saveInternalColor(List<InternalColor> internalcolor) {
		return windowsDaoInterface.saveInternalColor(internalcolor);
	};

	@Transactional
	@Override
	public InternalColor updateInternalColor(InternalColor internalcolor) {
		return windowsDaoInterface.updateInternalColor(internalcolor);
	};

	@Transactional
	@Override
	public List<InternalColor> updateInternalColor(List<InternalColor> internalcolor) {
		return windowsDaoInterface.updateInternalColor(internalcolor);
	};

	@Transactional
	@Override
	public InternalColor delSingleInternalColor(long id) {
		return windowsDaoInterface.delSingleInternalColor(id);
	}

	@Transactional
	@Override
	public List<InternalColor> delInternalColor(List<InternalColor> internalcolor) {
		return windowsDaoInterface.delInternalColor(internalcolor);
	};

	@Transactional
	@Override
	public List<InterPaneFrame> getListInterPaneFrame() {
		return windowsDaoInterface.getListInterPaneFrame();
	};

	@Transactional
	@Override
	public InterPaneFrame getSingleInterPaneFrame(long id) {
		return windowsDaoInterface.getSingleInterPaneFrame(id);
	};

	@Transactional
	@Override
	public InterPaneFrame saveInterPaneFrame(InterPaneFrame interpaneframe) {
		return windowsDaoInterface.saveInterPaneFrame(interpaneframe);
	};

	@Transactional
	@Override
	public List<InterPaneFrame> saveInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		return windowsDaoInterface.saveInterPaneFrame(interpaneframe);
	};

	@Transactional
	@Override
	public InterPaneFrame updateInterPaneFrame(InterPaneFrame interpaneframe) {
		return windowsDaoInterface.updateInterPaneFrame(interpaneframe);
	};

	@Transactional
	@Override
	public List<InterPaneFrame> updateInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		return windowsDaoInterface.updateInterPaneFrame(interpaneframe);
	};

	@Transactional
	@Override
	public InterPaneFrame delSingleInterPaneFrame(long id) {
		return windowsDaoInterface.delSingleInterPaneFrame(id);
	}

	@Transactional
	@Override
	public List<InterPaneFrame> delInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		return windowsDaoInterface.delInterPaneFrame(interpaneframe);
	};

	@Transactional
	@Override
	public List<InterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours() {
		return windowsDaoInterface.getListInterPaneFramesAvailableColours();
	};

	@Transactional
	@Override
	public InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(long id) {
		return windowsDaoInterface.getSingleInterPaneFramesAvailableColours(id);
	};

	@Transactional
	@Override
	public InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		return windowsDaoInterface.saveInterPaneFramesAvailableColours(interpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<InterPaneFramesAvailableColours> saveInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		return windowsDaoInterface.saveInterPaneFramesAvailableColours(interpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		return windowsDaoInterface.updateInterPaneFramesAvailableColours(interpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		return windowsDaoInterface.updateInterPaneFramesAvailableColours(interpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(long id) {
		return windowsDaoInterface.delSingleInterPaneFramesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<InterPaneFramesAvailableColours> delInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		return windowsDaoInterface.delInterPaneFramesAvailableColours(interpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListBalconyLatch> getListListBalconyLatch() {
		return windowsDaoInterface.getListListBalconyLatch();
	};

	@Transactional
	@Override
	public ListBalconyLatch getSingleListBalconyLatch(long id) {
		return windowsDaoInterface.getSingleListBalconyLatch(id);
	};

	@Transactional
	@Override
	public ListBalconyLatch saveListBalconyLatch(ListBalconyLatch listbalconylatch) {
		return windowsDaoInterface.saveListBalconyLatch(listbalconylatch);
	};

	@Transactional
	@Override
	public List<ListBalconyLatch> saveListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		return windowsDaoInterface.saveListBalconyLatch(listbalconylatch);
	};

	@Transactional
	@Override
	public ListBalconyLatch updateListBalconyLatch(ListBalconyLatch listbalconylatch) {
		return windowsDaoInterface.updateListBalconyLatch(listbalconylatch);
	};

	@Transactional
	@Override
	public List<ListBalconyLatch> updateListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		return windowsDaoInterface.updateListBalconyLatch(listbalconylatch);
	};

	@Transactional
	@Override
	public ListBalconyLatch delSingleListBalconyLatch(long id) {
		return windowsDaoInterface.delSingleListBalconyLatch(id);
	}

	@Transactional
	@Override
	public List<ListBalconyLatch> delListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		return windowsDaoInterface.delListBalconyLatch(listbalconylatch);
	};

	@Transactional
	@Override
	public List<ListBalconyLatchAvailableColours> getListListBalconyLatchAvailableColours() {
		return windowsDaoInterface.getListListBalconyLatchAvailableColours();
	};

	@Transactional
	@Override
	public ListBalconyLatchAvailableColours getSingleListBalconyLatchAvailableColours(long id) {
		return windowsDaoInterface.getSingleListBalconyLatchAvailableColours(id);
	};

	@Transactional
	@Override
	public ListBalconyLatchAvailableColours saveListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours) {
		return windowsDaoInterface.saveListBalconyLatchAvailableColours(listbalconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<ListBalconyLatchAvailableColours> saveListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		return windowsDaoInterface.saveListBalconyLatchAvailableColours(listbalconylatchavailablecolours);
	};

	@Transactional
	@Override
	public ListBalconyLatchAvailableColours updateListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours) {
		return windowsDaoInterface.updateListBalconyLatchAvailableColours(listbalconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<ListBalconyLatchAvailableColours> updateListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		return windowsDaoInterface.updateListBalconyLatchAvailableColours(listbalconylatchavailablecolours);
	};

	@Transactional
	@Override
	public ListBalconyLatchAvailableColours delSingleListBalconyLatchAvailableColours(long id) {
		return windowsDaoInterface.delSingleListBalconyLatchAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListBalconyLatchAvailableColours> delListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		return windowsDaoInterface.delListBalconyLatchAvailableColours(listbalconylatchavailablecolours);
	};

	@Transactional
	@Override
	public List<ListClient> getListListClient() {
		return windowsDaoInterface.getListListClient();
	};

	@Transactional
	@Override
	public ListClient getSingleListClient(long id) {
		return windowsDaoInterface.getSingleListClient(id);
	};

	@Transactional
	@Override
	public ListClient saveListClient(ListClient listclient) {
		return windowsDaoInterface.saveListClient(listclient);
	};

	@Transactional
	@Override
	public List<ListClient> saveListClient(List<ListClient> listclient) {
		return windowsDaoInterface.saveListClient(listclient);
	};

	@Transactional
	@Override
	public ListClient updateListClient(ListClient listclient) {
		return windowsDaoInterface.updateListClient(listclient);
	};

	@Transactional
	@Override
	public List<ListClient> updateListClient(List<ListClient> listclient) {
		return windowsDaoInterface.updateListClient(listclient);
	};

	@Transactional
	@Override
	public ListClient delSingleListClient(long id) {
		return windowsDaoInterface.delSingleListClient(id);
	}

	@Transactional
	@Override
	public List<ListClient> delListClient(List<ListClient> listclient) {
		return windowsDaoInterface.delListClient(listclient);
	};

	@Transactional
	@Override
	public List<ListColorOfCasings> getListListColorOfCasings() {
		return windowsDaoInterface.getListListColorOfCasings();
	};

	@Transactional
	@Override
	public ListColorOfCasings getSingleListColorOfCasings(long id) {
		return windowsDaoInterface.getSingleListColorOfCasings(id);
	};

	@Transactional
	@Override
	public ListColorOfCasings saveListColorOfCasings(ListColorOfCasings listcolorofcasings) {
		return windowsDaoInterface.saveListColorOfCasings(listcolorofcasings);
	};

	@Transactional
	@Override
	public List<ListColorOfCasings> saveListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		return windowsDaoInterface.saveListColorOfCasings(listcolorofcasings);
	};

	@Transactional
	@Override
	public ListColorOfCasings updateListColorOfCasings(ListColorOfCasings listcolorofcasings) {
		return windowsDaoInterface.updateListColorOfCasings(listcolorofcasings);
	};

	@Transactional
	@Override
	public List<ListColorOfCasings> updateListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		return windowsDaoInterface.updateListColorOfCasings(listcolorofcasings);
	};

	@Transactional
	@Override
	public ListColorOfCasings delSingleListColorOfCasings(long id) {
		return windowsDaoInterface.delSingleListColorOfCasings(id);
	}

	@Transactional
	@Override
	public List<ListColorOfCasings> delListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		return windowsDaoInterface.delListColorOfCasings(listcolorofcasings);
	};

	@Transactional
	@Override
	public List<ListColorOfCasingsAvailableColours> getListListColorOfCasingsAvailableColours() {
		return windowsDaoInterface.getListListColorOfCasingsAvailableColours();
	};

	@Transactional
	@Override
	public ListColorOfCasingsAvailableColours getSingleListColorOfCasingsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListColorOfCasingsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListColorOfCasingsAvailableColours saveListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours) {
		return windowsDaoInterface.saveListColorOfCasingsAvailableColours(listcolorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListColorOfCasingsAvailableColours> saveListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		return windowsDaoInterface.saveListColorOfCasingsAvailableColours(listcolorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public ListColorOfCasingsAvailableColours updateListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours) {
		return windowsDaoInterface.updateListColorOfCasingsAvailableColours(listcolorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListColorOfCasingsAvailableColours> updateListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		return windowsDaoInterface.updateListColorOfCasingsAvailableColours(listcolorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public ListColorOfCasingsAvailableColours delSingleListColorOfCasingsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListColorOfCasingsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListColorOfCasingsAvailableColours> delListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		return windowsDaoInterface.delListColorOfCasingsAvailableColours(listcolorofcasingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfile> getListListCrossbarProfile() {
		return windowsDaoInterface.getListListCrossbarProfile();
	};

	@Transactional
	@Override
	public ListCrossbarProfile getSingleListCrossbarProfile(long id) {
		return windowsDaoInterface.getSingleListCrossbarProfile(id);
	};

	@Transactional
	@Override
	public ListCrossbarProfile saveListCrossbarProfile(ListCrossbarProfile listcrossbarprofile) {
		return windowsDaoInterface.saveListCrossbarProfile(listcrossbarprofile);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfile> saveListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		return windowsDaoInterface.saveListCrossbarProfile(listcrossbarprofile);
	};

	@Transactional
	@Override
	public ListCrossbarProfile updateListCrossbarProfile(ListCrossbarProfile listcrossbarprofile) {
		return windowsDaoInterface.updateListCrossbarProfile(listcrossbarprofile);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfile> updateListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		return windowsDaoInterface.updateListCrossbarProfile(listcrossbarprofile);
	};

	@Transactional
	@Override
	public ListCrossbarProfile delSingleListCrossbarProfile(long id) {
		return windowsDaoInterface.delSingleListCrossbarProfile(id);
	}

	@Transactional
	@Override
	public List<ListCrossbarProfile> delListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		return windowsDaoInterface.delListCrossbarProfile(listcrossbarprofile);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfileAvailableColours> getListListCrossbarProfileAvailableColours() {
		return windowsDaoInterface.getListListCrossbarProfileAvailableColours();
	};

	@Transactional
	@Override
	public ListCrossbarProfileAvailableColours getSingleListCrossbarProfileAvailableColours(long id) {
		return windowsDaoInterface.getSingleListCrossbarProfileAvailableColours(id);
	};

	@Transactional
	@Override
	public ListCrossbarProfileAvailableColours saveListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours) {
		return windowsDaoInterface.saveListCrossbarProfileAvailableColours(listcrossbarprofileavailablecolours);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfileAvailableColours> saveListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		return windowsDaoInterface.saveListCrossbarProfileAvailableColours(listcrossbarprofileavailablecolours);
	};

	@Transactional
	@Override
	public ListCrossbarProfileAvailableColours updateListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours) {
		return windowsDaoInterface.updateListCrossbarProfileAvailableColours(listcrossbarprofileavailablecolours);
	};

	@Transactional
	@Override
	public List<ListCrossbarProfileAvailableColours> updateListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		return windowsDaoInterface.updateListCrossbarProfileAvailableColours(listcrossbarprofileavailablecolours);
	};

	@Transactional
	@Override
	public ListCrossbarProfileAvailableColours delSingleListCrossbarProfileAvailableColours(long id) {
		return windowsDaoInterface.delSingleListCrossbarProfileAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListCrossbarProfileAvailableColours> delListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		return windowsDaoInterface.delListCrossbarProfileAvailableColours(listcrossbarprofileavailablecolours);
	};

	@Transactional
	@Override
	public List<ListDiffuserColor> getListListDiffuserColor() {
		return windowsDaoInterface.getListListDiffuserColor();
	};

	@Transactional
	@Override
	public ListDiffuserColor getSingleListDiffuserColor(long id) {
		return windowsDaoInterface.getSingleListDiffuserColor(id);
	};

	@Transactional
	@Override
	public ListDiffuserColor saveListDiffuserColor(ListDiffuserColor listdiffusercolor) {
		return windowsDaoInterface.saveListDiffuserColor(listdiffusercolor);
	};

	@Transactional
	@Override
	public List<ListDiffuserColor> saveListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		return windowsDaoInterface.saveListDiffuserColor(listdiffusercolor);
	};

	@Transactional
	@Override
	public ListDiffuserColor updateListDiffuserColor(ListDiffuserColor listdiffusercolor) {
		return windowsDaoInterface.updateListDiffuserColor(listdiffusercolor);
	};

	@Transactional
	@Override
	public List<ListDiffuserColor> updateListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		return windowsDaoInterface.updateListDiffuserColor(listdiffusercolor);
	};

	@Transactional
	@Override
	public ListDiffuserColor delSingleListDiffuserColor(long id) {
		return windowsDaoInterface.delSingleListDiffuserColor(id);
	}

	@Transactional
	@Override
	public List<ListDiffuserColor> delListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		return windowsDaoInterface.delListDiffuserColor(listdiffusercolor);
	};

	@Transactional
	@Override
	public List<ListDoorHandleColor> getListListDoorHandleColor() {
		return windowsDaoInterface.getListListDoorHandleColor();
	};

	@Transactional
	@Override
	public ListDoorHandleColor getSingleListDoorHandleColor(long id) {
		return windowsDaoInterface.getSingleListDoorHandleColor(id);
	};

	@Transactional
	@Override
	public ListDoorHandleColor saveListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor) {
		return windowsDaoInterface.saveListDoorHandleColor(listdoorhandlecolor);
	};

	@Transactional
	@Override
	public List<ListDoorHandleColor> saveListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		return windowsDaoInterface.saveListDoorHandleColor(listdoorhandlecolor);
	};

	@Transactional
	@Override
	public ListDoorHandleColor updateListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor) {
		return windowsDaoInterface.updateListDoorHandleColor(listdoorhandlecolor);
	};

	@Transactional
	@Override
	public List<ListDoorHandleColor> updateListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		return windowsDaoInterface.updateListDoorHandleColor(listdoorhandlecolor);
	};

	@Transactional
	@Override
	public ListDoorHandleColor delSingleListDoorHandleColor(long id) {
		return windowsDaoInterface.delSingleListDoorHandleColor(id);
	}

	@Transactional
	@Override
	public List<ListDoorHandleColor> delListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		return windowsDaoInterface.delListDoorHandleColor(listdoorhandlecolor);
	};

	@Transactional
	@Override
	public List<ListExtension> getListListExtension() {
		return windowsDaoInterface.getListListExtension();
	};

	@Transactional
	@Override
	public ListExtension getSingleListExtension(long id) {
		return windowsDaoInterface.getSingleListExtension(id);
	};

	@Transactional
	@Override
	public ListExtension saveListExtension(ListExtension listextension) {
		return windowsDaoInterface.saveListExtension(listextension);
	};

	@Transactional
	@Override
	public List<ListExtension> saveListExtension(List<ListExtension> listextension) {
		return windowsDaoInterface.saveListExtension(listextension);
	};

	@Transactional
	@Override
	public ListExtension updateListExtension(ListExtension listextension) {
		return windowsDaoInterface.updateListExtension(listextension);
	};

	@Transactional
	@Override
	public List<ListExtension> updateListExtension(List<ListExtension> listextension) {
		return windowsDaoInterface.updateListExtension(listextension);
	};

	@Transactional
	@Override
	public ListExtension delSingleListExtension(long id) {
		return windowsDaoInterface.delSingleListExtension(id);
	}

	@Transactional
	@Override
	public List<ListExtension> delListExtension(List<ListExtension> listextension) {
		return windowsDaoInterface.delListExtension(listextension);
	};

	@Transactional
	@Override
	public List<ListExtensionAvailableColours> getListListExtensionAvailableColours() {
		return windowsDaoInterface.getListListExtensionAvailableColours();
	};

	@Transactional
	@Override
	public ListExtensionAvailableColours getSingleListExtensionAvailableColours(long id) {
		return windowsDaoInterface.getSingleListExtensionAvailableColours(id);
	};

	@Transactional
	@Override
	public ListExtensionAvailableColours saveListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours) {
		return windowsDaoInterface.saveListExtensionAvailableColours(listextensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ListExtensionAvailableColours> saveListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		return windowsDaoInterface.saveListExtensionAvailableColours(listextensionavailablecolours);
	};

	@Transactional
	@Override
	public ListExtensionAvailableColours updateListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours) {
		return windowsDaoInterface.updateListExtensionAvailableColours(listextensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ListExtensionAvailableColours> updateListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		return windowsDaoInterface.updateListExtensionAvailableColours(listextensionavailablecolours);
	};

	@Transactional
	@Override
	public ListExtensionAvailableColours delSingleListExtensionAvailableColours(long id) {
		return windowsDaoInterface.delSingleListExtensionAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListExtensionAvailableColours> delListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		return windowsDaoInterface.delListExtensionAvailableColours(listextensionavailablecolours);
	};

	@Transactional
	@Override
	public List<ListExternalColor> getListListExternalColor() {
		return windowsDaoInterface.getListListExternalColor();
	};

	@Transactional
	@Override
	public ListExternalColor getSingleListExternalColor(long id) {
		return windowsDaoInterface.getSingleListExternalColor(id);
	};

	@Transactional
	@Override
	public ListExternalColor saveListExternalColor(ListExternalColor listexternalcolor) {
		return windowsDaoInterface.saveListExternalColor(listexternalcolor);
	};

	@Transactional
	@Override
	public List<ListExternalColor> saveListExternalColor(List<ListExternalColor> listexternalcolor) {
		return windowsDaoInterface.saveListExternalColor(listexternalcolor);
	};

	@Transactional
	@Override
	public ListExternalColor updateListExternalColor(ListExternalColor listexternalcolor) {
		return windowsDaoInterface.updateListExternalColor(listexternalcolor);
	};

	@Transactional
	@Override
	public List<ListExternalColor> updateListExternalColor(List<ListExternalColor> listexternalcolor) {
		return windowsDaoInterface.updateListExternalColor(listexternalcolor);
	};

	@Transactional
	@Override
	public ListExternalColor delSingleListExternalColor(long id) {
		return windowsDaoInterface.delSingleListExternalColor(id);
	}

	@Transactional
	@Override
	public List<ListExternalColor> delListExternalColor(List<ListExternalColor> listexternalcolor) {
		return windowsDaoInterface.delListExternalColor(listexternalcolor);
	};

	@Transactional
	@Override
	public List<ListFittings> getListListFittings() {
		return windowsDaoInterface.getListListFittings();
	};

	@Transactional
	@Override
	public ListFittings getSingleListFittings(long id) {
		return windowsDaoInterface.getSingleListFittings(id);
	};

	@Transactional
	@Override
	public ListFittings saveListFittings(ListFittings listfittings) {
		return windowsDaoInterface.saveListFittings(listfittings);
	};

	@Transactional
	@Override
	public List<ListFittings> saveListFittings(List<ListFittings> listfittings) {
		return windowsDaoInterface.saveListFittings(listfittings);
	};

	@Transactional
	@Override
	public ListFittings updateListFittings(ListFittings listfittings) {
		return windowsDaoInterface.updateListFittings(listfittings);
	};

	@Transactional
	@Override
	public List<ListFittings> updateListFittings(List<ListFittings> listfittings) {
		return windowsDaoInterface.updateListFittings(listfittings);
	};

	@Transactional
	@Override
	public ListFittings delSingleListFittings(long id) {
		return windowsDaoInterface.delSingleListFittings(id);
	}

	@Transactional
	@Override
	public List<ListFittings> delListFittings(List<ListFittings> listfittings) {
		return windowsDaoInterface.delListFittings(listfittings);
	};

	@Transactional
	@Override
	public List<ListFittingsAvailableColours> getListListFittingsAvailableColours() {
		return windowsDaoInterface.getListListFittingsAvailableColours();
	};

	@Transactional
	@Override
	public ListFittingsAvailableColours getSingleListFittingsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListFittingsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListFittingsAvailableColours saveListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours) {
		return windowsDaoInterface.saveListFittingsAvailableColours(listfittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListFittingsAvailableColours> saveListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		return windowsDaoInterface.saveListFittingsAvailableColours(listfittingsavailablecolours);
	};

	@Transactional
	@Override
	public ListFittingsAvailableColours updateListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours) {
		return windowsDaoInterface.updateListFittingsAvailableColours(listfittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListFittingsAvailableColours> updateListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		return windowsDaoInterface.updateListFittingsAvailableColours(listfittingsavailablecolours);
	};

	@Transactional
	@Override
	public ListFittingsAvailableColours delSingleListFittingsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListFittingsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListFittingsAvailableColours> delListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		return windowsDaoInterface.delListFittingsAvailableColours(listfittingsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListFrameColors> getListListFrameColors() {
		return windowsDaoInterface.getListListFrameColors();
	};

	@Transactional
	@Override
	public ListFrameColors getSingleListFrameColors(long id) {
		return windowsDaoInterface.getSingleListFrameColors(id);
	};

	@Transactional
	@Override
	public ListFrameColors saveListFrameColors(ListFrameColors listframecolors) {
		return windowsDaoInterface.saveListFrameColors(listframecolors);
	};

	@Transactional
	@Override
	public List<ListFrameColors> saveListFrameColors(List<ListFrameColors> listframecolors) {
		return windowsDaoInterface.saveListFrameColors(listframecolors);
	};

	@Transactional
	@Override
	public ListFrameColors updateListFrameColors(ListFrameColors listframecolors) {
		return windowsDaoInterface.updateListFrameColors(listframecolors);
	};

	@Transactional
	@Override
	public List<ListFrameColors> updateListFrameColors(List<ListFrameColors> listframecolors) {
		return windowsDaoInterface.updateListFrameColors(listframecolors);
	};

	@Transactional
	@Override
	public ListFrameColors delSingleListFrameColors(long id) {
		return windowsDaoInterface.delSingleListFrameColors(id);
	}

	@Transactional
	@Override
	public List<ListFrameColors> delListFrameColors(List<ListFrameColors> listframecolors) {
		return windowsDaoInterface.delListFrameColors(listframecolors);
	};

	@Transactional
	@Override
	public List<ListFullfillments> getListListFullfillments() {
		return windowsDaoInterface.getListListFullfillments();
	};

	@Transactional
	@Override
	public ListFullfillments getSingleListFullfillments(long id) {
		return windowsDaoInterface.getSingleListFullfillments(id);
	};

	@Transactional
	@Override
	public ListFullfillments saveListFullfillments(ListFullfillments listfullfillments) {
		return windowsDaoInterface.saveListFullfillments(listfullfillments);
	};

	@Transactional
	@Override
	public List<ListFullfillments> saveListFullfillments(List<ListFullfillments> listfullfillments) {
		return windowsDaoInterface.saveListFullfillments(listfullfillments);
	};

	@Transactional
	@Override
	public ListFullfillments updateListFullfillments(ListFullfillments listfullfillments) {
		return windowsDaoInterface.updateListFullfillments(listfullfillments);
	};

	@Transactional
	@Override
	public List<ListFullfillments> updateListFullfillments(List<ListFullfillments> listfullfillments) {
		return windowsDaoInterface.updateListFullfillments(listfullfillments);
	};

	@Transactional
	@Override
	public ListFullfillments delSingleListFullfillments(long id) {
		return windowsDaoInterface.delSingleListFullfillments(id);
	}

	@Transactional
	@Override
	public List<ListFullfillments> delListFullfillments(List<ListFullfillments> listfullfillments) {
		return windowsDaoInterface.delListFullfillments(listfullfillments);
	};

	@Transactional
	@Override
	public List<ListFullfillmentsAvailableColours> getListListFullfillmentsAvailableColours() {
		return windowsDaoInterface.getListListFullfillmentsAvailableColours();
	};

	@Transactional
	@Override
	public ListFullfillmentsAvailableColours getSingleListFullfillmentsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListFullfillmentsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListFullfillmentsAvailableColours saveListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours) {
		return windowsDaoInterface.saveListFullfillmentsAvailableColours(listfullfillmentsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListFullfillmentsAvailableColours> saveListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		return windowsDaoInterface.saveListFullfillmentsAvailableColours(listfullfillmentsavailablecolours);
	};

	@Transactional
	@Override
	public ListFullfillmentsAvailableColours updateListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours) {
		return windowsDaoInterface.updateListFullfillmentsAvailableColours(listfullfillmentsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListFullfillmentsAvailableColours> updateListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		return windowsDaoInterface.updateListFullfillmentsAvailableColours(listfullfillmentsavailablecolours);
	};

	@Transactional
	@Override
	public ListFullfillmentsAvailableColours delSingleListFullfillmentsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListFullfillmentsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListFullfillmentsAvailableColours> delListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		return windowsDaoInterface.delListFullfillmentsAvailableColours(listfullfillmentsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListGlazingBeads> getListListGlazingBeads() {
		return windowsDaoInterface.getListListGlazingBeads();
	};

	@Transactional
	@Override
	public ListGlazingBeads getSingleListGlazingBeads(long id) {
		return windowsDaoInterface.getSingleListGlazingBeads(id);
	};

	@Transactional
	@Override
	public ListGlazingBeads saveListGlazingBeads(ListGlazingBeads listglazingbeads) {
		return windowsDaoInterface.saveListGlazingBeads(listglazingbeads);
	};

	@Transactional
	@Override
	public List<ListGlazingBeads> saveListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		return windowsDaoInterface.saveListGlazingBeads(listglazingbeads);
	};

	@Transactional
	@Override
	public ListGlazingBeads updateListGlazingBeads(ListGlazingBeads listglazingbeads) {
		return windowsDaoInterface.updateListGlazingBeads(listglazingbeads);
	};

	@Transactional
	@Override
	public List<ListGlazingBeads> updateListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		return windowsDaoInterface.updateListGlazingBeads(listglazingbeads);
	};

	@Transactional
	@Override
	public ListGlazingBeads delSingleListGlazingBeads(long id) {
		return windowsDaoInterface.delSingleListGlazingBeads(id);
	}

	@Transactional
	@Override
	public List<ListGlazingBeads> delListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		return windowsDaoInterface.delListGlazingBeads(listglazingbeads);
	};

	@Transactional
	@Override
	public List<ListGlazingBeadsAvailableColours> getListListGlazingBeadsAvailableColours() {
		return windowsDaoInterface.getListListGlazingBeadsAvailableColours();
	};

	@Transactional
	@Override
	public ListGlazingBeadsAvailableColours getSingleListGlazingBeadsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListGlazingBeadsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListGlazingBeadsAvailableColours saveListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours) {
		return windowsDaoInterface.saveListGlazingBeadsAvailableColours(listglazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListGlazingBeadsAvailableColours> saveListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		return windowsDaoInterface.saveListGlazingBeadsAvailableColours(listglazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public ListGlazingBeadsAvailableColours updateListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours) {
		return windowsDaoInterface.updateListGlazingBeadsAvailableColours(listglazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListGlazingBeadsAvailableColours> updateListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		return windowsDaoInterface.updateListGlazingBeadsAvailableColours(listglazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public ListGlazingBeadsAvailableColours delSingleListGlazingBeadsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListGlazingBeadsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListGlazingBeadsAvailableColours> delListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		return windowsDaoInterface.delListGlazingBeadsAvailableColours(listglazingbeadsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListHandles> getListListHandles() {
		return windowsDaoInterface.getListListHandles();
	};

	@Transactional
	@Override
	public ListHandles getSingleListHandles(long id) {
		return windowsDaoInterface.getSingleListHandles(id);
	};

	@Transactional
	@Override
	public ListHandles saveListHandles(ListHandles listhandles) {
		return windowsDaoInterface.saveListHandles(listhandles);
	};

	@Transactional
	@Override
	public List<ListHandles> saveListHandles(List<ListHandles> listhandles) {
		return windowsDaoInterface.saveListHandles(listhandles);
	};

	@Transactional
	@Override
	public ListHandles updateListHandles(ListHandles listhandles) {
		return windowsDaoInterface.updateListHandles(listhandles);
	};

	@Transactional
	@Override
	public List<ListHandles> updateListHandles(List<ListHandles> listhandles) {
		return windowsDaoInterface.updateListHandles(listhandles);
	};

	@Transactional
	@Override
	public ListHandles delSingleListHandles(long id) {
		return windowsDaoInterface.delSingleListHandles(id);
	}

	@Transactional
	@Override
	public List<ListHandles> delListHandles(List<ListHandles> listhandles) {
		return windowsDaoInterface.delListHandles(listhandles);
	};

	@Transactional
	@Override
	public List<ListHandlesAvailableColours> getListListHandlesAvailableColours() {
		return windowsDaoInterface.getListListHandlesAvailableColours();
	};

	@Transactional
	@Override
	public ListHandlesAvailableColours getSingleListHandlesAvailableColours(long id) {
		return windowsDaoInterface.getSingleListHandlesAvailableColours(id);
	};

	@Transactional
	@Override
	public ListHandlesAvailableColours saveListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours) {
		return windowsDaoInterface.saveListHandlesAvailableColours(listhandlesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListHandlesAvailableColours> saveListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		return windowsDaoInterface.saveListHandlesAvailableColours(listhandlesavailablecolours);
	};

	@Transactional
	@Override
	public ListHandlesAvailableColours updateListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours) {
		return windowsDaoInterface.updateListHandlesAvailableColours(listhandlesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListHandlesAvailableColours> updateListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		return windowsDaoInterface.updateListHandlesAvailableColours(listhandlesavailablecolours);
	};

	@Transactional
	@Override
	public ListHandlesAvailableColours delSingleListHandlesAvailableColours(long id) {
		return windowsDaoInterface.delSingleListHandlesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListHandlesAvailableColours> delListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		return windowsDaoInterface.delListHandlesAvailableColours(listhandlesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListInternalColors> getListListInternalColors() {
		return windowsDaoInterface.getListListInternalColors();
	};

	@Transactional
	@Override
	public ListInternalColors getSingleListInternalColors(long id) {
		return windowsDaoInterface.getSingleListInternalColors(id);
	};

	@Transactional
	@Override
	public ListInternalColors saveListInternalColors(ListInternalColors listinternalcolors) {
		return windowsDaoInterface.saveListInternalColors(listinternalcolors);
	};

	@Transactional
	@Override
	public List<ListInternalColors> saveListInternalColors(List<ListInternalColors> listinternalcolors) {
		return windowsDaoInterface.saveListInternalColors(listinternalcolors);
	};

	@Transactional
	@Override
	public ListInternalColors updateListInternalColors(ListInternalColors listinternalcolors) {
		return windowsDaoInterface.updateListInternalColors(listinternalcolors);
	};

	@Transactional
	@Override
	public List<ListInternalColors> updateListInternalColors(List<ListInternalColors> listinternalcolors) {
		return windowsDaoInterface.updateListInternalColors(listinternalcolors);
	};

	@Transactional
	@Override
	public ListInternalColors delSingleListInternalColors(long id) {
		return windowsDaoInterface.delSingleListInternalColors(id);
	}

	@Transactional
	@Override
	public List<ListInternalColors> delListInternalColors(List<ListInternalColors> listinternalcolors) {
		return windowsDaoInterface.delListInternalColors(listinternalcolors);
	};

	@Transactional
	@Override
	public List<ListInterPaneFrames> getListListInterPaneFrames() {
		return windowsDaoInterface.getListListInterPaneFrames();
	};

	@Transactional
	@Override
	public ListInterPaneFrames getSingleListInterPaneFrames(long id) {
		return windowsDaoInterface.getSingleListInterPaneFrames(id);
	};

	@Transactional
	@Override
	public ListInterPaneFrames saveListInterPaneFrames(ListInterPaneFrames listinterpaneframes) {
		return windowsDaoInterface.saveListInterPaneFrames(listinterpaneframes);
	};

	@Transactional
	@Override
	public List<ListInterPaneFrames> saveListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		return windowsDaoInterface.saveListInterPaneFrames(listinterpaneframes);
	};

	@Transactional
	@Override
	public ListInterPaneFrames updateListInterPaneFrames(ListInterPaneFrames listinterpaneframes) {
		return windowsDaoInterface.updateListInterPaneFrames(listinterpaneframes);
	};

	@Transactional
	@Override
	public List<ListInterPaneFrames> updateListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		return windowsDaoInterface.updateListInterPaneFrames(listinterpaneframes);
	};

	@Transactional
	@Override
	public ListInterPaneFrames delSingleListInterPaneFrames(long id) {
		return windowsDaoInterface.delSingleListInterPaneFrames(id);
	}

	@Transactional
	@Override
	public List<ListInterPaneFrames> delListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		return windowsDaoInterface.delListInterPaneFrames(listinterpaneframes);
	};

	@Transactional
	@Override
	public List<ListInterPaneFramesAvailableColours> getListListInterPaneFramesAvailableColours() {
		return windowsDaoInterface.getListListInterPaneFramesAvailableColours();
	};

	@Transactional
	@Override
	public ListInterPaneFramesAvailableColours getSingleListInterPaneFramesAvailableColours(long id) {
		return windowsDaoInterface.getSingleListInterPaneFramesAvailableColours(id);
	};

	@Transactional
	@Override
	public ListInterPaneFramesAvailableColours saveListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours) {
		return windowsDaoInterface.saveListInterPaneFramesAvailableColours(listinterpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListInterPaneFramesAvailableColours> saveListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		return windowsDaoInterface.saveListInterPaneFramesAvailableColours(listinterpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public ListInterPaneFramesAvailableColours updateListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours) {
		return windowsDaoInterface.updateListInterPaneFramesAvailableColours(listinterpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListInterPaneFramesAvailableColours> updateListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		return windowsDaoInterface.updateListInterPaneFramesAvailableColours(listinterpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public ListInterPaneFramesAvailableColours delSingleListInterPaneFramesAvailableColours(long id) {
		return windowsDaoInterface.delSingleListInterPaneFramesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListInterPaneFramesAvailableColours> delListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		return windowsDaoInterface.delListInterPaneFramesAvailableColours(listinterpaneframesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListMullionPatterns> getListListMullionPatterns() {
		return windowsDaoInterface.getListListMullionPatterns();
	};

	@Transactional
	@Override
	public ListMullionPatterns getSingleListMullionPatterns(long id) {
		return windowsDaoInterface.getSingleListMullionPatterns(id);
	};

	@Transactional
	@Override
	public ListMullionPatterns saveListMullionPatterns(ListMullionPatterns listmullionpatterns) {
		return windowsDaoInterface.saveListMullionPatterns(listmullionpatterns);
	};

	@Transactional
	@Override
	public List<ListMullionPatterns> saveListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		return windowsDaoInterface.saveListMullionPatterns(listmullionpatterns);
	};

	@Transactional
	@Override
	public ListMullionPatterns updateListMullionPatterns(ListMullionPatterns listmullionpatterns) {
		return windowsDaoInterface.updateListMullionPatterns(listmullionpatterns);
	};

	@Transactional
	@Override
	public List<ListMullionPatterns> updateListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		return windowsDaoInterface.updateListMullionPatterns(listmullionpatterns);
	};

	@Transactional
	@Override
	public ListMullionPatterns delSingleListMullionPatterns(long id) {
		return windowsDaoInterface.delSingleListMullionPatterns(id);
	}

	@Transactional
	@Override
	public List<ListMullionPatterns> delListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		return windowsDaoInterface.delListMullionPatterns(listmullionpatterns);
	};

	@Transactional
	@Override
	public List<ListMullionPatternsAvailableColours> getListListMullionPatternsAvailableColours() {
		return windowsDaoInterface.getListListMullionPatternsAvailableColours();
	};

	@Transactional
	@Override
	public ListMullionPatternsAvailableColours getSingleListMullionPatternsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListMullionPatternsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListMullionPatternsAvailableColours saveListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours) {
		return windowsDaoInterface.saveListMullionPatternsAvailableColours(listmullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListMullionPatternsAvailableColours> saveListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		return windowsDaoInterface.saveListMullionPatternsAvailableColours(listmullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public ListMullionPatternsAvailableColours updateListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours) {
		return windowsDaoInterface.updateListMullionPatternsAvailableColours(listmullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListMullionPatternsAvailableColours> updateListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		return windowsDaoInterface.updateListMullionPatternsAvailableColours(listmullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public ListMullionPatternsAvailableColours delSingleListMullionPatternsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListMullionPatternsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListMullionPatternsAvailableColours> delListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		return windowsDaoInterface.delListMullionPatternsAvailableColours(listmullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctions> getListListOpeningFunctions() {
		return windowsDaoInterface.getListListOpeningFunctions();
	};

	@Transactional
	@Override
	public ListOpeningFunctions getSingleListOpeningFunctions(long id) {
		return windowsDaoInterface.getSingleListOpeningFunctions(id);
	};

	@Transactional
	@Override
	public ListOpeningFunctions saveListOpeningFunctions(ListOpeningFunctions listopeningfunctions) {
		return windowsDaoInterface.saveListOpeningFunctions(listopeningfunctions);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctions> saveListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		return windowsDaoInterface.saveListOpeningFunctions(listopeningfunctions);
	};

	@Transactional
	@Override
	public ListOpeningFunctions updateListOpeningFunctions(ListOpeningFunctions listopeningfunctions) {
		return windowsDaoInterface.updateListOpeningFunctions(listopeningfunctions);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctions> updateListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		return windowsDaoInterface.updateListOpeningFunctions(listopeningfunctions);
	};

	@Transactional
	@Override
	public ListOpeningFunctions delSingleListOpeningFunctions(long id) {
		return windowsDaoInterface.delSingleListOpeningFunctions(id);
	}

	@Transactional
	@Override
	public List<ListOpeningFunctions> delListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		return windowsDaoInterface.delListOpeningFunctions(listopeningfunctions);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctionsAvailableColours> getListListOpeningFunctionsAvailableColours() {
		return windowsDaoInterface.getListListOpeningFunctionsAvailableColours();
	};

	@Transactional
	@Override
	public ListOpeningFunctionsAvailableColours getSingleListOpeningFunctionsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListOpeningFunctionsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListOpeningFunctionsAvailableColours saveListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours) {
		return windowsDaoInterface.saveListOpeningFunctionsAvailableColours(listopeningfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctionsAvailableColours> saveListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		return windowsDaoInterface.saveListOpeningFunctionsAvailableColours(listopeningfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public ListOpeningFunctionsAvailableColours updateListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours) {
		return windowsDaoInterface.updateListOpeningFunctionsAvailableColours(listopeningfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListOpeningFunctionsAvailableColours> updateListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		return windowsDaoInterface.updateListOpeningFunctionsAvailableColours(listopeningfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public ListOpeningFunctionsAvailableColours delSingleListOpeningFunctionsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListOpeningFunctionsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListOpeningFunctionsAvailableColours> delListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		return windowsDaoInterface.delListOpeningFunctionsAvailableColours(listopeningfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReeds> getListListReeds() {
		return windowsDaoInterface.getListListReeds();
	};

	@Transactional
	@Override
	public ListReeds getSingleListReeds(long id) {
		return windowsDaoInterface.getSingleListReeds(id);
	};

	@Transactional
	@Override
	public ListReeds saveListReeds(ListReeds listreeds) {
		return windowsDaoInterface.saveListReeds(listreeds);
	};

	@Transactional
	@Override
	public List<ListReeds> saveListReeds(List<ListReeds> listreeds) {
		return windowsDaoInterface.saveListReeds(listreeds);
	};

	@Transactional
	@Override
	public ListReeds updateListReeds(ListReeds listreeds) {
		return windowsDaoInterface.updateListReeds(listreeds);
	};

	@Transactional
	@Override
	public List<ListReeds> updateListReeds(List<ListReeds> listreeds) {
		return windowsDaoInterface.updateListReeds(listreeds);
	};

	@Transactional
	@Override
	public ListReeds delSingleListReeds(long id) {
		return windowsDaoInterface.delSingleListReeds(id);
	}

	@Transactional
	@Override
	public List<ListReeds> delListReeds(List<ListReeds> listreeds) {
		return windowsDaoInterface.delListReeds(listreeds);
	};

	@Transactional
	@Override
	public List<ListReedsAvailableColours> getListListReedsAvailableColours() {
		return windowsDaoInterface.getListListReedsAvailableColours();
	};

	@Transactional
	@Override
	public ListReedsAvailableColours getSingleListReedsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListReedsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListReedsAvailableColours saveListReedsAvailableColours(
			ListReedsAvailableColours listreedsavailablecolours) {
		return windowsDaoInterface.saveListReedsAvailableColours(listreedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReedsAvailableColours> saveListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		return windowsDaoInterface.saveListReedsAvailableColours(listreedsavailablecolours);
	};

	@Transactional
	@Override
	public ListReedsAvailableColours updateListReedsAvailableColours(
			ListReedsAvailableColours listreedsavailablecolours) {
		return windowsDaoInterface.updateListReedsAvailableColours(listreedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReedsAvailableColours> updateListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		return windowsDaoInterface.updateListReedsAvailableColours(listreedsavailablecolours);
	};

	@Transactional
	@Override
	public ListReedsAvailableColours delSingleListReedsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListReedsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListReedsAvailableColours> delListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		return windowsDaoInterface.delListReedsAvailableColours(listreedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReiforcements> getListListReiforcements() {
		return windowsDaoInterface.getListListReiforcements();
	};

	@Transactional
	@Override
	public ListReiforcements getSingleListReiforcements(long id) {
		return windowsDaoInterface.getSingleListReiforcements(id);
	};

	@Transactional
	@Override
	public ListReiforcements saveListReiforcements(ListReiforcements listreiforcements) {
		return windowsDaoInterface.saveListReiforcements(listreiforcements);
	};

	@Transactional
	@Override
	public List<ListReiforcements> saveListReiforcements(List<ListReiforcements> listreiforcements) {
		return windowsDaoInterface.saveListReiforcements(listreiforcements);
	};

	@Transactional
	@Override
	public ListReiforcements updateListReiforcements(ListReiforcements listreiforcements) {
		return windowsDaoInterface.updateListReiforcements(listreiforcements);
	};

	@Transactional
	@Override
	public List<ListReiforcements> updateListReiforcements(List<ListReiforcements> listreiforcements) {
		return windowsDaoInterface.updateListReiforcements(listreiforcements);
	};

	@Transactional
	@Override
	public ListReiforcements delSingleListReiforcements(long id) {
		return windowsDaoInterface.delSingleListReiforcements(id);
	}

	@Transactional
	@Override
	public List<ListReiforcements> delListReiforcements(List<ListReiforcements> listreiforcements) {
		return windowsDaoInterface.delListReiforcements(listreiforcements);
	};

	@Transactional
	@Override
	public List<ListReiforcementsAvailableColours> getListListReiforcementsAvailableColours() {
		return windowsDaoInterface.getListListReiforcementsAvailableColours();
	};

	@Transactional
	@Override
	public ListReiforcementsAvailableColours getSingleListReiforcementsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListReiforcementsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListReiforcementsAvailableColours saveListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours) {
		return windowsDaoInterface.saveListReiforcementsAvailableColours(listreiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReiforcementsAvailableColours> saveListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		return windowsDaoInterface.saveListReiforcementsAvailableColours(listreiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public ListReiforcementsAvailableColours updateListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours) {
		return windowsDaoInterface.updateListReiforcementsAvailableColours(listreiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListReiforcementsAvailableColours> updateListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		return windowsDaoInterface.updateListReiforcementsAvailableColours(listreiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public ListReiforcementsAvailableColours delSingleListReiforcementsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListReiforcementsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListReiforcementsAvailableColours> delListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		return windowsDaoInterface.delListReiforcementsAvailableColours(listreiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSillStripes> getListListSillStripes() {
		return windowsDaoInterface.getListListSillStripes();
	};

	@Transactional
	@Override
	public ListSillStripes getSingleListSillStripes(long id) {
		return windowsDaoInterface.getSingleListSillStripes(id);
	};

	@Transactional
	@Override
	public ListSillStripes saveListSillStripes(ListSillStripes listsillstripes) {
		return windowsDaoInterface.saveListSillStripes(listsillstripes);
	};

	@Transactional
	@Override
	public List<ListSillStripes> saveListSillStripes(List<ListSillStripes> listsillstripes) {
		return windowsDaoInterface.saveListSillStripes(listsillstripes);
	};

	@Transactional
	@Override
	public ListSillStripes updateListSillStripes(ListSillStripes listsillstripes) {
		return windowsDaoInterface.updateListSillStripes(listsillstripes);
	};

	@Transactional
	@Override
	public List<ListSillStripes> updateListSillStripes(List<ListSillStripes> listsillstripes) {
		return windowsDaoInterface.updateListSillStripes(listsillstripes);
	};

	@Transactional
	@Override
	public ListSillStripes delSingleListSillStripes(long id) {
		return windowsDaoInterface.delSingleListSillStripes(id);
	}

	@Transactional
	@Override
	public List<ListSillStripes> delListSillStripes(List<ListSillStripes> listsillstripes) {
		return windowsDaoInterface.delListSillStripes(listsillstripes);
	};

	@Transactional
	@Override
	public List<ListSillStripesAvailableColours> getListListSillStripesAvailableColours() {
		return windowsDaoInterface.getListListSillStripesAvailableColours();
	};

	@Transactional
	@Override
	public ListSillStripesAvailableColours getSingleListSillStripesAvailableColours(long id) {
		return windowsDaoInterface.getSingleListSillStripesAvailableColours(id);
	};

	@Transactional
	@Override
	public ListSillStripesAvailableColours saveListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours) {
		return windowsDaoInterface.saveListSillStripesAvailableColours(listsillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSillStripesAvailableColours> saveListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		return windowsDaoInterface.saveListSillStripesAvailableColours(listsillstripesavailablecolours);
	};

	@Transactional
	@Override
	public ListSillStripesAvailableColours updateListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours) {
		return windowsDaoInterface.updateListSillStripesAvailableColours(listsillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSillStripesAvailableColours> updateListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		return windowsDaoInterface.updateListSillStripesAvailableColours(listsillstripesavailablecolours);
	};

	@Transactional
	@Override
	public ListSillStripesAvailableColours delSingleListSillStripesAvailableColours(long id) {
		return windowsDaoInterface.delSingleListSillStripesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListSillStripesAvailableColours> delListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		return windowsDaoInterface.delListSillStripesAvailableColours(listsillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSpecialShapes> getListListSpecialShapes() {
		return windowsDaoInterface.getListListSpecialShapes();
	};

	@Transactional
	@Override
	public ListSpecialShapes getSingleListSpecialShapes(long id) {
		return windowsDaoInterface.getSingleListSpecialShapes(id);
	};

	@Transactional
	@Override
	public ListSpecialShapes saveListSpecialShapes(ListSpecialShapes listspecialshapes) {
		return windowsDaoInterface.saveListSpecialShapes(listspecialshapes);
	};

	@Transactional
	@Override
	public List<ListSpecialShapes> saveListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		return windowsDaoInterface.saveListSpecialShapes(listspecialshapes);
	};

	@Transactional
	@Override
	public ListSpecialShapes updateListSpecialShapes(ListSpecialShapes listspecialshapes) {
		return windowsDaoInterface.updateListSpecialShapes(listspecialshapes);
	};

	@Transactional
	@Override
	public List<ListSpecialShapes> updateListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		return windowsDaoInterface.updateListSpecialShapes(listspecialshapes);
	};

	@Transactional
	@Override
	public ListSpecialShapes delSingleListSpecialShapes(long id) {
		return windowsDaoInterface.delSingleListSpecialShapes(id);
	}

	@Transactional
	@Override
	public List<ListSpecialShapes> delListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		return windowsDaoInterface.delListSpecialShapes(listspecialshapes);
	};

	@Transactional
	@Override
	public List<ListSpecialShapesAvailableColours> getListListSpecialShapesAvailableColours() {
		return windowsDaoInterface.getListListSpecialShapesAvailableColours();
	};

	@Transactional
	@Override
	public ListSpecialShapesAvailableColours getSingleListSpecialShapesAvailableColours(long id) {
		return windowsDaoInterface.getSingleListSpecialShapesAvailableColours(id);
	};

	@Transactional
	@Override
	public ListSpecialShapesAvailableColours saveListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours) {
		return windowsDaoInterface.saveListSpecialShapesAvailableColours(listspecialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSpecialShapesAvailableColours> saveListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		return windowsDaoInterface.saveListSpecialShapesAvailableColours(listspecialshapesavailablecolours);
	};

	@Transactional
	@Override
	public ListSpecialShapesAvailableColours updateListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours) {
		return windowsDaoInterface.updateListSpecialShapesAvailableColours(listspecialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListSpecialShapesAvailableColours> updateListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		return windowsDaoInterface.updateListSpecialShapesAvailableColours(listspecialshapesavailablecolours);
	};

	@Transactional
	@Override
	public ListSpecialShapesAvailableColours delSingleListSpecialShapesAvailableColours(long id) {
		return windowsDaoInterface.delSingleListSpecialShapesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListSpecialShapesAvailableColours> delListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		return windowsDaoInterface.delListSpecialShapesAvailableColours(listspecialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<ListThreeSholds> getListListThreeSholds() {
		return windowsDaoInterface.getListListThreeSholds();
	};

	@Transactional
	@Override
	public ListThreeSholds getSingleListThreeSholds(long id) {
		return windowsDaoInterface.getSingleListThreeSholds(id);
	};

	@Transactional
	@Override
	public ListThreeSholds saveListThreeSholds(ListThreeSholds listthreesholds) {
		return windowsDaoInterface.saveListThreeSholds(listthreesholds);
	};

	@Transactional
	@Override
	public List<ListThreeSholds> saveListThreeSholds(List<ListThreeSholds> listthreesholds) {
		return windowsDaoInterface.saveListThreeSholds(listthreesholds);
	};

	@Transactional
	@Override
	public ListThreeSholds updateListThreeSholds(ListThreeSholds listthreesholds) {
		return windowsDaoInterface.updateListThreeSholds(listthreesholds);
	};

	@Transactional
	@Override
	public List<ListThreeSholds> updateListThreeSholds(List<ListThreeSholds> listthreesholds) {
		return windowsDaoInterface.updateListThreeSholds(listthreesholds);
	};

	@Transactional
	@Override
	public ListThreeSholds delSingleListThreeSholds(long id) {
		return windowsDaoInterface.delSingleListThreeSholds(id);
	}

	@Transactional
	@Override
	public List<ListThreeSholds> delListThreeSholds(List<ListThreeSholds> listthreesholds) {
		return windowsDaoInterface.delListThreeSholds(listthreesholds);
	};

	@Transactional
	@Override
	public List<ListThreeSholdsAvailableColours> getListListThreeSholdsAvailableColours() {
		return windowsDaoInterface.getListListThreeSholdsAvailableColours();
	};

	@Transactional
	@Override
	public ListThreeSholdsAvailableColours getSingleListThreeSholdsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListThreeSholdsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListThreeSholdsAvailableColours saveListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours) {
		return windowsDaoInterface.saveListThreeSholdsAvailableColours(listthreesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListThreeSholdsAvailableColours> saveListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		return windowsDaoInterface.saveListThreeSholdsAvailableColours(listthreesholdsavailablecolours);
	};

	@Transactional
	@Override
	public ListThreeSholdsAvailableColours updateListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours) {
		return windowsDaoInterface.updateListThreeSholdsAvailableColours(listthreesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListThreeSholdsAvailableColours> updateListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		return windowsDaoInterface.updateListThreeSholdsAvailableColours(listthreesholdsavailablecolours);
	};

	@Transactional
	@Override
	public ListThreeSholdsAvailableColours delSingleListThreeSholdsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListThreeSholdsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListThreeSholdsAvailableColours> delListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		return windowsDaoInterface.delListThreeSholdsAvailableColours(listthreesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullions> getListListTypesOfMullions() {
		return windowsDaoInterface.getListListTypesOfMullions();
	};

	@Transactional
	@Override
	public ListTypesOfMullions getSingleListTypesOfMullions(long id) {
		return windowsDaoInterface.getSingleListTypesOfMullions(id);
	};

	@Transactional
	@Override
	public ListTypesOfMullions saveListTypesOfMullions(ListTypesOfMullions listtypesofmullions) {
		return windowsDaoInterface.saveListTypesOfMullions(listtypesofmullions);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullions> saveListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		return windowsDaoInterface.saveListTypesOfMullions(listtypesofmullions);
	};

	@Transactional
	@Override
	public ListTypesOfMullions updateListTypesOfMullions(ListTypesOfMullions listtypesofmullions) {
		return windowsDaoInterface.updateListTypesOfMullions(listtypesofmullions);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullions> updateListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		return windowsDaoInterface.updateListTypesOfMullions(listtypesofmullions);
	};

	@Transactional
	@Override
	public ListTypesOfMullions delSingleListTypesOfMullions(long id) {
		return windowsDaoInterface.delSingleListTypesOfMullions(id);
	}

	@Transactional
	@Override
	public List<ListTypesOfMullions> delListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		return windowsDaoInterface.delListTypesOfMullions(listtypesofmullions);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullionsAvailableColours> getListListTypesOfMullionsAvailableColours() {
		return windowsDaoInterface.getListListTypesOfMullionsAvailableColours();
	};

	@Transactional
	@Override
	public ListTypesOfMullionsAvailableColours getSingleListTypesOfMullionsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListTypesOfMullionsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListTypesOfMullionsAvailableColours saveListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours) {
		return windowsDaoInterface.saveListTypesOfMullionsAvailableColours(listtypesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullionsAvailableColours> saveListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		return windowsDaoInterface.saveListTypesOfMullionsAvailableColours(listtypesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public ListTypesOfMullionsAvailableColours updateListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours) {
		return windowsDaoInterface.updateListTypesOfMullionsAvailableColours(listtypesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListTypesOfMullionsAvailableColours> updateListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		return windowsDaoInterface.updateListTypesOfMullionsAvailableColours(listtypesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public ListTypesOfMullionsAvailableColours delSingleListTypesOfMullionsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListTypesOfMullionsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListTypesOfMullionsAvailableColours> delListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		return windowsDaoInterface.delListTypesOfMullionsAvailableColours(listtypesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListVentilators> getListListVentilators() {
		return windowsDaoInterface.getListListVentilators();
	};

	@Transactional
	@Override
	public ListVentilators getSingleListVentilators(long id) {
		return windowsDaoInterface.getSingleListVentilators(id);
	};

	@Transactional
	@Override
	public ListVentilators saveListVentilators(ListVentilators listventilators) {
		return windowsDaoInterface.saveListVentilators(listventilators);
	};

	@Transactional
	@Override
	public List<ListVentilators> saveListVentilators(List<ListVentilators> listventilators) {
		return windowsDaoInterface.saveListVentilators(listventilators);
	};

	@Transactional
	@Override
	public ListVentilators updateListVentilators(ListVentilators listventilators) {
		return windowsDaoInterface.updateListVentilators(listventilators);
	};

	@Transactional
	@Override
	public List<ListVentilators> updateListVentilators(List<ListVentilators> listventilators) {
		return windowsDaoInterface.updateListVentilators(listventilators);
	};

	@Transactional
	@Override
	public ListVentilators delSingleListVentilators(long id) {
		return windowsDaoInterface.delSingleListVentilators(id);
	}

	@Transactional
	@Override
	public List<ListVentilators> delListVentilators(List<ListVentilators> listventilators) {
		return windowsDaoInterface.delListVentilators(listventilators);
	};

	@Transactional
	@Override
	public List<ListVentilatorsAvailableColours> getListListVentilatorsAvailableColours() {
		return windowsDaoInterface.getListListVentilatorsAvailableColours();
	};

	@Transactional
	@Override
	public ListVentilatorsAvailableColours getSingleListVentilatorsAvailableColours(long id) {
		return windowsDaoInterface.getSingleListVentilatorsAvailableColours(id);
	};

	@Transactional
	@Override
	public ListVentilatorsAvailableColours saveListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours) {
		return windowsDaoInterface.saveListVentilatorsAvailableColours(listventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListVentilatorsAvailableColours> saveListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		return windowsDaoInterface.saveListVentilatorsAvailableColours(listventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public ListVentilatorsAvailableColours updateListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours) {
		return windowsDaoInterface.updateListVentilatorsAvailableColours(listventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListVentilatorsAvailableColours> updateListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		return windowsDaoInterface.updateListVentilatorsAvailableColours(listventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public ListVentilatorsAvailableColours delSingleListVentilatorsAvailableColours(long id) {
		return windowsDaoInterface.delSingleListVentilatorsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListVentilatorsAvailableColours> delListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		return windowsDaoInterface.delListVentilatorsAvailableColours(listventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<ListWingLocks> getListListWingLocks() {
		return windowsDaoInterface.getListListWingLocks();
	};

	@Transactional
	@Override
	public ListWingLocks getSingleListWingLocks(long id) {
		return windowsDaoInterface.getSingleListWingLocks(id);
	};

	@Transactional
	@Override
	public ListWingLocks saveListWingLocks(ListWingLocks listwinglocks) {
		return windowsDaoInterface.saveListWingLocks(listwinglocks);
	};

	@Transactional
	@Override
	public List<ListWingLocks> saveListWingLocks(List<ListWingLocks> listwinglocks) {
		return windowsDaoInterface.saveListWingLocks(listwinglocks);
	};

	@Transactional
	@Override
	public ListWingLocks updateListWingLocks(ListWingLocks listwinglocks) {
		return windowsDaoInterface.updateListWingLocks(listwinglocks);
	};

	@Transactional
	@Override
	public List<ListWingLocks> updateListWingLocks(List<ListWingLocks> listwinglocks) {
		return windowsDaoInterface.updateListWingLocks(listwinglocks);
	};

	@Transactional
	@Override
	public ListWingLocks delSingleListWingLocks(long id) {
		return windowsDaoInterface.delSingleListWingLocks(id);
	}

	@Transactional
	@Override
	public List<ListWingLocks> delListWingLocks(List<ListWingLocks> listwinglocks) {
		return windowsDaoInterface.delListWingLocks(listwinglocks);
	};

	@Transactional
	@Override
	public List<ListWingLocksAvailableColours> getListListWingLocksAvailableColours() {
		return windowsDaoInterface.getListListWingLocksAvailableColours();
	};

	@Transactional
	@Override
	public ListWingLocksAvailableColours getSingleListWingLocksAvailableColours(long id) {
		return windowsDaoInterface.getSingleListWingLocksAvailableColours(id);
	};

	@Transactional
	@Override
	public ListWingLocksAvailableColours saveListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours) {
		return windowsDaoInterface.saveListWingLocksAvailableColours(listwinglocksavailablecolours);
	};

	@Transactional
	@Override
	public List<ListWingLocksAvailableColours> saveListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		return windowsDaoInterface.saveListWingLocksAvailableColours(listwinglocksavailablecolours);
	};

	@Transactional
	@Override
	public ListWingLocksAvailableColours updateListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours) {
		return windowsDaoInterface.updateListWingLocksAvailableColours(listwinglocksavailablecolours);
	};

	@Transactional
	@Override
	public List<ListWingLocksAvailableColours> updateListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		return windowsDaoInterface.updateListWingLocksAvailableColours(listwinglocksavailablecolours);
	};

	@Transactional
	@Override
	public ListWingLocksAvailableColours delSingleListWingLocksAvailableColours(long id) {
		return windowsDaoInterface.delSingleListWingLocksAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ListWingLocksAvailableColours> delListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		return windowsDaoInterface.delListWingLocksAvailableColours(listwinglocksavailablecolours);
	};

	@Transactional
	@Override
	public List<MullionPattern> getListMullionPattern() {
		return windowsDaoInterface.getListMullionPattern();
	};

	@Transactional
	@Override
	public MullionPattern getSingleMullionPattern(long id) {
		return windowsDaoInterface.getSingleMullionPattern(id);
	};

	@Transactional
	@Override
	public MullionPattern saveMullionPattern(MullionPattern mullionpattern) {
		return windowsDaoInterface.saveMullionPattern(mullionpattern);
	};

	@Transactional
	@Override
	public List<MullionPattern> saveMullionPattern(List<MullionPattern> mullionpattern) {
		return windowsDaoInterface.saveMullionPattern(mullionpattern);
	};

	@Transactional
	@Override
	public MullionPattern updateMullionPattern(MullionPattern mullionpattern) {
		return windowsDaoInterface.updateMullionPattern(mullionpattern);
	};

	@Transactional
	@Override
	public List<MullionPattern> updateMullionPattern(List<MullionPattern> mullionpattern) {
		return windowsDaoInterface.updateMullionPattern(mullionpattern);
	};

	@Transactional
	@Override
	public MullionPattern delSingleMullionPattern(long id) {
		return windowsDaoInterface.delSingleMullionPattern(id);
	}

	@Transactional
	@Override
	public List<MullionPattern> delMullionPattern(List<MullionPattern> mullionpattern) {
		return windowsDaoInterface.delMullionPattern(mullionpattern);
	};

	@Transactional
	@Override
	public List<MullionPatternsAvailableColours> getListMullionPatternsAvailableColours() {
		return windowsDaoInterface.getListMullionPatternsAvailableColours();
	};

	@Transactional
	@Override
	public MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(long id) {
		return windowsDaoInterface.getSingleMullionPatternsAvailableColours(id);
	};

	@Transactional
	@Override
	public MullionPatternsAvailableColours saveMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		return windowsDaoInterface.saveMullionPatternsAvailableColours(mullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<MullionPatternsAvailableColours> saveMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		return windowsDaoInterface.saveMullionPatternsAvailableColours(mullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public MullionPatternsAvailableColours updateMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		return windowsDaoInterface.updateMullionPatternsAvailableColours(mullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		return windowsDaoInterface.updateMullionPatternsAvailableColours(mullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(long id) {
		return windowsDaoInterface.delSingleMullionPatternsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<MullionPatternsAvailableColours> delMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		return windowsDaoInterface.delMullionPatternsAvailableColours(mullionpatternsavailablecolours);
	};

	@Transactional
	@Override
	public List<OpeningFunctions> getListOpeningFunctions() {
		return windowsDaoInterface.getListOpeningFunctions();
	};

	@Transactional
	@Override
	public OpeningFunctions getSingleOpeningFunctions(long id) {
		return windowsDaoInterface.getSingleOpeningFunctions(id);
	};

	@Transactional
	@Override
	public OpeningFunctions saveOpeningFunctions(OpeningFunctions openingfunctions) {
		return windowsDaoInterface.saveOpeningFunctions(openingfunctions);
	};

	@Transactional
	@Override
	public List<OpeningFunctions> saveOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		return windowsDaoInterface.saveOpeningFunctions(openingfunctions);
	};

	@Transactional
	@Override
	public OpeningFunctions updateOpeningFunctions(OpeningFunctions openingfunctions) {
		return windowsDaoInterface.updateOpeningFunctions(openingfunctions);
	};

	@Transactional
	@Override
	public List<OpeningFunctions> updateOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		return windowsDaoInterface.updateOpeningFunctions(openingfunctions);
	};

	@Transactional
	@Override
	public OpeningFunctions delSingleOpeningFunctions(long id) {
		return windowsDaoInterface.delSingleOpeningFunctions(id);
	}

	@Transactional
	@Override
	public List<OpeningFunctions> delOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		return windowsDaoInterface.delOpeningFunctions(openingfunctions);
	};

	@Transactional
	@Override
	public List<OpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours() {
		return windowsDaoInterface.getListOpeningFunctionsAvailableColours();
	};

	@Transactional
	@Override
	public OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(long id) {
		return windowsDaoInterface.getSingleOpeningFunctionsAvailableColours(id);
	};

	@Transactional
	@Override
	public OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		return windowsDaoInterface.saveOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<OpeningFunctionsAvailableColours> saveOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		return windowsDaoInterface.saveOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		return windowsDaoInterface.updateOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		return windowsDaoInterface.updateOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(long id) {
		return windowsDaoInterface.delSingleOpeningFunctionsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<OpeningFunctionsAvailableColours> delOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		return windowsDaoInterface.delOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
	};

	@Transactional
	@Override
	public List<Orders> getListOrders() {
		return windowsDaoInterface.getListOrders();
	};

	@Transactional
	@Override
	public Orders getSingleOrders(long id) {
		return windowsDaoInterface.getSingleOrders(id);
	};

	@Transactional
	@Override
	public Orders saveOrders(Orders orders) {
		return windowsDaoInterface.saveOrders(orders);
	};

	@Transactional
	@Override
	public List<Orders> saveOrders(List<Orders> orders) {
		return windowsDaoInterface.saveOrders(orders);
	};

	@Transactional
	@Override
	public Orders updateOrders(Orders orders) {
		return windowsDaoInterface.updateOrders(orders);
	};

	@Transactional
	@Override
	public List<Orders> updateOrders(List<Orders> orders) {
		return windowsDaoInterface.updateOrders(orders);
	};

	@Transactional
	@Override
	public Orders delSingleOrders(long id) {
		return windowsDaoInterface.delSingleOrders(id);
	}

	@Transactional
	@Override
	public List<Orders> delOrders(List<Orders> orders) {
		return windowsDaoInterface.delOrders(orders);
	};

	@Transactional
	@Override
	public List<Reed> getListReed() {
		return windowsDaoInterface.getListReed();
	};

	@Transactional
	@Override
	public Reed getSingleReed(long id) {
		return windowsDaoInterface.getSingleReed(id);
	};

	@Transactional
	@Override
	public Reed saveReed(Reed reed) {
		return windowsDaoInterface.saveReed(reed);
	};

	@Transactional
	@Override
	public List<Reed> saveReed(List<Reed> reed) {
		return windowsDaoInterface.saveReed(reed);
	};

	@Transactional
	@Override
	public Reed updateReed(Reed reed) {
		return windowsDaoInterface.updateReed(reed);
	};

	@Transactional
	@Override
	public List<Reed> updateReed(List<Reed> reed) {
		return windowsDaoInterface.updateReed(reed);
	};

	@Transactional
	@Override
	public Reed delSingleReed(long id) {
		return windowsDaoInterface.delSingleReed(id);
	}

	@Transactional
	@Override
	public List<Reed> delReed(List<Reed> reed) {
		return windowsDaoInterface.delReed(reed);
	};

	@Transactional
	@Override
	public List<ReedsAvailableColours> getListReedsAvailableColours() {
		return windowsDaoInterface.getListReedsAvailableColours();
	};

	@Transactional
	@Override
	public ReedsAvailableColours getSingleReedsAvailableColours(long id) {
		return windowsDaoInterface.getSingleReedsAvailableColours(id);
	};

	@Transactional
	@Override
	public ReedsAvailableColours saveReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		return windowsDaoInterface.saveReedsAvailableColours(reedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ReedsAvailableColours> saveReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		return windowsDaoInterface.saveReedsAvailableColours(reedsavailablecolours);
	};

	@Transactional
	@Override
	public ReedsAvailableColours updateReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		return windowsDaoInterface.updateReedsAvailableColours(reedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ReedsAvailableColours> updateReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		return windowsDaoInterface.updateReedsAvailableColours(reedsavailablecolours);
	};

	@Transactional
	@Override
	public ReedsAvailableColours delSingleReedsAvailableColours(long id) {
		return windowsDaoInterface.delSingleReedsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ReedsAvailableColours> delReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		return windowsDaoInterface.delReedsAvailableColours(reedsavailablecolours);
	};

	@Transactional
	@Override
	public List<ReiforcementsAvailableColours> getListReiforcementsAvailableColours() {
		return windowsDaoInterface.getListReiforcementsAvailableColours();
	};

	@Transactional
	@Override
	public ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(long id) {
		return windowsDaoInterface.getSingleReiforcementsAvailableColours(id);
	};

	@Transactional
	@Override
	public ReiforcementsAvailableColours saveReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		return windowsDaoInterface.saveReiforcementsAvailableColours(reiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<ReiforcementsAvailableColours> saveReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		return windowsDaoInterface.saveReiforcementsAvailableColours(reiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public ReiforcementsAvailableColours updateReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		return windowsDaoInterface.updateReiforcementsAvailableColours(reiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		return windowsDaoInterface.updateReiforcementsAvailableColours(reiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(long id) {
		return windowsDaoInterface.delSingleReiforcementsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ReiforcementsAvailableColours> delReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		return windowsDaoInterface.delReiforcementsAvailableColours(reiforcementsavailablecolours);
	};

	@Transactional
	@Override
	public List<Reinforcement> getListReinforcement() {
		return windowsDaoInterface.getListReinforcement();
	};

	@Transactional
	@Override
	public Reinforcement getSingleReinforcement(long id) {
		return windowsDaoInterface.getSingleReinforcement(id);
	};

	@Transactional
	@Override
	public Reinforcement saveReinforcement(Reinforcement reinforcement) {
		return windowsDaoInterface.saveReinforcement(reinforcement);
	};

	@Transactional
	@Override
	public List<Reinforcement> saveReinforcement(List<Reinforcement> reinforcement) {
		return windowsDaoInterface.saveReinforcement(reinforcement);
	};

	@Transactional
	@Override
	public Reinforcement updateReinforcement(Reinforcement reinforcement) {
		return windowsDaoInterface.updateReinforcement(reinforcement);
	};

	@Transactional
	@Override
	public List<Reinforcement> updateReinforcement(List<Reinforcement> reinforcement) {
		return windowsDaoInterface.updateReinforcement(reinforcement);
	};

	@Transactional
	@Override
	public Reinforcement delSingleReinforcement(long id) {
		return windowsDaoInterface.delSingleReinforcement(id);
	}

	@Transactional
	@Override
	public List<Reinforcement> delReinforcement(List<Reinforcement> reinforcement) {
		return windowsDaoInterface.delReinforcement(reinforcement);
	};

	@Transactional
	@Override
	public List<SillStrip> getListSillStrip() {
		return windowsDaoInterface.getListSillStrip();
	};

	@Transactional
	@Override
	public SillStrip getSingleSillStrip(long id) {
		return windowsDaoInterface.getSingleSillStrip(id);
	};

	@Transactional
	@Override
	public SillStrip saveSillStrip(SillStrip sillstrip) {
		return windowsDaoInterface.saveSillStrip(sillstrip);
	};

	@Transactional
	@Override
	public List<SillStrip> saveSillStrip(List<SillStrip> sillstrip) {
		return windowsDaoInterface.saveSillStrip(sillstrip);
	};

	@Transactional
	@Override
	public SillStrip updateSillStrip(SillStrip sillstrip) {
		return windowsDaoInterface.updateSillStrip(sillstrip);
	};

	@Transactional
	@Override
	public List<SillStrip> updateSillStrip(List<SillStrip> sillstrip) {
		return windowsDaoInterface.updateSillStrip(sillstrip);
	};

	@Transactional
	@Override
	public SillStrip delSingleSillStrip(long id) {
		return windowsDaoInterface.delSingleSillStrip(id);
	}

	@Transactional
	@Override
	public List<SillStrip> delSillStrip(List<SillStrip> sillstrip) {
		return windowsDaoInterface.delSillStrip(sillstrip);
	};

	@Transactional
	@Override
	public List<SillStripesAvailableColours> getListSillStripesAvailableColours() {
		return windowsDaoInterface.getListSillStripesAvailableColours();
	};

	@Transactional
	@Override
	public SillStripesAvailableColours getSingleSillStripesAvailableColours(long id) {
		return windowsDaoInterface.getSingleSillStripesAvailableColours(id);
	};

	@Transactional
	@Override
	public SillStripesAvailableColours saveSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		return windowsDaoInterface.saveSillStripesAvailableColours(sillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<SillStripesAvailableColours> saveSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		return windowsDaoInterface.saveSillStripesAvailableColours(sillstripesavailablecolours);
	};

	@Transactional
	@Override
	public SillStripesAvailableColours updateSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		return windowsDaoInterface.updateSillStripesAvailableColours(sillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<SillStripesAvailableColours> updateSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		return windowsDaoInterface.updateSillStripesAvailableColours(sillstripesavailablecolours);
	};

	@Transactional
	@Override
	public SillStripesAvailableColours delSingleSillStripesAvailableColours(long id) {
		return windowsDaoInterface.delSingleSillStripesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<SillStripesAvailableColours> delSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		return windowsDaoInterface.delSillStripesAvailableColours(sillstripesavailablecolours);
	};

	@Transactional
	@Override
	public List<SpecialShapes> getListSpecialShapes() {
		return windowsDaoInterface.getListSpecialShapes();
	};

	@Transactional
	@Override
	public SpecialShapes getSingleSpecialShapes(long id) {
		return windowsDaoInterface.getSingleSpecialShapes(id);
	};

	@Transactional
	@Override
	public SpecialShapes saveSpecialShapes(SpecialShapes specialshapes) {
		return windowsDaoInterface.saveSpecialShapes(specialshapes);
	};

	@Transactional
	@Override
	public List<SpecialShapes> saveSpecialShapes(List<SpecialShapes> specialshapes) {
		return windowsDaoInterface.saveSpecialShapes(specialshapes);
	};

	@Transactional
	@Override
	public SpecialShapes updateSpecialShapes(SpecialShapes specialshapes) {
		return windowsDaoInterface.updateSpecialShapes(specialshapes);
	};

	@Transactional
	@Override
	public List<SpecialShapes> updateSpecialShapes(List<SpecialShapes> specialshapes) {
		return windowsDaoInterface.updateSpecialShapes(specialshapes);
	};

	@Transactional
	@Override
	public SpecialShapes delSingleSpecialShapes(long id) {
		return windowsDaoInterface.delSingleSpecialShapes(id);
	}

	@Transactional
	@Override
	public List<SpecialShapes> delSpecialShapes(List<SpecialShapes> specialshapes) {
		return windowsDaoInterface.delSpecialShapes(specialshapes);
	};

	@Transactional
	@Override
	public List<SpecialShapesAvailableColours> getListSpecialShapesAvailableColours() {
		return windowsDaoInterface.getListSpecialShapesAvailableColours();
	};

	@Transactional
	@Override
	public SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(long id) {
		return windowsDaoInterface.getSingleSpecialShapesAvailableColours(id);
	};

	@Transactional
	@Override
	public SpecialShapesAvailableColours saveSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		return windowsDaoInterface.saveSpecialShapesAvailableColours(specialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<SpecialShapesAvailableColours> saveSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		return windowsDaoInterface.saveSpecialShapesAvailableColours(specialshapesavailablecolours);
	};

	@Transactional
	@Override
	public SpecialShapesAvailableColours updateSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		return windowsDaoInterface.updateSpecialShapesAvailableColours(specialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		return windowsDaoInterface.updateSpecialShapesAvailableColours(specialshapesavailablecolours);
	};

	@Transactional
	@Override
	public SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(long id) {
		return windowsDaoInterface.delSingleSpecialShapesAvailableColours(id);
	}

	@Transactional
	@Override
	public List<SpecialShapesAvailableColours> delSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		return windowsDaoInterface.delSpecialShapesAvailableColours(specialshapesavailablecolours);
	};

	@Transactional
	@Override
	public List<ThreeSholdsAvailableColours> getListThreeSholdsAvailableColours() {
		return windowsDaoInterface.getListThreeSholdsAvailableColours();
	};

	@Transactional
	@Override
	public ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(long id) {
		return windowsDaoInterface.getSingleThreeSholdsAvailableColours(id);
	};

	@Transactional
	@Override
	public ThreeSholdsAvailableColours saveThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		return windowsDaoInterface.saveThreeSholdsAvailableColours(threesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<ThreeSholdsAvailableColours> saveThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		return windowsDaoInterface.saveThreeSholdsAvailableColours(threesholdsavailablecolours);
	};

	@Transactional
	@Override
	public ThreeSholdsAvailableColours updateThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		return windowsDaoInterface.updateThreeSholdsAvailableColours(threesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		return windowsDaoInterface.updateThreeSholdsAvailableColours(threesholdsavailablecolours);
	};

	@Transactional
	@Override
	public ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(long id) {
		return windowsDaoInterface.delSingleThreeSholdsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<ThreeSholdsAvailableColours> delThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		return windowsDaoInterface.delThreeSholdsAvailableColours(threesholdsavailablecolours);
	};

	@Transactional
	@Override
	public List<Threshold> getListThreshold() {
		return windowsDaoInterface.getListThreshold();
	};

	@Transactional
	@Override
	public Threshold getSingleThreshold(long id) {
		return windowsDaoInterface.getSingleThreshold(id);
	};

	@Transactional
	@Override
	public Threshold saveThreshold(Threshold threshold) {
		return windowsDaoInterface.saveThreshold(threshold);
	};

	@Transactional
	@Override
	public List<Threshold> saveThreshold(List<Threshold> threshold) {
		return windowsDaoInterface.saveThreshold(threshold);
	};

	@Transactional
	@Override
	public Threshold updateThreshold(Threshold threshold) {
		return windowsDaoInterface.updateThreshold(threshold);
	};

	@Transactional
	@Override
	public List<Threshold> updateThreshold(List<Threshold> threshold) {
		return windowsDaoInterface.updateThreshold(threshold);
	};

	@Transactional
	@Override
	public Threshold delSingleThreshold(long id) {
		return windowsDaoInterface.delSingleThreshold(id);
	}

	@Transactional
	@Override
	public List<Threshold> delThreshold(List<Threshold> threshold) {
		return windowsDaoInterface.delThreshold(threshold);
	};

	@Transactional
	@Override
	public List<TypeOfMullion> getListTypeOfMullion() {
		return windowsDaoInterface.getListTypeOfMullion();
	};

	@Transactional
	@Override
	public TypeOfMullion getSingleTypeOfMullion(long id) {
		return windowsDaoInterface.getSingleTypeOfMullion(id);
	};

	@Transactional
	@Override
	public TypeOfMullion saveTypeOfMullion(TypeOfMullion typeofmullion) {
		return windowsDaoInterface.saveTypeOfMullion(typeofmullion);
	};

	@Transactional
	@Override
	public List<TypeOfMullion> saveTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		return windowsDaoInterface.saveTypeOfMullion(typeofmullion);
	};

	@Transactional
	@Override
	public TypeOfMullion updateTypeOfMullion(TypeOfMullion typeofmullion) {
		return windowsDaoInterface.updateTypeOfMullion(typeofmullion);
	};

	@Transactional
	@Override
	public List<TypeOfMullion> updateTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		return windowsDaoInterface.updateTypeOfMullion(typeofmullion);
	};

	@Transactional
	@Override
	public TypeOfMullion delSingleTypeOfMullion(long id) {
		return windowsDaoInterface.delSingleTypeOfMullion(id);
	}

	@Transactional
	@Override
	public List<TypeOfMullion> delTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		return windowsDaoInterface.delTypeOfMullion(typeofmullion);
	};

	@Transactional
	@Override
	public List<TypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours() {
		return windowsDaoInterface.getListTypesOfMullionsAvailableColours();
	};

	@Transactional
	@Override
	public TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(long id) {
		return windowsDaoInterface.getSingleTypesOfMullionsAvailableColours(id);
	};

	@Transactional
	@Override
	public TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		return windowsDaoInterface.saveTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<TypesOfMullionsAvailableColours> saveTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		return windowsDaoInterface.saveTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		return windowsDaoInterface.updateTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		return windowsDaoInterface.updateTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(long id) {
		return windowsDaoInterface.delSingleTypesOfMullionsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<TypesOfMullionsAvailableColours> delTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		return windowsDaoInterface.delTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
	};

	@Transactional
	@Override
	public List<Ventilator> getListVentilator() {
		return windowsDaoInterface.getListVentilator();
	};

	@Transactional
	@Override
	public Ventilator getSingleVentilator(long id) {
		return windowsDaoInterface.getSingleVentilator(id);
	};

	@Transactional
	@Override
	public Ventilator saveVentilator(Ventilator ventilator) {
		return windowsDaoInterface.saveVentilator(ventilator);
	};

	@Transactional
	@Override
	public List<Ventilator> saveVentilator(List<Ventilator> ventilator) {
		return windowsDaoInterface.saveVentilator(ventilator);
	};

	@Transactional
	@Override
	public Ventilator updateVentilator(Ventilator ventilator) {
		return windowsDaoInterface.updateVentilator(ventilator);
	};

	@Transactional
	@Override
	public List<Ventilator> updateVentilator(List<Ventilator> ventilator) {
		return windowsDaoInterface.updateVentilator(ventilator);
	};

	@Transactional
	@Override
	public Ventilator delSingleVentilator(long id) {
		return windowsDaoInterface.delSingleVentilator(id);
	}

	@Transactional
	@Override
	public List<Ventilator> delVentilator(List<Ventilator> ventilator) {
		return windowsDaoInterface.delVentilator(ventilator);
	};

	@Transactional
	@Override
	public List<VentilatorsAvailableColours> getListVentilatorsAvailableColours() {
		return windowsDaoInterface.getListVentilatorsAvailableColours();
	};

	@Transactional
	@Override
	public VentilatorsAvailableColours getSingleVentilatorsAvailableColours(long id) {
		return windowsDaoInterface.getSingleVentilatorsAvailableColours(id);
	};

	@Transactional
	@Override
	public VentilatorsAvailableColours saveVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		return windowsDaoInterface.saveVentilatorsAvailableColours(ventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<VentilatorsAvailableColours> saveVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		return windowsDaoInterface.saveVentilatorsAvailableColours(ventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public VentilatorsAvailableColours updateVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		return windowsDaoInterface.updateVentilatorsAvailableColours(ventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		return windowsDaoInterface.updateVentilatorsAvailableColours(ventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public VentilatorsAvailableColours delSingleVentilatorsAvailableColours(long id) {
		return windowsDaoInterface.delSingleVentilatorsAvailableColours(id);
	}

	@Transactional
	@Override
	public List<VentilatorsAvailableColours> delVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		return windowsDaoInterface.delVentilatorsAvailableColours(ventilatorsavailablecolours);
	};

	@Transactional
	@Override
	public List<Windows> getListWindows() {
		return windowsDaoInterface.getListWindows();
	};

	@Transactional
	@Override
	public Windows getSingleWindows(long id) {
		return windowsDaoInterface.getSingleWindows(id);
	};

	@Transactional
	@Override
	public Windows saveWindows(Windows windows) {
		return windowsDaoInterface.saveWindows(windows);
	};

	@Transactional
	@Override
	public List<Windows> saveWindows(List<Windows> windows) {
		return windowsDaoInterface.saveWindows(windows);
	};

	@Transactional
	@Override
	public Windows updateWindows(Windows windows) {
		return windowsDaoInterface.updateWindows(windows);
	};

	@Transactional
	@Override
	public List<Windows> updateWindows(List<Windows> windows) {
		return windowsDaoInterface.updateWindows(windows);
	};

	@Transactional
	@Override
	public Windows delSingleWindows(long id) {
		return windowsDaoInterface.delSingleWindows(id);
	}

	@Transactional
	@Override
	public List<Windows> delWindows(List<Windows> windows) {
		return windowsDaoInterface.delWindows(windows);
	};

	@Transactional
	@Override
	public List<WingLock> getListWingLock() {
		return windowsDaoInterface.getListWingLock();
	};

	@Transactional
	@Override
	public WingLock getSingleWingLock(long id) {
		return windowsDaoInterface.getSingleWingLock(id);
	};

	@Transactional
	@Override
	public WingLock saveWingLock(WingLock winglock) {
		return windowsDaoInterface.saveWingLock(winglock);
	};

	@Transactional
	@Override
	public List<WingLock> saveWingLock(List<WingLock> winglock) {
		return windowsDaoInterface.saveWingLock(winglock);
	};

	@Transactional
	@Override
	public WingLock updateWingLock(WingLock winglock) {
		return windowsDaoInterface.updateWingLock(winglock);
	};

	@Transactional
	@Override
	public List<WingLock> updateWingLock(List<WingLock> winglock) {
		return windowsDaoInterface.updateWingLock(winglock);
	};

	@Transactional
	@Override
	public WingLock delSingleWingLock(long id) {
		return windowsDaoInterface.delSingleWingLock(id);
	}

	@Transactional
	@Override
	public List<WingLock> delWingLock(List<WingLock> winglock) {
		return windowsDaoInterface.delWingLock(winglock);
	};

	@Transactional
	@Override
	public List<WingLocksAvailableColours> getListWingLocksAvailableColours() {
		return windowsDaoInterface.getListWingLocksAvailableColours();
	};

	@Transactional
	@Override
	public WingLocksAvailableColours getSingleWingLocksAvailableColours(long id) {
		return windowsDaoInterface.getSingleWingLocksAvailableColours(id);
	};

	@Transactional
	@Override
	public WingLocksAvailableColours saveWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		return windowsDaoInterface.saveWingLocksAvailableColours(winglocksavailablecolours);
	};

	@Transactional
	@Override
	public List<WingLocksAvailableColours> saveWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		return windowsDaoInterface.saveWingLocksAvailableColours(winglocksavailablecolours);
	};

	@Transactional
	@Override
	public WingLocksAvailableColours updateWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		return windowsDaoInterface.updateWingLocksAvailableColours(winglocksavailablecolours);
	};

	@Transactional
	@Override
	public List<WingLocksAvailableColours> updateWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		return windowsDaoInterface.updateWingLocksAvailableColours(winglocksavailablecolours);
	};

	@Transactional
	@Override
	public WingLocksAvailableColours delSingleWingLocksAvailableColours(long id) {
		return windowsDaoInterface.delSingleWingLocksAvailableColours(id);
	}

	@Transactional
	@Override
	public List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		return windowsDaoInterface.delWingLocksAvailableColours(winglocksavailablecolours);
	};

}
