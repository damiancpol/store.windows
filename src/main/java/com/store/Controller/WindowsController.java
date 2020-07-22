package com.store.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.store.Model.*;
import com.store.Service.WindowsServiceInterface;

@RestController
public class WindowsController {
	@Autowired
	WindowsServiceInterface windowsServiceInterface;

	@PostMapping("/windows/balconylatch")
	public ResponseEntity<?> addNewBalconyLatch(@RequestBody BalconyLatch balconylatch) {
		BalconyLatch saveBalconyLatch = windowsServiceInterface.saveBalconyLatch(balconylatch);
		return ResponseEntity.ok().body(saveBalconyLatch);
	}

	@PostMapping("/windows/balconylatchavailablecolours")
	public ResponseEntity<?> addNewBalconyLatchAvailableColours(
			@RequestBody BalconyLatchAvailableColours balconylatchavailablecolours) {
			BalconyLatchAvailableColours saveBalconyLatchAvailableColours = windowsServiceInterface
				.saveBalconyLatchAvailableColours(balconylatchavailablecolours);
		return ResponseEntity.ok().body(saveBalconyLatchAvailableColours);
	}

	@PostMapping("/windows/client")
	public ResponseEntity<?> addNewClient(@RequestBody Client client) {
		Client saveClient = windowsServiceInterface.saveClient(client);
		return ResponseEntity.ok().body(saveClient);
	}

	@PostMapping("/windows/colorofcasings")
	public ResponseEntity<?> addNewColorOfCasings(@RequestBody ColorOfCasings colorofcasings) {
		ColorOfCasings saveColorOfCasings = windowsServiceInterface.saveColorOfCasings(colorofcasings);
		return ResponseEntity.ok().body(saveColorOfCasings);
	}

	@PostMapping("/windows/colorofcasingsavailablecolours")
	public ResponseEntity<?> addNewColorOfCasingsAvailableColours(
			@RequestBody ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours = windowsServiceInterface
				.saveColorOfCasingsAvailableColours(colorofcasingsavailablecolours);
		return ResponseEntity.ok().body(saveColorOfCasingsAvailableColours);
	}

	@PostMapping("/windows/crossbarprofile")
	public ResponseEntity<?> addNewCrossbarProfile(@RequestBody CrossbarProfile crossbarprofile) {
		CrossbarProfile saveCrossbarProfile = windowsServiceInterface.saveCrossbarProfile(crossbarprofile);
		return ResponseEntity.ok().body(saveCrossbarProfile);
	}

