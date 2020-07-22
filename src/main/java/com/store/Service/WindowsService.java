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
	public BalconyLatch getSingleBalconyLatch(int id) {
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
	public BalconyLatch delSingleBalconyLatch(int id) {
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
	public BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(int id) {
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
	public BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(int id) {
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
	public Client getSingleClient(int id) {
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
	public Client delSingleClient(int id) {
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
	public ColorOfCasings getSingleColorOfCasings(int id) {
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
	public ColorOfCasings delSingleColorOfCasings(int id) {
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
	public ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(int id) {
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
	public ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(int id) {
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
	public CrossbarProfile getSingleCrossbarProfile(int id) {
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
	public CrossbarProfile delSingleCrossbarProfile(int id) {
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
	public CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(int id) {
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
	public CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(int id) {
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
	public DiffuserColor getSingleDiffuserColor(int id) {
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
	public DiffuserColor delSingleDiffuserColor(int id) {
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
	public DoorHandleColor getSingleDoorHandleColor(int id) {
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
	public DoorHandleColor delSingleDoorHandleColor(int id) {
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
	public Extension getSingleExtension(int id) {
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
	public Extension delSingleExtension(int id) {
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
	public ExtensionAvailableColours getSingleExtensionAvailableColours(int id) {
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
	public ExtensionAvailableColours delSingleExtensionAvailableColours(int id) {
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
	public ExternalColor getSingleExternalColor(int id) {
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
	public ExternalColor delSingleExternalColor(int id) {
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
	public Fittings getSingleFittings(int id) {
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
	public Fittings delSingleFittings(int id) {
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
	public FittingsAvailableColours getSingleFittingsAvailableColours(int id) {
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
	public FittingsAvailableColours delSingleFittingsAvailableColours(int id) {
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
	public FrameColor getSingleFrameColor(int id) {
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
	public FrameColor delSingleFrameColor(int id) {
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
	public Fulfillment getSingleFulfillment(int id) {
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
	public Fulfillment delSingleFulfillment(int id) {
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
	public FullfillmentAvailableColours getSingleFullfillmentAvailableColours(int id) {
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
	public FullfillmentAvailableColours delSingleFullfillmentAvailableColours(int id) {
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
	public GlazingBead getSingleGlazingBead(int id) {
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
	public GlazingBead delSingleGlazingBead(int id) {
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
	public GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(int id) {
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
	public GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(int id) {
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
	public Handle getSingleHandle(int id) {
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
	public Handle delSingleHandle(int id) {
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
	public HandlesAvailableColours getSingleHandlesAvailableColours(int id) {
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
	public HandlesAvailableColours delSingleHandlesAvailableColours(int id) {
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
	public InternalColor getSingleInternalColor(int id) {
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
	public InternalColor delSingleInternalColor(int id) {
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
	public InterPaneFrame getSingleInterPaneFrame(int id) {
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
	public InterPaneFrame delSingleInterPaneFrame(int id) {
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
	public InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(int id) {
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
	public InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(int id) {
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
	public List<MullionPattern> getListMullionPattern() {
		return windowsDaoInterface.getListMullionPattern();
	};

	@Transactional
	@Override
	public MullionPattern getSingleMullionPattern(int id) {
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
	public MullionPattern delSingleMullionPattern(int id) {
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
	public MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(int id) {
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
	public MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(int id) {
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
	public OpeningFunctions getSingleOpeningFunctions(int id) {
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
	public OpeningFunctions delSingleOpeningFunctions(int id) {
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
	public OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(int id) {
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
	public OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(int id) {
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
	public Orders getSingleOrders(int id) {
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
	public Orders delSingleOrders(int id) {
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
	public Reed getSingleReed(int id) {
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
	public Reed delSingleReed(int id) {
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
	public ReedsAvailableColours getSingleReedsAvailableColours(int id) {
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
	public ReedsAvailableColours delSingleReedsAvailableColours(int id) {
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
	public ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(int id) {
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
	public ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(int id) {
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
	public Reinforcement getSingleReinforcement(int id) {
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
	public Reinforcement delSingleReinforcement(int id) {
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
	public SillStrip getSingleSillStrip(int id) {
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
	public SillStrip delSingleSillStrip(int id) {
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
	public SillStripesAvailableColours getSingleSillStripesAvailableColours(int id) {
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
	public SillStripesAvailableColours delSingleSillStripesAvailableColours(int id) {
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
	public SpecialShapes getSingleSpecialShapes(int id) {
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
	public SpecialShapes delSingleSpecialShapes(int id) {
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
	public SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(int id) {
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
	public SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(int id) {
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
	public ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(int id) {
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
	public ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(int id) {
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
	public Threshold getSingleThreshold(int id) {
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
	public Threshold delSingleThreshold(int id) {
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
	public TypeOfMullion getSingleTypeOfMullion(int id) {
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
	public TypeOfMullion delSingleTypeOfMullion(int id) {
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
	public TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(int id) {
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
	public TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(int id) {
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
	public Ventilator getSingleVentilator(int id) {
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
	public Ventilator delSingleVentilator(int id) {
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
	public VentilatorsAvailableColours getSingleVentilatorsAvailableColours(int id) {
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
	public VentilatorsAvailableColours delSingleVentilatorsAvailableColours(int id) {
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
	public Windows getSingleWindows(int id) {
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
	public Windows delSingleWindows(int id) {
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
	public WingLock getSingleWingLock(int id) {
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
	public WingLock delSingleWingLock(int id) {
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
	public WingLocksAvailableColours getSingleWingLocksAvailableColours(int id) {
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
	public WingLocksAvailableColours delSingleWingLocksAvailableColours(int id) {
		return windowsDaoInterface.delSingleWingLocksAvailableColours(id);
	}

	@Transactional
	@Override
	public List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		return windowsDaoInterface.delWingLocksAvailableColours(winglocksavailablecolours);
	};

}
