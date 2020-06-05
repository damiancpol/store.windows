package com.store.Service;

import java.util.List;

import com.store.Model.*;

public interface WindowsServiceInterface {
	List<BalconyLatch> getListBalconyLatch();

	BalconyLatch getSingleBalconyLatch(long id);

	BalconyLatch saveBalconyLatch(BalconyLatch balconylatch);

	List<BalconyLatch> saveBalconyLatch(List<BalconyLatch> balconylatch);

	BalconyLatch updateBalconyLatch(BalconyLatch balconylatch);

	List<BalconyLatch> updateBalconyLatch(List<BalconyLatch> balconylatch);

	BalconyLatch delSingleBalconyLatch(long id);

	List<BalconyLatch> delBalconyLatch(List<BalconyLatch> balconylatch);

	List<BalconyLatchAvailableColours> getListBalconyLatchAvailableColours();

	BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(long id);

	BalconyLatchAvailableColours saveBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours);

	List<BalconyLatchAvailableColours> saveBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	BalconyLatchAvailableColours updateBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours);

	List<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(long id);

	List<BalconyLatchAvailableColours> delBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours);

	List<Client> getListClient();

	Client getSingleClient(long id);

	Client saveClient(Client client);

	List<Client> saveClient(List<Client> client);

	Client updateClient(Client client);

	List<Client> updateClient(List<Client> client);

	Client delSingleClient(long id);

	List<Client> delClient(List<Client> client);

	List<ColorOfCasings> getListColorOfCasings();

	ColorOfCasings getSingleColorOfCasings(long id);

	ColorOfCasings saveColorOfCasings(ColorOfCasings colorofcasings);

	List<ColorOfCasings> saveColorOfCasings(List<ColorOfCasings> colorofcasings);

	ColorOfCasings updateColorOfCasings(ColorOfCasings colorofcasings);

	List<ColorOfCasings> updateColorOfCasings(List<ColorOfCasings> colorofcasings);

	ColorOfCasings delSingleColorOfCasings(long id);

	List<ColorOfCasings> delColorOfCasings(List<ColorOfCasings> colorofcasings);

	List<ColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours();

	ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(long id);

	ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours);

	List<ColorOfCasingsAvailableColours> saveColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours);

	List<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(long id);

	List<ColorOfCasingsAvailableColours> delColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours);

	List<CrossbarProfile> getListCrossbarProfile();

	CrossbarProfile getSingleCrossbarProfile(long id);

	CrossbarProfile saveCrossbarProfile(CrossbarProfile crossbarprofile);

	List<CrossbarProfile> saveCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	CrossbarProfile updateCrossbarProfile(CrossbarProfile crossbarprofile);

	List<CrossbarProfile> updateCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	CrossbarProfile delSingleCrossbarProfile(long id);

	List<CrossbarProfile> delCrossbarProfile(List<CrossbarProfile> crossbarprofile);

	List<CrossbbarProfileAvaibleColors> getListCrossbbarProfileAvaibleColors();

	CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(long id);

	CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors);

	List<CrossbbarProfileAvaibleColors> saveCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors);

	List<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(long id);

	List<CrossbbarProfileAvaibleColors> delCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors);

	List<DiffuserColor> getListDiffuserColor();

	DiffuserColor getSingleDiffuserColor(long id);

	DiffuserColor saveDiffuserColor(DiffuserColor diffusercolor);

	List<DiffuserColor> saveDiffuserColor(List<DiffuserColor> diffusercolor);

	DiffuserColor updateDiffuserColor(DiffuserColor diffusercolor);

	List<DiffuserColor> updateDiffuserColor(List<DiffuserColor> diffusercolor);

	DiffuserColor delSingleDiffuserColor(long id);

	List<DiffuserColor> delDiffuserColor(List<DiffuserColor> diffusercolor);

	List<DoorHandleColor> getListDoorHandleColor();

	DoorHandleColor getSingleDoorHandleColor(long id);

	DoorHandleColor saveDoorHandleColor(DoorHandleColor doorhandlecolor);

	List<DoorHandleColor> saveDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	DoorHandleColor updateDoorHandleColor(DoorHandleColor doorhandlecolor);

	List<DoorHandleColor> updateDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	DoorHandleColor delSingleDoorHandleColor(long id);

	List<DoorHandleColor> delDoorHandleColor(List<DoorHandleColor> doorhandlecolor);

	List<Extension> getListExtension();

	Extension getSingleExtension(long id);

	Extension saveExtension(Extension extension);

	List<Extension> saveExtension(List<Extension> extension);

	Extension updateExtension(Extension extension);

	List<Extension> updateExtension(List<Extension> extension);

	Extension delSingleExtension(long id);

	List<Extension> delExtension(List<Extension> extension);

	List<ExtensionAvailableColours> getListExtensionAvailableColours();

	ExtensionAvailableColours getSingleExtensionAvailableColours(long id);

	ExtensionAvailableColours saveExtensionAvailableColours(ExtensionAvailableColours extensionavailablecolours);

	List<ExtensionAvailableColours> saveExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	ExtensionAvailableColours updateExtensionAvailableColours(ExtensionAvailableColours extensionavailablecolours);

	List<ExtensionAvailableColours> updateExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	ExtensionAvailableColours delSingleExtensionAvailableColours(long id);

	List<ExtensionAvailableColours> delExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours);

	List<ExternalColor> getListExternalColor();

	ExternalColor getSingleExternalColor(long id);

	ExternalColor saveExternalColor(ExternalColor externalcolor);

	List<ExternalColor> saveExternalColor(List<ExternalColor> externalcolor);

	ExternalColor updateExternalColor(ExternalColor externalcolor);

	List<ExternalColor> updateExternalColor(List<ExternalColor> externalcolor);

	ExternalColor delSingleExternalColor(long id);

	List<ExternalColor> delExternalColor(List<ExternalColor> externalcolor);

	List<Fittings> getListFittings();

	Fittings getSingleFittings(long id);

	Fittings saveFittings(Fittings fittings);

	List<Fittings> saveFittings(List<Fittings> fittings);

	Fittings updateFittings(Fittings fittings);

	List<Fittings> updateFittings(List<Fittings> fittings);

	Fittings delSingleFittings(long id);

	List<Fittings> delFittings(List<Fittings> fittings);

	List<FittingsAvailableColours> getListFittingsAvailableColours();

	FittingsAvailableColours getSingleFittingsAvailableColours(long id);

	FittingsAvailableColours saveFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours);

	List<FittingsAvailableColours> saveFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours);

	FittingsAvailableColours updateFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours);

	List<FittingsAvailableColours> updateFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours);

	FittingsAvailableColours delSingleFittingsAvailableColours(long id);

	List<FittingsAvailableColours> delFittingsAvailableColours(List<FittingsAvailableColours> fittingsavailablecolours);

	List<FrameColor> getListFrameColor();

	FrameColor getSingleFrameColor(long id);

	FrameColor saveFrameColor(FrameColor framecolor);

	List<FrameColor> saveFrameColor(List<FrameColor> framecolor);

	FrameColor updateFrameColor(FrameColor framecolor);

	List<FrameColor> updateFrameColor(List<FrameColor> framecolor);

	FrameColor delSingleFrameColor(long id);

	List<FrameColor> delFrameColor(List<FrameColor> framecolor);

	List<Fulfillment> getListFulfillment();

	Fulfillment getSingleFulfillment(long id);

	Fulfillment saveFulfillment(Fulfillment fulfillment);

	List<Fulfillment> saveFulfillment(List<Fulfillment> fulfillment);

	Fulfillment updateFulfillment(Fulfillment fulfillment);

	List<Fulfillment> updateFulfillment(List<Fulfillment> fulfillment);

	Fulfillment delSingleFulfillment(long id);

	List<Fulfillment> delFulfillment(List<Fulfillment> fulfillment);

	List<FullfillmentAvailableColours> getListFullfillmentAvailableColours();

	FullfillmentAvailableColours getSingleFullfillmentAvailableColours(long id);

	FullfillmentAvailableColours saveFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours);

	List<FullfillmentAvailableColours> saveFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	FullfillmentAvailableColours updateFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours);

	List<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	FullfillmentAvailableColours delSingleFullfillmentAvailableColours(long id);

	List<FullfillmentAvailableColours> delFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours);

	List<GlazingBead> getListGlazingBead();

	GlazingBead getSingleGlazingBead(long id);

	GlazingBead saveGlazingBead(GlazingBead glazingbead);

	List<GlazingBead> saveGlazingBead(List<GlazingBead> glazingbead);

	GlazingBead updateGlazingBead(GlazingBead glazingbead);

	List<GlazingBead> updateGlazingBead(List<GlazingBead> glazingbead);

	GlazingBead delSingleGlazingBead(long id);

	List<GlazingBead> delGlazingBead(List<GlazingBead> glazingbead);

	List<GlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours();

	GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(long id);

	GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours);

	List<GlazingBeadsAvailableColours> saveGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours);

	List<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(long id);

	List<GlazingBeadsAvailableColours> delGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours);

	List<Handle> getListHandle();

	Handle getSingleHandle(long id);

	Handle saveHandle(Handle handle);

	List<Handle> saveHandle(List<Handle> handle);

	Handle updateHandle(Handle handle);

	List<Handle> updateHandle(List<Handle> handle);

	Handle delSingleHandle(long id);

	List<Handle> delHandle(List<Handle> handle);

	List<HandlesAvailableColours> getListHandlesAvailableColours();

	HandlesAvailableColours getSingleHandlesAvailableColours(long id);

	HandlesAvailableColours saveHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours);

	List<HandlesAvailableColours> saveHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	HandlesAvailableColours updateHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours);

	List<HandlesAvailableColours> updateHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	HandlesAvailableColours delSingleHandlesAvailableColours(long id);

	List<HandlesAvailableColours> delHandlesAvailableColours(List<HandlesAvailableColours> handlesavailablecolours);

	List<InternalColor> getListInternalColor();

	InternalColor getSingleInternalColor(long id);

	InternalColor saveInternalColor(InternalColor internalcolor);

	List<InternalColor> saveInternalColor(List<InternalColor> internalcolor);

	InternalColor updateInternalColor(InternalColor internalcolor);

	List<InternalColor> updateInternalColor(List<InternalColor> internalcolor);

	InternalColor delSingleInternalColor(long id);

	List<InternalColor> delInternalColor(List<InternalColor> internalcolor);

	List<InterPaneFrame> getListInterPaneFrame();

	InterPaneFrame getSingleInterPaneFrame(long id);

	InterPaneFrame saveInterPaneFrame(InterPaneFrame interpaneframe);

	List<InterPaneFrame> saveInterPaneFrame(List<InterPaneFrame> interpaneframe);

	InterPaneFrame updateInterPaneFrame(InterPaneFrame interpaneframe);

	List<InterPaneFrame> updateInterPaneFrame(List<InterPaneFrame> interpaneframe);

	InterPaneFrame delSingleInterPaneFrame(long id);

	List<InterPaneFrame> delInterPaneFrame(List<InterPaneFrame> interpaneframe);

	List<InterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours();

	InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(long id);

	InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours);

	List<InterPaneFramesAvailableColours> saveInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours);

	List<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(long id);

	List<InterPaneFramesAvailableColours> delInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours);

	List<ListBalconyLatch> getListListBalconyLatch();

	ListBalconyLatch getSingleListBalconyLatch(long id);

	ListBalconyLatch saveListBalconyLatch(ListBalconyLatch listbalconylatch);

	List<ListBalconyLatch> saveListBalconyLatch(List<ListBalconyLatch> listbalconylatch);

	ListBalconyLatch updateListBalconyLatch(ListBalconyLatch listbalconylatch);

	List<ListBalconyLatch> updateListBalconyLatch(List<ListBalconyLatch> listbalconylatch);

	ListBalconyLatch delSingleListBalconyLatch(long id);

	List<ListBalconyLatch> delListBalconyLatch(List<ListBalconyLatch> listbalconylatch);

	List<ListBalconyLatchAvailableColours> getListListBalconyLatchAvailableColours();

	ListBalconyLatchAvailableColours getSingleListBalconyLatchAvailableColours(long id);

	ListBalconyLatchAvailableColours saveListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours);

	List<ListBalconyLatchAvailableColours> saveListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours);

	ListBalconyLatchAvailableColours updateListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours);

	List<ListBalconyLatchAvailableColours> updateListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours);

	ListBalconyLatchAvailableColours delSingleListBalconyLatchAvailableColours(long id);

	List<ListBalconyLatchAvailableColours> delListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours);

	List<ListClient> getListListClient();

	ListClient getSingleListClient(long id);

	ListClient saveListClient(ListClient listclient);

	List<ListClient> saveListClient(List<ListClient> listclient);

	ListClient updateListClient(ListClient listclient);

	List<ListClient> updateListClient(List<ListClient> listclient);

	ListClient delSingleListClient(long id);

	List<ListClient> delListClient(List<ListClient> listclient);

	List<ListColorOfCasings> getListListColorOfCasings();

	ListColorOfCasings getSingleListColorOfCasings(long id);

	ListColorOfCasings saveListColorOfCasings(ListColorOfCasings listcolorofcasings);

	List<ListColorOfCasings> saveListColorOfCasings(List<ListColorOfCasings> listcolorofcasings);

	ListColorOfCasings updateListColorOfCasings(ListColorOfCasings listcolorofcasings);

	List<ListColorOfCasings> updateListColorOfCasings(List<ListColorOfCasings> listcolorofcasings);

	ListColorOfCasings delSingleListColorOfCasings(long id);

	List<ListColorOfCasings> delListColorOfCasings(List<ListColorOfCasings> listcolorofcasings);

	List<ListColorOfCasingsAvailableColours> getListListColorOfCasingsAvailableColours();

	ListColorOfCasingsAvailableColours getSingleListColorOfCasingsAvailableColours(long id);

	ListColorOfCasingsAvailableColours saveListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours);

	List<ListColorOfCasingsAvailableColours> saveListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours);

	ListColorOfCasingsAvailableColours updateListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours);

	List<ListColorOfCasingsAvailableColours> updateListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours);

	ListColorOfCasingsAvailableColours delSingleListColorOfCasingsAvailableColours(long id);

	List<ListColorOfCasingsAvailableColours> delListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours);

	List<ListCrossbarProfile> getListListCrossbarProfile();

	ListCrossbarProfile getSingleListCrossbarProfile(long id);

	ListCrossbarProfile saveListCrossbarProfile(ListCrossbarProfile listcrossbarprofile);

	List<ListCrossbarProfile> saveListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile);

	ListCrossbarProfile updateListCrossbarProfile(ListCrossbarProfile listcrossbarprofile);

	List<ListCrossbarProfile> updateListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile);

	ListCrossbarProfile delSingleListCrossbarProfile(long id);

	List<ListCrossbarProfile> delListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile);

	List<ListCrossbarProfileAvailableColours> getListListCrossbarProfileAvailableColours();

	ListCrossbarProfileAvailableColours getSingleListCrossbarProfileAvailableColours(long id);

	ListCrossbarProfileAvailableColours saveListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours);

	List<ListCrossbarProfileAvailableColours> saveListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours);

	ListCrossbarProfileAvailableColours updateListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours);

	List<ListCrossbarProfileAvailableColours> updateListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours);

	ListCrossbarProfileAvailableColours delSingleListCrossbarProfileAvailableColours(long id);

	List<ListCrossbarProfileAvailableColours> delListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours);

	List<ListDiffuserColor> getListListDiffuserColor();

	ListDiffuserColor getSingleListDiffuserColor(long id);

	ListDiffuserColor saveListDiffuserColor(ListDiffuserColor listdiffusercolor);

	List<ListDiffuserColor> saveListDiffuserColor(List<ListDiffuserColor> listdiffusercolor);

	ListDiffuserColor updateListDiffuserColor(ListDiffuserColor listdiffusercolor);

	List<ListDiffuserColor> updateListDiffuserColor(List<ListDiffuserColor> listdiffusercolor);

	ListDiffuserColor delSingleListDiffuserColor(long id);

	List<ListDiffuserColor> delListDiffuserColor(List<ListDiffuserColor> listdiffusercolor);

	List<ListDoorHandleColor> getListListDoorHandleColor();

	ListDoorHandleColor getSingleListDoorHandleColor(long id);

	ListDoorHandleColor saveListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor);

	List<ListDoorHandleColor> saveListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor);

	ListDoorHandleColor updateListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor);

	List<ListDoorHandleColor> updateListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor);

	ListDoorHandleColor delSingleListDoorHandleColor(long id);

	List<ListDoorHandleColor> delListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor);

	List<ListExtension> getListListExtension();

	ListExtension getSingleListExtension(long id);

	ListExtension saveListExtension(ListExtension listextension);

	List<ListExtension> saveListExtension(List<ListExtension> listextension);

	ListExtension updateListExtension(ListExtension listextension);

	List<ListExtension> updateListExtension(List<ListExtension> listextension);

	ListExtension delSingleListExtension(long id);

	List<ListExtension> delListExtension(List<ListExtension> listextension);

	List<ListExtensionAvailableColours> getListListExtensionAvailableColours();

	ListExtensionAvailableColours getSingleListExtensionAvailableColours(long id);

	ListExtensionAvailableColours saveListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours);

	List<ListExtensionAvailableColours> saveListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours);

	ListExtensionAvailableColours updateListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours);

	List<ListExtensionAvailableColours> updateListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours);

	ListExtensionAvailableColours delSingleListExtensionAvailableColours(long id);

	List<ListExtensionAvailableColours> delListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours);

	List<ListExternalColor> getListListExternalColor();

	ListExternalColor getSingleListExternalColor(long id);

	ListExternalColor saveListExternalColor(ListExternalColor listexternalcolor);

	List<ListExternalColor> saveListExternalColor(List<ListExternalColor> listexternalcolor);

	ListExternalColor updateListExternalColor(ListExternalColor listexternalcolor);

	List<ListExternalColor> updateListExternalColor(List<ListExternalColor> listexternalcolor);

	ListExternalColor delSingleListExternalColor(long id);

	List<ListExternalColor> delListExternalColor(List<ListExternalColor> listexternalcolor);

	List<ListFittings> getListListFittings();

	ListFittings getSingleListFittings(long id);

	ListFittings saveListFittings(ListFittings listfittings);

	List<ListFittings> saveListFittings(List<ListFittings> listfittings);

	ListFittings updateListFittings(ListFittings listfittings);

	List<ListFittings> updateListFittings(List<ListFittings> listfittings);

	ListFittings delSingleListFittings(long id);

	List<ListFittings> delListFittings(List<ListFittings> listfittings);

	List<ListFittingsAvailableColours> getListListFittingsAvailableColours();

	ListFittingsAvailableColours getSingleListFittingsAvailableColours(long id);

	ListFittingsAvailableColours saveListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours);

	List<ListFittingsAvailableColours> saveListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours);

	ListFittingsAvailableColours updateListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours);

	List<ListFittingsAvailableColours> updateListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours);

	ListFittingsAvailableColours delSingleListFittingsAvailableColours(long id);

	List<ListFittingsAvailableColours> delListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours);

	List<ListFrameColors> getListListFrameColors();

	ListFrameColors getSingleListFrameColors(long id);

	ListFrameColors saveListFrameColors(ListFrameColors listframecolors);

	List<ListFrameColors> saveListFrameColors(List<ListFrameColors> listframecolors);

	ListFrameColors updateListFrameColors(ListFrameColors listframecolors);

	List<ListFrameColors> updateListFrameColors(List<ListFrameColors> listframecolors);

	ListFrameColors delSingleListFrameColors(long id);

	List<ListFrameColors> delListFrameColors(List<ListFrameColors> listframecolors);

	List<ListFullfillments> getListListFullfillments();

	ListFullfillments getSingleListFullfillments(long id);

	ListFullfillments saveListFullfillments(ListFullfillments listfullfillments);

	List<ListFullfillments> saveListFullfillments(List<ListFullfillments> listfullfillments);

	ListFullfillments updateListFullfillments(ListFullfillments listfullfillments);

	List<ListFullfillments> updateListFullfillments(List<ListFullfillments> listfullfillments);

	ListFullfillments delSingleListFullfillments(long id);

	List<ListFullfillments> delListFullfillments(List<ListFullfillments> listfullfillments);

	List<ListFullfillmentsAvailableColours> getListListFullfillmentsAvailableColours();

	ListFullfillmentsAvailableColours getSingleListFullfillmentsAvailableColours(long id);

	ListFullfillmentsAvailableColours saveListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours);

	List<ListFullfillmentsAvailableColours> saveListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours);

	ListFullfillmentsAvailableColours updateListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours);

	List<ListFullfillmentsAvailableColours> updateListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours);

	ListFullfillmentsAvailableColours delSingleListFullfillmentsAvailableColours(long id);

	List<ListFullfillmentsAvailableColours> delListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours);

	List<ListGlazingBeads> getListListGlazingBeads();

	ListGlazingBeads getSingleListGlazingBeads(long id);

	ListGlazingBeads saveListGlazingBeads(ListGlazingBeads listglazingbeads);

	List<ListGlazingBeads> saveListGlazingBeads(List<ListGlazingBeads> listglazingbeads);

	ListGlazingBeads updateListGlazingBeads(ListGlazingBeads listglazingbeads);

	List<ListGlazingBeads> updateListGlazingBeads(List<ListGlazingBeads> listglazingbeads);

	ListGlazingBeads delSingleListGlazingBeads(long id);

	List<ListGlazingBeads> delListGlazingBeads(List<ListGlazingBeads> listglazingbeads);

	List<ListGlazingBeadsAvailableColours> getListListGlazingBeadsAvailableColours();

	ListGlazingBeadsAvailableColours getSingleListGlazingBeadsAvailableColours(long id);

	ListGlazingBeadsAvailableColours saveListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours);

	List<ListGlazingBeadsAvailableColours> saveListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours);

	ListGlazingBeadsAvailableColours updateListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours);

	List<ListGlazingBeadsAvailableColours> updateListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours);

	ListGlazingBeadsAvailableColours delSingleListGlazingBeadsAvailableColours(long id);

	List<ListGlazingBeadsAvailableColours> delListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours);

	List<ListHandles> getListListHandles();

	ListHandles getSingleListHandles(long id);

	ListHandles saveListHandles(ListHandles listhandles);

	List<ListHandles> saveListHandles(List<ListHandles> listhandles);

	ListHandles updateListHandles(ListHandles listhandles);

	List<ListHandles> updateListHandles(List<ListHandles> listhandles);

	ListHandles delSingleListHandles(long id);

	List<ListHandles> delListHandles(List<ListHandles> listhandles);

	List<ListHandlesAvailableColours> getListListHandlesAvailableColours();

	ListHandlesAvailableColours getSingleListHandlesAvailableColours(long id);

	ListHandlesAvailableColours saveListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours);

	List<ListHandlesAvailableColours> saveListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours);

	ListHandlesAvailableColours updateListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours);

	List<ListHandlesAvailableColours> updateListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours);

	ListHandlesAvailableColours delSingleListHandlesAvailableColours(long id);

	List<ListHandlesAvailableColours> delListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours);

	List<ListInternalColors> getListListInternalColors();

	ListInternalColors getSingleListInternalColors(long id);

	ListInternalColors saveListInternalColors(ListInternalColors listinternalcolors);

	List<ListInternalColors> saveListInternalColors(List<ListInternalColors> listinternalcolors);

	ListInternalColors updateListInternalColors(ListInternalColors listinternalcolors);

	List<ListInternalColors> updateListInternalColors(List<ListInternalColors> listinternalcolors);

	ListInternalColors delSingleListInternalColors(long id);

	List<ListInternalColors> delListInternalColors(List<ListInternalColors> listinternalcolors);

	List<ListInterPaneFrames> getListListInterPaneFrames();

	ListInterPaneFrames getSingleListInterPaneFrames(long id);

	ListInterPaneFrames saveListInterPaneFrames(ListInterPaneFrames listinterpaneframes);

	List<ListInterPaneFrames> saveListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes);

	ListInterPaneFrames updateListInterPaneFrames(ListInterPaneFrames listinterpaneframes);

	List<ListInterPaneFrames> updateListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes);

	ListInterPaneFrames delSingleListInterPaneFrames(long id);

	List<ListInterPaneFrames> delListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes);

	List<ListInterPaneFramesAvailableColours> getListListInterPaneFramesAvailableColours();

	ListInterPaneFramesAvailableColours getSingleListInterPaneFramesAvailableColours(long id);

	ListInterPaneFramesAvailableColours saveListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours);

	List<ListInterPaneFramesAvailableColours> saveListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours);

	ListInterPaneFramesAvailableColours updateListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours);

	List<ListInterPaneFramesAvailableColours> updateListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours);

	ListInterPaneFramesAvailableColours delSingleListInterPaneFramesAvailableColours(long id);

	List<ListInterPaneFramesAvailableColours> delListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours);

	List<ListMullionPatterns> getListListMullionPatterns();

	ListMullionPatterns getSingleListMullionPatterns(long id);

	ListMullionPatterns saveListMullionPatterns(ListMullionPatterns listmullionpatterns);

	List<ListMullionPatterns> saveListMullionPatterns(List<ListMullionPatterns> listmullionpatterns);

	ListMullionPatterns updateListMullionPatterns(ListMullionPatterns listmullionpatterns);

	List<ListMullionPatterns> updateListMullionPatterns(List<ListMullionPatterns> listmullionpatterns);

	ListMullionPatterns delSingleListMullionPatterns(long id);

	List<ListMullionPatterns> delListMullionPatterns(List<ListMullionPatterns> listmullionpatterns);

	List<ListMullionPatternsAvailableColours> getListListMullionPatternsAvailableColours();

	ListMullionPatternsAvailableColours getSingleListMullionPatternsAvailableColours(long id);

	ListMullionPatternsAvailableColours saveListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours);

	List<ListMullionPatternsAvailableColours> saveListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours);

	ListMullionPatternsAvailableColours updateListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours);

	List<ListMullionPatternsAvailableColours> updateListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours);

	ListMullionPatternsAvailableColours delSingleListMullionPatternsAvailableColours(long id);

	List<ListMullionPatternsAvailableColours> delListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours);

	List<ListOpeningFunctions> getListListOpeningFunctions();

	ListOpeningFunctions getSingleListOpeningFunctions(long id);

	ListOpeningFunctions saveListOpeningFunctions(ListOpeningFunctions listopeningfunctions);

	List<ListOpeningFunctions> saveListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions);

	ListOpeningFunctions updateListOpeningFunctions(ListOpeningFunctions listopeningfunctions);

	List<ListOpeningFunctions> updateListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions);

	ListOpeningFunctions delSingleListOpeningFunctions(long id);

	List<ListOpeningFunctions> delListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions);

	List<ListOpeningFunctionsAvailableColours> getListListOpeningFunctionsAvailableColours();

	ListOpeningFunctionsAvailableColours getSingleListOpeningFunctionsAvailableColours(long id);

	ListOpeningFunctionsAvailableColours saveListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours);

	List<ListOpeningFunctionsAvailableColours> saveListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours);

	ListOpeningFunctionsAvailableColours updateListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours);

	List<ListOpeningFunctionsAvailableColours> updateListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours);

	ListOpeningFunctionsAvailableColours delSingleListOpeningFunctionsAvailableColours(long id);

	List<ListOpeningFunctionsAvailableColours> delListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours);

	List<ListReeds> getListListReeds();

	ListReeds getSingleListReeds(long id);

	ListReeds saveListReeds(ListReeds listreeds);

	List<ListReeds> saveListReeds(List<ListReeds> listreeds);

	ListReeds updateListReeds(ListReeds listreeds);

	List<ListReeds> updateListReeds(List<ListReeds> listreeds);

	ListReeds delSingleListReeds(long id);

	List<ListReeds> delListReeds(List<ListReeds> listreeds);

	List<ListReedsAvailableColours> getListListReedsAvailableColours();

	ListReedsAvailableColours getSingleListReedsAvailableColours(long id);

	ListReedsAvailableColours saveListReedsAvailableColours(ListReedsAvailableColours listreedsavailablecolours);

	List<ListReedsAvailableColours> saveListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours);

	ListReedsAvailableColours updateListReedsAvailableColours(ListReedsAvailableColours listreedsavailablecolours);

	List<ListReedsAvailableColours> updateListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours);

	ListReedsAvailableColours delSingleListReedsAvailableColours(long id);

	List<ListReedsAvailableColours> delListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours);

	List<ListReiforcements> getListListReiforcements();

	ListReiforcements getSingleListReiforcements(long id);

	ListReiforcements saveListReiforcements(ListReiforcements listreiforcements);

	List<ListReiforcements> saveListReiforcements(List<ListReiforcements> listreiforcements);

	ListReiforcements updateListReiforcements(ListReiforcements listreiforcements);

	List<ListReiforcements> updateListReiforcements(List<ListReiforcements> listreiforcements);

	ListReiforcements delSingleListReiforcements(long id);

	List<ListReiforcements> delListReiforcements(List<ListReiforcements> listreiforcements);

	List<ListReiforcementsAvailableColours> getListListReiforcementsAvailableColours();

	ListReiforcementsAvailableColours getSingleListReiforcementsAvailableColours(long id);

	ListReiforcementsAvailableColours saveListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours);

	List<ListReiforcementsAvailableColours> saveListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours);

	ListReiforcementsAvailableColours updateListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours);

	List<ListReiforcementsAvailableColours> updateListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours);

	ListReiforcementsAvailableColours delSingleListReiforcementsAvailableColours(long id);

	List<ListReiforcementsAvailableColours> delListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours);

	List<ListSillStripes> getListListSillStripes();

	ListSillStripes getSingleListSillStripes(long id);

	ListSillStripes saveListSillStripes(ListSillStripes listsillstripes);

	List<ListSillStripes> saveListSillStripes(List<ListSillStripes> listsillstripes);

	ListSillStripes updateListSillStripes(ListSillStripes listsillstripes);

	List<ListSillStripes> updateListSillStripes(List<ListSillStripes> listsillstripes);

	ListSillStripes delSingleListSillStripes(long id);

	List<ListSillStripes> delListSillStripes(List<ListSillStripes> listsillstripes);

	List<ListSillStripesAvailableColours> getListListSillStripesAvailableColours();

	ListSillStripesAvailableColours getSingleListSillStripesAvailableColours(long id);

	ListSillStripesAvailableColours saveListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours);

	List<ListSillStripesAvailableColours> saveListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours);

	ListSillStripesAvailableColours updateListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours);

	List<ListSillStripesAvailableColours> updateListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours);

	ListSillStripesAvailableColours delSingleListSillStripesAvailableColours(long id);

	List<ListSillStripesAvailableColours> delListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours);

	List<ListSpecialShapes> getListListSpecialShapes();

	ListSpecialShapes getSingleListSpecialShapes(long id);

	ListSpecialShapes saveListSpecialShapes(ListSpecialShapes listspecialshapes);

	List<ListSpecialShapes> saveListSpecialShapes(List<ListSpecialShapes> listspecialshapes);

	ListSpecialShapes updateListSpecialShapes(ListSpecialShapes listspecialshapes);

	List<ListSpecialShapes> updateListSpecialShapes(List<ListSpecialShapes> listspecialshapes);

	ListSpecialShapes delSingleListSpecialShapes(long id);

	List<ListSpecialShapes> delListSpecialShapes(List<ListSpecialShapes> listspecialshapes);

	List<ListSpecialShapesAvailableColours> getListListSpecialShapesAvailableColours();

	ListSpecialShapesAvailableColours getSingleListSpecialShapesAvailableColours(long id);

	ListSpecialShapesAvailableColours saveListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours);

	List<ListSpecialShapesAvailableColours> saveListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours);

	ListSpecialShapesAvailableColours updateListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours);

	List<ListSpecialShapesAvailableColours> updateListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours);

	ListSpecialShapesAvailableColours delSingleListSpecialShapesAvailableColours(long id);

	List<ListSpecialShapesAvailableColours> delListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours);

	List<ListThreeSholds> getListListThreeSholds();

	ListThreeSholds getSingleListThreeSholds(long id);

	ListThreeSholds saveListThreeSholds(ListThreeSholds listthreesholds);

	List<ListThreeSholds> saveListThreeSholds(List<ListThreeSholds> listthreesholds);

	ListThreeSholds updateListThreeSholds(ListThreeSholds listthreesholds);

	List<ListThreeSholds> updateListThreeSholds(List<ListThreeSholds> listthreesholds);

	ListThreeSholds delSingleListThreeSholds(long id);

	List<ListThreeSholds> delListThreeSholds(List<ListThreeSholds> listthreesholds);

	List<ListThreeSholdsAvailableColours> getListListThreeSholdsAvailableColours();

	ListThreeSholdsAvailableColours getSingleListThreeSholdsAvailableColours(long id);

	ListThreeSholdsAvailableColours saveListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours);

	List<ListThreeSholdsAvailableColours> saveListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours);

	ListThreeSholdsAvailableColours updateListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours);

	List<ListThreeSholdsAvailableColours> updateListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours);

	ListThreeSholdsAvailableColours delSingleListThreeSholdsAvailableColours(long id);

	List<ListThreeSholdsAvailableColours> delListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours);

	List<ListTypesOfMullions> getListListTypesOfMullions();

	ListTypesOfMullions getSingleListTypesOfMullions(long id);

	ListTypesOfMullions saveListTypesOfMullions(ListTypesOfMullions listtypesofmullions);

	List<ListTypesOfMullions> saveListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions);

	ListTypesOfMullions updateListTypesOfMullions(ListTypesOfMullions listtypesofmullions);

	List<ListTypesOfMullions> updateListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions);

	ListTypesOfMullions delSingleListTypesOfMullions(long id);

	List<ListTypesOfMullions> delListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions);

	List<ListTypesOfMullionsAvailableColours> getListListTypesOfMullionsAvailableColours();

	ListTypesOfMullionsAvailableColours getSingleListTypesOfMullionsAvailableColours(long id);

	ListTypesOfMullionsAvailableColours saveListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours);

	List<ListTypesOfMullionsAvailableColours> saveListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours);

	ListTypesOfMullionsAvailableColours updateListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours);

	List<ListTypesOfMullionsAvailableColours> updateListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours);

	ListTypesOfMullionsAvailableColours delSingleListTypesOfMullionsAvailableColours(long id);

	List<ListTypesOfMullionsAvailableColours> delListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours);

	List<ListVentilators> getListListVentilators();

	ListVentilators getSingleListVentilators(long id);

	ListVentilators saveListVentilators(ListVentilators listventilators);

	List<ListVentilators> saveListVentilators(List<ListVentilators> listventilators);

	ListVentilators updateListVentilators(ListVentilators listventilators);

	List<ListVentilators> updateListVentilators(List<ListVentilators> listventilators);

	ListVentilators delSingleListVentilators(long id);

	List<ListVentilators> delListVentilators(List<ListVentilators> listventilators);

	List<ListVentilatorsAvailableColours> getListListVentilatorsAvailableColours();

	ListVentilatorsAvailableColours getSingleListVentilatorsAvailableColours(long id);

	ListVentilatorsAvailableColours saveListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours);

	List<ListVentilatorsAvailableColours> saveListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours);

	ListVentilatorsAvailableColours updateListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours);

	List<ListVentilatorsAvailableColours> updateListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours);

	ListVentilatorsAvailableColours delSingleListVentilatorsAvailableColours(long id);

	List<ListVentilatorsAvailableColours> delListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours);

	List<ListWingLocks> getListListWingLocks();

	ListWingLocks getSingleListWingLocks(long id);

	ListWingLocks saveListWingLocks(ListWingLocks listwinglocks);

	List<ListWingLocks> saveListWingLocks(List<ListWingLocks> listwinglocks);

	ListWingLocks updateListWingLocks(ListWingLocks listwinglocks);

	List<ListWingLocks> updateListWingLocks(List<ListWingLocks> listwinglocks);

	ListWingLocks delSingleListWingLocks(long id);

	List<ListWingLocks> delListWingLocks(List<ListWingLocks> listwinglocks);

	List<ListWingLocksAvailableColours> getListListWingLocksAvailableColours();

	ListWingLocksAvailableColours getSingleListWingLocksAvailableColours(long id);

	ListWingLocksAvailableColours saveListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours);

	List<ListWingLocksAvailableColours> saveListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours);

	ListWingLocksAvailableColours updateListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours);

	List<ListWingLocksAvailableColours> updateListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours);

	ListWingLocksAvailableColours delSingleListWingLocksAvailableColours(long id);

	List<ListWingLocksAvailableColours> delListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours);

	List<MullionPattern> getListMullionPattern();

	MullionPattern getSingleMullionPattern(long id);

	MullionPattern saveMullionPattern(MullionPattern mullionpattern);

	List<MullionPattern> saveMullionPattern(List<MullionPattern> mullionpattern);

	MullionPattern updateMullionPattern(MullionPattern mullionpattern);

	List<MullionPattern> updateMullionPattern(List<MullionPattern> mullionpattern);

	MullionPattern delSingleMullionPattern(long id);

	List<MullionPattern> delMullionPattern(List<MullionPattern> mullionpattern);

	List<MullionPatternsAvailableColours> getListMullionPatternsAvailableColours();

	MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(long id);

	MullionPatternsAvailableColours saveMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours);

	List<MullionPatternsAvailableColours> saveMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	MullionPatternsAvailableColours updateMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours);

	List<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(long id);

	List<MullionPatternsAvailableColours> delMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours);

	List<OpeningFunctions> getListOpeningFunctions();

	OpeningFunctions getSingleOpeningFunctions(long id);

	OpeningFunctions saveOpeningFunctions(OpeningFunctions openingfunctions);

	List<OpeningFunctions> saveOpeningFunctions(List<OpeningFunctions> openingfunctions);

	OpeningFunctions updateOpeningFunctions(OpeningFunctions openingfunctions);

	List<OpeningFunctions> updateOpeningFunctions(List<OpeningFunctions> openingfunctions);

	OpeningFunctions delSingleOpeningFunctions(long id);

	List<OpeningFunctions> delOpeningFunctions(List<OpeningFunctions> openingfunctions);

	List<OpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours();

	OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(long id);

	OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours);

	List<OpeningFunctionsAvailableColours> saveOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours);

	List<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(long id);

	List<OpeningFunctionsAvailableColours> delOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours);

	List<Orders> getListOrders();

	Orders getSingleOrders(long id);

	Orders saveOrders(Orders orders);

	List<Orders> saveOrders(List<Orders> orders);

	Orders updateOrders(Orders orders);

	List<Orders> updateOrders(List<Orders> orders);

	Orders delSingleOrders(long id);

	List<Orders> delOrders(List<Orders> orders);

	List<Reed> getListReed();

	Reed getSingleReed(long id);

	Reed saveReed(Reed reed);

	List<Reed> saveReed(List<Reed> reed);

	Reed updateReed(Reed reed);

	List<Reed> updateReed(List<Reed> reed);

	Reed delSingleReed(long id);

	List<Reed> delReed(List<Reed> reed);

	List<ReedsAvailableColours> getListReedsAvailableColours();

	ReedsAvailableColours getSingleReedsAvailableColours(long id);

	ReedsAvailableColours saveReedsAvailableColours(ReedsAvailableColours reedsavailablecolours);

	List<ReedsAvailableColours> saveReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	ReedsAvailableColours updateReedsAvailableColours(ReedsAvailableColours reedsavailablecolours);

	List<ReedsAvailableColours> updateReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	ReedsAvailableColours delSingleReedsAvailableColours(long id);

	List<ReedsAvailableColours> delReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours);

	List<ReiforcementsAvailableColours> getListReiforcementsAvailableColours();

	ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(long id);

	ReiforcementsAvailableColours saveReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours);

	List<ReiforcementsAvailableColours> saveReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	ReiforcementsAvailableColours updateReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours);

	List<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(long id);

	List<ReiforcementsAvailableColours> delReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours);

	List<Reinforcement> getListReinforcement();

	Reinforcement getSingleReinforcement(long id);

	Reinforcement saveReinforcement(Reinforcement reinforcement);

	List<Reinforcement> saveReinforcement(List<Reinforcement> reinforcement);

	Reinforcement updateReinforcement(Reinforcement reinforcement);

	List<Reinforcement> updateReinforcement(List<Reinforcement> reinforcement);

	Reinforcement delSingleReinforcement(long id);

	List<Reinforcement> delReinforcement(List<Reinforcement> reinforcement);

	List<SillStrip> getListSillStrip();

	SillStrip getSingleSillStrip(long id);

	SillStrip saveSillStrip(SillStrip sillstrip);

	List<SillStrip> saveSillStrip(List<SillStrip> sillstrip);

	SillStrip updateSillStrip(SillStrip sillstrip);

	List<SillStrip> updateSillStrip(List<SillStrip> sillstrip);

	SillStrip delSingleSillStrip(long id);

	List<SillStrip> delSillStrip(List<SillStrip> sillstrip);

	List<SillStripesAvailableColours> getListSillStripesAvailableColours();

	SillStripesAvailableColours getSingleSillStripesAvailableColours(long id);

	SillStripesAvailableColours saveSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours);

	List<SillStripesAvailableColours> saveSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	SillStripesAvailableColours updateSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours);

	List<SillStripesAvailableColours> updateSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	SillStripesAvailableColours delSingleSillStripesAvailableColours(long id);

	List<SillStripesAvailableColours> delSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours);

	List<SpecialShapes> getListSpecialShapes();

	SpecialShapes getSingleSpecialShapes(long id);

	SpecialShapes saveSpecialShapes(SpecialShapes specialshapes);

	List<SpecialShapes> saveSpecialShapes(List<SpecialShapes> specialshapes);

	SpecialShapes updateSpecialShapes(SpecialShapes specialshapes);

	List<SpecialShapes> updateSpecialShapes(List<SpecialShapes> specialshapes);

	SpecialShapes delSingleSpecialShapes(long id);

	List<SpecialShapes> delSpecialShapes(List<SpecialShapes> specialshapes);

	List<SpecialShapesAvailableColours> getListSpecialShapesAvailableColours();

	SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(long id);

	SpecialShapesAvailableColours saveSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours);

	List<SpecialShapesAvailableColours> saveSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	SpecialShapesAvailableColours updateSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours);

	List<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(long id);

	List<SpecialShapesAvailableColours> delSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours);

	List<ThreeSholdsAvailableColours> getListThreeSholdsAvailableColours();

	ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(long id);

	ThreeSholdsAvailableColours saveThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours);

	List<ThreeSholdsAvailableColours> saveThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	ThreeSholdsAvailableColours updateThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours);

	List<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(long id);

	List<ThreeSholdsAvailableColours> delThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours);

	List<Threshold> getListThreshold();

	Threshold getSingleThreshold(long id);

	Threshold saveThreshold(Threshold threshold);

	List<Threshold> saveThreshold(List<Threshold> threshold);

	Threshold updateThreshold(Threshold threshold);

	List<Threshold> updateThreshold(List<Threshold> threshold);

	Threshold delSingleThreshold(long id);

	List<Threshold> delThreshold(List<Threshold> threshold);

	List<TypeOfMullion> getListTypeOfMullion();

	TypeOfMullion getSingleTypeOfMullion(long id);

	TypeOfMullion saveTypeOfMullion(TypeOfMullion typeofmullion);

	List<TypeOfMullion> saveTypeOfMullion(List<TypeOfMullion> typeofmullion);

	TypeOfMullion updateTypeOfMullion(TypeOfMullion typeofmullion);

	List<TypeOfMullion> updateTypeOfMullion(List<TypeOfMullion> typeofmullion);

	TypeOfMullion delSingleTypeOfMullion(long id);

	List<TypeOfMullion> delTypeOfMullion(List<TypeOfMullion> typeofmullion);

	List<TypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours();

	TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(long id);

	TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours);

	List<TypesOfMullionsAvailableColours> saveTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours);

	List<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(long id);

	List<TypesOfMullionsAvailableColours> delTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours);

	List<Ventilator> getListVentilator();

	Ventilator getSingleVentilator(long id);

	Ventilator saveVentilator(Ventilator ventilator);

	List<Ventilator> saveVentilator(List<Ventilator> ventilator);

	Ventilator updateVentilator(Ventilator ventilator);

	List<Ventilator> updateVentilator(List<Ventilator> ventilator);

	Ventilator delSingleVentilator(long id);

	List<Ventilator> delVentilator(List<Ventilator> ventilator);

	List<VentilatorsAvailableColours> getListVentilatorsAvailableColours();

	VentilatorsAvailableColours getSingleVentilatorsAvailableColours(long id);

	VentilatorsAvailableColours saveVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours);

	List<VentilatorsAvailableColours> saveVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	VentilatorsAvailableColours updateVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours);

	List<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	VentilatorsAvailableColours delSingleVentilatorsAvailableColours(long id);

	List<VentilatorsAvailableColours> delVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours);

	List<Windows> getListWindows();

	Windows getSingleWindows(long id);

	Windows saveWindows(Windows windows);

	List<Windows> saveWindows(List<Windows> windows);

	Windows updateWindows(Windows windows);

	List<Windows> updateWindows(List<Windows> windows);

	Windows delSingleWindows(long id);

	List<Windows> delWindows(List<Windows> windows);

	List<WingLock> getListWingLock();

	WingLock getSingleWingLock(long id);

	WingLock saveWingLock(WingLock winglock);

	List<WingLock> saveWingLock(List<WingLock> winglock);

	WingLock updateWingLock(WingLock winglock);

	List<WingLock> updateWingLock(List<WingLock> winglock);

	WingLock delSingleWingLock(long id);

	List<WingLock> delWingLock(List<WingLock> winglock);

	List<WingLocksAvailableColours> getListWingLocksAvailableColours();

	WingLocksAvailableColours getSingleWingLocksAvailableColours(long id);

	WingLocksAvailableColours saveWingLocksAvailableColours(WingLocksAvailableColours winglocksavailablecolours);

	List<WingLocksAvailableColours> saveWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

	WingLocksAvailableColours updateWingLocksAvailableColours(WingLocksAvailableColours winglocksavailablecolours);

	List<WingLocksAvailableColours> updateWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

	WingLocksAvailableColours delSingleWingLocksAvailableColours(long id);

	List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours);

}