	@PostMapping("/windows/crossbbarprofileavaiblecolors")
	public ResponseEntity<?> addNewCrossbbarProfileAvaibleColors(
			@RequestBody CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors = windowsServiceInterface
				.saveCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);
		return ResponseEntity.ok().body(saveCrossbbarProfileAvaibleColors);
	}

	@PostMapping("/windows/diffusercolor")
	public ResponseEntity<?> addNewDiffuserColor(@RequestBody DiffuserColor diffusercolor) {
		DiffuserColor saveDiffuserColor = windowsServiceInterface.saveDiffuserColor(diffusercolor);
		return ResponseEntity.ok().body(saveDiffuserColor);
	}

	@PostMapping("/windows/doorhandlecolor")
	public ResponseEntity<?> addNewDoorHandleColor(@RequestBody DoorHandleColor doorhandlecolor) {
		DoorHandleColor saveDoorHandleColor = windowsServiceInterface.saveDoorHandleColor(doorhandlecolor);
		return ResponseEntity.ok().body(saveDoorHandleColor);
	}

	@PostMapping("/windows/extension")
	public ResponseEntity<?> addNewExtension(@RequestBody Extension extension) {
		Extension saveExtension = windowsServiceInterface.saveExtension(extension);
		return ResponseEntity.ok().body(saveExtension);
	}

	@PostMapping("/windows/extensionavailablecolours")
	public ResponseEntity<?> addNewExtensionAvailableColours(
			@RequestBody ExtensionAvailableColours extensionavailablecolours) {
		ExtensionAvailableColours saveExtensionAvailableColours = windowsServiceInterface
				.saveExtensionAvailableColours(extensionavailablecolours);
		return ResponseEntity.ok().body(saveExtensionAvailableColours);
	}

	@PostMapping("/windows/externalcolor")
	public ResponseEntity<?> addNewExternalColor(@RequestBody ExternalColor externalcolor) {
		ExternalColor saveExternalColor = windowsServiceInterface.saveExternalColor(externalcolor);
		return ResponseEntity.ok().body(saveExternalColor);
	}

	@PostMapping("/windows/fittings")
	public ResponseEntity<?> addNewFittings(@RequestBody Fittings fittings) {
		Fittings saveFittings = windowsServiceInterface.saveFittings(fittings);
		return ResponseEntity.ok().body(saveFittings);
	}

	@PostMapping("/windows/fittingsavailablecolours")
	public ResponseEntity<?> addNewFittingsAvailableColours(
			@RequestBody FittingsAvailableColours fittingsavailablecolours) {
		FittingsAvailableColours saveFittingsAvailableColours = windowsServiceInterface
				.saveFittingsAvailableColours(fittingsavailablecolours);
		return ResponseEntity.ok().body(saveFittingsAvailableColours);
	}

	@PostMapping("/windows/framecolor")
	public ResponseEntity<?> addNewFrameColor(@RequestBody FrameColor framecolor) {
		FrameColor saveFrameColor = windowsServiceInterface.saveFrameColor(framecolor);
		return ResponseEntity.ok().body(saveFrameColor);
	}

	@PostMapping("/windows/fulfillment")
	public ResponseEntity<?> addNewFulfillment(@RequestBody Fulfillment fulfillment) {
		Fulfillment saveFulfillment = windowsServiceInterface.saveFulfillment(fulfillment);
		return ResponseEntity.ok().body(saveFulfillment);
	}

	@PostMapping("/windows/fullfillmentavailablecolours")
	public ResponseEntity<?> addNewFullfillmentAvailableColours(
			@RequestBody FullfillmentAvailableColours fullfillmentavailablecolours) {
		FullfillmentAvailableColours saveFullfillmentAvailableColours = windowsServiceInterface
				.saveFullfillmentAvailableColours(fullfillmentavailablecolours);
		return ResponseEntity.ok().body(saveFullfillmentAvailableColours);
	}

	@PostMapping("/windows/glazingbead")
	public ResponseEntity<?> addNewGlazingBead(@RequestBody GlazingBead glazingbead) {
		GlazingBead saveGlazingBead = windowsServiceInterface.saveGlazingBead(glazingbead);
		return ResponseEntity.ok().body(saveGlazingBead);
	}

	@PostMapping("/windows/glazingbeadsavailablecolours")
	public ResponseEntity<?> addNewGlazingBeadsAvailableColours(
			@RequestBody GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours = windowsServiceInterface
				.saveGlazingBeadsAvailableColours(glazingbeadsavailablecolours);
		return ResponseEntity.ok().body(saveGlazingBeadsAvailableColours);
	}

	@PostMapping("/windows/handle")
	public ResponseEntity<?> addNewHandle(@RequestBody Handle handle) {
		Handle saveHandle = windowsServiceInterface.saveHandle(handle);
		return ResponseEntity.ok().body(saveHandle);
	}

	@PostMapping("/windows/handlesavailablecolours")
	public ResponseEntity<?> addNewHandlesAvailableColours(
			@RequestBody HandlesAvailableColours handlesavailablecolours) {
		HandlesAvailableColours saveHandlesAvailableColours = windowsServiceInterface
				.saveHandlesAvailableColours(handlesavailablecolours);
		return ResponseEntity.ok().body(saveHandlesAvailableColours);
	}

	@PostMapping("/windows/internalcolor")
	public ResponseEntity<?> addNewInternalColor(@RequestBody InternalColor internalcolor) {
		InternalColor saveInternalColor = windowsServiceInterface.saveInternalColor(internalcolor);
		return ResponseEntity.ok().body(saveInternalColor);
	}

	@PostMapping("/windows/interpaneframe")
	public ResponseEntity<?> addNewInterPaneFrame(@RequestBody InterPaneFrame interpaneframe) {
		InterPaneFrame saveInterPaneFrame = windowsServiceInterface.saveInterPaneFrame(interpaneframe);
		return ResponseEntity.ok().body(saveInterPaneFrame);
	}

	@PostMapping("/windows/interpaneframesavailablecolours")
	public ResponseEntity<?> addNewInterPaneFramesAvailableColours(
			@RequestBody InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours = windowsServiceInterface
				.saveInterPaneFramesAvailableColours(interpaneframesavailablecolours);
		return ResponseEntity.ok().body(saveInterPaneFramesAvailableColours);
	}

	@PostMapping("/windows/mullionpattern")
	public ResponseEntity<?> addNewMullionPattern(@RequestBody MullionPattern mullionpattern) {
		MullionPattern saveMullionPattern = windowsServiceInterface.saveMullionPattern(mullionpattern);
		return ResponseEntity.ok().body(saveMullionPattern);
	}

	@PostMapping("/windows/mullionpatternsavailablecolours")
	public ResponseEntity<?> addNewMullionPatternsAvailableColours(
			@RequestBody MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		MullionPatternsAvailableColours saveMullionPatternsAvailableColours = windowsServiceInterface
				.saveMullionPatternsAvailableColours(mullionpatternsavailablecolours);
		return ResponseEntity.ok().body(saveMullionPatternsAvailableColours);
	}

	@PostMapping("/windows/openingfunctions")
	public ResponseEntity<?> addNewOpeningFunctions(@RequestBody OpeningFunctions openingfunctions) {
		OpeningFunctions saveOpeningFunctions = windowsServiceInterface.saveOpeningFunctions(openingfunctions);
		return ResponseEntity.ok().body(saveOpeningFunctions);
	}

	@PostMapping("/windows/openingfunctionsavailablecolours")
	public ResponseEntity<?> addNewOpeningFunctionsAvailableColours(
			@RequestBody OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours = windowsServiceInterface
				.saveOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);
		return ResponseEntity.ok().body(saveOpeningFunctionsAvailableColours);
	}

	@PostMapping("/windows/orders")
	public ResponseEntity<?> addNewOrders(@RequestBody Orders orders) {
		Orders saveOrders = windowsServiceInterface.saveOrders(orders);
		return ResponseEntity.ok().body(saveOrders);
	}

	@PostMapping("/windows/reed")
	public ResponseEntity<?> addNewReed(@RequestBody Reed reed) {
		Reed saveReed = windowsServiceInterface.saveReed(reed);
		return ResponseEntity.ok().body(saveReed);
	}

	@PostMapping("/windows/reedsavailablecolours")
	public ResponseEntity<?> addNewReedsAvailableColours(@RequestBody ReedsAvailableColours reedsavailablecolours) {
		ReedsAvailableColours saveReedsAvailableColours = windowsServiceInterface
				.saveReedsAvailableColours(reedsavailablecolours);
		return ResponseEntity.ok().body(saveReedsAvailableColours);
	}

	@PostMapping("/windows/reiforcementsavailablecolours")
	public ResponseEntity<?> addNewReiforcementsAvailableColours(
			@RequestBody ReiforcementsAvailableColours reiforcementsavailablecolours) {
		ReiforcementsAvailableColours saveReiforcementsAvailableColours = windowsServiceInterface
				.saveReiforcementsAvailableColours(reiforcementsavailablecolours);
		return ResponseEntity.ok().body(saveReiforcementsAvailableColours);
	}

	@PostMapping("/windows/reinforcement")
	public ResponseEntity<?> addNewReinforcement(@RequestBody Reinforcement reinforcement) {
		Reinforcement saveReinforcement = windowsServiceInterface.saveReinforcement(reinforcement);
		return ResponseEntity.ok().body(saveReinforcement);
	}

	@PostMapping("/windows/sillstrip")
	public ResponseEntity<?> addNewSillStrip(@RequestBody SillStrip sillstrip) {
		SillStrip saveSillStrip = windowsServiceInterface.saveSillStrip(sillstrip);
		return ResponseEntity.ok().body(saveSillStrip);
	}

	@PostMapping("/windows/sillstripesavailablecolours")
	public ResponseEntity<?> addNewSillStripesAvailableColours(
			@RequestBody SillStripesAvailableColours sillstripesavailablecolours) {
		SillStripesAvailableColours saveSillStripesAvailableColours = windowsServiceInterface
				.saveSillStripesAvailableColours(sillstripesavailablecolours);
		return ResponseEntity.ok().body(saveSillStripesAvailableColours);
	}

	@PostMapping("/windows/specialshapes")
	public ResponseEntity<?> addNewSpecialShapes(@RequestBody SpecialShapes specialshapes) {
		SpecialShapes saveSpecialShapes = windowsServiceInterface.saveSpecialShapes(specialshapes);
		return ResponseEntity.ok().body(saveSpecialShapes);
	}

	@PostMapping("/windows/specialshapesavailablecolours")
	public ResponseEntity<?> addNewSpecialShapesAvailableColours(
			@RequestBody SpecialShapesAvailableColours specialshapesavailablecolours) {
		SpecialShapesAvailableColours saveSpecialShapesAvailableColours = windowsServiceInterface
				.saveSpecialShapesAvailableColours(specialshapesavailablecolours);
		return ResponseEntity.ok().body(saveSpecialShapesAvailableColours);
	}

	@PostMapping("/windows/threesholdsavailablecolours")
	public ResponseEntity<?> addNewThreeSholdsAvailableColours(
			@RequestBody ThreeSholdsAvailableColours threesholdsavailablecolours) {
		ThreeSholdsAvailableColours saveThreeSholdsAvailableColours = windowsServiceInterface
				.saveThreeSholdsAvailableColours(threesholdsavailablecolours);
		return ResponseEntity.ok().body(saveThreeSholdsAvailableColours);
	}

	@PostMapping("/windows/threshold")
	public ResponseEntity<?> addNewThreshold(@RequestBody Threshold threshold) {
		Threshold saveThreshold = windowsServiceInterface.saveThreshold(threshold);
		return ResponseEntity.ok().body(saveThreshold);
	}

	@PostMapping("/windows/typeofmullion")
	public ResponseEntity<?> addNewTypeOfMullion(@RequestBody TypeOfMullion typeofmullion) {
		TypeOfMullion saveTypeOfMullion = windowsServiceInterface.saveTypeOfMullion(typeofmullion);
		return ResponseEntity.ok().body(saveTypeOfMullion);
	}

	@PostMapping("/windows/typesofmullionsavailablecolours")
	public ResponseEntity<?> addNewTypesOfMullionsAvailableColours(
			@RequestBody TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours = windowsServiceInterface
				.saveTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);
		return ResponseEntity.ok().body(saveTypesOfMullionsAvailableColours);
	}

	@PostMapping("/windows/ventilator")
	public ResponseEntity<?> addNewVentilator(@RequestBody Ventilator ventilator) {
		Ventilator saveVentilator = windowsServiceInterface.saveVentilator(ventilator);
		return ResponseEntity.ok().body(saveVentilator);
	}

	@PostMapping("/windows/ventilatorsavailablecolours")
	public ResponseEntity<?> addNewVentilatorsAvailableColours(
			@RequestBody VentilatorsAvailableColours ventilatorsavailablecolours) {
		VentilatorsAvailableColours saveVentilatorsAvailableColours = windowsServiceInterface
				.saveVentilatorsAvailableColours(ventilatorsavailablecolours);
		return ResponseEntity.ok().body(saveVentilatorsAvailableColours);
	}

	@PostMapping("/windows/windows")
	public ResponseEntity<?> addNewWindows(@RequestBody Windows windows) {
		Windows saveWindows = windowsServiceInterface.saveWindows(windows);
		
		return ResponseEntity.ok().body(saveWindows);
	}

	@PostMapping("/windows/winglock")
	public ResponseEntity<?> addNewWingLock(@RequestBody WingLock winglock) {
		WingLock saveWingLock = windowsServiceInterface.saveWingLock(winglock);
		return ResponseEntity.ok().body(saveWingLock);
	}

	@PostMapping("/windows/winglocksavailablecolours")
	public ResponseEntity<?> addNewWingLocksAvailableColours(
			@RequestBody WingLocksAvailableColours winglocksavailablecolours) {
		WingLocksAvailableColours saveWingLocksAvailableColours = windowsServiceInterface
				.saveWingLocksAvailableColours(winglocksavailablecolours);
		return ResponseEntity.ok().body(saveWingLocksAvailableColours);
	}

	@GetMapping("/windows/balconylatch/{id}")
	public ResponseEntity<?> getBalconyLatch(@PathVariable("id") int id) {

		BalconyLatch singleBalconyLatch = windowsServiceInterface.getSingleBalconyLatch(id);

		return ResponseEntity.ok().body(singleBalconyLatch);
	}

	@GetMapping("/windows/balconylatchavailablecolours/{id}")
	public ResponseEntity<?> getBalconyLatchAvailableColours(@PathVariable("id") int id) {

		BalconyLatchAvailableColours singleBalconyLatchAvailableColours = windowsServiceInterface
				.getSingleBalconyLatchAvailableColours(id);

		return ResponseEntity.ok().body(singleBalconyLatchAvailableColours);
	}

	@GetMapping("/windows/client/{id}")
	public ResponseEntity<?> getClient(@PathVariable("id") int id) {

		Client singleClient = windowsServiceInterface.getSingleClient(id);

		return ResponseEntity.ok().body(singleClient);
	}

	@GetMapping("/windows/colorofcasings/{id}")
	public ResponseEntity<?> getColorOfCasings(@PathVariable("id") int id) {

		ColorOfCasings singleColorOfCasings = windowsServiceInterface.getSingleColorOfCasings(id);

		return ResponseEntity.ok().body(singleColorOfCasings);
	}

	@GetMapping("/windows/colorofcasingsavailablecolours/{id}")
	public ResponseEntity<?> getColorOfCasingsAvailableColours(@PathVariable("id") int id) {

		ColorOfCasingsAvailableColours singleColorOfCasingsAvailableColours = windowsServiceInterface
				.getSingleColorOfCasingsAvailableColours(id);

		return ResponseEntity.ok().body(singleColorOfCasingsAvailableColours);
	}

	@GetMapping("/windows/crossbarprofile/{id}")
	public ResponseEntity<?> getCrossbarProfile(@PathVariable("id") int id) {

		CrossbarProfile singleCrossbarProfile = windowsServiceInterface.getSingleCrossbarProfile(id);

		return ResponseEntity.ok().body(singleCrossbarProfile);
	}

	@GetMapping("/windows/crossbbarprofileavaiblecolors/{id}")
	public ResponseEntity<?> getCrossbbarProfileAvaibleColors(@PathVariable("id") int id) {

		CrossbbarProfileAvaibleColors singleCrossbbarProfileAvaibleColors = windowsServiceInterface
				.getSingleCrossbbarProfileAvaibleColors(id);

		return ResponseEntity.ok().body(singleCrossbbarProfileAvaibleColors);
	}

	@GetMapping("/windows/diffusercolor/{id}")
	public ResponseEntity<?> getDiffuserColor(@PathVariable("id") int id) {

		DiffuserColor singleDiffuserColor = windowsServiceInterface.getSingleDiffuserColor(id);

		return ResponseEntity.ok().body(singleDiffuserColor);
	}

	@GetMapping("/windows/doorhandlecolor/{id}")
	public ResponseEntity<?> getDoorHandleColor(@PathVariable("id") int id) {

		DoorHandleColor singleDoorHandleColor = windowsServiceInterface.getSingleDoorHandleColor(id);

		return ResponseEntity.ok().body(singleDoorHandleColor);
	}

	@GetMapping("/windows/extension/{id}")
	public ResponseEntity<?> getExtension(@PathVariable("id") int id) {

		Extension singleExtension = windowsServiceInterface.getSingleExtension(id);

		return ResponseEntity.ok().body(singleExtension);
	}

	@GetMapping("/windows/extensionavailablecolours/{id}")
	public ResponseEntity<?> getExtensionAvailableColours(@PathVariable("id") int id) {

		ExtensionAvailableColours singleExtensionAvailableColours = windowsServiceInterface
				.getSingleExtensionAvailableColours(id);

		return ResponseEntity.ok().body(singleExtensionAvailableColours);
	}

	@GetMapping("/windows/externalcolor/{id}")
	public ResponseEntity<?> getExternalColor(@PathVariable("id") int id) {

		ExternalColor singleExternalColor = windowsServiceInterface.getSingleExternalColor(id);

		return ResponseEntity.ok().body(singleExternalColor);
	}

	@GetMapping("/windows/fittings/{id}")
	public ResponseEntity<?> getFittings(@PathVariable("id") int id) {

		Fittings singleFittings = windowsServiceInterface.getSingleFittings(id);

		return ResponseEntity.ok().body(singleFittings);
	}

	@GetMapping("/windows/fittingsavailablecolours/{id}")
	public ResponseEntity<?> getFittingsAvailableColours(@PathVariable("id") int id) {

		FittingsAvailableColours singleFittingsAvailableColours = windowsServiceInterface
				.getSingleFittingsAvailableColours(id);

		return ResponseEntity.ok().body(singleFittingsAvailableColours);
	}

	@GetMapping("/windows/framecolor/{id}")
	public ResponseEntity<?> getFrameColor(@PathVariable("id") int id) {

		FrameColor singleFrameColor = windowsServiceInterface.getSingleFrameColor(id);

		return ResponseEntity.ok().body(singleFrameColor);
	}

	@GetMapping("/windows/fulfillment/{id}")
	public ResponseEntity<?> getFulfillment(@PathVariable("id") int id) {

		Fulfillment singleFulfillment = windowsServiceInterface.getSingleFulfillment(id);

		return ResponseEntity.ok().body(singleFulfillment);
	}

	@GetMapping("/windows/fullfillmentavailablecolours/{id}")
	public ResponseEntity<?> getFullfillmentAvailableColours(@PathVariable("id") int id) {

		FullfillmentAvailableColours singleFullfillmentAvailableColours = windowsServiceInterface
				.getSingleFullfillmentAvailableColours(id);

		return ResponseEntity.ok().body(singleFullfillmentAvailableColours);
	}

	@GetMapping("/windows/glazingbead/{id}")
	public ResponseEntity<?> getGlazingBead(@PathVariable("id") int id) {

		GlazingBead singleGlazingBead = windowsServiceInterface.getSingleGlazingBead(id);

		return ResponseEntity.ok().body(singleGlazingBead);
	}

	@GetMapping("/windows/glazingbeadsavailablecolours/{id}")
	public ResponseEntity<?> getGlazingBeadsAvailableColours(@PathVariable("id") int id) {

		GlazingBeadsAvailableColours singleGlazingBeadsAvailableColours = windowsServiceInterface
				.getSingleGlazingBeadsAvailableColours(id);

		return ResponseEntity.ok().body(singleGlazingBeadsAvailableColours);
	}

	@GetMapping("/windows/handle/{id}")
	public ResponseEntity<?> getHandle(@PathVariable("id") int id) {

		Handle singleHandle = windowsServiceInterface.getSingleHandle(id);

		return ResponseEntity.ok().body(singleHandle);
	}

	@GetMapping("/windows/handlesavailablecolours/{id}")
	public ResponseEntity<?> getHandlesAvailableColours(@PathVariable("id") int id) {

		HandlesAvailableColours singleHandlesAvailableColours = windowsServiceInterface
				.getSingleHandlesAvailableColours(id);

		return ResponseEntity.ok().body(singleHandlesAvailableColours);
	}

	@GetMapping("/windows/internalcolor/{id}")
	public ResponseEntity<?> getInternalColor(@PathVariable("id") int id) {

		InternalColor singleInternalColor = windowsServiceInterface.getSingleInternalColor(id);

		return ResponseEntity.ok().body(singleInternalColor);
	}

	@GetMapping("/windows/interpaneframe/{id}")
	public ResponseEntity<?> getInterPaneFrame(@PathVariable("id") int id) {

		InterPaneFrame singleInterPaneFrame = windowsServiceInterface.getSingleInterPaneFrame(id);

		return ResponseEntity.ok().body(singleInterPaneFrame);
	}

	@GetMapping("/windows/interpaneframesavailablecolours/{id}")
	public ResponseEntity<?> getInterPaneFramesAvailableColours(@PathVariable("id") int id) {

		InterPaneFramesAvailableColours singleInterPaneFramesAvailableColours = windowsServiceInterface
				.getSingleInterPaneFramesAvailableColours(id);

		return ResponseEntity.ok().body(singleInterPaneFramesAvailableColours);
	}

	@GetMapping("/windows/mullionpattern/{id}")
	public ResponseEntity<?> getMullionPattern(@PathVariable("id") int id) {

		MullionPattern singleMullionPattern = windowsServiceInterface.getSingleMullionPattern(id);

		return ResponseEntity.ok().body(singleMullionPattern);
	}

	@GetMapping("/windows/mullionpatternsavailablecolours/{id}")
	public ResponseEntity<?> getMullionPatternsAvailableColours(@PathVariable("id") int id) {

		MullionPatternsAvailableColours singleMullionPatternsAvailableColours = windowsServiceInterface
				.getSingleMullionPatternsAvailableColours(id);

		return ResponseEntity.ok().body(singleMullionPatternsAvailableColours);
	}

	@GetMapping("/windows/openingfunctions/{id}")
	public ResponseEntity<?> getOpeningFunctions(@PathVariable("id") int id) {

		OpeningFunctions singleOpeningFunctions = windowsServiceInterface.getSingleOpeningFunctions(id);

		return ResponseEntity.ok().body(singleOpeningFunctions);
	}

	@GetMapping("/windows/openingfunctionsavailablecolours/{id}")
	public ResponseEntity<?> getOpeningFunctionsAvailableColours(@PathVariable("id") int id) {

		OpeningFunctionsAvailableColours singleOpeningFunctionsAvailableColours = windowsServiceInterface
				.getSingleOpeningFunctionsAvailableColours(id);

		return ResponseEntity.ok().body(singleOpeningFunctionsAvailableColours);
	}

	@GetMapping("/windows/orders/{id}")
	public ResponseEntity<?> getOrders(@PathVariable("id") int id) {

		Orders singleOrders = windowsServiceInterface.getSingleOrders(id);

		return ResponseEntity.ok().body(singleOrders);
	}

	@GetMapping("/windows/reed/{id}")
	public ResponseEntity<?> getReed(@PathVariable("id") int id) {

		Reed singleReed = windowsServiceInterface.getSingleReed(id);

		return ResponseEntity.ok().body(singleReed);
	}

	@GetMapping("/windows/reedsavailablecolours/{id}")
	public ResponseEntity<?> getReedsAvailableColours(@PathVariable("id") int id) {

		ReedsAvailableColours singleReedsAvailableColours = windowsServiceInterface.getSingleReedsAvailableColours(id);

		return ResponseEntity.ok().body(singleReedsAvailableColours);
	}

	@GetMapping("/windows/reiforcementsavailablecolours/{id}")
	public ResponseEntity<?> getReiforcementsAvailableColours(@PathVariable("id") int id) {

		ReiforcementsAvailableColours singleReiforcementsAvailableColours = windowsServiceInterface
				.getSingleReiforcementsAvailableColours(id);

		return ResponseEntity.ok().body(singleReiforcementsAvailableColours);
	}

	@GetMapping("/windows/reinforcement/{id}")
	public ResponseEntity<?> getReinforcement(@PathVariable("id") int id) {

		Reinforcement singleReinforcement = windowsServiceInterface.getSingleReinforcement(id);

		return ResponseEntity.ok().body(singleReinforcement);
	}

	@GetMapping("/windows/sillstrip/{id}")
	public ResponseEntity<?> getSillStrip(@PathVariable("id") int id) {

		SillStrip singleSillStrip = windowsServiceInterface.getSingleSillStrip(id);

		return ResponseEntity.ok().body(singleSillStrip);
	}

	@GetMapping("/windows/sillstripesavailablecolours/{id}")
	public ResponseEntity<?> getSillStripesAvailableColours(@PathVariable("id") int id) {

		SillStripesAvailableColours singleSillStripesAvailableColours = windowsServiceInterface
				.getSingleSillStripesAvailableColours(id);

		return ResponseEntity.ok().body(singleSillStripesAvailableColours);
	}

	@GetMapping("/windows/specialshapes/{id}")
	public ResponseEntity<?> getSpecialShapes(@PathVariable("id") int id) {

		SpecialShapes singleSpecialShapes = windowsServiceInterface.getSingleSpecialShapes(id);

		return ResponseEntity.ok().body(singleSpecialShapes);
	}

	@GetMapping("/windows/specialshapesavailablecolours/{id}")
	public ResponseEntity<?> getSpecialShapesAvailableColours(@PathVariable("id") int id) {

		SpecialShapesAvailableColours singleSpecialShapesAvailableColours = windowsServiceInterface
				.getSingleSpecialShapesAvailableColours(id);

		return ResponseEntity.ok().body(singleSpecialShapesAvailableColours);
	}

	@GetMapping("/windows/threesholdsavailablecolours/{id}")
	public ResponseEntity<?> getThreeSholdsAvailableColours(@PathVariable("id") int id) {

		ThreeSholdsAvailableColours singleThreeSholdsAvailableColours = windowsServiceInterface
				.getSingleThreeSholdsAvailableColours(id);

		return ResponseEntity.ok().body(singleThreeSholdsAvailableColours);
	}

	@GetMapping("/windows/threshold/{id}")
	public ResponseEntity<?> getThreshold(@PathVariable("id") int id) {

		Threshold singleThreshold = windowsServiceInterface.getSingleThreshold(id);

		return ResponseEntity.ok().body(singleThreshold);
	}

	@GetMapping("/windows/typeofmullion/{id}")
	public ResponseEntity<?> getTypeOfMullion(@PathVariable("id") int id) {

		TypeOfMullion singleTypeOfMullion = windowsServiceInterface.getSingleTypeOfMullion(id);

		return ResponseEntity.ok().body(singleTypeOfMullion);
	}

	@GetMapping("/windows/typesofmullionsavailablecolours/{id}")
	public ResponseEntity<?> getTypesOfMullionsAvailableColours(@PathVariable("id") int id) {

		TypesOfMullionsAvailableColours singleTypesOfMullionsAvailableColours = windowsServiceInterface
				.getSingleTypesOfMullionsAvailableColours(id);

		return ResponseEntity.ok().body(singleTypesOfMullionsAvailableColours);
	}

	@GetMapping("/windows/ventilator/{id}")
	public ResponseEntity<?> getVentilator(@PathVariable("id") int id) {

		Ventilator singleVentilator = windowsServiceInterface.getSingleVentilator(id);

		return ResponseEntity.ok().body(singleVentilator);
	}

	@GetMapping("/windows/ventilatorsavailablecolours/{id}")
	public ResponseEntity<?> getVentilatorsAvailableColours(@PathVariable("id") int id) {

		VentilatorsAvailableColours singleVentilatorsAvailableColours = windowsServiceInterface
				.getSingleVentilatorsAvailableColours(id);

		return ResponseEntity.ok().body(singleVentilatorsAvailableColours);
	}

	@GetMapping("/windows/windows/{id}")
	public ResponseEntity<?> getWindows(@PathVariable("id") int id) {

		Windows singleWindows = windowsServiceInterface.getSingleWindows(id);

		return ResponseEntity.ok().body(singleWindows);
	}

	@GetMapping("/windows/winglock/{id}")
	public ResponseEntity<?> getWingLock(@PathVariable("id") int id) {

		WingLock singleWingLock = windowsServiceInterface.getSingleWingLock(id);

		return ResponseEntity.ok().body(singleWingLock);
	}

	@GetMapping("/windows/winglocksavailablecolours/{id}")
	public ResponseEntity<?> getWingLocksAvailableColours(@PathVariable("id") int id) {

		WingLocksAvailableColours singleWingLocksAvailableColours = windowsServiceInterface
				.getSingleWingLocksAvailableColours(id);

		return ResponseEntity.ok().body(singleWingLocksAvailableColours);
	}

	@DeleteMapping("/windows/balconylatch/{id}")
	public ResponseEntity<?> delBalconyLatch(@PathVariable("id") int id) {

		BalconyLatch singleBalconyLatch = windowsServiceInterface.delSingleBalconyLatch(id);

		return ResponseEntity.ok().body(singleBalconyLatch);
	}

	@DeleteMapping("/windows/balconylatchavailablecolours/{id}")
	public ResponseEntity<?> delBalconyLatchAvailableColours(@PathVariable("id") int id) {

		BalconyLatchAvailableColours singleBalconyLatchAvailableColours = windowsServiceInterface
				.delSingleBalconyLatchAvailableColours(id);

		return ResponseEntity.ok().body(singleBalconyLatchAvailableColours);
	}

	@DeleteMapping("/windows/client/{id}")
	public ResponseEntity<?> delClient(@PathVariable("id") int id) {

		Client singleClient = windowsServiceInterface.delSingleClient(id);

		return ResponseEntity.ok().body(singleClient);
	}

	@DeleteMapping("/windows/colorofcasings/{id}")
	public ResponseEntity<?> delColorOfCasings(@PathVariable("id") int id) {

		ColorOfCasings singleColorOfCasings = windowsServiceInterface.delSingleColorOfCasings(id);

		return ResponseEntity.ok().body(singleColorOfCasings);
	}

	@DeleteMapping("/windows/colorofcasingsavailablecolours/{id}")
	public ResponseEntity<?> delColorOfCasingsAvailableColours(@PathVariable("id") int id) {

		ColorOfCasingsAvailableColours singleColorOfCasingsAvailableColours = windowsServiceInterface
				.delSingleColorOfCasingsAvailableColours(id);

		return ResponseEntity.ok().body(singleColorOfCasingsAvailableColours);
	}

	@DeleteMapping("/windows/crossbarprofile/{id}")
	public ResponseEntity<?> delCrossbarProfile(@PathVariable("id") int id) {

		CrossbarProfile singleCrossbarProfile = windowsServiceInterface.delSingleCrossbarProfile(id);

		return ResponseEntity.ok().body(singleCrossbarProfile);
	}

	@DeleteMapping("/windows/crossbbarprofileavaiblecolors/{id}")
	public ResponseEntity<?> delCrossbbarProfileAvaibleColors(@PathVariable("id") int id) {

		CrossbbarProfileAvaibleColors singleCrossbbarProfileAvaibleColors = windowsServiceInterface
				.delSingleCrossbbarProfileAvaibleColors(id);

		return ResponseEntity.ok().body(singleCrossbbarProfileAvaibleColors);
	}

	@DeleteMapping("/windows/diffusercolor/{id}")
	public ResponseEntity<?> delDiffuserColor(@PathVariable("id") int id) {

		DiffuserColor singleDiffuserColor = windowsServiceInterface.delSingleDiffuserColor(id);

		return ResponseEntity.ok().body(singleDiffuserColor);
	}

	@DeleteMapping("/windows/doorhandlecolor/{id}")
	public ResponseEntity<?> delDoorHandleColor(@PathVariable("id") int id) {

		DoorHandleColor singleDoorHandleColor = windowsServiceInterface.delSingleDoorHandleColor(id);

		return ResponseEntity.ok().body(singleDoorHandleColor);
	}

	@DeleteMapping("/windows/extension/{id}")
	public ResponseEntity<?> delExtension(@PathVariable("id") int id) {

		Extension singleExtension = windowsServiceInterface.delSingleExtension(id);

		return ResponseEntity.ok().body(singleExtension);
	}

	@DeleteMapping("/windows/extensionavailablecolours/{id}")
	public ResponseEntity<?> delExtensionAvailableColours(@PathVariable("id") int id) {

		ExtensionAvailableColours singleExtensionAvailableColours = windowsServiceInterface
				.delSingleExtensionAvailableColours(id);

		return ResponseEntity.ok().body(singleExtensionAvailableColours);
	}

	@DeleteMapping("/windows/externalcolor/{id}")
	public ResponseEntity<?> delExternalColor(@PathVariable("id") int id) {

		ExternalColor singleExternalColor = windowsServiceInterface.delSingleExternalColor(id);

		return ResponseEntity.ok().body(singleExternalColor);
	}

	@DeleteMapping("/windows/fittings/{id}")
	public ResponseEntity<?> delFittings(@PathVariable("id") int id) {

		Fittings singleFittings = windowsServiceInterface.delSingleFittings(id);

		return ResponseEntity.ok().body(singleFittings);
	}

	@DeleteMapping("/windows/fittingsavailablecolours/{id}")
	public ResponseEntity<?> delFittingsAvailableColours(@PathVariable("id") int id) {

		FittingsAvailableColours singleFittingsAvailableColours = windowsServiceInterface
				.delSingleFittingsAvailableColours(id);

		return ResponseEntity.ok().body(singleFittingsAvailableColours);
	}

	@DeleteMapping("/windows/framecolor/{id}")
	public ResponseEntity<?> delFrameColor(@PathVariable("id") int id) {

		FrameColor singleFrameColor = windowsServiceInterface.delSingleFrameColor(id);

		return ResponseEntity.ok().body(singleFrameColor);
	}

	@DeleteMapping("/windows/fulfillment/{id}")
	public ResponseEntity<?> delFulfillment(@PathVariable("id") int id) {

		Fulfillment singleFulfillment = windowsServiceInterface.delSingleFulfillment(id);

		return ResponseEntity.ok().body(singleFulfillment);
	}

	@DeleteMapping("/windows/fullfillmentavailablecolours/{id}")
	public ResponseEntity<?> delFullfillmentAvailableColours(@PathVariable("id") int id) {

		FullfillmentAvailableColours singleFullfillmentAvailableColours = windowsServiceInterface
				.delSingleFullfillmentAvailableColours(id);

		return ResponseEntity.ok().body(singleFullfillmentAvailableColours);
	}

	@DeleteMapping("/windows/glazingbead/{id}")
	public ResponseEntity<?> delGlazingBead(@PathVariable("id") int id) {

		GlazingBead singleGlazingBead = windowsServiceInterface.delSingleGlazingBead(id);

		return ResponseEntity.ok().body(singleGlazingBead);
	}

	@DeleteMapping("/windows/glazingbeadsavailablecolours/{id}")
	public ResponseEntity<?> delGlazingBeadsAvailableColours(@PathVariable("id") int id) {

		GlazingBeadsAvailableColours singleGlazingBeadsAvailableColours = windowsServiceInterface
				.delSingleGlazingBeadsAvailableColours(id);

		return ResponseEntity.ok().body(singleGlazingBeadsAvailableColours);
	}

	@DeleteMapping("/windows/handle/{id}")
	public ResponseEntity<?> delHandle(@PathVariable("id") int id) {

		Handle singleHandle = windowsServiceInterface.delSingleHandle(id);

		return ResponseEntity.ok().body(singleHandle);
	}

	@DeleteMapping("/windows/handlesavailablecolours/{id}")
	public ResponseEntity<?> delHandlesAvailableColours(@PathVariable("id") int id) {

		HandlesAvailableColours singleHandlesAvailableColours = windowsServiceInterface
				.delSingleHandlesAvailableColours(id);

		return ResponseEntity.ok().body(singleHandlesAvailableColours);
	}

	@DeleteMapping("/windows/internalcolor/{id}")
	public ResponseEntity<?> delInternalColor(@PathVariable("id") int id) {

		InternalColor singleInternalColor = windowsServiceInterface.delSingleInternalColor(id);

		return ResponseEntity.ok().body(singleInternalColor);
	}

	@DeleteMapping("/windows/interpaneframe/{id}")
	public ResponseEntity<?> delInterPaneFrame(@PathVariable("id") int id) {

		InterPaneFrame singleInterPaneFrame = windowsServiceInterface.delSingleInterPaneFrame(id);

		return ResponseEntity.ok().body(singleInterPaneFrame);
	}

	@DeleteMapping("/windows/interpaneframesavailablecolours/{id}")
	public ResponseEntity<?> delInterPaneFramesAvailableColours(@PathVariable("id") int id) {

		InterPaneFramesAvailableColours singleInterPaneFramesAvailableColours = windowsServiceInterface
				.delSingleInterPaneFramesAvailableColours(id);

		return ResponseEntity.ok().body(singleInterPaneFramesAvailableColours);
	}

	@DeleteMapping("/windows/mullionpattern/{id}")
	public ResponseEntity<?> delMullionPattern(@PathVariable("id") int id) {

		MullionPattern singleMullionPattern = windowsServiceInterface.delSingleMullionPattern(id);

		return ResponseEntity.ok().body(singleMullionPattern);
	}

	@DeleteMapping("/windows/mullionpatternsavailablecolours/{id}")
	public ResponseEntity<?> delMullionPatternsAvailableColours(@PathVariable("id") int id) {

		MullionPatternsAvailableColours singleMullionPatternsAvailableColours = windowsServiceInterface
				.delSingleMullionPatternsAvailableColours(id);

		return ResponseEntity.ok().body(singleMullionPatternsAvailableColours);
	}

	@DeleteMapping("/windows/openingfunctions/{id}")
	public ResponseEntity<?> delOpeningFunctions(@PathVariable("id") int id) {

		OpeningFunctions singleOpeningFunctions = windowsServiceInterface.delSingleOpeningFunctions(id);

		return ResponseEntity.ok().body(singleOpeningFunctions);
	}

	@DeleteMapping("/windows/openingfunctionsavailablecolours/{id}")
	public ResponseEntity<?> delOpeningFunctionsAvailableColours(@PathVariable("id") int id) {

		OpeningFunctionsAvailableColours singleOpeningFunctionsAvailableColours = windowsServiceInterface
				.delSingleOpeningFunctionsAvailableColours(id);

		return ResponseEntity.ok().body(singleOpeningFunctionsAvailableColours);
	}

	@DeleteMapping("/windows/orders/{id}")
	public ResponseEntity<?> delOrders(@PathVariable("id") int id) {

		Orders singleOrders = windowsServiceInterface.delSingleOrders(id);

		return ResponseEntity.ok().body(singleOrders);
	}

	@DeleteMapping("/windows/reed/{id}")
	public ResponseEntity<?> delReed(@PathVariable("id") int id) {

		Reed singleReed = windowsServiceInterface.delSingleReed(id);

		return ResponseEntity.ok().body(singleReed);
	}

	@DeleteMapping("/windows/reedsavailablecolours/{id}")
	public ResponseEntity<?> delReedsAvailableColours(@PathVariable("id") int id) {

		ReedsAvailableColours singleReedsAvailableColours = windowsServiceInterface.delSingleReedsAvailableColours(id);

		return ResponseEntity.ok().body(singleReedsAvailableColours);
	}

	@DeleteMapping("/windows/reiforcementsavailablecolours/{id}")
	public ResponseEntity<?> delReiforcementsAvailableColours(@PathVariable("id") int id) {

		ReiforcementsAvailableColours singleReiforcementsAvailableColours = windowsServiceInterface
				.delSingleReiforcementsAvailableColours(id);

		return ResponseEntity.ok().body(singleReiforcementsAvailableColours);
	}

	@DeleteMapping("/windows/reinforcement/{id}")
	public ResponseEntity<?> delReinforcement(@PathVariable("id") int id) {

		Reinforcement singleReinforcement = windowsServiceInterface.delSingleReinforcement(id);

		return ResponseEntity.ok().body(singleReinforcement);
	}

	@DeleteMapping("/windows/sillstrip/{id}")
	public ResponseEntity<?> delSillStrip(@PathVariable("id") int id) {

		SillStrip singleSillStrip = windowsServiceInterface.delSingleSillStrip(id);

		return ResponseEntity.ok().body(singleSillStrip);
	}

	@DeleteMapping("/windows/sillstripesavailablecolours/{id}")
	public ResponseEntity<?> delSillStripesAvailableColours(@PathVariable("id") int id) {

		SillStripesAvailableColours singleSillStripesAvailableColours = windowsServiceInterface
				.delSingleSillStripesAvailableColours(id);

		return ResponseEntity.ok().body(singleSillStripesAvailableColours);
	}

	@DeleteMapping("/windows/specialshapes/{id}")
	public ResponseEntity<?> delSpecialShapes(@PathVariable("id") int id) {

		SpecialShapes singleSpecialShapes = windowsServiceInterface.delSingleSpecialShapes(id);

		return ResponseEntity.ok().body(singleSpecialShapes);
	}

	@DeleteMapping("/windows/specialshapesavailablecolours/{id}")
	public ResponseEntity<?> delSpecialShapesAvailableColours(@PathVariable("id") int id) {

		SpecialShapesAvailableColours singleSpecialShapesAvailableColours = windowsServiceInterface
				.delSingleSpecialShapesAvailableColours(id);

		return ResponseEntity.ok().body(singleSpecialShapesAvailableColours);
	}

	@DeleteMapping("/windows/threesholdsavailablecolours/{id}")
	public ResponseEntity<?> delThreeSholdsAvailableColours(@PathVariable("id") int id) {

		ThreeSholdsAvailableColours singleThreeSholdsAvailableColours = windowsServiceInterface
				.delSingleThreeSholdsAvailableColours(id);

		return ResponseEntity.ok().body(singleThreeSholdsAvailableColours);
	}

	@DeleteMapping("/windows/threshold/{id}")
	public ResponseEntity<?> delThreshold(@PathVariable("id") int id) {

		Threshold singleThreshold = windowsServiceInterface.delSingleThreshold(id);

		return ResponseEntity.ok().body(singleThreshold);
	}

	@DeleteMapping("/windows/typeofmullion/{id}")
	public ResponseEntity<?> delTypeOfMullion(@PathVariable("id") int id) {

		TypeOfMullion singleTypeOfMullion = windowsServiceInterface.delSingleTypeOfMullion(id);

		return ResponseEntity.ok().body(singleTypeOfMullion);
	}

	@DeleteMapping("/windows/typesofmullionsavailablecolours/{id}")
	public ResponseEntity<?> delTypesOfMullionsAvailableColours(@PathVariable("id") int id) {

		TypesOfMullionsAvailableColours singleTypesOfMullionsAvailableColours = windowsServiceInterface
				.delSingleTypesOfMullionsAvailableColours(id);

		return ResponseEntity.ok().body(singleTypesOfMullionsAvailableColours);
	}

	@DeleteMapping("/windows/ventilator/{id}")
	public ResponseEntity<?> delVentilator(@PathVariable("id") int id) {

		Ventilator singleVentilator = windowsServiceInterface.delSingleVentilator(id);

		return ResponseEntity.ok().body(singleVentilator);
	}

	@DeleteMapping("/windows/ventilatorsavailablecolours/{id}")
	public ResponseEntity<?> delVentilatorsAvailableColours(@PathVariable("id") int id) {

		VentilatorsAvailableColours singleVentilatorsAvailableColours = windowsServiceInterface
				.delSingleVentilatorsAvailableColours(id);

		return ResponseEntity.ok().body(singleVentilatorsAvailableColours);
	}

	@DeleteMapping("/windows/windows/{id}")
	public ResponseEntity<?> delWindows(@PathVariable("id") int id) {

		Windows singleWindows = windowsServiceInterface.delSingleWindows(id);

		return ResponseEntity.ok().body(singleWindows);
	}

	@DeleteMapping("/windows/winglock/{id}")
	public ResponseEntity<?> delWingLock(@PathVariable("id") int id) {

		WingLock singleWingLock = windowsServiceInterface.delSingleWingLock(id);

		return ResponseEntity.ok().body(singleWingLock);
	}

	@DeleteMapping("/windows/winglocksavailablecolours/{id}")
	public ResponseEntity<?> delWingLocksAvailableColours(@PathVariable("id") int id) {

		WingLocksAvailableColours singleWingLocksAvailableColours = windowsServiceInterface
				.delSingleWingLocksAvailableColours(id);

		return ResponseEntity.ok().body(singleWingLocksAvailableColours);
	}

	@PutMapping("windows/balconylatch")
	public ResponseEntity<BalconyLatch> updateBalconyLatch(@RequestBody BalconyLatch balconylatch) {

		BalconyLatch updateBalconyLatch = windowsServiceInterface.updateBalconyLatch(balconylatch);

		return ResponseEntity.ok().body(updateBalconyLatch);

	}

	@PutMapping("windows/balconylatchavailablecolours")
	public ResponseEntity<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			@RequestBody BalconyLatchAvailableColours balconylatchavailablecolours) {

		BalconyLatchAvailableColours updateBalconyLatchAvailableColours = windowsServiceInterface
				.updateBalconyLatchAvailableColours(balconylatchavailablecolours);

		return ResponseEntity.ok().body(updateBalconyLatchAvailableColours);

	}

	@PutMapping("windows/client")
	public ResponseEntity<Client> updateClient(@RequestBody Client client) {

		Client updateClient = windowsServiceInterface.updateClient(client);

		return ResponseEntity.ok().body(updateClient);

	}

	@PutMapping("windows/colorofcasings")
	public ResponseEntity<ColorOfCasings> updateColorOfCasings(@RequestBody ColorOfCasings colorofcasings) {

		ColorOfCasings updateColorOfCasings = windowsServiceInterface.updateColorOfCasings(colorofcasings);

		return ResponseEntity.ok().body(updateColorOfCasings);

	}

	@PutMapping("windows/colorofcasingsavailablecolours")
	public ResponseEntity<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			@RequestBody ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {

		ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours = windowsServiceInterface
				.updateColorOfCasingsAvailableColours(colorofcasingsavailablecolours);

		return ResponseEntity.ok().body(updateColorOfCasingsAvailableColours);

	}

	@PutMapping("windows/crossbarprofile")
	public ResponseEntity<CrossbarProfile> updateCrossbarProfile(@RequestBody CrossbarProfile crossbarprofile) {

		CrossbarProfile updateCrossbarProfile = windowsServiceInterface.updateCrossbarProfile(crossbarprofile);

		return ResponseEntity.ok().body(updateCrossbarProfile);

	}

	@PutMapping("windows/crossbbarprofileavaiblecolors")
	public ResponseEntity<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			@RequestBody CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {

		CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors = windowsServiceInterface
				.updateCrossbbarProfileAvaibleColors(crossbbarprofileavaiblecolors);

		return ResponseEntity.ok().body(updateCrossbbarProfileAvaibleColors);

	}

	@PutMapping("windows/diffusercolor")
	public ResponseEntity<DiffuserColor> updateDiffuserColor(@RequestBody DiffuserColor diffusercolor) {

		DiffuserColor updateDiffuserColor = windowsServiceInterface.updateDiffuserColor(diffusercolor);

		return ResponseEntity.ok().body(updateDiffuserColor);

	}

	@PutMapping("windows/doorhandlecolor")
	public ResponseEntity<DoorHandleColor> updateDoorHandleColor(@RequestBody DoorHandleColor doorhandlecolor) {

		DoorHandleColor updateDoorHandleColor = windowsServiceInterface.updateDoorHandleColor(doorhandlecolor);

		return ResponseEntity.ok().body(updateDoorHandleColor);

	}

	@PutMapping("windows/extension")
	public ResponseEntity<Extension> updateExtension(@RequestBody Extension extension) {

		Extension updateExtension = windowsServiceInterface.updateExtension(extension);

		return ResponseEntity.ok().body(updateExtension);

	}

	@PutMapping("windows/extensionavailablecolours")
	public ResponseEntity<ExtensionAvailableColours> updateExtensionAvailableColours(
			@RequestBody ExtensionAvailableColours extensionavailablecolours) {

		ExtensionAvailableColours updateExtensionAvailableColours = windowsServiceInterface
				.updateExtensionAvailableColours(extensionavailablecolours);

		return ResponseEntity.ok().body(updateExtensionAvailableColours);

	}

	@PutMapping("windows/externalcolor")
	public ResponseEntity<ExternalColor> updateExternalColor(@RequestBody ExternalColor externalcolor) {

		ExternalColor updateExternalColor = windowsServiceInterface.updateExternalColor(externalcolor);

		return ResponseEntity.ok().body(updateExternalColor);

	}

	@PutMapping("windows/fittings")
	public ResponseEntity<Fittings> updateFittings(@RequestBody Fittings fittings) {

		Fittings updateFittings = windowsServiceInterface.updateFittings(fittings);

		return ResponseEntity.ok().body(updateFittings);

	}

	@PutMapping("windows/fittingsavailablecolours")
	public ResponseEntity<FittingsAvailableColours> updateFittingsAvailableColours(
			@RequestBody FittingsAvailableColours fittingsavailablecolours) {

		FittingsAvailableColours updateFittingsAvailableColours = windowsServiceInterface
				.updateFittingsAvailableColours(fittingsavailablecolours);

		return ResponseEntity.ok().body(updateFittingsAvailableColours);

	}

	@PutMapping("windows/framecolor")
	public ResponseEntity<FrameColor> updateFrameColor(@RequestBody FrameColor framecolor) {

		FrameColor updateFrameColor = windowsServiceInterface.updateFrameColor(framecolor);

		return ResponseEntity.ok().body(updateFrameColor);

	}

	@PutMapping("windows/fulfillment")
	public ResponseEntity<Fulfillment> updateFulfillment(@RequestBody Fulfillment fulfillment) {

		Fulfillment updateFulfillment = windowsServiceInterface.updateFulfillment(fulfillment);

		return ResponseEntity.ok().body(updateFulfillment);

	}

	@PutMapping("windows/fullfillmentavailablecolours")
	public ResponseEntity<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			@RequestBody FullfillmentAvailableColours fullfillmentavailablecolours) {

		FullfillmentAvailableColours updateFullfillmentAvailableColours = windowsServiceInterface
				.updateFullfillmentAvailableColours(fullfillmentavailablecolours);

		return ResponseEntity.ok().body(updateFullfillmentAvailableColours);

	}

	@PutMapping("windows/glazingbead")
	public ResponseEntity<GlazingBead> updateGlazingBead(@RequestBody GlazingBead glazingbead) {

		GlazingBead updateGlazingBead = windowsServiceInterface.updateGlazingBead(glazingbead);

		return ResponseEntity.ok().body(updateGlazingBead);

	}

	@PutMapping("windows/glazingbeadsavailablecolours")
	public ResponseEntity<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			@RequestBody GlazingBeadsAvailableColours glazingbeadsavailablecolours) {

		GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours = windowsServiceInterface
				.updateGlazingBeadsAvailableColours(glazingbeadsavailablecolours);

		return ResponseEntity.ok().body(updateGlazingBeadsAvailableColours);

	}

	@PutMapping("windows/handle")
	public ResponseEntity<Handle> updateHandle(@RequestBody Handle handle) {

		Handle updateHandle = windowsServiceInterface.updateHandle(handle);

		return ResponseEntity.ok().body(updateHandle);

	}

	@PutMapping("windows/handlesavailablecolours")
	public ResponseEntity<HandlesAvailableColours> updateHandlesAvailableColours(
			@RequestBody HandlesAvailableColours handlesavailablecolours) {

		HandlesAvailableColours updateHandlesAvailableColours = windowsServiceInterface
				.updateHandlesAvailableColours(handlesavailablecolours);

		return ResponseEntity.ok().body(updateHandlesAvailableColours);

	}

	@PutMapping("windows/internalcolor")
	public ResponseEntity<InternalColor> updateInternalColor(@RequestBody InternalColor internalcolor) {

		InternalColor updateInternalColor = windowsServiceInterface.updateInternalColor(internalcolor);

		return ResponseEntity.ok().body(updateInternalColor);

	}

	@PutMapping("windows/interpaneframe")
	public ResponseEntity<InterPaneFrame> updateInterPaneFrame(@RequestBody InterPaneFrame interpaneframe) {

		InterPaneFrame updateInterPaneFrame = windowsServiceInterface.updateInterPaneFrame(interpaneframe);

		return ResponseEntity.ok().body(updateInterPaneFrame);

	}

	@PutMapping("windows/interpaneframesavailablecolours")
	public ResponseEntity<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			@RequestBody InterPaneFramesAvailableColours interpaneframesavailablecolours) {

		InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours = windowsServiceInterface
				.updateInterPaneFramesAvailableColours(interpaneframesavailablecolours);

		return ResponseEntity.ok().body(updateInterPaneFramesAvailableColours);

	}

	@PutMapping("windows/mullionpattern")
	public ResponseEntity<MullionPattern> updateMullionPattern(@RequestBody MullionPattern mullionpattern) {

		MullionPattern updateMullionPattern = windowsServiceInterface.updateMullionPattern(mullionpattern);

		return ResponseEntity.ok().body(updateMullionPattern);

	}

	@PutMapping("windows/mullionpatternsavailablecolours")
	public ResponseEntity<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			@RequestBody MullionPatternsAvailableColours mullionpatternsavailablecolours) {

		MullionPatternsAvailableColours updateMullionPatternsAvailableColours = windowsServiceInterface
				.updateMullionPatternsAvailableColours(mullionpatternsavailablecolours);

		return ResponseEntity.ok().body(updateMullionPatternsAvailableColours);

	}

	@PutMapping("windows/openingfunctions")
	public ResponseEntity<OpeningFunctions> updateOpeningFunctions(@RequestBody OpeningFunctions openingfunctions) {

		OpeningFunctions updateOpeningFunctions = windowsServiceInterface.updateOpeningFunctions(openingfunctions);

		return ResponseEntity.ok().body(updateOpeningFunctions);

	}

	@PutMapping("windows/openingfunctionsavailablecolours")
	public ResponseEntity<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			@RequestBody OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {

		OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours = windowsServiceInterface
				.updateOpeningFunctionsAvailableColours(openingfunctionsavailablecolours);

		return ResponseEntity.ok().body(updateOpeningFunctionsAvailableColours);

	}

	@PutMapping("windows/orders")
	public ResponseEntity<Orders> updateOrders(@RequestBody Orders orders) {

		Orders updateOrders = windowsServiceInterface.updateOrders(orders);

		return ResponseEntity.ok().body(updateOrders);

	}

	@PutMapping("windows/reed")
	public ResponseEntity<Reed> updateReed(@RequestBody Reed reed) {

		Reed updateReed = windowsServiceInterface.updateReed(reed);

		return ResponseEntity.ok().body(updateReed);

	}

	@PutMapping("windows/reedsavailablecolours")
	public ResponseEntity<ReedsAvailableColours> updateReedsAvailableColours(
			@RequestBody ReedsAvailableColours reedsavailablecolours) {

		ReedsAvailableColours updateReedsAvailableColours = windowsServiceInterface
				.updateReedsAvailableColours(reedsavailablecolours);

		return ResponseEntity.ok().body(updateReedsAvailableColours);

	}

	@PutMapping("windows/reiforcementsavailablecolours")
	public ResponseEntity<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			@RequestBody ReiforcementsAvailableColours reiforcementsavailablecolours) {

		ReiforcementsAvailableColours updateReiforcementsAvailableColours = windowsServiceInterface
				.updateReiforcementsAvailableColours(reiforcementsavailablecolours);

		return ResponseEntity.ok().body(updateReiforcementsAvailableColours);

	}

	@PutMapping("windows/reinforcement")
	public ResponseEntity<Reinforcement> updateReinforcement(@RequestBody Reinforcement reinforcement) {

		Reinforcement updateReinforcement = windowsServiceInterface.updateReinforcement(reinforcement);

		return ResponseEntity.ok().body(updateReinforcement);

	}

	@PutMapping("windows/sillstrip")
	public ResponseEntity<SillStrip> updateSillStrip(@RequestBody SillStrip sillstrip) {

		SillStrip updateSillStrip = windowsServiceInterface.updateSillStrip(sillstrip);

		return ResponseEntity.ok().body(updateSillStrip);

	}

	@PutMapping("windows/sillstripesavailablecolours")
	public ResponseEntity<SillStripesAvailableColours> updateSillStripesAvailableColours(
			@RequestBody SillStripesAvailableColours sillstripesavailablecolours) {

		SillStripesAvailableColours updateSillStripesAvailableColours = windowsServiceInterface
				.updateSillStripesAvailableColours(sillstripesavailablecolours);

		return ResponseEntity.ok().body(updateSillStripesAvailableColours);

	}

	@PutMapping("windows/specialshapes")
	public ResponseEntity<SpecialShapes> updateSpecialShapes(@RequestBody SpecialShapes specialshapes) {

		SpecialShapes updateSpecialShapes = windowsServiceInterface.updateSpecialShapes(specialshapes);

		return ResponseEntity.ok().body(updateSpecialShapes);

	}

	@PutMapping("windows/specialshapesavailablecolours")
	public ResponseEntity<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			@RequestBody SpecialShapesAvailableColours specialshapesavailablecolours) {

		SpecialShapesAvailableColours updateSpecialShapesAvailableColours = windowsServiceInterface
				.updateSpecialShapesAvailableColours(specialshapesavailablecolours);

		return ResponseEntity.ok().body(updateSpecialShapesAvailableColours);

	}

	@PutMapping("windows/threesholdsavailablecolours")
	public ResponseEntity<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			@RequestBody ThreeSholdsAvailableColours threesholdsavailablecolours) {

		ThreeSholdsAvailableColours updateThreeSholdsAvailableColours = windowsServiceInterface
				.updateThreeSholdsAvailableColours(threesholdsavailablecolours);

		return ResponseEntity.ok().body(updateThreeSholdsAvailableColours);

	}

	@PutMapping("windows/threshold")
	public ResponseEntity<Threshold> updateThreshold(@RequestBody Threshold threshold) {

		Threshold updateThreshold = windowsServiceInterface.updateThreshold(threshold);

		return ResponseEntity.ok().body(updateThreshold);

	}

	@PutMapping("windows/typeofmullion")
	public ResponseEntity<TypeOfMullion> updateTypeOfMullion(@RequestBody TypeOfMullion typeofmullion) {

		TypeOfMullion updateTypeOfMullion = windowsServiceInterface.updateTypeOfMullion(typeofmullion);

		return ResponseEntity.ok().body(updateTypeOfMullion);

	}

	@PutMapping("windows/typesofmullionsavailablecolours")
	public ResponseEntity<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			@RequestBody TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {

		TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours = windowsServiceInterface
				.updateTypesOfMullionsAvailableColours(typesofmullionsavailablecolours);

		return ResponseEntity.ok().body(updateTypesOfMullionsAvailableColours);

	}

	@PutMapping("windows/ventilator")
	public ResponseEntity<Ventilator> updateVentilator(@RequestBody Ventilator ventilator) {

		Ventilator updateVentilator = windowsServiceInterface.updateVentilator(ventilator);

		return ResponseEntity.ok().body(updateVentilator);

	}

	@PutMapping("windows/ventilatorsavailablecolours")
	public ResponseEntity<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			@RequestBody VentilatorsAvailableColours ventilatorsavailablecolours) {

		VentilatorsAvailableColours updateVentilatorsAvailableColours = windowsServiceInterface
				.updateVentilatorsAvailableColours(ventilatorsavailablecolours);

		return ResponseEntity.ok().body(updateVentilatorsAvailableColours);

	}

	@PutMapping("windows/windows")
	public ResponseEntity<Windows> updateWindows(@RequestBody Windows windows) {

		Windows updateWindows = windowsServiceInterface.updateWindows(windows);

		return ResponseEntity.ok().body(updateWindows);

	}

	@PutMapping("windows/winglock")
	public ResponseEntity<WingLock> updateWingLock(@RequestBody WingLock winglock) {

		WingLock updateWingLock = windowsServiceInterface.updateWingLock(winglock);

		return ResponseEntity.ok().body(updateWingLock);

	}

	@PutMapping("windows/winglocksavailablecolours")
	public ResponseEntity<WingLocksAvailableColours> updateWingLocksAvailableColours(
			@RequestBody WingLocksAvailableColours winglocksavailablecolours) {

		WingLocksAvailableColours updateWingLocksAvailableColours = windowsServiceInterface
				.updateWingLocksAvailableColours(winglocksavailablecolours);

		return ResponseEntity.ok().body(updateWingLocksAvailableColours);

	}

}