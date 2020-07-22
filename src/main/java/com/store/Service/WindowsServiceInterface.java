package com.store.Service;

import java.util.List;

import com.store.Model.*;

public interface WindowsServiceInterface {

	List<BalconyLatch> getListBalconyLatch();

	BalconyLatch getSingleBalconyLatch(int id);

	BalconyLatch saveBalconyLatch(BalconyLatch balconylatch);

	List<BalconyLatch> saveBalconyLatch(List<BalconyLatch> balconylatch);

	BalconyLatch updateBalconyLatch(BalconyLatch balconylatch);

	List<BalconyLatch> updateBalconyLatch(List<BalconyLatch> balconylatch);

	BalconyLatch delSingleBalconyLatch(int id);

	List<BalconyLatch> delBalconyLatch(List<BalconyLatch> balconylatch);

	List<BalconyLatchAvailableColours> getListBalconyLatchAvailableColours();

	BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(int id);

	BalconyLatchAvailableColours saveBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours);

	List<BalconyLatchAvailableColours> saveBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	BalconyLatchAvailableColours updateBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours);

	List<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(int id);

	List<BalconyLatchAvailableColours> delBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	List<Client> getListClient();

	Client getSingleClient(int id);

	Client saveClient(Client client);

	List<Client> saveClient(List<Client> client);

	Client updateClient(Client client);

	List<Client> updateClient(List<Client> client);

	Client delSingleClient(int id);

	List<Client> delClient(List<Client> client);

	List<ColorOfCasings> getListColorOfCasings();

	ColorOfCasings getSingleColorOfCasings(int id);

	ColorOfCasings saveColorOfCasings(ColorOfCasings colorofcasings);

	List<ColorOfCasings> saveColorOfCasings(List<ColorOfCasings> colorofcasings);

	ColorOfCasings updateColorOfCasings(ColorOfCasings colorofcasings);

	List<ColorOfCasings> updateColorOfCasings(List<ColorOfCasings> colorofcasings);

	ColorOfCasings delSingleColorOfCasings(int id);

	List<ColorOfCasings> delColorOfCasings(List<ColorOfCasings> colorofcasings);

	List<ColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours();

	ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(int id);

	ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours);

	List<ColorOfCasingsAvailableColours> saveColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours);

	List<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(int id);

	List<ColorOfCasingsAvailableColours> delColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	List<CrossbarProfile> getListCrossbarProfile();

	CrossbarProfile getSingleCrossbarProfile(int id);

	CrossbarProfile saveCrossbarProfile(CrossbarProfile crossbarprofile);

	List<CrossbarProfile> saveCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	CrossbarProfile updateCrossbarProfile(CrossbarProfile crossbarprofile);

	List<CrossbarProfile> updateCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	CrossbarProfile delSingleCrossbarProfile(int id);

	List<CrossbarProfile> delCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	List<CrossbbarProfileAvaibleColors> getListCrossbbarProfileAvaibleColors();

	CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(int id);

	CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors);

	List<CrossbbarProfileAvaibleColors> saveCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors);

	List<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(int id);

	List<CrossbbarProfileAvaibleColors> delCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	List<DiffuserColor> getListDiffuserColor();

	DiffuserColor getSingleDiffuserColor(int id);

	DiffuserColor saveDiffuserColor(DiffuserColor diffusercolor);

	List<DiffuserColor> saveDiffuserColor(List<DiffuserColor> diffusercolor);

	DiffuserColor updateDiffuserColor(DiffuserColor diffusercolor);

	List<DiffuserColor> updateDiffuserColor(List<DiffuserColor> diffusercolor);

	DiffuserColor delSingleDiffuserColor(int id);

	List<DiffuserColor> delDiffuserColor(List<DiffuserColor> diffusercolor);

	List<DoorHandleColor> getListDoorHandleColor();

	DoorHandleColor getSingleDoorHandleColor(int id);

	DoorHandleColor saveDoorHandleColor(DoorHandleColor doorhandlecolor);

	List<DoorHandleColor> saveDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	DoorHandleColor updateDoorHandleColor(DoorHandleColor doorhandlecolor);

	List<DoorHandleColor> updateDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	DoorHandleColor delSingleDoorHandleColor(int id);

	List<DoorHandleColor> delDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	List<Extension> getListExtension();

	Extension getSingleExtension(int id);

	Extension saveExtension(Extension extension);

	List<Extension> saveExtension(List<Extension> extension);

	Extension updateExtension(Extension extension);

	List<Extension> updateExtension(List<Extension> extension);

	Extension delSingleExtension(int id);

	List<Extension> delExtension(List<Extension> extension);

	List<ExtensionAvailableColours> getListExtensionAvailableColours();

	ExtensionAvailableColours getSingleExtensionAvailableColours(int id);

	ExtensionAvailableColours saveExtensionAvailableColours(ExtensionAvailableColours extensionavailablecolours);

	List<ExtensionAvailableColours> saveExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	ExtensionAvailableColours updateExtensionAvailableColours(ExtensionAvailableColours extensionavailablecolours);

	List<ExtensionAvailableColours> updateExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	ExtensionAvailableColours delSingleExtensionAvailableColours(int id);

	List<ExtensionAvailableColours> delExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	List<ExternalColor> getListExternalColor();

	ExternalColor getSingleExternalColor(int id);

	ExternalColor saveExternalColor(ExternalColor externalcolor);

	List<ExternalColor> saveExternalColor(List<ExternalColor> externalcolor);

	ExternalColor updateExternalColor(ExternalColor externalcolor);

	List<ExternalColor> updateExternalColor(List<ExternalColor> externalcolor);

	ExternalColor delSingleExternalColor(int id);

	List<ExternalColor> delExternalColor(List<ExternalColor> externalcolor);

	List<Fittings> getListFittings();

	Fittings getSingleFittings(int id);

	Fittings saveFittings(Fittings fittings);

	List<Fittings> saveFittings(List<Fittings> fittings);

	Fittings updateFittings(Fittings fittings);

	List<Fittings> updateFittings(List<Fittings> fittings);

	Fittings delSingleFittings(int id);

	List<Fittings> delFittings(List<Fittings> fittings);

	List<FittingsAvailableColours> getListFittingsAvailableColours();

	FittingsAvailableColours getSingleFittingsAvailableColours(int id);

	FittingsAvailableColours saveFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours);

	List<FittingsAvailableColours> saveFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours);

	FittingsAvailableColours updateFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours);

	List<FittingsAvailableColours> updateFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours);

	FittingsAvailableColours delSingleFittingsAvailableColours(int id);

	List<FittingsAvailableColours> delFittingsAvailableColours(List<FittingsAvailableColours> fittingsavailablecolours);

	List<FrameColor> getListFrameColor();

	FrameColor getSingleFrameColor(int id);

	FrameColor saveFrameColor(FrameColor framecolor);

	List<FrameColor> saveFrameColor(List<FrameColor> framecolor);

	FrameColor updateFrameColor(FrameColor framecolor);

	List<FrameColor> updateFrameColor(List<FrameColor> framecolor);

	FrameColor delSingleFrameColor(int id);

	List<FrameColor> delFrameColor(List<FrameColor> framecolor);

	List<Fulfillment> getListFulfillment();

	Fulfillment getSingleFulfillment(int id);

	Fulfillment saveFulfillment(Fulfillment fulfillment);

	List<Fulfillment> saveFulfillment(List<Fulfillment> fulfillment);

	Fulfillment updateFulfillment(Fulfillment fulfillment);

	List<Fulfillment> updateFulfillment(List<Fulfillment> fulfillment);

	Fulfillment delSingleFulfillment(int id);

	List<Fulfillment> delFulfillment(List<Fulfillment> fulfillment);

	List<FullfillmentAvailableColours> getListFullfillmentAvailableColours();

	FullfillmentAvailableColours getSingleFullfillmentAvailableColours(int id);

	FullfillmentAvailableColours saveFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours);

	List<FullfillmentAvailableColours> saveFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	FullfillmentAvailableColours updateFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours);

	List<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	FullfillmentAvailableColours delSingleFullfillmentAvailableColours(int id);

	List<FullfillmentAvailableColours> delFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	List<GlazingBead> getListGlazingBead();

	GlazingBead getSingleGlazingBead(int id);

	GlazingBead saveGlazingBead(GlazingBead glazingbead);

	List<GlazingBead> saveGlazingBead(List<GlazingBead> glazingbead);

	GlazingBead updateGlazingBead(GlazingBead glazingbead);

	List<GlazingBead> updateGlazingBead(List<GlazingBead> glazingbead);

	GlazingBead delSingleGlazingBead(int id);

	List<GlazingBead> delGlazingBead(List<GlazingBead> glazingbead);

	List<GlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours();

	GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(int id);

	GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours);

	List<GlazingBeadsAvailableColours> saveGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours);

	List<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(int id);

	List<GlazingBeadsAvailableColours> delGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	List<Handle> getListHandle();

	Handle getSingleHandle(int id);

	Handle saveHandle(Handle handle);

	List<Handle> saveHandle(List<Handle> handle);

	Handle updateHandle(Handle handle);

	List<Handle> updateHandle(List<Handle> handle);

	Handle delSingleHandle(int id);

	List<Handle> delHandle(List<Handle> handle);

	List<HandlesAvailableColours> getListHandlesAvailableColours();

	HandlesAvailableColours getSingleHandlesAvailableColours(int id);

	HandlesAvailableColours saveHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours);

	List<HandlesAvailableColours> saveHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	HandlesAvailableColours updateHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours);

	List<HandlesAvailableColours> updateHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	HandlesAvailableColours delSingleHandlesAvailableColours(int id);

	List<HandlesAvailableColours> delHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	List<InternalColor> getListInternalColor();

	InternalColor getSingleInternalColor(int id);

	InternalColor saveInternalColor(InternalColor internalcolor);

	List<InternalColor> saveInternalColor(List<InternalColor> internalcolor);

	InternalColor updateInternalColor(InternalColor internalcolor);

	List<InternalColor> updateInternalColor(List<InternalColor> internalcolor);

	InternalColor delSingleInternalColor(int id);

	List<InternalColor> delInternalColor(List<InternalColor> internalcolor);

	List<InterPaneFrame> getListInterPaneFrame();

	InterPaneFrame getSingleInterPaneFrame(int id);

	InterPaneFrame saveInterPaneFrame(InterPaneFrame interpaneframe);

	List<InterPaneFrame> saveInterPaneFrame(List<InterPaneFrame> interpaneframe);

	InterPaneFrame updateInterPaneFrame(InterPaneFrame interpaneframe);

	List<InterPaneFrame> updateInterPaneFrame(List<InterPaneFrame> interpaneframe);

	InterPaneFrame delSingleInterPaneFrame(int id);

	List<InterPaneFrame> delInterPaneFrame(List<InterPaneFrame> interpaneframe);

	List<InterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours();

	InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(int id);

	InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours);

	List<InterPaneFramesAvailableColours> saveInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours);

	List<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(int id);

	List<InterPaneFramesAvailableColours> delInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	

	


	

	List<MullionPattern> getListMullionPattern();

	MullionPattern getSingleMullionPattern(int id);

	MullionPattern saveMullionPattern(MullionPattern mullionpattern);

	List<MullionPattern> saveMullionPattern(List<MullionPattern> mullionpattern);

	MullionPattern updateMullionPattern(MullionPattern mullionpattern);

	List<MullionPattern> updateMullionPattern(List<MullionPattern> mullionpattern);

	MullionPattern delSingleMullionPattern(int id);

	List<MullionPattern> delMullionPattern(List<MullionPattern> mullionpattern);

	List<MullionPatternsAvailableColours> getListMullionPatternsAvailableColours();

	MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(int id);

	MullionPatternsAvailableColours saveMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours);

	List<MullionPatternsAvailableColours> saveMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	MullionPatternsAvailableColours updateMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours);

	List<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(int id);

	List<MullionPatternsAvailableColours> delMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	List<OpeningFunctions> getListOpeningFunctions();

	OpeningFunctions getSingleOpeningFunctions(int id);

	OpeningFunctions saveOpeningFunctions(OpeningFunctions openingfunctions);

	List<OpeningFunctions> saveOpeningFunctions(List<OpeningFunctions> openingfunctions);

	OpeningFunctions updateOpeningFunctions(OpeningFunctions openingfunctions);

	List<OpeningFunctions> updateOpeningFunctions(List<OpeningFunctions> openingfunctions);

	OpeningFunctions delSingleOpeningFunctions(int id);

	List<OpeningFunctions> delOpeningFunctions(List<OpeningFunctions> openingfunctions);

	List<OpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours();

	OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(int id);

	OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours);

	List<OpeningFunctionsAvailableColours> saveOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours);

	List<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(int id);

	List<OpeningFunctionsAvailableColours> delOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	List<Orders> getListOrders();

	Orders getSingleOrders(int id);

	Orders saveOrders(Orders orders);

	List<Orders> saveOrders(List<Orders> orders);

	Orders updateOrders(Orders orders);

	List<Orders> updateOrders(List<Orders> orders);

	Orders delSingleOrders(int id);

	List<Orders> delOrders(List<Orders> orders);

	List<Reed> getListReed();

	Reed getSingleReed(int id);

	Reed saveReed(Reed reed);

	List<Reed> saveReed(List<Reed> reed);

	Reed updateReed(Reed reed);

	List<Reed> updateReed(List<Reed> reed);

	Reed delSingleReed(int id);

	List<Reed> delReed(List<Reed> reed);

	List<ReedsAvailableColours> getListReedsAvailableColours();

	ReedsAvailableColours getSingleReedsAvailableColours(int id);

	ReedsAvailableColours saveReedsAvailableColours(ReedsAvailableColours reedsavailablecolours);

	List<ReedsAvailableColours> saveReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	ReedsAvailableColours updateReedsAvailableColours(ReedsAvailableColours reedsavailablecolours);

	List<ReedsAvailableColours> updateReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	ReedsAvailableColours delSingleReedsAvailableColours(int id);

	List<ReedsAvailableColours> delReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	List<ReiforcementsAvailableColours> getListReiforcementsAvailableColours();

	ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(int id);

	ReiforcementsAvailableColours saveReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours);

	List<ReiforcementsAvailableColours> saveReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	ReiforcementsAvailableColours updateReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours);

	List<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(int id);

	List<ReiforcementsAvailableColours> delReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	List<Reinforcement> getListReinforcement();

	Reinforcement getSingleReinforcement(int id);

	Reinforcement saveReinforcement(Reinforcement reinforcement);

	List<Reinforcement> saveReinforcement(List<Reinforcement> reinforcement);

	Reinforcement updateReinforcement(Reinforcement reinforcement);

	List<Reinforcement> updateReinforcement(List<Reinforcement> reinforcement);

	Reinforcement delSingleReinforcement(int id);

	List<Reinforcement> delReinforcement(List<Reinforcement> reinforcement);

	List<SillStrip> getListSillStrip();

	SillStrip getSingleSillStrip(int id);

	SillStrip saveSillStrip(SillStrip sillstrip);

	List<SillStrip> saveSillStrip(List<SillStrip> sillstrip);

	SillStrip updateSillStrip(SillStrip sillstrip);

	List<SillStrip> updateSillStrip(List<SillStrip> sillstrip);

	SillStrip delSingleSillStrip(int id);

	List<SillStrip> delSillStrip(List<SillStrip> sillstrip);

	List<SillStripesAvailableColours> getListSillStripesAvailableColours();

	SillStripesAvailableColours getSingleSillStripesAvailableColours(int id);

	SillStripesAvailableColours saveSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours);

	List<SillStripesAvailableColours> saveSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	SillStripesAvailableColours updateSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours);

	List<SillStripesAvailableColours> updateSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	SillStripesAvailableColours delSingleSillStripesAvailableColours(int id);

	List<SillStripesAvailableColours> delSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	List<SpecialShapes> getListSpecialShapes();

	SpecialShapes getSingleSpecialShapes(int id);

	SpecialShapes saveSpecialShapes(SpecialShapes specialshapes);

	List<SpecialShapes> saveSpecialShapes(List<SpecialShapes> specialshapes);

	SpecialShapes updateSpecialShapes(SpecialShapes specialshapes);

	List<SpecialShapes> updateSpecialShapes(List<SpecialShapes> specialshapes);

	SpecialShapes delSingleSpecialShapes(int id);

	List<SpecialShapes> delSpecialShapes(List<SpecialShapes> specialshapes);

	List<SpecialShapesAvailableColours> getListSpecialShapesAvailableColours();

	SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(int id);

	SpecialShapesAvailableColours saveSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours);

	List<SpecialShapesAvailableColours> saveSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	SpecialShapesAvailableColours updateSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours);

	List<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(int id);

	List<SpecialShapesAvailableColours> delSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	List<ThreeSholdsAvailableColours> getListThreeSholdsAvailableColours();

	ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(int id);

	ThreeSholdsAvailableColours saveThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours);

	List<ThreeSholdsAvailableColours> saveThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	ThreeSholdsAvailableColours updateThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours);

	List<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(int id);

	List<ThreeSholdsAvailableColours> delThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	List<Threshold> getListThreshold();

	Threshold getSingleThreshold(int id);

	Threshold saveThreshold(Threshold threshold);

	List<Threshold> saveThreshold(List<Threshold> threshold);

	Threshold updateThreshold(Threshold threshold);

	List<Threshold> updateThreshold(List<Threshold> threshold);

	Threshold delSingleThreshold(int id);

	List<Threshold> delThreshold(List<Threshold> threshold);

	List<TypeOfMullion> getListTypeOfMullion();

	TypeOfMullion getSingleTypeOfMullion(int id);

	TypeOfMullion saveTypeOfMullion(TypeOfMullion typeofmullion);

	List<TypeOfMullion> saveTypeOfMullion(List<TypeOfMullion> typeofmullion);

	TypeOfMullion updateTypeOfMullion(TypeOfMullion typeofmullion);

	List<TypeOfMullion> updateTypeOfMullion(List<TypeOfMullion> typeofmullion);

	TypeOfMullion delSingleTypeOfMullion(int id);

	List<TypeOfMullion> delTypeOfMullion(List<TypeOfMullion> typeofmullion);

	List<TypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours();

	TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(int id);

	TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours);

	List<TypesOfMullionsAvailableColours> saveTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours);

	List<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(int id);

	List<TypesOfMullionsAvailableColours> delTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	List<Ventilator> getListVentilator();

	Ventilator getSingleVentilator(int id);

	Ventilator saveVentilator(Ventilator ventilator);

	List<Ventilator> saveVentilator(List<Ventilator> ventilator);

	Ventilator updateVentilator(Ventilator ventilator);

	List<Ventilator> updateVentilator(List<Ventilator> ventilator);

	Ventilator delSingleVentilator(int id);

	List<Ventilator> delVentilator(List<Ventilator> ventilator);

	List<VentilatorsAvailableColours> getListVentilatorsAvailableColours();

	VentilatorsAvailableColours getSingleVentilatorsAvailableColours(int id);

	VentilatorsAvailableColours saveVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours);

	List<VentilatorsAvailableColours> saveVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	VentilatorsAvailableColours updateVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours);

	List<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	VentilatorsAvailableColours delSingleVentilatorsAvailableColours(int id);

	List<VentilatorsAvailableColours> delVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	List<Windows> getListWindows();

	Windows getSingleWindows(int id);

	Windows saveWindows(Windows windows);

	List<Windows> saveWindows(List<Windows> windows);

	Windows updateWindows(Windows windows);

	List<Windows> updateWindows(List<Windows> windows);

	Windows delSingleWindows(int id);

	List<Windows> delWindows(List<Windows> windows);

	List<WingLock> getListWingLock();

	WingLock getSingleWingLock(int id);

	WingLock saveWingLock(WingLock winglock);

	List<WingLock> saveWingLock(List<WingLock> winglock);

	WingLock updateWingLock(WingLock winglock);

	List<WingLock> updateWingLock(List<WingLock> winglock);

	WingLock delSingleWingLock(int id);

	List<WingLock> delWingLock(List<WingLock> winglock);

	List<WingLocksAvailableColours> getListWingLocksAvailableColours();

	WingLocksAvailableColours getSingleWingLocksAvailableColours(int id);

	WingLocksAvailableColours saveWingLocksAvailableColours(WingLocksAvailableColours winglocksavailablecolours);

	List<WingLocksAvailableColours> saveWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

	WingLocksAvailableColours updateWingLocksAvailableColours(WingLocksAvailableColours winglocksavailablecolours);

	List<WingLocksAvailableColours> updateWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

	WingLocksAvailableColours delSingleWingLocksAvailableColours(int id);

	List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

}