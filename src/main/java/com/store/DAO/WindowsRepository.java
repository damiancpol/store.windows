package com.store.DAO;

import java.util.List;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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

@Repository
public class WindowsRepository implements WindowsDaoInterface {
	@Autowired
	SessionFactory sessionFactory;

	public BalconyLatch saveBalconyLatch(BalconyLatch balconylatch) {
		Set<BalconyLatchAvailableColours> BalconyLatchAvailableColours = balconylatch.getBalconyLatchAvailableColours();

		for (BalconyLatchAvailableColours list : BalconyLatchAvailableColours) {

			BalconyLatchAvailableColours lc = new BalconyLatchAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setBalconyLatch(balconylatch);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(balconylatch);

		return balconylatch;
	};

	public ColorOfCasings saveColorOfCasings(ColorOfCasings colorofcasings) {
		Set<ColorOfCasingsAvailableColours> ColorOfCasingsAvailableColours = colorofcasings
				.getColorOfCasingsAvailableColours();

		for (ColorOfCasingsAvailableColours list : ColorOfCasingsAvailableColours) {

			ColorOfCasingsAvailableColours lc = new ColorOfCasingsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setColorOfCasings(colorofcasings);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(colorofcasings);

		return colorofcasings;
	};

	public CrossbarProfile saveCrossbarProfile(CrossbarProfile crossbarprofile) {
		Set<CrossbbarProfileAvaibleColors> CrossbarProfileAvailableColours = crossbarprofile
				.getCrossbbarProfileAvaibleColors();

		for (CrossbbarProfileAvaibleColors list : CrossbarProfileAvailableColours) {

			CrossbbarProfileAvaibleColors lc = new CrossbbarProfileAvaibleColors();
			lc.setArtnr(list.getArtnr());
			lc.setCrossbarProfile(crossbarprofile);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(crossbarprofile);

		return crossbarprofile;
	};

	public Extension saveExtension(Extension extension) {
		Set<ExtensionAvailableColours> ExtensionAvailableColours = extension.getExtensionAvailableColours();

		for (ExtensionAvailableColours list : ExtensionAvailableColours) {

			ExtensionAvailableColours lc = new ExtensionAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setExtension(extension);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(extension);

		return extension;
	};

	public Fittings saveFittings(Fittings fittings) {
		Set<FittingsAvailableColours> FittingsAvailableColours = fittings.getFittingsAvailableColours();

		for (FittingsAvailableColours list : FittingsAvailableColours) {

			FittingsAvailableColours lc = new FittingsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setFittings(fittings);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(fittings);

		return fittings;
	};

	public Fulfillment saveFulfillment(Fulfillment fulfillment) {
		Set<FullfillmentAvailableColours> FulfillmentAvailableColours = fulfillment.getFullfillmentAvailableColours();

		for (FullfillmentAvailableColours list : FulfillmentAvailableColours) {

			FullfillmentAvailableColours lc = new FullfillmentAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setFulfillment(fulfillment);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(fulfillment);

		return fulfillment;
	};

	public GlazingBead saveGlazingBead(GlazingBead glazingbead) {
		Set<GlazingBeadsAvailableColours> GlazingBeadAvailableColours = glazingbead.getGlazingBeadsAvailableColours();

		for (GlazingBeadsAvailableColours list : GlazingBeadAvailableColours) {

			GlazingBeadsAvailableColours lc = new GlazingBeadsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setGlazingBead(glazingbead);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(glazingbead);

		return glazingbead;
	};

	public Handle saveHandle(Handle handle) {
		Set<HandlesAvailableColours> HandleAvailableColours = handle.getHandlesAvailableColours();

		for (HandlesAvailableColours list : HandleAvailableColours) {

			HandlesAvailableColours lc = new HandlesAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setHandle(handle);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(handle);

		return handle;
	};

	public InterPaneFrame saveInterPaneFrame(InterPaneFrame interpaneframe) {
		Set<InterPaneFramesAvailableColours> InterPaneFrameAvailableColours = interpaneframe
				.getInterPaneFramesAvailableColours();

		for (InterPaneFramesAvailableColours list : InterPaneFrameAvailableColours) {

			InterPaneFramesAvailableColours lc = new InterPaneFramesAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setInterPaneFrame(interpaneframe);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(interpaneframe);

		return interpaneframe;
	};

	public MullionPattern saveMullionPattern(MullionPattern mullionpattern) {
		Set<MullionPatternsAvailableColours> MullionPatternsAvailableColours = mullionpattern
				.getMullionPatternsAvailableColours();

		for (MullionPatternsAvailableColours list : MullionPatternsAvailableColours) {

			MullionPatternsAvailableColours lc = new MullionPatternsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setMullionPattern(mullionpattern);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(mullionpattern);

		return mullionpattern;
	};

	public Reed saveReed(Reed reed) {
		Set<ReedsAvailableColours> ReedAvailableColours = reed.getReedsAvailableColours();

		for (ReedsAvailableColours list : ReedAvailableColours) {

			ReedsAvailableColours lc = new ReedsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setReed(reed);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(reed);

		return reed;
	};

	public Reinforcement saveReinforcement(Reinforcement reinforcement) {
		Set<ReiforcementsAvailableColours> ReinforcementAvailableColours = reinforcement
				.getReiforcementsAvailableColours();

		for (ReiforcementsAvailableColours list : ReinforcementAvailableColours) {

			ReiforcementsAvailableColours lc = new ReiforcementsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setReinforcement(reinforcement);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(reinforcement);

		return reinforcement;
	};

	public SillStrip saveSillStrip(SillStrip sillstrip) {
		Set<SillStripesAvailableColours> SillStripAvailableColours = sillstrip.getSillStripesAvailableColours();

		for (SillStripesAvailableColours list : SillStripAvailableColours) {

			SillStripesAvailableColours lc = new SillStripesAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setSillStrip(sillstrip);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(sillstrip);

		return sillstrip;
	};

	public SpecialShapes saveSpecialShapes(SpecialShapes specialshapes) {
		Set<SpecialShapesAvailableColours> SpecialShapesAvailableColours = specialshapes
				.getSpecialShapesAvailableColours();

		for (SpecialShapesAvailableColours list : SpecialShapesAvailableColours) {

			SpecialShapesAvailableColours lc = new SpecialShapesAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setSpecialShapes(specialshapes);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(specialshapes);

		return specialshapes;
	};

	public Threshold saveThreshold(Threshold threshold) {
		Set<ThreeSholdsAvailableColours> ThresholdAvailableColours = threshold.getThreeSholdsAvailableColours();

		for (ThreeSholdsAvailableColours list : ThresholdAvailableColours) {

			ThreeSholdsAvailableColours lc = new ThreeSholdsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setThreshold(threshold);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(threshold);

		return threshold;
	};

	public TypeOfMullion saveTypeOfMullion(TypeOfMullion typeofmullion) {
		Set<TypesOfMullionsAvailableColours> TypeOfMullionAvailableColours = typeofmullion
				.getTypesOfMullionsAvailableColours();

		for (TypesOfMullionsAvailableColours list : TypeOfMullionAvailableColours) {

			TypesOfMullionsAvailableColours lc = new TypesOfMullionsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setTypeOfMullion(typeofmullion);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(typeofmullion);

		return typeofmullion;
	};

	public Ventilator saveVentilator(Ventilator ventilator) {
		Set<VentilatorsAvailableColours> VentilatorAvailableColours = ventilator.getVentilatorsAvailableColours();

		for (VentilatorsAvailableColours list : VentilatorAvailableColours) {

			VentilatorsAvailableColours lc = new VentilatorsAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setVentilator(ventilator);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(ventilator);

		return ventilator;
	};

	public WingLock saveWingLock(WingLock winglock) {
		Set<WingLocksAvailableColours> WingLockAvailableColours = winglock.getWingLocksAvailableColours();

		for (WingLocksAvailableColours list : WingLockAvailableColours) {

			WingLocksAvailableColours lc = new WingLocksAvailableColours();
			lc.setArtnr(list.getArtnr());
			lc.setWingLock(winglock);
			lc.setName(list.getName());

			sessionFactory.getCurrentSession().save(lc);

		}
		sessionFactory.getCurrentSession().save(winglock);

		return winglock;
	}

	public BalconyLatch getSingleBalconyLatch(int id) {
		BalconyLatch balconylatch = (BalconyLatch) sessionFactory.getCurrentSession().get(BalconyLatch.class, id);

		return balconylatch;
	}

	public BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(int id) {
		BalconyLatchAvailableColours balconylatchavailablecolours = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().get(BalconyLatchAvailableColours.class, id);

		return balconylatchavailablecolours;
	}

	public Client getSingleClient(int id) {
		Client client = (Client) sessionFactory.getCurrentSession().get(Client.class, id);

		return client;
	}

	public ColorOfCasings getSingleColorOfCasings(int id) {
		ColorOfCasings colorofcasings = (ColorOfCasings) sessionFactory.getCurrentSession().get(ColorOfCasings.class,
				id);

		return colorofcasings;
	}

	public ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(int id) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().get(ColorOfCasingsAvailableColours.class, id);

		return colorofcasingsavailablecolours;
	}

	public CrossbarProfile getSingleCrossbarProfile(int id) {
		CrossbarProfile crossbarprofile = (CrossbarProfile) sessionFactory.getCurrentSession()
				.get(CrossbarProfile.class, id);

		return crossbarprofile;
	}

	public CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(int id) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().get(CrossbbarProfileAvaibleColors.class, id);

		return crossbbarprofileavaiblecolors;
	}

	public DiffuserColor getSingleDiffuserColor(int id) {
		DiffuserColor diffusercolor = (DiffuserColor) sessionFactory.getCurrentSession().get(DiffuserColor.class, id);

		return diffusercolor;
	}

	public DoorHandleColor getSingleDoorHandleColor(int id) {
		DoorHandleColor doorhandlecolor = (DoorHandleColor) sessionFactory.getCurrentSession()
				.get(DoorHandleColor.class, id);

		return doorhandlecolor;
	}

	public Extension getSingleExtension(int id) {
		Extension extension = (Extension) sessionFactory.getCurrentSession().get(Extension.class, id);

		return extension;
	}

	public ExtensionAvailableColours getSingleExtensionAvailableColours(int id) {
		ExtensionAvailableColours extensionavailablecolours = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().get(ExtensionAvailableColours.class, id);

		return extensionavailablecolours;
	}

	public ExternalColor getSingleExternalColor(int id) {
		ExternalColor externalcolor = (ExternalColor) sessionFactory.getCurrentSession().get(ExternalColor.class, id);

		return externalcolor;
	}

	public Fittings getSingleFittings(int id) {
		Fittings fittings = (Fittings) sessionFactory.getCurrentSession().get(Fittings.class, id);

		return fittings;
	}

	public FittingsAvailableColours getSingleFittingsAvailableColours(int id) {
		FittingsAvailableColours fittingsavailablecolours = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().get(FittingsAvailableColours.class, id);

		return fittingsavailablecolours;
	}

	public FrameColor getSingleFrameColor(int id) {
		FrameColor framecolor = (FrameColor) sessionFactory.getCurrentSession().get(FrameColor.class, id);

		return framecolor;
	}

	public Fulfillment getSingleFulfillment(int id) {
		Fulfillment fulfillment = (Fulfillment) sessionFactory.getCurrentSession().get(Fulfillment.class, id);

		return fulfillment;
	}

	public FullfillmentAvailableColours getSingleFullfillmentAvailableColours(int id) {
		FullfillmentAvailableColours fullfillmentavailablecolours = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().get(FullfillmentAvailableColours.class, id);

		return fullfillmentavailablecolours;
	}

	public GlazingBead getSingleGlazingBead(int id) {
		GlazingBead glazingbead = (GlazingBead) sessionFactory.getCurrentSession().get(GlazingBead.class, id);

		return glazingbead;
	}

	public GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(int id) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().get(GlazingBeadsAvailableColours.class, id);

		return glazingbeadsavailablecolours;
	}

	public Handle getSingleHandle(int id) {
		Handle handle = (Handle) sessionFactory.getCurrentSession().get(Handle.class, id);

		return handle;
	}

	public HandlesAvailableColours getSingleHandlesAvailableColours(int id) {
		HandlesAvailableColours handlesavailablecolours = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.get(HandlesAvailableColours.class, id);

		return handlesavailablecolours;
	}

	public InternalColor getSingleInternalColor(int id) {
		InternalColor internalcolor = (InternalColor) sessionFactory.getCurrentSession().get(InternalColor.class, id);

		return internalcolor;
	}

	public InterPaneFrame getSingleInterPaneFrame(int id) {
		InterPaneFrame interpaneframe = (InterPaneFrame) sessionFactory.getCurrentSession().get(InterPaneFrame.class,
				id);

		return interpaneframe;
	}

	public InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(int id) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().get(InterPaneFramesAvailableColours.class, id);

		return interpaneframesavailablecolours;
	}

	public MullionPattern getSingleMullionPattern(int id) {
		MullionPattern mullionpattern = (MullionPattern) sessionFactory.getCurrentSession().get(MullionPattern.class,
				id);

		return mullionpattern;
	}

	public MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(int id) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().get(MullionPatternsAvailableColours.class, id);

		return mullionpatternsavailablecolours;
	}

	public OpeningFunctions getSingleOpeningFunctions(int id) {
		OpeningFunctions openingfunctions = (OpeningFunctions) sessionFactory.getCurrentSession()
				.get(OpeningFunctions.class, id);

		return openingfunctions;
	}

	public OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(int id) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().get(OpeningFunctionsAvailableColours.class, id);

		return openingfunctionsavailablecolours;
	}

	public Orders getSingleOrders(int id) {
		Orders orders = (Orders) sessionFactory.getCurrentSession().get(Orders.class, id);

		return orders;
	}

	public Reed getSingleReed(int id) {
		Reed reed = (Reed) sessionFactory.getCurrentSession().get(Reed.class, id);

		return reed;
	}

	public ReedsAvailableColours getSingleReedsAvailableColours(int id) {
		ReedsAvailableColours reedsavailablecolours = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.get(ReedsAvailableColours.class, id);

		return reedsavailablecolours;
	}

	public ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(int id) {
		ReiforcementsAvailableColours reiforcementsavailablecolours = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().get(ReiforcementsAvailableColours.class, id);

		return reiforcementsavailablecolours;
	}

	public Reinforcement getSingleReinforcement(int id) {
		Reinforcement reinforcement = (Reinforcement) sessionFactory.getCurrentSession().get(Reinforcement.class, id);

		return reinforcement;
	}

	public SillStrip getSingleSillStrip(int id) {
		SillStrip sillstrip = (SillStrip) sessionFactory.getCurrentSession().get(SillStrip.class, id);

		return sillstrip;
	}

	public SillStripesAvailableColours getSingleSillStripesAvailableColours(int id) {
		SillStripesAvailableColours sillstripesavailablecolours = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().get(SillStripesAvailableColours.class, id);

		return sillstripesavailablecolours;
	}

	public SpecialShapes getSingleSpecialShapes(int id) {
		SpecialShapes specialshapes = (SpecialShapes) sessionFactory.getCurrentSession().get(SpecialShapes.class, id);

		return specialshapes;
	}

	public SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(int id) {
		SpecialShapesAvailableColours specialshapesavailablecolours = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().get(SpecialShapesAvailableColours.class, id);

		return specialshapesavailablecolours;
	}

	public ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(int id) {
		ThreeSholdsAvailableColours threesholdsavailablecolours = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().get(ThreeSholdsAvailableColours.class, id);

		return threesholdsavailablecolours;
	}

	public Threshold getSingleThreshold(int id) {
		Threshold threshold = (Threshold) sessionFactory.getCurrentSession().get(Threshold.class, id);

		return threshold;
	}

	public TypeOfMullion getSingleTypeOfMullion(int id) {
		TypeOfMullion typeofmullion = (TypeOfMullion) sessionFactory.getCurrentSession().get(TypeOfMullion.class, id);

		return typeofmullion;
	}

	public TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(int id) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().get(TypesOfMullionsAvailableColours.class, id);

		return typesofmullionsavailablecolours;
	}

	public Ventilator getSingleVentilator(int id) {
		Ventilator ventilator = (Ventilator) sessionFactory.getCurrentSession().get(Ventilator.class, id);

		return ventilator;
	}

	public VentilatorsAvailableColours getSingleVentilatorsAvailableColours(int id) {
		VentilatorsAvailableColours ventilatorsavailablecolours = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().get(VentilatorsAvailableColours.class, id);

		return ventilatorsavailablecolours;
	}

	public Windows getSingleWindows(int id) {
		Windows windows = (Windows) sessionFactory.getCurrentSession().get(Windows.class, id);

		return windows;
	}

	public WingLock getSingleWingLock(int id) {
		WingLock winglock = (WingLock) sessionFactory.getCurrentSession().get(WingLock.class, id);

		return winglock;
	}

	public WingLocksAvailableColours getSingleWingLocksAvailableColours(int id) {
		WingLocksAvailableColours winglocksavailablecolours = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().get(WingLocksAvailableColours.class, id);

		return winglocksavailablecolours;
	}

	@Override
	public List<BalconyLatch> getListBalconyLatch() {
		List<BalconyLatch> balconylatch = (List<BalconyLatch>) sessionFactory.getCurrentSession()
				.createQuery("from BalconyLatch").list();
		return balconylatch;
	}

	@Override
	public List<BalconyLatchAvailableColours> getListBalconyLatchAvailableColours() {
		List<BalconyLatchAvailableColours> balconylatchavailablecolours = (List<BalconyLatchAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from BalconyLatchAvailableColours").list();
		return balconylatchavailablecolours;
	}

	@Override
	public List<Client> getListClient() {
		List<Client> client = (List<Client>) sessionFactory.getCurrentSession().createQuery("from Client").list();
		return client;
	}

	@Override
	public List<ColorOfCasings> getListColorOfCasings() {
		List<ColorOfCasings> colorofcasings = (List<ColorOfCasings>) sessionFactory.getCurrentSession()
				.createQuery("from ColorOfCasings").list();
		return colorofcasings;
	}

	@Override
	public List<ColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours() {
		List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours = (List<ColorOfCasingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ColorOfCasingsAvailableColours").list();
		return colorofcasingsavailablecolours;
	}

	@Override
	public List<CrossbarProfile> getListCrossbarProfile() {
		List<CrossbarProfile> crossbarprofile = (List<CrossbarProfile>) sessionFactory.getCurrentSession()
				.createQuery("from CrossbarProfile").list();
		return crossbarprofile;
	}

	@Override
	public List<CrossbbarProfileAvaibleColors> getListCrossbbarProfileAvaibleColors() {
		List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors = (List<CrossbbarProfileAvaibleColors>) sessionFactory
				.getCurrentSession().createQuery("from CrossbbarProfileAvaibleColors").list();
		return crossbbarprofileavaiblecolors;
	}

	@Override
	public List<DiffuserColor> getListDiffuserColor() {
		List<DiffuserColor> diffusercolor = (List<DiffuserColor>) sessionFactory.getCurrentSession()
				.createQuery("from DiffuserColor").list();
		return diffusercolor;
	}

	@Override
	public List<DoorHandleColor> getListDoorHandleColor() {
		List<DoorHandleColor> doorhandlecolor = (List<DoorHandleColor>) sessionFactory.getCurrentSession()
				.createQuery("from DoorHandleColor").list();
		return doorhandlecolor;
	}

	@Override
	public List<Extension> getListExtension() {
		List<Extension> extension = (List<Extension>) sessionFactory.getCurrentSession().createQuery("from Extension")
				.list();
		return extension;
	}

	@Override
	public List<ExtensionAvailableColours> getListExtensionAvailableColours() {
		List<ExtensionAvailableColours> extensionavailablecolours = (List<ExtensionAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ExtensionAvailableColours").list();
		return extensionavailablecolours;
	}

	@Override
	public List<ExternalColor> getListExternalColor() {
		List<ExternalColor> externalcolor = (List<ExternalColor>) sessionFactory.getCurrentSession()
				.createQuery("from ExternalColor").list();
		return externalcolor;
	}

	@Override
	public List<Fittings> getListFittings() {
		List<Fittings> fittings = (List<Fittings>) sessionFactory.getCurrentSession().createQuery("from Fittings")
				.list();
		return fittings;
	}

	@Override
	public List<FittingsAvailableColours> getListFittingsAvailableColours() {
		List<FittingsAvailableColours> fittingsavailablecolours = (List<FittingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from FittingsAvailableColours").list();
		return fittingsavailablecolours;
	}

	@Override
	public List<FrameColor> getListFrameColor() {
		List<FrameColor> framecolor = (List<FrameColor>) sessionFactory.getCurrentSession()
				.createQuery("from FrameColor").list();
		return framecolor;
	}

	@Override
	public List<Fulfillment> getListFulfillment() {
		List<Fulfillment> fulfillment = (List<Fulfillment>) sessionFactory.getCurrentSession()
				.createQuery("from Fulfillment").list();
		return fulfillment;
	}

	@Override
	public List<FullfillmentAvailableColours> getListFullfillmentAvailableColours() {
		List<FullfillmentAvailableColours> fullfillmentavailablecolours = (List<FullfillmentAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from FullfillmentAvailableColours").list();
		return fullfillmentavailablecolours;
	}

	@Override
	public List<GlazingBead> getListGlazingBead() {
		List<GlazingBead> glazingbead = (List<GlazingBead>) sessionFactory.getCurrentSession()
				.createQuery("from GlazingBead").list();
		return glazingbead;
	}

	@Override
	public List<GlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours() {
		List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours = (List<GlazingBeadsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from GlazingBeadsAvailableColours").list();
		return glazingbeadsavailablecolours;
	}

	@Override
	public List<Handle> getListHandle() {
		List<Handle> handle = (List<Handle>) sessionFactory.getCurrentSession().createQuery("from Handle").list();
		return handle;
	}

	@Override
	public List<HandlesAvailableColours> getListHandlesAvailableColours() {
		List<HandlesAvailableColours> handlesavailablecolours = (List<HandlesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from HandlesAvailableColours").list();
		return handlesavailablecolours;
	}

	@Override
	public List<InternalColor> getListInternalColor() {
		List<InternalColor> internalcolor = (List<InternalColor>) sessionFactory.getCurrentSession()
				.createQuery("from InternalColor").list();
		return internalcolor;
	}

	@Override
	public List<InterPaneFrame> getListInterPaneFrame() {
		List<InterPaneFrame> interpaneframe = (List<InterPaneFrame>) sessionFactory.getCurrentSession()
				.createQuery("from InterPaneFrame").list();
		return interpaneframe;
	}

	@Override
	public List<InterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours() {
		List<InterPaneFramesAvailableColours> interpaneframesavailablecolours = (List<InterPaneFramesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from InterPaneFramesAvailableColours").list();
		return interpaneframesavailablecolours;
	}

	@Override
	public List<MullionPattern> getListMullionPattern() {
		List<MullionPattern> mullionpattern = (List<MullionPattern>) sessionFactory.getCurrentSession()
				.createQuery("from MullionPattern").list();
		return mullionpattern;
	}

	@Override
	public List<MullionPatternsAvailableColours> getListMullionPatternsAvailableColours() {
		List<MullionPatternsAvailableColours> mullionpatternsavailablecolours = (List<MullionPatternsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from MullionPatternsAvailableColours").list();
		return mullionpatternsavailablecolours;
	}

	@Override
	public List<OpeningFunctions> getListOpeningFunctions() {
		List<OpeningFunctions> openingfunctions = (List<OpeningFunctions>) sessionFactory.getCurrentSession()
				.createQuery("from OpeningFunctions").list();
		return openingfunctions;
	}

	@Override
	public List<OpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours() {
		List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours = (List<OpeningFunctionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from OpeningFunctionsAvailableColours").list();
		return openingfunctionsavailablecolours;
	}

	@Override
	public List<Orders> getListOrders() {
		List<Orders> orders = (List<Orders>) sessionFactory.getCurrentSession().createQuery("from Orders").list();
		return orders;
	}

	@Override
	public List<Reed> getListReed() {
		List<Reed> reed = (List<Reed>) sessionFactory.getCurrentSession().createQuery("from Reed").list();
		return reed;
	}

	@Override
	public List<ReedsAvailableColours> getListReedsAvailableColours() {
		List<ReedsAvailableColours> reedsavailablecolours = (List<ReedsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ReedsAvailableColours").list();
		return reedsavailablecolours;
	}

	@Override
	public List<ReiforcementsAvailableColours> getListReiforcementsAvailableColours() {
		List<ReiforcementsAvailableColours> reiforcementsavailablecolours = (List<ReiforcementsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ReiforcementsAvailableColours").list();
		return reiforcementsavailablecolours;
	}

	@Override
	public List<Reinforcement> getListReinforcement() {
		List<Reinforcement> reinforcement = (List<Reinforcement>) sessionFactory.getCurrentSession()
				.createQuery("from Reinforcement").list();
		return reinforcement;
	}

	@Override
	public List<SillStrip> getListSillStrip() {
		List<SillStrip> sillstrip = (List<SillStrip>) sessionFactory.getCurrentSession().createQuery("from SillStrip")
				.list();
		return sillstrip;
	}

	@Override
	public List<SillStripesAvailableColours> getListSillStripesAvailableColours() {
		List<SillStripesAvailableColours> sillstripesavailablecolours = (List<SillStripesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from SillStripesAvailableColours").list();
		return sillstripesavailablecolours;
	}

	@Override
	public List<SpecialShapes> getListSpecialShapes() {
		List<SpecialShapes> specialshapes = (List<SpecialShapes>) sessionFactory.getCurrentSession()
				.createQuery("from SpecialShapes").list();
		return specialshapes;
	}

	@Override
	public List<SpecialShapesAvailableColours> getListSpecialShapesAvailableColours() {
		List<SpecialShapesAvailableColours> specialshapesavailablecolours = (List<SpecialShapesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from SpecialShapesAvailableColours").list();
		return specialshapesavailablecolours;
	}

	@Override
	public List<ThreeSholdsAvailableColours> getListThreeSholdsAvailableColours() {
		List<ThreeSholdsAvailableColours> threesholdsavailablecolours = (List<ThreeSholdsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ThreeSholdsAvailableColours").list();
		return threesholdsavailablecolours;
	}

	@Override
	public List<Threshold> getListThreshold() {
		List<Threshold> threshold = (List<Threshold>) sessionFactory.getCurrentSession().createQuery("from Threshold")
				.list();
		return threshold;
	}

	@Override
	public List<TypeOfMullion> getListTypeOfMullion() {
		List<TypeOfMullion> typeofmullion = (List<TypeOfMullion>) sessionFactory.getCurrentSession()
				.createQuery("from TypeOfMullion").list();
		return typeofmullion;
	}

	@Override
	public List<TypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours() {
		List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours = (List<TypesOfMullionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from TypesOfMullionsAvailableColours").list();
		return typesofmullionsavailablecolours;
	}

	@Override
	public List<Ventilator> getListVentilator() {
		List<Ventilator> ventilator = (List<Ventilator>) sessionFactory.getCurrentSession()
				.createQuery("from Ventilator").list();
		return ventilator;
	}

	@Override
	public List<VentilatorsAvailableColours> getListVentilatorsAvailableColours() {
		List<VentilatorsAvailableColours> ventilatorsavailablecolours = (List<VentilatorsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from VentilatorsAvailableColours").list();
		return ventilatorsavailablecolours;
	}

	@Override
	public List<Windows> getListWindows() {
		List<Windows> windows = (List<Windows>) sessionFactory.getCurrentSession().createQuery("from Windows").list();
		return windows;
	}

	@Override
	public List<WingLock> getListWingLock() {
		List<WingLock> winglock = (List<WingLock>) sessionFactory.getCurrentSession().createQuery("from WingLock")
				.list();
		return winglock;
	}

	@Override
	public List<WingLocksAvailableColours> getListWingLocksAvailableColours() {
		List<WingLocksAvailableColours> winglocksavailablecolours = (List<WingLocksAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from WingLocksAvailableColours").list();
		return winglocksavailablecolours;
	}

	@Override
	public BalconyLatch delSingleBalconyLatch(int id) {
		BalconyLatch balconylatch = (BalconyLatch) sessionFactory.getCurrentSession().load(BalconyLatch.class, id);
		sessionFactory.getCurrentSession().delete(balconylatch);
		return null;
	}

	@Override
	public BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(int id) {
		BalconyLatchAvailableColours balconylatchavailablecolours = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().load(BalconyLatchAvailableColours.class, id);
		System.out.println("nynynyn" + balconylatchavailablecolours.getArtnr());
		sessionFactory.getCurrentSession().delete(balconylatchavailablecolours);
		return null;
	}

	@Override
	public Client delSingleClient(int id) {
		Client client = (Client) sessionFactory.getCurrentSession().load(Client.class, id);
		sessionFactory.getCurrentSession().delete(client);
		return null;
	}

	@Override
	public ColorOfCasings delSingleColorOfCasings(int id) {
		ColorOfCasings colorofcasings = (ColorOfCasings) sessionFactory.getCurrentSession().load(ColorOfCasings.class,
				id);
		sessionFactory.getCurrentSession().delete(colorofcasings);
		return null;
	}

	@Override
	public ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(int id) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().load(ColorOfCasingsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(colorofcasingsavailablecolours);
		return null;
	}

	@Override
	public CrossbarProfile delSingleCrossbarProfile(int id) {
		CrossbarProfile crossbarprofile = (CrossbarProfile) sessionFactory.getCurrentSession()
				.load(CrossbarProfile.class, id);
		sessionFactory.getCurrentSession().delete(crossbarprofile);
		return null;
	}

	@Override
	public CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(int id) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().load(CrossbbarProfileAvaibleColors.class, id);
		sessionFactory.getCurrentSession().delete(crossbbarprofileavaiblecolors);
		return null;
	}

	@Override
	public DiffuserColor delSingleDiffuserColor(int id) {
		DiffuserColor diffusercolor = (DiffuserColor) sessionFactory.getCurrentSession().load(DiffuserColor.class, id);
		sessionFactory.getCurrentSession().delete(diffusercolor);
		return null;
	}

	@Override
	public DoorHandleColor delSingleDoorHandleColor(int id) {
		DoorHandleColor doorhandlecolor = (DoorHandleColor) sessionFactory.getCurrentSession()
				.load(DoorHandleColor.class, id);
		sessionFactory.getCurrentSession().delete(doorhandlecolor);
		return null;
	}

	@Override
	public Extension delSingleExtension(int id) {
		Extension extension = (Extension) sessionFactory.getCurrentSession().load(Extension.class, id);
		sessionFactory.getCurrentSession().delete(extension);
		return null;
	}

	@Override
	public ExtensionAvailableColours delSingleExtensionAvailableColours(int id) {
		ExtensionAvailableColours extensionavailablecolours = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().load(ExtensionAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(extensionavailablecolours);
		return null;
	}

	@Override
	public ExternalColor delSingleExternalColor(int id) {
		ExternalColor externalcolor = (ExternalColor) sessionFactory.getCurrentSession().load(ExternalColor.class, id);
		sessionFactory.getCurrentSession().delete(externalcolor);
		return null;
	}

	@Override
	public Fittings delSingleFittings(int id) {
		Fittings fittings = (Fittings) sessionFactory.getCurrentSession().load(Fittings.class, id);
		sessionFactory.getCurrentSession().delete(fittings);
		return null;
	}

	@Override
	public FittingsAvailableColours delSingleFittingsAvailableColours(int id) {
		FittingsAvailableColours fittingsavailablecolours = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().load(FittingsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(fittingsavailablecolours);
		return null;
	}

	@Override
	public FrameColor delSingleFrameColor(int id) {
		FrameColor framecolor = (FrameColor) sessionFactory.getCurrentSession().load(FrameColor.class, id);
		sessionFactory.getCurrentSession().delete(framecolor);
		return null;
	}

	@Override
	public Fulfillment delSingleFulfillment(int id) {
		Fulfillment fulfillment = (Fulfillment) sessionFactory.getCurrentSession().load(Fulfillment.class, id);
		sessionFactory.getCurrentSession().delete(fulfillment);
		return null;
	}

	@Override
	public FullfillmentAvailableColours delSingleFullfillmentAvailableColours(int id) {
		FullfillmentAvailableColours fullfillmentavailablecolours = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().load(FullfillmentAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(fullfillmentavailablecolours);
		return null;
	}

	@Override
	public GlazingBead delSingleGlazingBead(int id) {
		GlazingBead glazingbead = (GlazingBead) sessionFactory.getCurrentSession().load(GlazingBead.class, id);
		sessionFactory.getCurrentSession().delete(glazingbead);
		return null;
	}

	@Override
	public GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(int id) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().load(GlazingBeadsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(glazingbeadsavailablecolours);
		return null;
	}

	@Override
	public Handle delSingleHandle(int id) {
		Handle handle = (Handle) sessionFactory.getCurrentSession().load(Handle.class, id);
		sessionFactory.getCurrentSession().delete(handle);
		return null;
	}

	@Override
	public HandlesAvailableColours delSingleHandlesAvailableColours(int id) {
		HandlesAvailableColours handlesavailablecolours = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.load(HandlesAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(handlesavailablecolours);
		return null;
	}

	@Override
	public InternalColor delSingleInternalColor(int id) {
		InternalColor internalcolor = (InternalColor) sessionFactory.getCurrentSession().load(InternalColor.class, id);
		sessionFactory.getCurrentSession().delete(internalcolor);
		return null;
	}

	@Override
	public InterPaneFrame delSingleInterPaneFrame(int id) {
		InterPaneFrame interpaneframe = (InterPaneFrame) sessionFactory.getCurrentSession().load(InterPaneFrame.class,
				id);
		sessionFactory.getCurrentSession().delete(interpaneframe);
		return null;
	}

	@Override
	public InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(int id) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().load(InterPaneFramesAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(interpaneframesavailablecolours);
		return null;
	}

	@Override
	public MullionPattern delSingleMullionPattern(int id) {
		MullionPattern mullionpattern = (MullionPattern) sessionFactory.getCurrentSession().load(MullionPattern.class,
				id);
		sessionFactory.getCurrentSession().delete(mullionpattern);
		return null;
	}

	@Override
	public MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(int id) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().load(MullionPatternsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(mullionpatternsavailablecolours);
		return null;
	}

	@Override
	public OpeningFunctions delSingleOpeningFunctions(int id) {
		OpeningFunctions openingfunctions = (OpeningFunctions) sessionFactory.getCurrentSession()
				.load(OpeningFunctions.class, id);
		sessionFactory.getCurrentSession().delete(openingfunctions);
		return null;
	}

	@Override
	public OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(int id) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().load(OpeningFunctionsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(openingfunctionsavailablecolours);
		return null;
	}

	@Override
	public Orders delSingleOrders(int id) {
		Orders orders = (Orders) sessionFactory.getCurrentSession().load(Orders.class, id);
		Set<Windows> windows = orders.getWindows();
		for(Windows win: windows) {
			
			sessionFactory.getCurrentSession().delete(win);
			
		}
		sessionFactory.getCurrentSession().delete(orders);
		return null;
	}

	@Override
	public Reed delSingleReed(int id) {
		Reed reed = (Reed) sessionFactory.getCurrentSession().load(Reed.class, id);
		sessionFactory.getCurrentSession().delete(reed);
		return null;
	}

	@Override
	public ReedsAvailableColours delSingleReedsAvailableColours(int id) {
		ReedsAvailableColours reedsavailablecolours = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.load(ReedsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(reedsavailablecolours);
		return null;
	}

	@Override
	public ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(int id) {
		ReiforcementsAvailableColours reiforcementsavailablecolours = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().load(ReiforcementsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(reiforcementsavailablecolours);
		return null;
	}

	@Override
	public Reinforcement delSingleReinforcement(int id) {
		Reinforcement reinforcement = (Reinforcement) sessionFactory.getCurrentSession().load(Reinforcement.class, id);
		sessionFactory.getCurrentSession().delete(reinforcement);
		return null;
	}

	@Override
	public SillStrip delSingleSillStrip(int id) {
		SillStrip sillstrip = (SillStrip) sessionFactory.getCurrentSession().load(SillStrip.class, id);
		sessionFactory.getCurrentSession().delete(sillstrip);
		return null;
	}

	@Override
	public SillStripesAvailableColours delSingleSillStripesAvailableColours(int id) {
		SillStripesAvailableColours sillstripesavailablecolours = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().load(SillStripesAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(sillstripesavailablecolours);
		return null;
	}

	@Override
	public SpecialShapes delSingleSpecialShapes(int id) {
		SpecialShapes specialshapes = (SpecialShapes) sessionFactory.getCurrentSession().load(SpecialShapes.class, id);
		sessionFactory.getCurrentSession().delete(specialshapes);
		return null;
	}

	@Override
	public SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(int id) {
		SpecialShapesAvailableColours specialshapesavailablecolours = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().load(SpecialShapesAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(specialshapesavailablecolours);
		return null;
	}

	@Override
	public ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(int id) {
		ThreeSholdsAvailableColours threesholdsavailablecolours = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().load(ThreeSholdsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(threesholdsavailablecolours);
		return null;
	}

	@Override
	public Threshold delSingleThreshold(int id) {
		Threshold threshold = (Threshold) sessionFactory.getCurrentSession().load(Threshold.class, id);
		sessionFactory.getCurrentSession().delete(threshold);
		return null;
	}

	@Override
	public TypeOfMullion delSingleTypeOfMullion(int id) {
		TypeOfMullion typeofmullion = (TypeOfMullion) sessionFactory.getCurrentSession().load(TypeOfMullion.class, id);
		sessionFactory.getCurrentSession().delete(typeofmullion);
		return null;
	}

	@Override
	public TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(int id) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().load(TypesOfMullionsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(typesofmullionsavailablecolours);
		return null;
	}

	@Override
	public Ventilator delSingleVentilator(int id) {
		Ventilator ventilator = (Ventilator) sessionFactory.getCurrentSession().load(Ventilator.class, id);
		sessionFactory.getCurrentSession().delete(ventilator);
		return null;
	}

	@Override
	public VentilatorsAvailableColours delSingleVentilatorsAvailableColours(int id) {
		VentilatorsAvailableColours ventilatorsavailablecolours = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().load(VentilatorsAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(ventilatorsavailablecolours);
		return null;
	}

	@Override
	public Windows delSingleWindows(int id) {
		Windows windows = (Windows) sessionFactory.getCurrentSession().load(Windows.class, id);
		sessionFactory.getCurrentSession().delete(windows);
		return null;
	}

	@Override
	public WingLock delSingleWingLock(int id) {
		WingLock winglock = (WingLock) sessionFactory.getCurrentSession().load(WingLock.class, id);
		sessionFactory.getCurrentSession().delete(winglock);
		return null;
	}

	@Override
	public WingLocksAvailableColours delSingleWingLocksAvailableColours(int id) {
		WingLocksAvailableColours winglocksavailablecolours = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().load(WingLocksAvailableColours.class, id);
		sessionFactory.getCurrentSession().delete(winglocksavailablecolours);
		return null;
	}

	@Override
	public BalconyLatch updateBalconyLatch(BalconyLatch balconylatch) {
		BalconyLatch balconylatchs = (BalconyLatch) sessionFactory.getCurrentSession().load(BalconyLatch.class,
				balconylatch.getIdBalconyLatch());
		balconylatchs.setName(balconylatch.getName());
		balconylatchs.setArtnr(balconylatch.getArtnr());

		Set<BalconyLatchAvailableColours> balconylatchAvaibleColors = balconylatchs.getBalconyLatchAvailableColours();
		Set<BalconyLatchAvailableColours> balconylatchAvaibleColors2 = balconylatch.getBalconyLatchAvailableColours();
		for (BalconyLatchAvailableColours crac : balconylatchAvaibleColors) {
			for (BalconyLatchAvailableColours crac1 : balconylatchAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setBalconyLatch(balconylatch);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return balconylatch;
	}

	@Override
	public ColorOfCasings updateColorOfCasings(ColorOfCasings colorofcasings) {
		ColorOfCasings colorofcasingss = (ColorOfCasings) sessionFactory.getCurrentSession().load(ColorOfCasings.class,
				colorofcasings.getIdColorOfCasings());
		colorofcasingss.setName(colorofcasings.getName());
		colorofcasingss.setArtnr(colorofcasings.getArtnr());

		Set<ColorOfCasingsAvailableColours> colorofcasingsAvaibleColors = colorofcasingss
				.getColorOfCasingsAvailableColours();
		Set<ColorOfCasingsAvailableColours> colorofcasingsAvaibleColors2 = colorofcasings
				.getColorOfCasingsAvailableColours();
		for (ColorOfCasingsAvailableColours crac : colorofcasingsAvaibleColors) {
			for (ColorOfCasingsAvailableColours crac1 : colorofcasingsAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setColorOfCasings(colorofcasings);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return colorofcasings;
	}

	@Override
	public CrossbarProfile updateCrossbarProfile(CrossbarProfile crossbarprofile) {
		CrossbarProfile crossbarprofiles = (CrossbarProfile) sessionFactory.getCurrentSession()
				.load(CrossbarProfile.class, crossbarprofile.getIdCrossbarProfile());
		crossbarprofiles.setName(crossbarprofile.getName());
		crossbarprofiles.setArtnr(crossbarprofile.getArtnr());

		Set<CrossbbarProfileAvaibleColors> crossbarprofileAvaibleColors = crossbarprofiles
				.getCrossbbarProfileAvaibleColors();
		Set<CrossbbarProfileAvaibleColors> crossbarprofileAvaibleColors2 = crossbarprofile
				.getCrossbbarProfileAvaibleColors();
		for (CrossbbarProfileAvaibleColors crac : crossbarprofileAvaibleColors) {
			for (CrossbbarProfileAvaibleColors crac1 : crossbarprofileAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setCrossbarProfile(crossbarprofile);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return crossbarprofile;
	}

	@Override
	public Extension updateExtension(Extension extension) {
		Extension extensions = (Extension) sessionFactory.getCurrentSession().load(Extension.class,
				extension.getIdExtension());
		extensions.setName(extension.getName());
		extensions.setArtnr(extension.getArtnr());

		Set<ExtensionAvailableColours> extensionAvaibleColors = extensions.getExtensionAvailableColours();
		Set<ExtensionAvailableColours> extensionAvaibleColors2 = extension.getExtensionAvailableColours();
		for (ExtensionAvailableColours crac : extensionAvaibleColors) {
			for (ExtensionAvailableColours crac1 : extensionAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setExtension(extension);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return extension;
	}

	@Override
	public Fittings updateFittings(Fittings fittings) {
		Fittings fittingss = (Fittings) sessionFactory.getCurrentSession().load(Fittings.class,
				fittings.getIdFittings());
		fittingss.setName(fittings.getName());
		fittingss.setArtnr(fittings.getArtnr());

		Set<FittingsAvailableColours> fittingsAvaibleColors = fittingss.getFittingsAvailableColours();
		Set<FittingsAvailableColours> fittingsAvaibleColors2 = fittings.getFittingsAvailableColours();
		for (FittingsAvailableColours crac : fittingsAvaibleColors) {
			for (FittingsAvailableColours crac1 : fittingsAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setFittings(fittings);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return fittings;
	}

	@Override
	public Fulfillment updateFulfillment(Fulfillment fulfillment) {
		Fulfillment fulfillments = (Fulfillment) sessionFactory.getCurrentSession().load(Fulfillment.class,
				fulfillment.getIdFulfillment());
		fulfillments.setName(fulfillment.getName());
		fulfillments.setArtnr(fulfillment.getArtnr());

		Set<FullfillmentAvailableColours> fulfillmentAvaibleColors = fulfillments.getFullfillmentAvailableColours();
		Set<FullfillmentAvailableColours> fulfillmentAvaibleColors2 = fulfillment.getFullfillmentAvailableColours();
		for (FullfillmentAvailableColours crac : fulfillmentAvaibleColors) {
			for (FullfillmentAvailableColours crac1 : fulfillmentAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setFulfillment(fulfillment);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return fulfillment;
	}

	@Override
	public GlazingBead updateGlazingBead(GlazingBead glazingbead) {
		GlazingBead glazingbeads = (GlazingBead) sessionFactory.getCurrentSession().load(GlazingBead.class,
				glazingbead.getIdGlazingBead());
		glazingbeads.setName(glazingbead.getName());
		glazingbeads.setArtnr(glazingbead.getArtnr());

		Set<GlazingBeadsAvailableColours> glazingbeadAvaibleColors = glazingbeads.getGlazingBeadsAvailableColours();
		Set<GlazingBeadsAvailableColours> glazingbeadAvaibleColors2 = glazingbead.getGlazingBeadsAvailableColours();
		for (GlazingBeadsAvailableColours crac : glazingbeadAvaibleColors) {
			for (GlazingBeadsAvailableColours crac1 : glazingbeadAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setGlazingBead(glazingbead);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return glazingbead;
	}

	@Override
	public Handle updateHandle(Handle handle) {
		Handle handles = (Handle) sessionFactory.getCurrentSession().load(Handle.class, handle.getIdHandle());
		handles.setName(handle.getName());
		handles.setArtnr(handle.getArtnr());

		Set<HandlesAvailableColours> handleAvaibleColors = handles.getHandlesAvailableColours();
		Set<HandlesAvailableColours> handleAvaibleColors2 = handle.getHandlesAvailableColours();
		for (HandlesAvailableColours crac : handleAvaibleColors) {
			for (HandlesAvailableColours crac1 : handleAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setHandle(handle);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return handle;
	}

	@Override
	public InterPaneFrame updateInterPaneFrame(InterPaneFrame interpaneframe) {
		InterPaneFrame interpaneframes = (InterPaneFrame) sessionFactory.getCurrentSession().load(InterPaneFrame.class,
				interpaneframe.getIdInterPaneFrame());
		interpaneframes.setName(interpaneframe.getName());
		interpaneframes.setArtnr(interpaneframe.getArtnr());

		Set<InterPaneFramesAvailableColours> interpaneframeAvaibleColors = interpaneframes
				.getInterPaneFramesAvailableColours();
		Set<InterPaneFramesAvailableColours> interpaneframeAvaibleColors2 = interpaneframe
				.getInterPaneFramesAvailableColours();
		for (InterPaneFramesAvailableColours crac : interpaneframeAvaibleColors) {
			for (InterPaneFramesAvailableColours crac1 : interpaneframeAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setInterPaneFrame(interpaneframe);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return interpaneframe;
	}

	@Override
	public MullionPattern updateMullionPattern(MullionPattern mullionpattern) {
		MullionPattern mullionpatterns = (MullionPattern) sessionFactory.getCurrentSession().load(MullionPattern.class,
				mullionpattern.getIdMullionPattern());
		mullionpatterns.setName(mullionpattern.getName());
		mullionpatterns.setArtnr(mullionpattern.getArtnr());

		Set<MullionPatternsAvailableColours> mullionpatternAvaibleColors = mullionpatterns
				.getMullionPatternsAvailableColours();
		Set<MullionPatternsAvailableColours> mullionpatternAvaibleColors2 = mullionpattern
				.getMullionPatternsAvailableColours();
		for (MullionPatternsAvailableColours crac : mullionpatternAvaibleColors) {
			for (MullionPatternsAvailableColours crac1 : mullionpatternAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setMullionPattern(mullionpattern);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return mullionpattern;
	}

	@Override
	public Reed updateReed(Reed reed) {
		Reed reeds = (Reed) sessionFactory.getCurrentSession().load(Reed.class, reed.getIdReed());
		reeds.setName(reed.getName());
		reeds.setArtnr(reed.getArtnr());

		Set<ReedsAvailableColours> reedAvaibleColors = reeds.getReedsAvailableColours();
		Set<ReedsAvailableColours> reedAvaibleColors2 = reed.getReedsAvailableColours();
		for (ReedsAvailableColours crac : reedAvaibleColors) {
			for (ReedsAvailableColours crac1 : reedAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setReed(reed);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return reed;
	}

	@Override
	public Reinforcement updateReinforcement(Reinforcement reinforcement) {
		Reinforcement reinforcements = (Reinforcement) sessionFactory.getCurrentSession().load(Reinforcement.class,
				reinforcement.getIdReinforcement());
		reinforcements.setName(reinforcement.getName());
		reinforcements.setArtnr(reinforcement.getArtnr());

		Set<ReiforcementsAvailableColours> reinforcementAvaibleColors = reinforcements
				.getReiforcementsAvailableColours();
		Set<ReiforcementsAvailableColours> reinforcementAvaibleColors2 = reinforcement
				.getReiforcementsAvailableColours();
		for (ReiforcementsAvailableColours crac : reinforcementAvaibleColors) {
			for (ReiforcementsAvailableColours crac1 : reinforcementAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setReinforcement(reinforcement);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return reinforcement;
	}

	@Override
	public SillStrip updateSillStrip(SillStrip sillstrip) {
		SillStrip sillstrips = (SillStrip) sessionFactory.getCurrentSession().load(SillStrip.class,
				sillstrip.getIdSillStrip());
		sillstrips.setName(sillstrip.getName());
		sillstrips.setArtnr(sillstrip.getArtnr());

		Set<SillStripesAvailableColours> sillstripAvaibleColors = sillstrips.getSillStripesAvailableColours();
		Set<SillStripesAvailableColours> sillstripAvaibleColors2 = sillstrip.getSillStripesAvailableColours();
		for (SillStripesAvailableColours crac : sillstripAvaibleColors) {
			for (SillStripesAvailableColours crac1 : sillstripAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setSillStrip(sillstrip);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return sillstrip;
	}

	@Override
	public SpecialShapes updateSpecialShapes(SpecialShapes specialshapes) {
		SpecialShapes specialshapess = (SpecialShapes) sessionFactory.getCurrentSession().load(SpecialShapes.class,
				specialshapes.getIdSpecialShapes());
		specialshapess.setName(specialshapes.getName());
		specialshapess.setArtnr(specialshapes.getArtnr());

		Set<SpecialShapesAvailableColours> specialshapesAvaibleColors = specialshapess
				.getSpecialShapesAvailableColours();
		Set<SpecialShapesAvailableColours> specialshapesAvaibleColors2 = specialshapes
				.getSpecialShapesAvailableColours();
		for (SpecialShapesAvailableColours crac : specialshapesAvaibleColors) {
			for (SpecialShapesAvailableColours crac1 : specialshapesAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setSpecialShapes(specialshapes);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return specialshapes;
	}

	@Override
	public Threshold updateThreshold(Threshold threshold) {
		Threshold thresholds = (Threshold) sessionFactory.getCurrentSession().load(Threshold.class,
				threshold.getIdThreshold());
		thresholds.setName(threshold.getName());
		thresholds.setArtnr(threshold.getArtnr());

		Set<ThreeSholdsAvailableColours> thresholdAvaibleColors = thresholds.getThreeSholdsAvailableColours();
		Set<ThreeSholdsAvailableColours> thresholdAvaibleColors2 = threshold.getThreeSholdsAvailableColours();
		for (ThreeSholdsAvailableColours crac : thresholdAvaibleColors) {
			for (ThreeSholdsAvailableColours crac1 : thresholdAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setThreshold(threshold);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return threshold;
	}

	@Override
	public TypeOfMullion updateTypeOfMullion(TypeOfMullion typeofmullion) {
		TypeOfMullion typeofmullions = (TypeOfMullion) sessionFactory.getCurrentSession().load(TypeOfMullion.class,
				typeofmullion.getIdTypeOfMullion());
		typeofmullions.setName(typeofmullion.getName());
		typeofmullions.setArtnr(typeofmullion.getArtnr());

		Set<TypesOfMullionsAvailableColours> typeofmullionAvaibleColors = typeofmullions
				.getTypesOfMullionsAvailableColours();
		Set<TypesOfMullionsAvailableColours> typeofmullionAvaibleColors2 = typeofmullion
				.getTypesOfMullionsAvailableColours();
		for (TypesOfMullionsAvailableColours crac : typeofmullionAvaibleColors) {
			for (TypesOfMullionsAvailableColours crac1 : typeofmullionAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setTypeOfMullion(typeofmullion);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return typeofmullion;
	}

	@Override
	public Ventilator updateVentilator(Ventilator ventilator) {
		Ventilator ventilators = (Ventilator) sessionFactory.getCurrentSession().load(Ventilator.class,
				ventilator.getIdVentilator());
		ventilators.setName(ventilator.getName());
		ventilators.setArtnr(ventilator.getArtnr());

		Set<VentilatorsAvailableColours> ventilatorAvaibleColors = ventilators.getVentilatorsAvailableColours();
		Set<VentilatorsAvailableColours> ventilatorAvaibleColors2 = ventilator.getVentilatorsAvailableColours();
		for (VentilatorsAvailableColours crac : ventilatorAvaibleColors) {
			for (VentilatorsAvailableColours crac1 : ventilatorAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setVentilator(ventilator);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return ventilator;
	}

	@Override
	public WingLock updateWingLock(WingLock winglock) {
		WingLock winglocks = (WingLock) sessionFactory.getCurrentSession().load(WingLock.class,
				winglock.getIdWingLock());
		winglocks.setName(winglock.getName());
		winglocks.setArtnr(winglock.getArtnr());

		Set<WingLocksAvailableColours> winglockAvaibleColors = winglocks.getWingLocksAvailableColours();
		Set<WingLocksAvailableColours> winglockAvaibleColors2 = winglock.getWingLocksAvailableColours();
		for (WingLocksAvailableColours crac : winglockAvaibleColors) {
			for (WingLocksAvailableColours crac1 : winglockAvaibleColors2) {
				crac.setArtnr(crac1.getArtnr());
				crac.setWingLock(winglock);
				crac.setName(crac1.getName());

			}

			sessionFactory.getCurrentSession().flush();

		}

		sessionFactory.getCurrentSession().flush();
		return winglock;
	}

	@Override
	public List<BalconyLatch> saveBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch balconylatchs : balconylatch) {
			sessionFactory.getCurrentSession().save(balconylatchs);
		}
		return balconylatch;
	}

	@Override
	public List<BalconyLatchAvailableColours> saveBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours balconylatchavailablecolourss : balconylatchavailablecolours) {
			sessionFactory.getCurrentSession().save(balconylatchavailablecolourss);
		}
		return balconylatchavailablecolours;
	}

	@Override
	public List<Client> saveClient(List<Client> client) {
		for (Client clients : client) {
			sessionFactory.getCurrentSession().save(clients);
		}
		return client;
	}

	@Override
	public List<ColorOfCasings> saveColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings colorofcasingss : colorofcasings) {
			sessionFactory.getCurrentSession().save(colorofcasingss);
		}
		return colorofcasings;
	}

	@Override
	public List<ColorOfCasingsAvailableColours> saveColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours colorofcasingsavailablecolourss : colorofcasingsavailablecolours) {
			sessionFactory.getCurrentSession().save(colorofcasingsavailablecolourss);
		}
		return colorofcasingsavailablecolours;
	}

	@Override
	public List<CrossbarProfile> saveCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile crossbarprofiles : crossbarprofile) {
			sessionFactory.getCurrentSession().save(crossbarprofiles);
		}
		return crossbarprofile;
	}

	@Override
	public List<CrossbbarProfileAvaibleColors> saveCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolorss : crossbbarprofileavaiblecolors) {
			sessionFactory.getCurrentSession().save(crossbbarprofileavaiblecolorss);
		}
		return crossbbarprofileavaiblecolors;
	}

	@Override
	public List<DiffuserColor> saveDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor diffusercolors : diffusercolor) {
			sessionFactory.getCurrentSession().save(diffusercolors);
		}
		return diffusercolor;
	}

	@Override
	public List<DoorHandleColor> saveDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor doorhandlecolors : doorhandlecolor) {
			sessionFactory.getCurrentSession().save(doorhandlecolors);
		}
		return doorhandlecolor;
	}

	@Override
	public List<Extension> saveExtension(List<Extension> extension) {
		for (Extension extensions : extension) {
			sessionFactory.getCurrentSession().save(extensions);
		}
		return extension;
	}

	@Override
	public List<ExtensionAvailableColours> saveExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours extensionavailablecolourss : extensionavailablecolours) {
			sessionFactory.getCurrentSession().save(extensionavailablecolourss);
		}
		return extensionavailablecolours;
	}

	@Override
	public List<ExternalColor> saveExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor externalcolors : externalcolor) {
			sessionFactory.getCurrentSession().save(externalcolors);
		}
		return externalcolor;
	}

	@Override
	public List<Fittings> saveFittings(List<Fittings> fittings) {
		for (Fittings fittingss : fittings) {
			sessionFactory.getCurrentSession().save(fittingss);
		}
		return fittings;
	}

	@Override
	public List<FittingsAvailableColours> saveFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours fittingsavailablecolourss : fittingsavailablecolours) {
			sessionFactory.getCurrentSession().save(fittingsavailablecolourss);
		}
		return fittingsavailablecolours;
	}

	@Override
	public List<FrameColor> saveFrameColor(List<FrameColor> framecolor) {
		for (FrameColor framecolors : framecolor) {
			sessionFactory.getCurrentSession().save(framecolors);
		}
		return framecolor;
	}

	@Override
	public List<Fulfillment> saveFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment fulfillments : fulfillment) {
			sessionFactory.getCurrentSession().save(fulfillments);
		}
		return fulfillment;
	}

	@Override
	public List<FullfillmentAvailableColours> saveFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours fullfillmentavailablecolourss : fullfillmentavailablecolours) {
			sessionFactory.getCurrentSession().save(fullfillmentavailablecolourss);
		}
		return fullfillmentavailablecolours;
	}

	@Override
	public List<GlazingBead> saveGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead glazingbeads : glazingbead) {
			sessionFactory.getCurrentSession().save(glazingbeads);
		}
		return glazingbead;
	}

	@Override
	public List<GlazingBeadsAvailableColours> saveGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours glazingbeadsavailablecolourss : glazingbeadsavailablecolours) {
			sessionFactory.getCurrentSession().save(glazingbeadsavailablecolourss);
		}
		return glazingbeadsavailablecolours;
	}

	@Override
	public List<Handle> saveHandle(List<Handle> handle) {
		for (Handle handles : handle) {
			sessionFactory.getCurrentSession().save(handles);
		}
		return handle;
	}

	@Override
	public List<HandlesAvailableColours> saveHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours handlesavailablecolourss : handlesavailablecolours) {
			sessionFactory.getCurrentSession().save(handlesavailablecolourss);
		}
		return handlesavailablecolours;
	}

	@Override
	public List<InternalColor> saveInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor internalcolors : internalcolor) {
			sessionFactory.getCurrentSession().save(internalcolors);
		}
		return internalcolor;
	}

	@Override
	public List<InterPaneFrame> saveInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame interpaneframes : interpaneframe) {
			sessionFactory.getCurrentSession().save(interpaneframes);
		}
		return interpaneframe;
	}

	@Override
	public List<InterPaneFramesAvailableColours> saveInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours interpaneframesavailablecolourss : interpaneframesavailablecolours) {
			sessionFactory.getCurrentSession().save(interpaneframesavailablecolourss);
		}
		return interpaneframesavailablecolours;
	}

	@Override
	public List<MullionPattern> saveMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern mullionpatterns : mullionpattern) {
			sessionFactory.getCurrentSession().save(mullionpatterns);
		}
		return mullionpattern;
	}

	@Override
	public List<MullionPatternsAvailableColours> saveMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours mullionpatternsavailablecolourss : mullionpatternsavailablecolours) {
			sessionFactory.getCurrentSession().save(mullionpatternsavailablecolourss);
		}
		return mullionpatternsavailablecolours;
	}

	@Override
	public List<OpeningFunctions> saveOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions openingfunctionss : openingfunctions) {
			sessionFactory.getCurrentSession().save(openingfunctionss);
		}
		return openingfunctions;
	}

	@Override
	public List<OpeningFunctionsAvailableColours> saveOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours openingfunctionsavailablecolourss : openingfunctionsavailablecolours) {
			sessionFactory.getCurrentSession().save(openingfunctionsavailablecolourss);
		}
		return openingfunctionsavailablecolours;
	}

	@Override
	public List<Orders> saveOrders(List<Orders> orders) {
		for (Orders orderss : orders) {
			sessionFactory.getCurrentSession().save(orderss);

		}
		return orders;
	}

	@Override
	public List<Reed> saveReed(List<Reed> reed) {
		for (Reed reeds : reed) {
			sessionFactory.getCurrentSession().save(reeds);
		}
		return reed;
	}

	@Override
	public List<ReedsAvailableColours> saveReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours reedsavailablecolourss : reedsavailablecolours) {
			sessionFactory.getCurrentSession().save(reedsavailablecolourss);
		}
		return reedsavailablecolours;
	}

	@Override
	public List<ReiforcementsAvailableColours> saveReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours reiforcementsavailablecolourss : reiforcementsavailablecolours) {
			sessionFactory.getCurrentSession().save(reiforcementsavailablecolourss);
		}
		return reiforcementsavailablecolours;
	}

	@Override
	public List<Reinforcement> saveReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement reinforcements : reinforcement) {
			sessionFactory.getCurrentSession().save(reinforcements);
		}
		return reinforcement;
	}

	@Override
	public List<SillStrip> saveSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip sillstrips : sillstrip) {
			sessionFactory.getCurrentSession().save(sillstrips);
		}
		return sillstrip;
	}

	@Override
	public List<SillStripesAvailableColours> saveSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours sillstripesavailablecolourss : sillstripesavailablecolours) {
			sessionFactory.getCurrentSession().save(sillstripesavailablecolourss);
		}
		return sillstripesavailablecolours;
	}

	@Override
	public List<SpecialShapes> saveSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes specialshapess : specialshapes) {
			sessionFactory.getCurrentSession().save(specialshapess);
		}
		return specialshapes;
	}

	@Override
	public List<SpecialShapesAvailableColours> saveSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours specialshapesavailablecolourss : specialshapesavailablecolours) {
			sessionFactory.getCurrentSession().save(specialshapesavailablecolourss);
		}
		return specialshapesavailablecolours;
	}

	@Override
	public List<ThreeSholdsAvailableColours> saveThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours threesholdsavailablecolourss : threesholdsavailablecolours) {
			sessionFactory.getCurrentSession().save(threesholdsavailablecolourss);
		}
		return threesholdsavailablecolours;
	}

	@Override
	public List<Threshold> saveThreshold(List<Threshold> threshold) {
		for (Threshold thresholds : threshold) {
			sessionFactory.getCurrentSession().save(thresholds);
		}
		return threshold;
	}

	@Override
	public List<TypeOfMullion> saveTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion typeofmullions : typeofmullion) {
			sessionFactory.getCurrentSession().save(typeofmullions);
		}
		return typeofmullion;
	}

	@Override
	public List<TypesOfMullionsAvailableColours> saveTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours typesofmullionsavailablecolourss : typesofmullionsavailablecolours) {
			sessionFactory.getCurrentSession().save(typesofmullionsavailablecolourss);
		}
		return typesofmullionsavailablecolours;
	}

	@Override
	public List<Ventilator> saveVentilator(List<Ventilator> ventilator) {
		for (Ventilator ventilators : ventilator) {
			sessionFactory.getCurrentSession().save(ventilators);
		}
		return ventilator;
	}

	@Override
	public List<VentilatorsAvailableColours> saveVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours ventilatorsavailablecolourss : ventilatorsavailablecolours) {
			sessionFactory.getCurrentSession().save(ventilatorsavailablecolourss);
		}
		return ventilatorsavailablecolours;
	}

	@Override
	public List<Windows> saveWindows(List<Windows> windows) {
		for (Windows windowss : windows) {
			sessionFactory.getCurrentSession().save(windowss);

		}
		return windows;
	}

	@Override
	public List<WingLock> saveWingLock(List<WingLock> winglock) {
		for (WingLock winglocks : winglock) {
			sessionFactory.getCurrentSession().save(winglocks);
		}
		return winglock;
	}

	@Override
	public List<WingLocksAvailableColours> saveWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours winglocksavailablecolourss : winglocksavailablecolours) {
			sessionFactory.getCurrentSession().save(winglocksavailablecolourss);
		}
		return winglocksavailablecolours;
	}

	@Override
	public List<BalconyLatch> updateBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch balconylatchs : balconylatch) {
			BalconyLatch BalconyLatchs = (BalconyLatch) sessionFactory.getCurrentSession().load(BalconyLatch.class,
					balconylatchs.getIdBalconyLatch());
			BalconyLatchs.setArtnr(balconylatchs.getArtnr());
			BalconyLatchs.setName(balconylatchs.getName());

			BalconyLatchs.setBalconyLatchAvailableColours(balconylatchs.getBalconyLatchAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return balconylatch;
	}

	@Override
	public List<ColorOfCasings> updateColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings colorofcasingss : colorofcasings) {
			ColorOfCasings ColorOfCasingss = (ColorOfCasings) sessionFactory.getCurrentSession()
					.load(ColorOfCasings.class, colorofcasingss.getIdColorOfCasings());
			ColorOfCasingss.setArtnr(colorofcasingss.getArtnr());
			ColorOfCasingss.setName(colorofcasingss.getName());

			ColorOfCasingss.setColorOfCasingsAvailableColours(colorofcasingss.getColorOfCasingsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return colorofcasings;
	}

	@Override
	public List<CrossbarProfile> updateCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile crossbarprofiles : crossbarprofile) {
			CrossbarProfile CrossbarProfiles = (CrossbarProfile) sessionFactory.getCurrentSession()
					.load(CrossbarProfile.class, crossbarprofiles.getIdCrossbarProfile());
			CrossbarProfiles.setArtnr(crossbarprofiles.getArtnr());
			CrossbarProfiles.setName(crossbarprofiles.getName());

			CrossbarProfiles.setCrossbbarProfileAvaibleColors(crossbarprofiles.getCrossbbarProfileAvaibleColors());
			sessionFactory.getCurrentSession().flush();
		}

		return crossbarprofile;
	}

	@Override
	public List<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolorss : crossbbarprofileavaiblecolors) {
			CrossbbarProfileAvaibleColors CrossbbarProfileAvaibleColorss = (CrossbbarProfileAvaibleColors) sessionFactory
					.getCurrentSession().load(CrossbbarProfileAvaibleColors.class,
							crossbbarprofileavaiblecolorss.getIdCrossbbarProfileAvaibleColors());
			CrossbbarProfileAvaibleColorss.setArtnr(crossbbarprofileavaiblecolorss.getArtnr());
			CrossbbarProfileAvaibleColorss.setName(crossbbarprofileavaiblecolorss.getName());
			CrossbbarProfileAvaibleColorss.setCrossbarProfile(crossbbarprofileavaiblecolorss.getCrossbarProfile());
			sessionFactory.getCurrentSession().flush();
		}

		return crossbbarprofileavaiblecolors;
	}

	@Override
	public List<DiffuserColor> updateDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor diffusercolors : diffusercolor) {
			DiffuserColor DiffuserColors = (DiffuserColor) sessionFactory.getCurrentSession().load(DiffuserColor.class,
					diffusercolors.getId());
			DiffuserColors.setArtnr(diffusercolors.getArtnr());
			DiffuserColors.setName(diffusercolors.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return diffusercolor;
	}

	@Override
	public List<DoorHandleColor> updateDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor doorhandlecolors : doorhandlecolor) {
			DoorHandleColor DoorHandleColors = (DoorHandleColor) sessionFactory.getCurrentSession()
					.load(DoorHandleColor.class, doorhandlecolors.getId());
			DoorHandleColors.setArtnr(doorhandlecolors.getArtnr());
			DoorHandleColors.setName(doorhandlecolors.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return doorhandlecolor;
	}

	@Override
	public List<Extension> updateExtension(List<Extension> extension) {
		for (Extension extensions : extension) {
			Extension Extensions = (Extension) sessionFactory.getCurrentSession().load(Extension.class,
					extensions.getIdExtension());
			Extensions.setArtnr(extensions.getArtnr());
			Extensions.setName(extensions.getName());

			Extensions.setExtensionAvailableColours(extensions.getExtensionAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return extension;
	}

	@Override
	public List<ExtensionAvailableColours> updateExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours extensionavailablecolourss : extensionavailablecolours) {
			ExtensionAvailableColours ExtensionAvailableColourss = (ExtensionAvailableColours) sessionFactory
					.getCurrentSession()
					.load(ExtensionAvailableColours.class, extensionavailablecolourss.getIdExtensionAvailableColours());
			ExtensionAvailableColourss.setArtnr(extensionavailablecolourss.getArtnr());
			ExtensionAvailableColourss.setName(extensionavailablecolourss.getName());

			ExtensionAvailableColourss.setExtension(extensionavailablecolourss.getExtension());
			sessionFactory.getCurrentSession().flush();
		}

		return extensionavailablecolours;
	}

	@Override
	public List<ExternalColor> updateExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor externalcolors : externalcolor) {
			ExternalColor ExternalColors = (ExternalColor) sessionFactory.getCurrentSession().load(ExternalColor.class,
					externalcolors.getId());
			ExternalColors.setArtnr(externalcolors.getArtnr());
			ExternalColors.setName(externalcolors.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return externalcolor;
	}

	@Override
	public List<Fittings> updateFittings(List<Fittings> fittings) {
		for (Fittings fittingss : fittings) {
			Fittings Fittingss = (Fittings) sessionFactory.getCurrentSession().load(Fittings.class,
					fittingss.getIdFittings());
			Fittingss.setArtnr(fittingss.getArtnr());
			Fittingss.setName(fittingss.getName());

			Fittingss.setFittingsAvailableColours(fittingss.getFittingsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return fittings;
	}

	@Override
	public List<FittingsAvailableColours> updateFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours fittingsavailablecolourss : fittingsavailablecolours) {
			FittingsAvailableColours FittingsAvailableColourss = (FittingsAvailableColours) sessionFactory
					.getCurrentSession()
					.load(FittingsAvailableColours.class, fittingsavailablecolourss.getIdFittingsAvailableColours());
			FittingsAvailableColourss.setArtnr(fittingsavailablecolourss.getArtnr());

			FittingsAvailableColourss.setFittings(fittingsavailablecolourss.getFittings());
			sessionFactory.getCurrentSession().flush();
		}

		return fittingsavailablecolours;
	}

	@Override
	public List<FrameColor> updateFrameColor(List<FrameColor> framecolor) {
		for (FrameColor framecolors : framecolor) {
			FrameColor FrameColors = (FrameColor) sessionFactory.getCurrentSession().load(FrameColor.class,
					framecolors.getId());
			FrameColors.setArtnr(framecolors.getArtnr());
			FrameColors.setName(framecolors.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return framecolor;
	}

	@Override
	public List<Fulfillment> updateFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment fulfillments : fulfillment) {
			Fulfillment Fulfillments = (Fulfillment) sessionFactory.getCurrentSession().load(Fulfillment.class,
					fulfillments.getIdFulfillment());
			Fulfillments.setArtnr(fulfillments.getArtnr());
			Fulfillments.setName(fulfillments.getName());

			Fulfillments.setFullfillmentAvailableColours(fulfillments.getFullfillmentAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return fulfillment;
	}

	@Override
	public List<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours fullfillmentavailablecolourss : fullfillmentavailablecolours) {
			FullfillmentAvailableColours FullfillmentAvailableColourss = (FullfillmentAvailableColours) sessionFactory
					.getCurrentSession().load(FullfillmentAvailableColours.class,
							fullfillmentavailablecolourss.getIdFullfillmentAvailableColours());
			FullfillmentAvailableColourss.setArtnr(fullfillmentavailablecolourss.getArtnr());
			FullfillmentAvailableColourss.setName(fullfillmentavailablecolourss.getName());

			FullfillmentAvailableColourss.setFulfillment(fullfillmentavailablecolourss.getFulfillment());
			sessionFactory.getCurrentSession().flush();
		}

		return fullfillmentavailablecolours;
	}

	@Override
	public List<GlazingBead> updateGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead glazingbeads : glazingbead) {
			GlazingBead GlazingBeads = (GlazingBead) sessionFactory.getCurrentSession().load(GlazingBead.class,
					glazingbeads.getIdGlazingBead());
			GlazingBeads.setArtnr(glazingbeads.getArtnr());
			GlazingBeads.setName(glazingbeads.getName());

			GlazingBeads.setGlazingBeadsAvailableColours(glazingbeads.getGlazingBeadsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return glazingbead;
	}

	@Override
	public List<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours glazingbeadsavailablecolourss : glazingbeadsavailablecolours) {
			GlazingBeadsAvailableColours GlazingBeadsAvailableColourss = (GlazingBeadsAvailableColours) sessionFactory
					.getCurrentSession().load(GlazingBeadsAvailableColours.class,
							glazingbeadsavailablecolourss.getIdGlazingBeadsAvailableColours());
			GlazingBeadsAvailableColourss.setArtnr(glazingbeadsavailablecolourss.getArtnr());
			GlazingBeadsAvailableColourss.setName(glazingbeadsavailablecolourss.getName());
			GlazingBeadsAvailableColourss.setGlazingBead(glazingbeadsavailablecolourss.getGlazingBead());
			sessionFactory.getCurrentSession().flush();
		}

		return glazingbeadsavailablecolours;
	}

	@Override
	public List<Handle> updateHandle(List<Handle> handle) {
		for (Handle handles : handle) {
			Handle Handles = (Handle) sessionFactory.getCurrentSession().load(Handle.class, handles.getIdHandle());
			Handles.setArtnr(handles.getArtnr());
			Handles.setName(handles.getName());

			Handles.setHandlesAvailableColours(handles.getHandlesAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return handle;
	}

	@Override
	public List<HandlesAvailableColours> updateHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours handlesavailablecolourss : handlesavailablecolours) {
			HandlesAvailableColours HandlesAvailableColourss = (HandlesAvailableColours) sessionFactory
					.getCurrentSession()
					.load(HandlesAvailableColours.class, handlesavailablecolourss.getIdHandlesAvailableColours());
			HandlesAvailableColourss.setArtnr(handlesavailablecolourss.getArtnr());
			HandlesAvailableColourss.setName(handlesavailablecolourss.getName());
			HandlesAvailableColourss
					.setIdHandlesAvailableColours(handlesavailablecolourss.getIdHandlesAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return handlesavailablecolours;
	}

	@Override
	public List<InternalColor> updateInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor internalcolors : internalcolor) {
			InternalColor InternalColors = (InternalColor) sessionFactory.getCurrentSession().load(InternalColor.class,
					internalcolors.getId());
			InternalColors.setArtnr(internalcolors.getArtnr());
			InternalColors.setName(internalcolors.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return internalcolor;
	}

	@Override
	public List<InterPaneFrame> updateInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame interpaneframes : interpaneframe) {
			InterPaneFrame InterPaneFrames = (InterPaneFrame) sessionFactory.getCurrentSession()
					.load(InterPaneFrame.class, interpaneframes.getIdInterPaneFrame());
			InterPaneFrames.setArtnr(interpaneframes.getArtnr());
			InterPaneFrames.setName(interpaneframes.getName());

			InterPaneFrames.setInterPaneFramesAvailableColours(interpaneframes.getInterPaneFramesAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return interpaneframe;
	}

	@Override
	public List<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours interpaneframesavailablecolourss : interpaneframesavailablecolours) {
			InterPaneFramesAvailableColours InterPaneFramesAvailableColourss = (InterPaneFramesAvailableColours) sessionFactory
					.getCurrentSession().load(InterPaneFramesAvailableColours.class,
							interpaneframesavailablecolourss.getIdInterPaneFramesAvailableColours());
			InterPaneFramesAvailableColourss.setArtnr(interpaneframesavailablecolourss.getArtnr());
			InterPaneFramesAvailableColourss.setName(interpaneframesavailablecolourss.getName());
			InterPaneFramesAvailableColourss.setInterPaneFrame(interpaneframesavailablecolourss.getInterPaneFrame());
			sessionFactory.getCurrentSession().flush();
		}

		return interpaneframesavailablecolours;
	}

	@Override
	public List<MullionPattern> updateMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern mullionpatterns : mullionpattern) {
			MullionPattern MullionPatterns = (MullionPattern) sessionFactory.getCurrentSession()
					.load(MullionPattern.class, mullionpatterns.getIdMullionPattern());
			MullionPatterns.setArtnr(mullionpatterns.getArtnr());
			MullionPatterns.setName(mullionpatterns.getName());

			MullionPatterns.setMullionPatternsAvailableColours(mullionpatterns.getMullionPatternsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return mullionpattern;
	}

	@Override
	public List<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours mullionpatternsavailablecolourss : mullionpatternsavailablecolours) {
			MullionPatternsAvailableColours MullionPatternsAvailableColourss = (MullionPatternsAvailableColours) sessionFactory
					.getCurrentSession().load(MullionPatternsAvailableColours.class,
							mullionpatternsavailablecolourss.getIdMullionPatternsAvailableColours());
			MullionPatternsAvailableColourss.setArtnr(mullionpatternsavailablecolourss.getArtnr());
			MullionPatternsAvailableColourss.setName(mullionpatternsavailablecolourss.getName());
			MullionPatternsAvailableColourss.setMullionPattern(mullionpatternsavailablecolourss.getMullionPattern());
			sessionFactory.getCurrentSession().flush();
		}

		return mullionpatternsavailablecolours;
	}

	@Override
	public List<OpeningFunctions> updateOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions openingfunctionss : openingfunctions) {
			OpeningFunctions OpeningFunctionss = (OpeningFunctions) sessionFactory.getCurrentSession()
					.load(OpeningFunctions.class, openingfunctionss.getId());

			OpeningFunctionss.setName(openingfunctionss.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return openingfunctions;
	}

	@Override
	public List<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours openingfunctionsavailablecolourss : openingfunctionsavailablecolours) {
			OpeningFunctionsAvailableColours OpeningFunctionsAvailableColourss = (OpeningFunctionsAvailableColours) sessionFactory
					.getCurrentSession()
					.load(OpeningFunctionsAvailableColours.class, openingfunctionsavailablecolourss.getId());
			OpeningFunctionsAvailableColourss.setArtnr(openingfunctionsavailablecolourss.getArtnr());
			OpeningFunctionsAvailableColourss.setName(openingfunctionsavailablecolourss.getName());

			sessionFactory.getCurrentSession().flush();
		}

		return openingfunctionsavailablecolours;
	}

	@Override
	public List<Reed> updateReed(List<Reed> reed) {
		for (Reed reeds : reed) {
			Reed Reeds = (Reed) sessionFactory.getCurrentSession().load(Reed.class, reeds.getIdReed());
			Reeds.setArtnr(reeds.getArtnr());
			Reeds.setName(reeds.getName());

			Reeds.setReedsAvailableColours(reeds.getReedsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return reed;
	}

	@Override
	public List<ReedsAvailableColours> updateReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours reedsavailablecolourss : reedsavailablecolours) {
			ReedsAvailableColours ReedsAvailableColourss = (ReedsAvailableColours) sessionFactory.getCurrentSession()
					.load(ReedsAvailableColours.class, reedsavailablecolourss.getIdReedsAvailableColours());
			ReedsAvailableColourss.setArtnr(reedsavailablecolourss.getArtnr());
			ReedsAvailableColourss.setName(reedsavailablecolourss.getName());
			ReedsAvailableColourss.setReed(reedsavailablecolourss.getReed());
			sessionFactory.getCurrentSession().flush();
		}

		return reedsavailablecolours;
	}

	@Override
	public List<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours reiforcementsavailablecolourss : reiforcementsavailablecolours) {
			ReiforcementsAvailableColours ReiforcementsAvailableColourss = (ReiforcementsAvailableColours) sessionFactory
					.getCurrentSession().load(ReiforcementsAvailableColours.class,
							reiforcementsavailablecolourss.getIdReiforcementsAvailableColours());
			ReiforcementsAvailableColourss.setArtnr(reiforcementsavailablecolourss.getArtnr());
			ReiforcementsAvailableColourss.setName(reiforcementsavailablecolourss.getName());
			ReiforcementsAvailableColourss.setReinforcement(reiforcementsavailablecolourss.getReinforcement());
			sessionFactory.getCurrentSession().flush();
		}

		return reiforcementsavailablecolours;
	}

	@Override
	public List<Reinforcement> updateReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement reinforcements : reinforcement) {
			Reinforcement Reinforcements = (Reinforcement) sessionFactory.getCurrentSession().load(Reinforcement.class,
					reinforcements.getIdReinforcement());
			Reinforcements.setArtnr(reinforcements.getArtnr());
			Reinforcements.setName(reinforcements.getName());

			Reinforcements.setReiforcementsAvailableColours(reinforcements.getReiforcementsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return reinforcement;
	}

	@Override
	public List<SillStrip> updateSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip sillstrips : sillstrip) {
			SillStrip SillStrips = (SillStrip) sessionFactory.getCurrentSession().load(SillStrip.class,
					sillstrips.getIdSillStrip());
			SillStrips.setArtnr(sillstrips.getArtnr());
			SillStrips.setName(sillstrips.getName());

			SillStrips.setSillStripesAvailableColours(sillstrips.getSillStripesAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return sillstrip;
	}

	@Override
	public List<SillStripesAvailableColours> updateSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours sillstripesavailablecolourss : sillstripesavailablecolours) {
			SillStripesAvailableColours SillStripesAvailableColourss = (SillStripesAvailableColours) sessionFactory
					.getCurrentSession().load(SillStripesAvailableColours.class,
							sillstripesavailablecolourss.getIdSillStripesAvailableColours());
			SillStripesAvailableColourss.setArtnr(sillstripesavailablecolourss.getArtnr());
			SillStripesAvailableColourss.setName(sillstripesavailablecolourss.getName());
			SillStripesAvailableColourss.setSillStrip(sillstripesavailablecolourss.getSillStrip());
			sessionFactory.getCurrentSession().flush();
		}

		return sillstripesavailablecolours;
	}

	@Override
	public List<SpecialShapes> updateSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes specialshapess : specialshapes) {
			SpecialShapes SpecialShapess = (SpecialShapes) sessionFactory.getCurrentSession().load(SpecialShapes.class,
					specialshapess.getIdSpecialShapes());
			SpecialShapess.setArtnr(specialshapess.getArtnr());
			SpecialShapess.setName(specialshapess.getName());

			SpecialShapess.setSpecialShapesAvailableColours(specialshapess.getSpecialShapesAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return specialshapes;
	}

	@Override
	public List<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours specialshapesavailablecolourss : specialshapesavailablecolours) {
			SpecialShapesAvailableColours SpecialShapesAvailableColourss = (SpecialShapesAvailableColours) sessionFactory
					.getCurrentSession().load(SpecialShapesAvailableColours.class,
							specialshapesavailablecolourss.getIdSpecialShapesAvailableColours());
			SpecialShapesAvailableColourss.setArtnr(specialshapesavailablecolourss.getArtnr());
			SpecialShapesAvailableColourss.setName(specialshapesavailablecolourss.getName());
			SpecialShapesAvailableColourss.setSpecialShapes(specialshapesavailablecolourss.getSpecialShapes());
			sessionFactory.getCurrentSession().flush();
		}

		return specialshapesavailablecolours;
	}

	@Override
	public List<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours threesholdsavailablecolourss : threesholdsavailablecolours) {
			ThreeSholdsAvailableColours ThreeSholdsAvailableColourss = (ThreeSholdsAvailableColours) sessionFactory
					.getCurrentSession().load(ThreeSholdsAvailableColours.class,
							threesholdsavailablecolourss.getIdThreeSholdsAvailableColours());
			ThreeSholdsAvailableColourss.setArtnr(threesholdsavailablecolourss.getArtnr());
			ThreeSholdsAvailableColourss.setName(threesholdsavailablecolourss.getName());
			ThreeSholdsAvailableColourss.setThreshold(threesholdsavailablecolourss.getThreshold());
			sessionFactory.getCurrentSession().flush();
		}

		return threesholdsavailablecolours;
	}

	@Override
	public List<Threshold> updateThreshold(List<Threshold> threshold) {
		for (Threshold thresholds : threshold) {
			Threshold Thresholds = (Threshold) sessionFactory.getCurrentSession().load(Threshold.class,
					thresholds.getIdThreshold());
			Thresholds.setArtnr(thresholds.getArtnr());
			Thresholds.setName(thresholds.getName());

			Thresholds.setThreeSholdsAvailableColours(thresholds.getThreeSholdsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return threshold;
	}

	@Override
	public List<TypeOfMullion> updateTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion typeofmullions : typeofmullion) {
			TypeOfMullion TypeOfMullions = (TypeOfMullion) sessionFactory.getCurrentSession().load(TypeOfMullion.class,
					typeofmullions.getIdTypeOfMullion());
			TypeOfMullions.setArtnr(typeofmullions.getArtnr());
			TypeOfMullions.setName(typeofmullions.getName());

			TypeOfMullions.setTypesOfMullionsAvailableColours(typeofmullions.getTypesOfMullionsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return typeofmullion;
	}

	@Override
	public List<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours typesofmullionsavailablecolourss : typesofmullionsavailablecolours) {
			TypesOfMullionsAvailableColours TypesOfMullionsAvailableColourss = (TypesOfMullionsAvailableColours) sessionFactory
					.getCurrentSession().load(TypesOfMullionsAvailableColours.class,
							typesofmullionsavailablecolourss.getIdTypesOfMullionsAvailableColours());
			TypesOfMullionsAvailableColourss.setArtnr(typesofmullionsavailablecolourss.getArtnr());
			TypesOfMullionsAvailableColourss.setName(typesofmullionsavailablecolourss.getName());
			TypesOfMullionsAvailableColourss.setTypeOfMullion(typesofmullionsavailablecolourss.getTypeOfMullion());
			sessionFactory.getCurrentSession().flush();
		}

		return typesofmullionsavailablecolours;
	}

	@Override
	public List<Ventilator> updateVentilator(List<Ventilator> ventilator) {
		for (Ventilator ventilators : ventilator) {
			Ventilator Ventilators = (Ventilator) sessionFactory.getCurrentSession().load(Ventilator.class,
					ventilators.getIdVentilator());
			Ventilators.setArtnr(ventilators.getArtnr());
			Ventilators.setName(ventilators.getName());

			Ventilators.setVentilatorsAvailableColours(ventilators.getVentilatorsAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return ventilator;
	}

	@Override
	public List<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours ventilatorsavailablecolourss : ventilatorsavailablecolours) {
			VentilatorsAvailableColours VentilatorsAvailableColourss = (VentilatorsAvailableColours) sessionFactory
					.getCurrentSession().load(VentilatorsAvailableColours.class,
							ventilatorsavailablecolourss.getIdVentilatorsAvailableColours());
			VentilatorsAvailableColourss.setArtnr(ventilatorsavailablecolourss.getArtnr());
			VentilatorsAvailableColourss.setName(ventilatorsavailablecolourss.getName());
			VentilatorsAvailableColourss.setVentilator(ventilatorsavailablecolourss.getVentilator());
			sessionFactory.getCurrentSession().flush();
		}

		return ventilatorsavailablecolours;
	}

	@Override
	public List<WingLock> updateWingLock(List<WingLock> winglock) {
		for (WingLock winglocks : winglock) {
			WingLock WingLocks = (WingLock) sessionFactory.getCurrentSession().load(WingLock.class,
					winglocks.getIdWingLock());
			WingLocks.setArtnr(winglocks.getArtnr());
			WingLocks.setName(winglocks.getName());

			WingLocks.setWingLocksAvailableColours(winglocks.getWingLocksAvailableColours());
			sessionFactory.getCurrentSession().flush();
		}

		return winglock;
	}

	@Override
	public List<WingLocksAvailableColours> updateWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours winglocksavailablecolourss : winglocksavailablecolours) {
			WingLocksAvailableColours WingLocksAvailableColourss = (WingLocksAvailableColours) sessionFactory
					.getCurrentSession()
					.load(WingLocksAvailableColours.class, winglocksavailablecolourss.getIdWingLocksAvailableColours());
			WingLocksAvailableColourss.setArtnr(winglocksavailablecolourss.getArtnr());
			WingLocksAvailableColourss.setName(winglocksavailablecolourss.getName());
			WingLocksAvailableColourss.setWingLock(winglocksavailablecolourss.getWingLock());
			sessionFactory.getCurrentSession().flush();
		}

		return winglocksavailablecolours;
	}

	@Override
	public List<BalconyLatch> delBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch balconylatchs : balconylatch) {
			sessionFactory.getCurrentSession().delete(balconylatchs);

		}
		return balconylatch;
	}

	@Override
	public List<BalconyLatchAvailableColours> delBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours balconylatchavailablecolourss : balconylatchavailablecolours) {
			sessionFactory.getCurrentSession().delete(balconylatchavailablecolourss);

		}
		return balconylatchavailablecolours;
	}

	@Override
	public List<Client> delClient(List<Client> client) {
		for (Client clients : client) {
			sessionFactory.getCurrentSession().delete(clients);

		}
		return client;
	}

	@Override
	public List<ColorOfCasings> delColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings colorofcasingss : colorofcasings) {
			sessionFactory.getCurrentSession().delete(colorofcasingss);

		}
		return colorofcasings;
	}

	@Override
	public List<ColorOfCasingsAvailableColours> delColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours colorofcasingsavailablecolourss : colorofcasingsavailablecolours) {
			sessionFactory.getCurrentSession().delete(colorofcasingsavailablecolourss);

		}
		return colorofcasingsavailablecolours;
	}

	@Override
	public List<CrossbarProfile> delCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile crossbarprofiles : crossbarprofile) {
			sessionFactory.getCurrentSession().delete(crossbarprofiles);

		}
		return crossbarprofile;
	}

	@Override
	public List<CrossbbarProfileAvaibleColors> delCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolorss : crossbbarprofileavaiblecolors) {
			sessionFactory.getCurrentSession().delete(crossbbarprofileavaiblecolorss);

		}
		return crossbbarprofileavaiblecolors;
	}

	@Override
	public List<DiffuserColor> delDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor diffusercolors : diffusercolor) {
			sessionFactory.getCurrentSession().delete(diffusercolors);

		}
		return diffusercolor;
	}

	@Override
	public List<DoorHandleColor> delDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor doorhandlecolors : doorhandlecolor) {
			sessionFactory.getCurrentSession().delete(doorhandlecolors);

		}
		return doorhandlecolor;
	}

	@Override
	public List<Extension> delExtension(List<Extension> extension) {
		for (Extension extensions : extension) {
			sessionFactory.getCurrentSession().delete(extensions);

		}
		return extension;
	}

	@Override
	public List<ExtensionAvailableColours> delExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours extensionavailablecolourss : extensionavailablecolours) {
			sessionFactory.getCurrentSession().delete(extensionavailablecolourss);

		}
		return extensionavailablecolours;
	}

	@Override
	public List<ExternalColor> delExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor externalcolors : externalcolor) {
			sessionFactory.getCurrentSession().delete(externalcolors);

		}
		return externalcolor;
	}

	@Override
	public List<Fittings> delFittings(List<Fittings> fittings) {
		for (Fittings fittingss : fittings) {
			sessionFactory.getCurrentSession().delete(fittingss);

		}
		return fittings;
	}

	@Override
	public List<FittingsAvailableColours> delFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours fittingsavailablecolourss : fittingsavailablecolours) {
			sessionFactory.getCurrentSession().delete(fittingsavailablecolourss);

		}
		return fittingsavailablecolours;
	}

	@Override
	public List<FrameColor> delFrameColor(List<FrameColor> framecolor) {
		for (FrameColor framecolors : framecolor) {
			sessionFactory.getCurrentSession().delete(framecolors);

		}
		return framecolor;
	}

	@Override
	public List<Fulfillment> delFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment fulfillments : fulfillment) {
			sessionFactory.getCurrentSession().delete(fulfillments);

		}
		return fulfillment;
	}

	@Override
	public List<FullfillmentAvailableColours> delFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours fullfillmentavailablecolourss : fullfillmentavailablecolours) {
			sessionFactory.getCurrentSession().delete(fullfillmentavailablecolourss);

		}
		return fullfillmentavailablecolours;
	}

	@Override
	public List<GlazingBead> delGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead glazingbeads : glazingbead) {
			sessionFactory.getCurrentSession().delete(glazingbeads);

		}
		return glazingbead;
	}

	@Override
	public List<GlazingBeadsAvailableColours> delGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours glazingbeadsavailablecolourss : glazingbeadsavailablecolours) {
			sessionFactory.getCurrentSession().delete(glazingbeadsavailablecolourss);

		}
		return glazingbeadsavailablecolours;
	}

	@Override
	public List<Handle> delHandle(List<Handle> handle) {
		for (Handle handles : handle) {
			sessionFactory.getCurrentSession().delete(handles);

		}
		return handle;
	}

	@Override
	public List<HandlesAvailableColours> delHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours handlesavailablecolourss : handlesavailablecolours) {
			sessionFactory.getCurrentSession().delete(handlesavailablecolourss);

		}
		return handlesavailablecolours;
	}

	@Override
	public List<InternalColor> delInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor internalcolors : internalcolor) {
			sessionFactory.getCurrentSession().delete(internalcolors);

		}
		return internalcolor;
	}

	@Override
	public List<InterPaneFrame> delInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame interpaneframes : interpaneframe) {
			sessionFactory.getCurrentSession().delete(interpaneframes);

		}
		return interpaneframe;
	}

	@Override
	public List<InterPaneFramesAvailableColours> delInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours interpaneframesavailablecolourss : interpaneframesavailablecolours) {
			sessionFactory.getCurrentSession().delete(interpaneframesavailablecolourss);

		}
		return interpaneframesavailablecolours;
	}

	@Override
	public List<MullionPattern> delMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern mullionpatterns : mullionpattern) {
			sessionFactory.getCurrentSession().delete(mullionpatterns);

		}
		return mullionpattern;
	}

	@Override
	public List<MullionPatternsAvailableColours> delMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours mullionpatternsavailablecolourss : mullionpatternsavailablecolours) {
			sessionFactory.getCurrentSession().delete(mullionpatternsavailablecolourss);

		}
		return mullionpatternsavailablecolours;
	}

	@Override
	public List<OpeningFunctions> delOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions openingfunctionss : openingfunctions) {
			sessionFactory.getCurrentSession().delete(openingfunctionss);

		}
		return openingfunctions;
	}

	@Override
	public List<OpeningFunctionsAvailableColours> delOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours openingfunctionsavailablecolourss : openingfunctionsavailablecolours) {
			sessionFactory.getCurrentSession().delete(openingfunctionsavailablecolourss);

		}
		return openingfunctionsavailablecolours;
	}

	@Override
	public List<Orders> delOrders(List<Orders> orders) {
		for (Orders orderss : orders) {
			sessionFactory.getCurrentSession().delete(orderss);

		}
		return orders;
	}

	@Override
	public List<Reed> delReed(List<Reed> reed) {
		for (Reed reeds : reed) {
			sessionFactory.getCurrentSession().delete(reeds);

		}
		return reed;
	}

	@Override
	public List<ReedsAvailableColours> delReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours reedsavailablecolourss : reedsavailablecolours) {
			sessionFactory.getCurrentSession().delete(reedsavailablecolourss);

		}
		return reedsavailablecolours;
	}

	@Override
	public List<ReiforcementsAvailableColours> delReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours reiforcementsavailablecolourss : reiforcementsavailablecolours) {
			sessionFactory.getCurrentSession().delete(reiforcementsavailablecolourss);

		}
		return reiforcementsavailablecolours;
	}

	@Override
	public List<Reinforcement> delReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement reinforcements : reinforcement) {
			sessionFactory.getCurrentSession().delete(reinforcements);

		}
		return reinforcement;
	}

	@Override
	public List<SillStrip> delSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip sillstrips : sillstrip) {
			sessionFactory.getCurrentSession().delete(sillstrips);

		}
		return sillstrip;
	}

	@Override
	public List<SillStripesAvailableColours> delSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours sillstripesavailablecolourss : sillstripesavailablecolours) {
			sessionFactory.getCurrentSession().delete(sillstripesavailablecolourss);

		}
		return sillstripesavailablecolours;
	}

	@Override
	public List<SpecialShapes> delSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes specialshapess : specialshapes) {
			sessionFactory.getCurrentSession().delete(specialshapess);

		}
		return specialshapes;
	}

	@Override
	public List<SpecialShapesAvailableColours> delSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours specialshapesavailablecolourss : specialshapesavailablecolours) {
			sessionFactory.getCurrentSession().delete(specialshapesavailablecolourss);

		}
		return specialshapesavailablecolours;
	}

	@Override
	public List<ThreeSholdsAvailableColours> delThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours threesholdsavailablecolourss : threesholdsavailablecolours) {
			sessionFactory.getCurrentSession().delete(threesholdsavailablecolourss);

		}
		return threesholdsavailablecolours;
	}

	@Override
	public List<Threshold> delThreshold(List<Threshold> threshold) {
		for (Threshold thresholds : threshold) {
			sessionFactory.getCurrentSession().delete(thresholds);

		}
		return threshold;
	}

	@Override
	public List<TypeOfMullion> delTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion typeofmullions : typeofmullion) {
			sessionFactory.getCurrentSession().delete(typeofmullions);

		}
		return typeofmullion;
	}

	@Override
	public List<TypesOfMullionsAvailableColours> delTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours typesofmullionsavailablecolourss : typesofmullionsavailablecolours) {
			sessionFactory.getCurrentSession().delete(typesofmullionsavailablecolourss);

		}
		return typesofmullionsavailablecolours;
	}

	@Override
	public List<Ventilator> delVentilator(List<Ventilator> ventilator) {
		for (Ventilator ventilators : ventilator) {
			sessionFactory.getCurrentSession().delete(ventilators);

		}
		return ventilator;
	}

	@Override
	public List<VentilatorsAvailableColours> delVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours ventilatorsavailablecolourss : ventilatorsavailablecolours) {
			sessionFactory.getCurrentSession().delete(ventilatorsavailablecolourss);

		}
		return ventilatorsavailablecolours;
	}

	@Override
	public List<Windows> delWindows(List<Windows> windows) {
		for (Windows windowss : windows) {
			sessionFactory.getCurrentSession().delete(windowss);

		}
		return windows;
	}

	@Override
	public List<WingLock> delWingLock(List<WingLock> winglock) {
		for (WingLock winglocks : winglock) {
			sessionFactory.getCurrentSession().delete(winglocks);

		}
		return winglock;
	}

	@Override
	public List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours winglocksavailablecolourss : winglocksavailablecolours) {
			sessionFactory.getCurrentSession().delete(winglocksavailablecolourss);

		}
		return winglocksavailablecolours;
	}

	@Override
	public BalconyLatchAvailableColours updateBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		BalconyLatchAvailableColours balconylatchavailablecolourss = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().load(BalconyLatchAvailableColours.class,
						balconylatchavailablecolours.getIdBalconyLatchAvailableColours());
		balconylatchavailablecolourss.setArtnr(balconylatchavailablecolours.getArtnr());
		balconylatchavailablecolourss.setName(balconylatchavailablecolours.getName());
		balconylatchavailablecolourss.setBalconyLatch(balconylatchavailablecolours.getBalconyLatch());
		sessionFactory.getCurrentSession().flush();

		return balconylatchavailablecolours;
	}

	@Override
	public ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolourss = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().load(ColorOfCasingsAvailableColours.class,
						colorofcasingsavailablecolours.getIdColorOfCasingsAvailableColours());
		colorofcasingsavailablecolourss.setArtnr(colorofcasingsavailablecolours.getArtnr());
		colorofcasingsavailablecolourss.setName(colorofcasingsavailablecolours.getName());
		colorofcasingsavailablecolourss.setColorOfCasings(colorofcasingsavailablecolours.getColorOfCasings());
		sessionFactory.getCurrentSession().flush();

		return colorofcasingsavailablecolours;
	}

	@Override
	public CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolorss = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().load(CrossbbarProfileAvaibleColors.class,
						crossbbarprofileavaiblecolors.getIdCrossbbarProfileAvaibleColors());
		crossbbarprofileavaiblecolorss.setArtnr(crossbbarprofileavaiblecolors.getArtnr());
		crossbbarprofileavaiblecolorss.setName(crossbbarprofileavaiblecolors.getName());
		crossbbarprofileavaiblecolorss.setCrossbarProfile(crossbbarprofileavaiblecolors.getCrossbarProfile());
		sessionFactory.getCurrentSession().flush();

		return crossbbarprofileavaiblecolors;
	}

	@Override
	public DiffuserColor updateDiffuserColor(DiffuserColor diffusercolor) {
		DiffuserColor diffusercolors = (DiffuserColor) sessionFactory.getCurrentSession().load(DiffuserColor.class,
				diffusercolor.getId());
		diffusercolors.setArtnr(diffusercolor.getArtnr());
		diffusercolors.setName(diffusercolor.getName());

		sessionFactory.getCurrentSession().flush();

		return diffusercolor;
	}

	@Override
	public DoorHandleColor updateDoorHandleColor(DoorHandleColor doorhandlecolor) {
		DoorHandleColor doorhandlecolors = (DoorHandleColor) sessionFactory.getCurrentSession()
				.load(DoorHandleColor.class, doorhandlecolor.getId());
		doorhandlecolors.setArtnr(doorhandlecolor.getArtnr());
		doorhandlecolors.setName(doorhandlecolor.getName());

		sessionFactory.getCurrentSession().flush();

		return doorhandlecolor;
	}

	@Override
	public ExtensionAvailableColours updateExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		ExtensionAvailableColours extensionavailablecolourss = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession()
				.load(ExtensionAvailableColours.class, extensionavailablecolours.getIdExtensionAvailableColours());
		extensionavailablecolourss.setArtnr(extensionavailablecolours.getArtnr());
		extensionavailablecolourss.setName(extensionavailablecolours.getName());
		extensionavailablecolourss.setExtension(extensionavailablecolours.getExtension());
		sessionFactory.getCurrentSession().flush();

		return extensionavailablecolours;
	}

	@Override
	public ExternalColor updateExternalColor(ExternalColor externalcolor) {
		ExternalColor externalcolors = (ExternalColor) sessionFactory.getCurrentSession().load(ExternalColor.class,
				externalcolor.getId());
		externalcolors.setArtnr(externalcolor.getArtnr());
		externalcolors.setName(externalcolor.getName());

		sessionFactory.getCurrentSession().flush();

		return externalcolor;
	}

	@Override
	public FittingsAvailableColours updateFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		FittingsAvailableColours fittingsavailablecolourss = (FittingsAvailableColours) sessionFactory
				.getCurrentSession()
				.load(FittingsAvailableColours.class, fittingsavailablecolours.getIdFittingsAvailableColours());
		fittingsavailablecolourss.setArtnr(fittingsavailablecolours.getArtnr());
		fittingsavailablecolourss.setName(fittingsavailablecolours.getName());
		fittingsavailablecolourss.setFittings(fittingsavailablecolours.getFittings());
		sessionFactory.getCurrentSession().flush();

		return fittingsavailablecolours;
	}

	@Override
	public FrameColor updateFrameColor(FrameColor framecolor) {
		FrameColor framecolors = (FrameColor) sessionFactory.getCurrentSession().load(FrameColor.class,
				framecolor.getId());
		framecolors.setArtnr(framecolor.getArtnr());
		framecolors.setName(framecolor.getName());

		sessionFactory.getCurrentSession().flush();

		return framecolor;
	}

	@Override
	public FullfillmentAvailableColours updateFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		FullfillmentAvailableColours fullfillmentavailablecolourss = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().load(FullfillmentAvailableColours.class,
						fullfillmentavailablecolours.getIdFullfillmentAvailableColours());
		fullfillmentavailablecolourss.setArtnr(fullfillmentavailablecolours.getArtnr());
		fullfillmentavailablecolourss.setName(fullfillmentavailablecolours.getName());
		fullfillmentavailablecolourss.setFulfillment(fullfillmentavailablecolours.getFulfillment());
		sessionFactory.getCurrentSession().flush();

		return fullfillmentavailablecolours;
	}

	@Override
	public GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolourss = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().load(GlazingBeadsAvailableColours.class,
						glazingbeadsavailablecolours.getIdGlazingBeadsAvailableColours());
		glazingbeadsavailablecolourss.setArtnr(glazingbeadsavailablecolours.getArtnr());
		glazingbeadsavailablecolourss.setName(glazingbeadsavailablecolours.getName());
		glazingbeadsavailablecolourss.setGlazingBead(glazingbeadsavailablecolours.getGlazingBead());
		sessionFactory.getCurrentSession().flush();

		return glazingbeadsavailablecolours;
	}

	@Override
	public HandlesAvailableColours updateHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		HandlesAvailableColours handlesavailablecolourss = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.load(HandlesAvailableColours.class, handlesavailablecolours.getIdHandlesAvailableColours());
		handlesavailablecolourss.setArtnr(handlesavailablecolours.getArtnr());
		handlesavailablecolourss.setName(handlesavailablecolours.getName());
		handlesavailablecolourss.setHandle(handlesavailablecolours.getHandle());
		sessionFactory.getCurrentSession().flush();

		return handlesavailablecolours;
	}

	@Override
	public InternalColor updateInternalColor(InternalColor internalcolor) {
		InternalColor internalcolors = (InternalColor) sessionFactory.getCurrentSession().load(InternalColor.class,
				internalcolor.getId());
		internalcolors.setArtnr(internalcolor.getArtnr());
		internalcolors.setName(internalcolor.getName());

		sessionFactory.getCurrentSession().flush();

		return internalcolor;
	}

	@Override
	public InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		InterPaneFramesAvailableColours interpaneframesavailablecolourss = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().load(InterPaneFramesAvailableColours.class,
						interpaneframesavailablecolours.getIdInterPaneFramesAvailableColours());
		interpaneframesavailablecolourss.setArtnr(interpaneframesavailablecolours.getArtnr());
		interpaneframesavailablecolourss.setName(interpaneframesavailablecolours.getName());
		interpaneframesavailablecolourss.setInterPaneFrame(interpaneframesavailablecolours.getInterPaneFrame());
		sessionFactory.getCurrentSession().flush();

		return interpaneframesavailablecolours;
	}

	@Override
	public MullionPatternsAvailableColours updateMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		MullionPatternsAvailableColours mullionpatternsavailablecolourss = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().load(MullionPatternsAvailableColours.class,
						mullionpatternsavailablecolours.getIdMullionPatternsAvailableColours());
		mullionpatternsavailablecolourss.setArtnr(mullionpatternsavailablecolours.getArtnr());
		mullionpatternsavailablecolourss.setName(mullionpatternsavailablecolours.getName());
		mullionpatternsavailablecolourss.setMullionPattern(mullionpatternsavailablecolours.getMullionPattern());
		sessionFactory.getCurrentSession().flush();

		return mullionpatternsavailablecolours;
	}

	@Override
	public OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolourss = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession()
				.load(OpeningFunctionsAvailableColours.class, openingfunctionsavailablecolours.getId());
		openingfunctionsavailablecolourss.setArtnr(openingfunctionsavailablecolours.getArtnr());
		openingfunctionsavailablecolourss.setName(openingfunctionsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return openingfunctionsavailablecolours;
	}

	@Override
	public ReedsAvailableColours updateReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		ReedsAvailableColours reedsavailablecolourss = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.load(ReedsAvailableColours.class, reedsavailablecolours.getIdReedsAvailableColours());
		reedsavailablecolourss.setArtnr(reedsavailablecolours.getArtnr());
		reedsavailablecolourss.setName(reedsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return reedsavailablecolours;
	}

	@Override
	public ReiforcementsAvailableColours updateReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		ReiforcementsAvailableColours reiforcementsavailablecolourss = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().load(ReiforcementsAvailableColours.class,
						reiforcementsavailablecolours.getIdReiforcementsAvailableColours());
		reiforcementsavailablecolourss.setArtnr(reiforcementsavailablecolours.getArtnr());
		reiforcementsavailablecolourss.setName(reiforcementsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return reiforcementsavailablecolours;
	}

	@Override
	public SillStripesAvailableColours updateSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		SillStripesAvailableColours sillstripesavailablecolourss = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().load(SillStripesAvailableColours.class,
						sillstripesavailablecolours.getIdSillStripesAvailableColours());
		sillstripesavailablecolourss.setArtnr(sillstripesavailablecolours.getArtnr());
		sillstripesavailablecolourss.setName(sillstripesavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return sillstripesavailablecolours;
	}

	@Override
	public SpecialShapesAvailableColours updateSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		SpecialShapesAvailableColours specialshapesavailablecolourss = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().load(SpecialShapesAvailableColours.class,
						specialshapesavailablecolours.getIdSpecialShapesAvailableColours());
		specialshapesavailablecolourss.setArtnr(specialshapesavailablecolours.getArtnr());
		specialshapesavailablecolourss.setName(specialshapesavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return specialshapesavailablecolours;
	}

	@Override
	public ThreeSholdsAvailableColours updateThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		ThreeSholdsAvailableColours threesholdsavailablecolourss = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().load(ThreeSholdsAvailableColours.class,
						threesholdsavailablecolours.getIdThreeSholdsAvailableColours());
		threesholdsavailablecolourss.setArtnr(threesholdsavailablecolours.getArtnr());
		threesholdsavailablecolourss.setName(threesholdsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return threesholdsavailablecolours;
	}

	@Override
	public TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolourss = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().load(TypesOfMullionsAvailableColours.class,
						typesofmullionsavailablecolours.getIdTypesOfMullionsAvailableColours());
		typesofmullionsavailablecolourss.setArtnr(typesofmullionsavailablecolours.getArtnr());
		typesofmullionsavailablecolourss.setName(typesofmullionsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return typesofmullionsavailablecolours;
	}

	@Override
	public VentilatorsAvailableColours updateVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		VentilatorsAvailableColours ventilatorsavailablecolourss = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().load(VentilatorsAvailableColours.class,
						ventilatorsavailablecolours.getIdVentilatorsAvailableColours());
		ventilatorsavailablecolourss.setArtnr(ventilatorsavailablecolours.getArtnr());
		ventilatorsavailablecolourss.setName(ventilatorsavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return ventilatorsavailablecolours;
	}

	@Override
	public WingLocksAvailableColours updateWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		WingLocksAvailableColours winglocksavailablecolourss = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession()
				.load(WingLocksAvailableColours.class, winglocksavailablecolours.getIdWingLocksAvailableColours());
		winglocksavailablecolourss.setArtnr(winglocksavailablecolours.getArtnr());
		winglocksavailablecolourss.setName(winglocksavailablecolours.getName());

		sessionFactory.getCurrentSession().flush();

		return winglocksavailablecolours;
	}

	@Override
	public List<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours balconylatchavailablecolourss : balconylatchavailablecolours) {

			BalconyLatchAvailableColours balconylatchavailablecolourse = (BalconyLatchAvailableColours) sessionFactory
					.getCurrentSession().load(BalconyLatchAvailableColours.class,
							balconylatchavailablecolourss.getIdBalconyLatchAvailableColours());
			balconylatchavailablecolourse.setArtnr(balconylatchavailablecolourss.getArtnr());
			balconylatchavailablecolourse.setName(balconylatchavailablecolourss.getName());
			balconylatchavailablecolourse.setBalconyLatch(balconylatchavailablecolourss.getBalconyLatch());
		}

		return balconylatchavailablecolours;
	}

	@Override
	public List<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours colorofcasingsavailablecolourss : colorofcasingsavailablecolours) {

			ColorOfCasingsAvailableColours colorofcasingsavailablecolourse = (ColorOfCasingsAvailableColours) sessionFactory
					.getCurrentSession().load(ColorOfCasingsAvailableColours.class,
							colorofcasingsavailablecolourss.getIdColorOfCasingsAvailableColours());
			colorofcasingsavailablecolourse.setArtnr(colorofcasingsavailablecolourss.getArtnr());
			colorofcasingsavailablecolourse.setName(colorofcasingsavailablecolourss.getName());
			colorofcasingsavailablecolourse.setColorOfCasings(colorofcasingsavailablecolourss.getColorOfCasings());
		}

		return colorofcasingsavailablecolours;
	}

	@Override
	public BalconyLatchAvailableColours saveBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		sessionFactory.getCurrentSession().saveOrUpdate(balconylatchavailablecolours);
		return null;
	}

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> updateClient(List<Client> client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExtensionAvailableColours saveExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		sessionFactory.getCurrentSession().save(extensionavailablecolours);
		return extensionavailablecolours;
	}

	@Override
	public ExternalColor saveExternalColor(ExternalColor externalcolor) {
		sessionFactory.getCurrentSession().save(externalcolor);
		return externalcolor;
	}

	@Override
	public FittingsAvailableColours saveFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		sessionFactory.getCurrentSession().save(fittingsavailablecolours);
		return fittingsavailablecolours;
	}

	@Override
	public FrameColor saveFrameColor(FrameColor framecolor) {
		sessionFactory.getCurrentSession().save(framecolor);
		return framecolor;
	}

	@Override
	public FullfillmentAvailableColours saveFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		sessionFactory.getCurrentSession().save(fullfillmentavailablecolours);
		return fullfillmentavailablecolours;
	}

	@Override
	public GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		sessionFactory.getCurrentSession().save(glazingbeadsavailablecolours);
		return glazingbeadsavailablecolours;
	}

	@Override
	public HandlesAvailableColours saveHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		sessionFactory.getCurrentSession().save(handlesavailablecolours);
		return handlesavailablecolours;
	}

	@Override
	public InternalColor saveInternalColor(InternalColor internalcolor) {
		sessionFactory.getCurrentSession().save(internalcolor);
		return internalcolor;
	}

	@Override
	public InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		sessionFactory.getCurrentSession().save(interpaneframesavailablecolours);
		return interpaneframesavailablecolours;
	}

	@Override
	public MullionPatternsAvailableColours saveMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		sessionFactory.getCurrentSession().save(mullionpatternsavailablecolours);
		return mullionpatternsavailablecolours;
	}

	@Override
	public OpeningFunctions saveOpeningFunctions(OpeningFunctions openingfunctions) {
		sessionFactory.getCurrentSession().save(openingfunctions);
		return openingfunctions;
	}

	@Override
	public OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		sessionFactory.getCurrentSession().save(openingfunctionsavailablecolours);
		return openingfunctionsavailablecolours;
	}

	@Override
	public Orders saveOrders(Orders orders) {
		Client client = orders.getClient();
		sessionFactory.getCurrentSession().save(client);
		sessionFactory.getCurrentSession().save(orders);
		Set<Windows> windows = orders.getWindows();
		for (Windows win1 : windows) {
			Windows win = new Windows();
			win.setBalconyLatch(win1.getBalconyLatch());
			win.setColorOfCasings(win1.getColorOfCasings());
			win.setCrossbarProfile(win1.getCrossbarProfile());
			win.setDoorHandleColor(win1.getDoorHandleColor());
			win.setDiffuserColor(win1.getDiffuserColor());
			win.setExtension(win1.getExtension());
			win.setExternalColor(win1.getExternalColor());
			win.setFittings(win1.getFittings());
			win.setFrameColor(win1.getFrameColor());
			win.setFulfillment(win1.getFulfillment());
			win.setGlazingBead(win1.getGlazingBead());
			win.setGrossPrice(win1.getGrossPrice());
			win.setHandle(win1.getHandle());
			win.setHeight(win1.getHeight());
			win.setInternalColor(win1.getInternalColor());
			win.setInterPaneFrame(win1.getInterPaneFrame());
			win.setMullionPattern(win1.getMullionPattern());
			win.setNetPrice(win1.getNetPrice());
			win.setOpeningFunctions(win1.getOpeningFunctions());
			win.setProfile_type(win1.getProfile_type());
			win.setReed(win1.getReed());
			win.setReinforcement(win1.getReinforcement());
			win.setSillStrip(win1.getSillStrip());
			win.setSpecialShapes(win1.getSpecialShapes());
			win.setThreshold(win1.getThreshold());
			win.setTypeOfMullion(win1.getTypeOfMullion());
			win.setVentilator(win1.getVentilator());
			win.setWidth(win1.getWidth());
			win.setWindow_type(win1.getWindow_type());
			win.setWingLock(win1.getWingLock());
			win.setOrders(orders);
			sessionFactory.getCurrentSession().saveOrUpdate(win);
		}

		return orders;
	}

	@Override
	public ReedsAvailableColours saveReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		sessionFactory.getCurrentSession().save(reedsavailablecolours);
		return reedsavailablecolours;
	}

	@Override
	public ReiforcementsAvailableColours saveReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		sessionFactory.getCurrentSession().save(reiforcementsavailablecolours);
		return reiforcementsavailablecolours;
	}

	@Override
	public SillStripesAvailableColours saveSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		sessionFactory.getCurrentSession().save(sillstripesavailablecolours);
		return sillstripesavailablecolours;
	}

	@Override
	public SpecialShapesAvailableColours saveSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		sessionFactory.getCurrentSession().save(specialshapesavailablecolours);
		return specialshapesavailablecolours;
	}

	@Override
	public ThreeSholdsAvailableColours saveThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		sessionFactory.getCurrentSession().save(threesholdsavailablecolours);
		return threesholdsavailablecolours;
	}

	@Override
	public TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		sessionFactory.getCurrentSession().save(typesofmullionsavailablecolours);
		return typesofmullionsavailablecolours;
	}

	@Override
	public VentilatorsAvailableColours saveVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		sessionFactory.getCurrentSession().save(ventilatorsavailablecolours);
		return ventilatorsavailablecolours;
	}

	@Override
	public Windows saveWindows(Windows windows) {
		sessionFactory.getCurrentSession().save(windows);

		return windows;
	}

	@Override
	public WingLocksAvailableColours saveWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		sessionFactory.getCurrentSession().save(winglocksavailablecolours);
		return winglocksavailablecolours;
	}

	@Override
	public ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		sessionFactory.getCurrentSession().save(colorofcasingsavailablecolours);
		return null;
	}

	@Override
	public CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		sessionFactory.getCurrentSession().save(crossbbarprofileavaiblecolors);
		return null;
	}

	@Override
	public DiffuserColor saveDiffuserColor(DiffuserColor diffusercolor) {
		sessionFactory.getCurrentSession().save(diffusercolor);
		return null;
	}

	@Override
	public DoorHandleColor saveDoorHandleColor(DoorHandleColor doorhandlecolor) {
		sessionFactory.getCurrentSession().save(doorhandlecolor);
		return null;
	}

	@Override
	public OpeningFunctions updateOpeningFunctions(OpeningFunctions openingfunctions) {
		OpeningFunctions op = (OpeningFunctions) sessionFactory.getCurrentSession().load(OpeningFunctions.class,
				openingfunctions.getId());
		op.setName(openingfunctions.getName());
		sessionFactory.getCurrentSession().flush();
		return null;
	}

	@Override
	public Orders updateOrders(Orders orders) {
		Orders or = (Orders) sessionFactory.getCurrentSession().load(Orders.class, orders.getId_order());
		or.setClient(orders.getClient());
		or.setGrossPrice(orders.getGrossPrice());
		or.setNetPrice(orders.getNetPrice());
		or.setOrderNumber(orders.getOrderNumber());
		or.setWindows(orders.getWindows());
		return null;
	}

	@Override
	public List<Orders> updateOrders(List<Orders> orders) {
		for (Orders or : orders) {
			Orders or1 = (Orders) sessionFactory.getCurrentSession().load(Orders.class, or.getId_order());
			or1.setClient(or.getClient());
			or1.setGrossPrice(or.getGrossPrice());
			or1.setNetPrice(or.getNetPrice());
			or1.setOrderNumber(or.getOrderNumber());
			or1.setWindows(or.getWindows());
			sessionFactory.getCurrentSession().flush();

		}

		return null;
	}

	@Override
	public Windows updateWindows(Windows windows) {
		Windows win = (Windows) sessionFactory.getCurrentSession().load(Windows.class, windows.getId_window());
		win.setBalconyLatch(windows.getBalconyLatch());
		win.setColorOfCasings(windows.getColorOfCasings());
		win.setCrossbarProfile(windows.getCrossbarProfile());
		win.setDoorHandleColor(windows.getDoorHandleColor());
		win.setDiffuserColor(windows.getDiffuserColor());
		win.setExtension(windows.getExtension());
		win.setExternalColor(windows.getExternalColor());
		win.setFittings(windows.getFittings());
		win.setFrameColor(windows.getFrameColor());
		win.setFulfillment(windows.getFulfillment());
		win.setGlazingBead(windows.getGlazingBead());
		win.setGrossPrice(windows.getGrossPrice());
		win.setHandle(windows.getHandle());
		win.setHeight(windows.getHeight());
		win.setInternalColor(windows.getInternalColor());
		win.setInterPaneFrame(windows.getInterPaneFrame());
		win.setMullionPattern(windows.getMullionPattern());
		win.setNetPrice(windows.getNetPrice());
		win.setOpeningFunctions(windows.getOpeningFunctions());
		win.setProfile_type(windows.getProfile_type());
		win.setReed(windows.getReed());
		win.setReinforcement(windows.getReinforcement());
		win.setSillStrip(windows.getSillStrip());
		win.setSpecialShapes(windows.getSpecialShapes());
		win.setThreshold(windows.getThreshold());
		win.setTypeOfMullion(windows.getTypeOfMullion());
		win.setVentilator(windows.getVentilator());
		win.setWidth(windows.getWidth());
		win.setWindow_type(windows.getWindow_type());
		win.setWingLock(windows.getWingLock());
		win.setOrders(windows.getOrders());
		sessionFactory.getCurrentSession().flush();

		return null;
	}

	@Override
	public List<Windows> updateWindows(List<Windows> windows) {
		for (Windows windows1 : windows) {
			Windows win = (Windows) sessionFactory.getCurrentSession().load(Windows.class, windows1.getId_window());
			win.setBalconyLatch(windows1.getBalconyLatch());
			win.setColorOfCasings(windows1.getColorOfCasings());
			win.setCrossbarProfile(windows1.getCrossbarProfile());
			win.setDoorHandleColor(windows1.getDoorHandleColor());
			win.setDiffuserColor(windows1.getDiffuserColor());
			win.setExtension(windows1.getExtension());
			win.setExternalColor(windows1.getExternalColor());
			win.setFittings(windows1.getFittings());
			win.setFrameColor(windows1.getFrameColor());
			win.setFulfillment(windows1.getFulfillment());
			win.setGlazingBead(windows1.getGlazingBead());
			win.setGrossPrice(windows1.getGrossPrice());
			win.setHandle(windows1.getHandle());
			win.setHeight(windows1.getHeight());
			win.setInternalColor(windows1.getInternalColor());
			win.setInterPaneFrame(windows1.getInterPaneFrame());
			win.setMullionPattern(windows1.getMullionPattern());
			win.setNetPrice(windows1.getNetPrice());
			win.setOpeningFunctions(windows1.getOpeningFunctions());
			win.setProfile_type(windows1.getProfile_type());
			win.setReed(windows1.getReed());
			win.setReinforcement(windows1.getReinforcement());
			win.setSillStrip(windows1.getSillStrip());
			win.setSpecialShapes(windows1.getSpecialShapes());
			win.setThreshold(windows1.getThreshold());
			win.setTypeOfMullion(windows1.getTypeOfMullion());
			win.setVentilator(windows1.getVentilator());
			win.setWidth(windows1.getWidth());
			win.setWindow_type(windows1.getWindow_type());
			win.setWingLock(windows1.getWingLock());
			win.setOrders(windows1.getOrders());
			sessionFactory.getCurrentSession().flush();
		}

		return null;
	}
}
