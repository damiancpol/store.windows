package com.store.DAO;

import java.util.List;

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

@Repository
public class WindowsRepository implements WindowsDaoInterface {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<BalconyLatch> getListBalconyLatch() {
		List<BalconyLatch> balconylatch = (List<BalconyLatch>) sessionFactory.getCurrentSession()
				.createQuery("from BalconyLatch").list();
		return balconylatch;
	};

	@Override
	public BalconyLatch getSingleBalconyLatch(long id) {
		BalconyLatch balconylatch = (BalconyLatch) sessionFactory.getCurrentSession().get(BalconyLatch.class, id);
		return balconylatch;
	};

	@Override
	public BalconyLatch saveBalconyLatch(BalconyLatch balconylatch) {
		BalconyLatch balconylatch1 = (BalconyLatch) sessionFactory.getCurrentSession().save(balconylatch);
		return balconylatch1;
	};

	@Override
	public List<BalconyLatch> saveBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch balconylatch1 : balconylatch) {
			sessionFactory.getCurrentSession().save(balconylatch1);

		}
		return null;
	};

	@Override
	public BalconyLatch updateBalconyLatch(BalconyLatch balconylatch) {
		BalconyLatch balconylatch1 = (BalconyLatch) sessionFactory.getCurrentSession().byId(BalconyLatch.class)
				.load(balconylatch.getId());
		balconylatch1.setName(balconylatch.getName());
		sessionFactory.getCurrentSession().flush();
		return balconylatch1;
	};

	@Override
	public List<BalconyLatch> updateBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch balconylatch1 : balconylatch) {
			BalconyLatch BalconyLatch2 = (BalconyLatch) sessionFactory.getCurrentSession().byId(BalconyLatch.class)
					.load(balconylatch1.getId());
			BalconyLatch2.setName(balconylatch1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public BalconyLatch delSingleBalconyLatch(long id) {
		BalconyLatch balconylatch = (BalconyLatch) sessionFactory.getCurrentSession().byId(BalconyLatch.class).load(id);
		sessionFactory.getCurrentSession().delete(balconylatch);
		return balconylatch;
	};

	@Override
	public List<BalconyLatch> delBalconyLatch(List<BalconyLatch> balconylatch) {
		for (BalconyLatch BalconyLatch1 : balconylatch) {

			BalconyLatch balconylatch2 = (BalconyLatch) sessionFactory.getCurrentSession().byId(BalconyLatch.class)
					.load(BalconyLatch1.getId());
			sessionFactory.getCurrentSession().delete(balconylatch2);
		}
		return null;
	};

	@Override
	public List<BalconyLatchAvailableColours> getListBalconyLatchAvailableColours() {
		List<BalconyLatchAvailableColours> balconylatchavailablecolours = (List<BalconyLatchAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from BalconyLatchAvailableColours").list();
		return balconylatchavailablecolours;
	};

	@Override
	public BalconyLatchAvailableColours getSingleBalconyLatchAvailableColours(long id) {
		BalconyLatchAvailableColours balconylatchavailablecolours = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().get(BalconyLatchAvailableColours.class, id);
		return balconylatchavailablecolours;
	};

	@Override
	public BalconyLatchAvailableColours saveBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		BalconyLatchAvailableColours balconylatchavailablecolours1 = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().save(balconylatchavailablecolours);
		return balconylatchavailablecolours1;
	};

	@Override
	public List<BalconyLatchAvailableColours> saveBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours balconylatchavailablecolours1 : balconylatchavailablecolours) {
			sessionFactory.getCurrentSession().save(balconylatchavailablecolours1);

		}
		return null;
	};

	@Override
	public BalconyLatchAvailableColours updateBalconyLatchAvailableColours(
			BalconyLatchAvailableColours balconylatchavailablecolours) {
		BalconyLatchAvailableColours balconylatchavailablecolours1 = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().byId(BalconyLatchAvailableColours.class)
				.load(balconylatchavailablecolours.getId());
		balconylatchavailablecolours1.setName(balconylatchavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return balconylatchavailablecolours1;
	};

	@Override
	public List<BalconyLatchAvailableColours> updateBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours balconylatchavailablecolours1 : balconylatchavailablecolours) {
			BalconyLatchAvailableColours BalconyLatchAvailableColours2 = (BalconyLatchAvailableColours) sessionFactory
					.getCurrentSession().byId(BalconyLatchAvailableColours.class)
					.load(balconylatchavailablecolours1.getId());
			BalconyLatchAvailableColours2.setName(balconylatchavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public BalconyLatchAvailableColours delSingleBalconyLatchAvailableColours(long id) {
		BalconyLatchAvailableColours balconylatchavailablecolours = (BalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().byId(BalconyLatchAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(balconylatchavailablecolours);
		return balconylatchavailablecolours;
	};

	@Override
	public List<BalconyLatchAvailableColours> delBalconyLatchAvailableColours(
			List<BalconyLatchAvailableColours> balconylatchavailablecolours) {
		for (BalconyLatchAvailableColours BalconyLatchAvailableColours1 : balconylatchavailablecolours) {

			BalconyLatchAvailableColours balconylatchavailablecolours2 = (BalconyLatchAvailableColours) sessionFactory
					.getCurrentSession().byId(BalconyLatchAvailableColours.class)
					.load(BalconyLatchAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(balconylatchavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Client> getListClient() {
		List<Client> client = (List<Client>) sessionFactory.getCurrentSession().createQuery("from Client").list();
		return client;
	};

	@Override
	public Client getSingleClient(long id) {
		Client client = (Client) sessionFactory.getCurrentSession().get(Client.class, id);
		return client;
	};

	@Override
	public Client saveClient(Client client) {
		Client client1 = (Client) sessionFactory.getCurrentSession().save(client);
		return client1;
	};

	@Override
	public List<Client> saveClient(List<Client> client) {
		for (Client client1 : client) {
			sessionFactory.getCurrentSession().save(client1);

		}
		return null;
	};

	@Override
	public Client updateClient(Client client) {
		Client client1 = (Client) sessionFactory.getCurrentSession().byId(Client.class).load(client.getId_client());
		client1.setName(client.getName());
		sessionFactory.getCurrentSession().flush();
		return client1;
	};

	@Override
	public List<Client> updateClient(List<Client> client) {
		for (Client client1 : client) {
			Client Client2 = (Client) sessionFactory.getCurrentSession().byId(Client.class).load(client1.getId_client());
			Client2.setName(client1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Client delSingleClient(long id) {
		Client client = (Client) sessionFactory.getCurrentSession().byId(Client.class).load(id);
		sessionFactory.getCurrentSession().delete(client);
		return client;
	};

	@Override
	public List<Client> delClient(List<Client> client) {
		for (Client Client1 : client) {

			Client client2 = (Client) sessionFactory.getCurrentSession().byId(Client.class).load(Client1.getId_client());
			sessionFactory.getCurrentSession().delete(client2);
		}
		return null;
	};

	@Override
	public List<ColorOfCasings> getListColorOfCasings() {
		List<ColorOfCasings> colorofcasings = (List<ColorOfCasings>) sessionFactory.getCurrentSession()
				.createQuery("from ColorOfCasings").list();
		return colorofcasings;
	};

	@Override
	public ColorOfCasings getSingleColorOfCasings(long id) {
		ColorOfCasings colorofcasings = (ColorOfCasings) sessionFactory.getCurrentSession().get(ColorOfCasings.class,
				id);
		return colorofcasings;
	};

	@Override
	public ColorOfCasings saveColorOfCasings(ColorOfCasings colorofcasings) {
		ColorOfCasings colorofcasings1 = (ColorOfCasings) sessionFactory.getCurrentSession().save(colorofcasings);
		return colorofcasings1;
	};

	@Override
	public List<ColorOfCasings> saveColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings colorofcasings1 : colorofcasings) {
			sessionFactory.getCurrentSession().save(colorofcasings1);

		}
		return null;
	};

	@Override
	public ColorOfCasings updateColorOfCasings(ColorOfCasings colorofcasings) {
		ColorOfCasings colorofcasings1 = (ColorOfCasings) sessionFactory.getCurrentSession().byId(ColorOfCasings.class)
				.load(colorofcasings.getId());
		colorofcasings1.setName(colorofcasings.getName());
		sessionFactory.getCurrentSession().flush();
		return colorofcasings1;
	};

	@Override
	public List<ColorOfCasings> updateColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings colorofcasings1 : colorofcasings) {
			ColorOfCasings ColorOfCasings2 = (ColorOfCasings) sessionFactory.getCurrentSession()
					.byId(ColorOfCasings.class).load(colorofcasings1.getId());
			ColorOfCasings2.setName(colorofcasings1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ColorOfCasings delSingleColorOfCasings(long id) {
		ColorOfCasings colorofcasings = (ColorOfCasings) sessionFactory.getCurrentSession().byId(ColorOfCasings.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(colorofcasings);
		return colorofcasings;
	};

	@Override
	public List<ColorOfCasings> delColorOfCasings(List<ColorOfCasings> colorofcasings) {
		for (ColorOfCasings ColorOfCasings1 : colorofcasings) {

			ColorOfCasings colorofcasings2 = (ColorOfCasings) sessionFactory.getCurrentSession()
					.byId(ColorOfCasings.class).load(ColorOfCasings1.getId());
			sessionFactory.getCurrentSession().delete(colorofcasings2);
		}
		return null;
	};

	@Override
	public List<ColorOfCasingsAvailableColours> getListColorOfCasingsAvailableColours() {
		List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours = (List<ColorOfCasingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ColorOfCasingsAvailableColours").list();
		return colorofcasingsavailablecolours;
	};

	@Override
	public ColorOfCasingsAvailableColours getSingleColorOfCasingsAvailableColours(long id) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().get(ColorOfCasingsAvailableColours.class, id);
		return colorofcasingsavailablecolours;
	};

	@Override
	public ColorOfCasingsAvailableColours saveColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours1 = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().save(colorofcasingsavailablecolours);
		return colorofcasingsavailablecolours1;
	};

	@Override
	public List<ColorOfCasingsAvailableColours> saveColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours colorofcasingsavailablecolours1 : colorofcasingsavailablecolours) {
			sessionFactory.getCurrentSession().save(colorofcasingsavailablecolours1);

		}
		return null;
	};

	@Override
	public ColorOfCasingsAvailableColours updateColorOfCasingsAvailableColours(
			ColorOfCasingsAvailableColours colorofcasingsavailablecolours) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours1 = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ColorOfCasingsAvailableColours.class)
				.load(colorofcasingsavailablecolours.getId());
		colorofcasingsavailablecolours1.setName(colorofcasingsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return colorofcasingsavailablecolours1;
	};

	@Override
	public List<ColorOfCasingsAvailableColours> updateColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours colorofcasingsavailablecolours1 : colorofcasingsavailablecolours) {
			ColorOfCasingsAvailableColours ColorOfCasingsAvailableColours2 = (ColorOfCasingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ColorOfCasingsAvailableColours.class)
					.load(colorofcasingsavailablecolours1.getId());
			ColorOfCasingsAvailableColours2.setName(colorofcasingsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ColorOfCasingsAvailableColours delSingleColorOfCasingsAvailableColours(long id) {
		ColorOfCasingsAvailableColours colorofcasingsavailablecolours = (ColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ColorOfCasingsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(colorofcasingsavailablecolours);
		return colorofcasingsavailablecolours;
	};

	@Override
	public List<ColorOfCasingsAvailableColours> delColorOfCasingsAvailableColours(
			List<ColorOfCasingsAvailableColours> colorofcasingsavailablecolours) {
		for (ColorOfCasingsAvailableColours ColorOfCasingsAvailableColours1 : colorofcasingsavailablecolours) {

			ColorOfCasingsAvailableColours colorofcasingsavailablecolours2 = (ColorOfCasingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ColorOfCasingsAvailableColours.class)
					.load(ColorOfCasingsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(colorofcasingsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<CrossbarProfile> getListCrossbarProfile() {
		List<CrossbarProfile> crossbarprofile = (List<CrossbarProfile>) sessionFactory.getCurrentSession()
				.createQuery("from CrossbarProfile").list();
		return crossbarprofile;
	};

	@Override
	public CrossbarProfile getSingleCrossbarProfile(long id) {
		CrossbarProfile crossbarprofile = (CrossbarProfile) sessionFactory.getCurrentSession()
				.get(CrossbarProfile.class, id);
		return crossbarprofile;
	};

	@Override
	public CrossbarProfile saveCrossbarProfile(CrossbarProfile crossbarprofile) {
		CrossbarProfile crossbarprofile1 = (CrossbarProfile) sessionFactory.getCurrentSession().save(crossbarprofile);
		return crossbarprofile1;
	};

	@Override
	public List<CrossbarProfile> saveCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile crossbarprofile1 : crossbarprofile) {
			sessionFactory.getCurrentSession().save(crossbarprofile1);

		}
		return null;
	};

	@Override
	public CrossbarProfile updateCrossbarProfile(CrossbarProfile crossbarprofile) {
		CrossbarProfile crossbarprofile1 = (CrossbarProfile) sessionFactory.getCurrentSession()
				.byId(CrossbarProfile.class).load(crossbarprofile.getId());
		crossbarprofile1.setName(crossbarprofile.getName());
		sessionFactory.getCurrentSession().flush();
		return crossbarprofile1;
	};

	@Override
	public List<CrossbarProfile> updateCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile crossbarprofile1 : crossbarprofile) {
			CrossbarProfile CrossbarProfile2 = (CrossbarProfile) sessionFactory.getCurrentSession()
					.byId(CrossbarProfile.class).load(crossbarprofile1.getId());
			CrossbarProfile2.setName(crossbarprofile1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public CrossbarProfile delSingleCrossbarProfile(long id) {
		CrossbarProfile crossbarprofile = (CrossbarProfile) sessionFactory.getCurrentSession()
				.byId(CrossbarProfile.class).load(id);
		sessionFactory.getCurrentSession().delete(crossbarprofile);
		return crossbarprofile;
	};

	@Override
	public List<CrossbarProfile> delCrossbarProfile(List<CrossbarProfile> crossbarprofile) {
		for (CrossbarProfile CrossbarProfile1 : crossbarprofile) {

			CrossbarProfile crossbarprofile2 = (CrossbarProfile) sessionFactory.getCurrentSession()
					.byId(CrossbarProfile.class).load(CrossbarProfile1.getId());
			sessionFactory.getCurrentSession().delete(crossbarprofile2);
		}
		return null;
	};

	@Override
	public List<CrossbbarProfileAvaibleColors> getListCrossbbarProfileAvaibleColors() {
		List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors = (List<CrossbbarProfileAvaibleColors>) sessionFactory
				.getCurrentSession().createQuery("from CrossbbarProfileAvaibleColors").list();
		return crossbbarprofileavaiblecolors;
	};

	@Override
	public CrossbbarProfileAvaibleColors getSingleCrossbbarProfileAvaibleColors(long id) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().get(CrossbbarProfileAvaibleColors.class, id);
		return crossbbarprofileavaiblecolors;
	};

	@Override
	public CrossbbarProfileAvaibleColors saveCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors1 = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().save(crossbbarprofileavaiblecolors);
		return crossbbarprofileavaiblecolors1;
	};

	@Override
	public List<CrossbbarProfileAvaibleColors> saveCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors1 : crossbbarprofileavaiblecolors) {
			sessionFactory.getCurrentSession().save(crossbbarprofileavaiblecolors1);

		}
		return null;
	};

	@Override
	public CrossbbarProfileAvaibleColors updateCrossbbarProfileAvaibleColors(
			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors1 = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().byId(CrossbbarProfileAvaibleColors.class)
				.load(crossbbarprofileavaiblecolors.getId());
		crossbbarprofileavaiblecolors1.setName(crossbbarprofileavaiblecolors.getName());
		sessionFactory.getCurrentSession().flush();
		return crossbbarprofileavaiblecolors1;
	};

	@Override
	public List<CrossbbarProfileAvaibleColors> updateCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors1 : crossbbarprofileavaiblecolors) {
			CrossbbarProfileAvaibleColors CrossbbarProfileAvaibleColors2 = (CrossbbarProfileAvaibleColors) sessionFactory
					.getCurrentSession().byId(CrossbbarProfileAvaibleColors.class)
					.load(crossbbarprofileavaiblecolors1.getId());
			CrossbbarProfileAvaibleColors2.setName(crossbbarprofileavaiblecolors1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public CrossbbarProfileAvaibleColors delSingleCrossbbarProfileAvaibleColors(long id) {
		CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors = (CrossbbarProfileAvaibleColors) sessionFactory
				.getCurrentSession().byId(CrossbbarProfileAvaibleColors.class).load(id);
		sessionFactory.getCurrentSession().delete(crossbbarprofileavaiblecolors);
		return crossbbarprofileavaiblecolors;
	};

	@Override
	public List<CrossbbarProfileAvaibleColors> delCrossbbarProfileAvaibleColors(
			List<CrossbbarProfileAvaibleColors> crossbbarprofileavaiblecolors) {
		for (CrossbbarProfileAvaibleColors CrossbbarProfileAvaibleColors1 : crossbbarprofileavaiblecolors) {

			CrossbbarProfileAvaibleColors crossbbarprofileavaiblecolors2 = (CrossbbarProfileAvaibleColors) sessionFactory
					.getCurrentSession().byId(CrossbbarProfileAvaibleColors.class)
					.load(CrossbbarProfileAvaibleColors1.getId());
			sessionFactory.getCurrentSession().delete(crossbbarprofileavaiblecolors2);
		}
		return null;
	};

	@Override
	public List<DiffuserColor> getListDiffuserColor() {
		List<DiffuserColor> diffusercolor = (List<DiffuserColor>) sessionFactory.getCurrentSession()
				.createQuery("from DiffuserColor").list();
		return diffusercolor;
	};

	@Override
	public DiffuserColor getSingleDiffuserColor(long id) {
		DiffuserColor diffusercolor = (DiffuserColor) sessionFactory.getCurrentSession().get(DiffuserColor.class, id);
		return diffusercolor;
	};

	@Override
	public DiffuserColor saveDiffuserColor(DiffuserColor diffusercolor) {
		DiffuserColor diffusercolor1 = (DiffuserColor) sessionFactory.getCurrentSession().save(diffusercolor);
		return diffusercolor1;
	};

	@Override
	public List<DiffuserColor> saveDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor diffusercolor1 : diffusercolor) {
			sessionFactory.getCurrentSession().save(diffusercolor1);

		}
		return null;
	};

	@Override
	public DiffuserColor updateDiffuserColor(DiffuserColor diffusercolor) {
		DiffuserColor diffusercolor1 = (DiffuserColor) sessionFactory.getCurrentSession().byId(DiffuserColor.class)
				.load(diffusercolor.getId());
		diffusercolor1.setName(diffusercolor.getName());
		sessionFactory.getCurrentSession().flush();
		return diffusercolor1;
	};

	@Override
	public List<DiffuserColor> updateDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor diffusercolor1 : diffusercolor) {
			DiffuserColor DiffuserColor2 = (DiffuserColor) sessionFactory.getCurrentSession().byId(DiffuserColor.class)
					.load(diffusercolor1.getId());
			DiffuserColor2.setName(diffusercolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public DiffuserColor delSingleDiffuserColor(long id) {
		DiffuserColor diffusercolor = (DiffuserColor) sessionFactory.getCurrentSession().byId(DiffuserColor.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(diffusercolor);
		return diffusercolor;
	};

	@Override
	public List<DiffuserColor> delDiffuserColor(List<DiffuserColor> diffusercolor) {
		for (DiffuserColor DiffuserColor1 : diffusercolor) {

			DiffuserColor diffusercolor2 = (DiffuserColor) sessionFactory.getCurrentSession().byId(DiffuserColor.class)
					.load(DiffuserColor1.getId());
			sessionFactory.getCurrentSession().delete(diffusercolor2);
		}
		return null;
	};

	@Override
	public List<DoorHandleColor> getListDoorHandleColor() {
		List<DoorHandleColor> doorhandlecolor = (List<DoorHandleColor>) sessionFactory.getCurrentSession()
				.createQuery("from DoorHandleColor").list();
		return doorhandlecolor;
	};

	@Override
	public DoorHandleColor getSingleDoorHandleColor(long id) {
		DoorHandleColor doorhandlecolor = (DoorHandleColor) sessionFactory.getCurrentSession()
				.get(DoorHandleColor.class, id);
		return doorhandlecolor;
	};

	@Override
	public DoorHandleColor saveDoorHandleColor(DoorHandleColor doorhandlecolor) {
		DoorHandleColor doorhandlecolor1 = (DoorHandleColor) sessionFactory.getCurrentSession().save(doorhandlecolor);
		return doorhandlecolor1;
	};

	@Override
	public List<DoorHandleColor> saveDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor doorhandlecolor1 : doorhandlecolor) {
			sessionFactory.getCurrentSession().save(doorhandlecolor1);

		}
		return null;
	};

	@Override
	public DoorHandleColor updateDoorHandleColor(DoorHandleColor doorhandlecolor) {
		DoorHandleColor doorhandlecolor1 = (DoorHandleColor) sessionFactory.getCurrentSession()
				.byId(DoorHandleColor.class).load(doorhandlecolor.getId());
		doorhandlecolor1.setName(doorhandlecolor.getName());
		sessionFactory.getCurrentSession().flush();
		return doorhandlecolor1;
	};

	@Override
	public List<DoorHandleColor> updateDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor doorhandlecolor1 : doorhandlecolor) {
			DoorHandleColor DoorHandleColor2 = (DoorHandleColor) sessionFactory.getCurrentSession()
					.byId(DoorHandleColor.class).load(doorhandlecolor1.getId());
			DoorHandleColor2.setName(doorhandlecolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public DoorHandleColor delSingleDoorHandleColor(long id) {
		DoorHandleColor doorhandlecolor = (DoorHandleColor) sessionFactory.getCurrentSession()
				.byId(DoorHandleColor.class).load(id);
		sessionFactory.getCurrentSession().delete(doorhandlecolor);
		return doorhandlecolor;
	};

	@Override
	public List<DoorHandleColor> delDoorHandleColor(List<DoorHandleColor> doorhandlecolor) {
		for (DoorHandleColor DoorHandleColor1 : doorhandlecolor) {

			DoorHandleColor doorhandlecolor2 = (DoorHandleColor) sessionFactory.getCurrentSession()
					.byId(DoorHandleColor.class).load(DoorHandleColor1.getId());
			sessionFactory.getCurrentSession().delete(doorhandlecolor2);
		}
		return null;
	};

	@Override
	public List<Extension> getListExtension() {
		List<Extension> extension = (List<Extension>) sessionFactory.getCurrentSession().createQuery("from Extension")
				.list();
		return extension;
	};

	@Override
	public Extension getSingleExtension(long id) {
		Extension extension = (Extension) sessionFactory.getCurrentSession().get(Extension.class, id);
		return extension;
	};

	@Override
	public Extension saveExtension(Extension extension) {
		Extension extension1 = (Extension) sessionFactory.getCurrentSession().save(extension);
		return extension1;
	};

	@Override
	public List<Extension> saveExtension(List<Extension> extension) {
		for (Extension extension1 : extension) {
			sessionFactory.getCurrentSession().save(extension1);

		}
		return null;
	};

	@Override
	public Extension updateExtension(Extension extension) {
		Extension extension1 = (Extension) sessionFactory.getCurrentSession().byId(Extension.class)
				.load(extension.getId());
		extension1.setName(extension.getName());
		sessionFactory.getCurrentSession().flush();
		return extension1;
	};

	@Override
	public List<Extension> updateExtension(List<Extension> extension) {
		for (Extension extension1 : extension) {
			Extension Extension2 = (Extension) sessionFactory.getCurrentSession().byId(Extension.class)
					.load(extension1.getId());
			Extension2.setName(extension1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Extension delSingleExtension(long id) {
		Extension extension = (Extension) sessionFactory.getCurrentSession().byId(Extension.class).load(id);
		sessionFactory.getCurrentSession().delete(extension);
		return extension;
	};

	@Override
	public List<Extension> delExtension(List<Extension> extension) {
		for (Extension Extension1 : extension) {

			Extension extension2 = (Extension) sessionFactory.getCurrentSession().byId(Extension.class)
					.load(Extension1.getId());
			sessionFactory.getCurrentSession().delete(extension2);
		}
		return null;
	};

	@Override
	public List<ExtensionAvailableColours> getListExtensionAvailableColours() {
		List<ExtensionAvailableColours> extensionavailablecolours = (List<ExtensionAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ExtensionAvailableColours").list();
		return extensionavailablecolours;
	};

	@Override
	public ExtensionAvailableColours getSingleExtensionAvailableColours(long id) {
		ExtensionAvailableColours extensionavailablecolours = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().get(ExtensionAvailableColours.class, id);
		return extensionavailablecolours;
	};

	@Override
	public ExtensionAvailableColours saveExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		ExtensionAvailableColours extensionavailablecolours1 = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().save(extensionavailablecolours);
		return extensionavailablecolours1;
	};

	@Override
	public List<ExtensionAvailableColours> saveExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours extensionavailablecolours1 : extensionavailablecolours) {
			sessionFactory.getCurrentSession().save(extensionavailablecolours1);

		}
		return null;
	};

	@Override
	public ExtensionAvailableColours updateExtensionAvailableColours(
			ExtensionAvailableColours extensionavailablecolours) {
		ExtensionAvailableColours extensionavailablecolours1 = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().byId(ExtensionAvailableColours.class).load(extensionavailablecolours.getId());
		extensionavailablecolours1.setName(extensionavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return extensionavailablecolours1;
	};

	@Override
	public List<ExtensionAvailableColours> updateExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours extensionavailablecolours1 : extensionavailablecolours) {
			ExtensionAvailableColours ExtensionAvailableColours2 = (ExtensionAvailableColours) sessionFactory
					.getCurrentSession().byId(ExtensionAvailableColours.class).load(extensionavailablecolours1.getId());
			ExtensionAvailableColours2.setName(extensionavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ExtensionAvailableColours delSingleExtensionAvailableColours(long id) {
		ExtensionAvailableColours extensionavailablecolours = (ExtensionAvailableColours) sessionFactory
				.getCurrentSession().byId(ExtensionAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(extensionavailablecolours);
		return extensionavailablecolours;
	};

	@Override
	public List<ExtensionAvailableColours> delExtensionAvailableColours(
			List<ExtensionAvailableColours> extensionavailablecolours) {
		for (ExtensionAvailableColours ExtensionAvailableColours1 : extensionavailablecolours) {

			ExtensionAvailableColours extensionavailablecolours2 = (ExtensionAvailableColours) sessionFactory
					.getCurrentSession().byId(ExtensionAvailableColours.class).load(ExtensionAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(extensionavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ExternalColor> getListExternalColor() {
		List<ExternalColor> externalcolor = (List<ExternalColor>) sessionFactory.getCurrentSession()
				.createQuery("from ExternalColor").list();
		return externalcolor;
	};

	@Override
	public ExternalColor getSingleExternalColor(long id) {
		ExternalColor externalcolor = (ExternalColor) sessionFactory.getCurrentSession().get(ExternalColor.class, id);
		return externalcolor;
	};

	@Override
	public ExternalColor saveExternalColor(ExternalColor externalcolor) {
		ExternalColor externalcolor1 = (ExternalColor) sessionFactory.getCurrentSession().save(externalcolor);
		return externalcolor1;
	};

	@Override
	public List<ExternalColor> saveExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor externalcolor1 : externalcolor) {
			sessionFactory.getCurrentSession().save(externalcolor1);

		}
		return null;
	};

	@Override
	public ExternalColor updateExternalColor(ExternalColor externalcolor) {
		ExternalColor externalcolor1 = (ExternalColor) sessionFactory.getCurrentSession().byId(ExternalColor.class)
				.load(externalcolor.getId());
		externalcolor1.setName(externalcolor.getName());
		sessionFactory.getCurrentSession().flush();
		return externalcolor1;
	};

	@Override
	public List<ExternalColor> updateExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor externalcolor1 : externalcolor) {
			ExternalColor ExternalColor2 = (ExternalColor) sessionFactory.getCurrentSession().byId(ExternalColor.class)
					.load(externalcolor1.getId());
			ExternalColor2.setName(externalcolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ExternalColor delSingleExternalColor(long id) {
		ExternalColor externalcolor = (ExternalColor) sessionFactory.getCurrentSession().byId(ExternalColor.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(externalcolor);
		return externalcolor;
	};

	@Override
	public List<ExternalColor> delExternalColor(List<ExternalColor> externalcolor) {
		for (ExternalColor ExternalColor1 : externalcolor) {

			ExternalColor externalcolor2 = (ExternalColor) sessionFactory.getCurrentSession().byId(ExternalColor.class)
					.load(ExternalColor1.getId());
			sessionFactory.getCurrentSession().delete(externalcolor2);
		}
		return null;
	};

	@Override
	public List<Fittings> getListFittings() {
		List<Fittings> fittings = (List<Fittings>) sessionFactory.getCurrentSession().createQuery("from Fittings")
				.list();
		return fittings;
	};

	@Override
	public Fittings getSingleFittings(long id) {
		Fittings fittings = (Fittings) sessionFactory.getCurrentSession().get(Fittings.class, id);
		return fittings;
	};

	@Override
	public Fittings saveFittings(Fittings fittings) {
		Fittings fittings1 = (Fittings) sessionFactory.getCurrentSession().save(fittings);
		return fittings1;
	};

	@Override
	public List<Fittings> saveFittings(List<Fittings> fittings) {
		for (Fittings fittings1 : fittings) {
			sessionFactory.getCurrentSession().save(fittings1);

		}
		return null;
	};

	@Override
	public Fittings updateFittings(Fittings fittings) {
		Fittings fittings1 = (Fittings) sessionFactory.getCurrentSession().byId(Fittings.class).load(fittings.getId());
		fittings1.setName(fittings.getName());
		sessionFactory.getCurrentSession().flush();
		return fittings1;
	};

	@Override
	public List<Fittings> updateFittings(List<Fittings> fittings) {
		for (Fittings fittings1 : fittings) {
			Fittings Fittings2 = (Fittings) sessionFactory.getCurrentSession().byId(Fittings.class)
					.load(fittings1.getId());
			Fittings2.setName(fittings1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Fittings delSingleFittings(long id) {
		Fittings fittings = (Fittings) sessionFactory.getCurrentSession().byId(Fittings.class).load(id);
		sessionFactory.getCurrentSession().delete(fittings);
		return fittings;
	};

	@Override
	public List<Fittings> delFittings(List<Fittings> fittings) {
		for (Fittings Fittings1 : fittings) {

			Fittings fittings2 = (Fittings) sessionFactory.getCurrentSession().byId(Fittings.class)
					.load(Fittings1.getId());
			sessionFactory.getCurrentSession().delete(fittings2);
		}
		return null;
	};

	@Override
	public List<FittingsAvailableColours> getListFittingsAvailableColours() {
		List<FittingsAvailableColours> fittingsavailablecolours = (List<FittingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from FittingsAvailableColours").list();
		return fittingsavailablecolours;
	};

	@Override
	public FittingsAvailableColours getSingleFittingsAvailableColours(long id) {
		FittingsAvailableColours fittingsavailablecolours = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().get(FittingsAvailableColours.class, id);
		return fittingsavailablecolours;
	};

	@Override
	public FittingsAvailableColours saveFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		FittingsAvailableColours fittingsavailablecolours1 = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().save(fittingsavailablecolours);
		return fittingsavailablecolours1;
	};

	@Override
	public List<FittingsAvailableColours> saveFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours fittingsavailablecolours1 : fittingsavailablecolours) {
			sessionFactory.getCurrentSession().save(fittingsavailablecolours1);

		}
		return null;
	};

	@Override
	public FittingsAvailableColours updateFittingsAvailableColours(FittingsAvailableColours fittingsavailablecolours) {
		FittingsAvailableColours fittingsavailablecolours1 = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().byId(FittingsAvailableColours.class).load(fittingsavailablecolours.getId());
		fittingsavailablecolours1.setName(fittingsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return fittingsavailablecolours1;
	};

	@Override
	public List<FittingsAvailableColours> updateFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours fittingsavailablecolours1 : fittingsavailablecolours) {
			FittingsAvailableColours FittingsAvailableColours2 = (FittingsAvailableColours) sessionFactory
					.getCurrentSession().byId(FittingsAvailableColours.class).load(fittingsavailablecolours1.getId());
			FittingsAvailableColours2.setName(fittingsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public FittingsAvailableColours delSingleFittingsAvailableColours(long id) {
		FittingsAvailableColours fittingsavailablecolours = (FittingsAvailableColours) sessionFactory
				.getCurrentSession().byId(FittingsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(fittingsavailablecolours);
		return fittingsavailablecolours;
	};

	@Override
	public List<FittingsAvailableColours> delFittingsAvailableColours(
			List<FittingsAvailableColours> fittingsavailablecolours) {
		for (FittingsAvailableColours FittingsAvailableColours1 : fittingsavailablecolours) {

			FittingsAvailableColours fittingsavailablecolours2 = (FittingsAvailableColours) sessionFactory
					.getCurrentSession().byId(FittingsAvailableColours.class).load(FittingsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(fittingsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<FrameColor> getListFrameColor() {
		List<FrameColor> framecolor = (List<FrameColor>) sessionFactory.getCurrentSession()
				.createQuery("from FrameColor").list();
		return framecolor;
	};

	@Override
	public FrameColor getSingleFrameColor(long id) {
		FrameColor framecolor = (FrameColor) sessionFactory.getCurrentSession().get(FrameColor.class, id);
		return framecolor;
	};

	@Override
	public FrameColor saveFrameColor(FrameColor framecolor) {
		FrameColor framecolor1 = (FrameColor) sessionFactory.getCurrentSession().save(framecolor);
		return framecolor1;
	};

	@Override
	public List<FrameColor> saveFrameColor(List<FrameColor> framecolor) {
		for (FrameColor framecolor1 : framecolor) {
			sessionFactory.getCurrentSession().save(framecolor1);

		}
		return null;
	};

	@Override
	public FrameColor updateFrameColor(FrameColor framecolor) {
		FrameColor framecolor1 = (FrameColor) sessionFactory.getCurrentSession().byId(FrameColor.class)
				.load(framecolor.getId());
		framecolor1.setName(framecolor.getName());
		sessionFactory.getCurrentSession().flush();
		return framecolor1;
	};

	@Override
	public List<FrameColor> updateFrameColor(List<FrameColor> framecolor) {
		for (FrameColor framecolor1 : framecolor) {
			FrameColor FrameColor2 = (FrameColor) sessionFactory.getCurrentSession().byId(FrameColor.class)
					.load(framecolor1.getId());
			FrameColor2.setName(framecolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public FrameColor delSingleFrameColor(long id) {
		FrameColor framecolor = (FrameColor) sessionFactory.getCurrentSession().byId(FrameColor.class).load(id);
		sessionFactory.getCurrentSession().delete(framecolor);
		return framecolor;
	};

	@Override
	public List<FrameColor> delFrameColor(List<FrameColor> framecolor) {
		for (FrameColor FrameColor1 : framecolor) {

			FrameColor framecolor2 = (FrameColor) sessionFactory.getCurrentSession().byId(FrameColor.class)
					.load(FrameColor1.getId());
			sessionFactory.getCurrentSession().delete(framecolor2);
		}
		return null;
	};

	@Override
	public List<Fulfillment> getListFulfillment() {
		List<Fulfillment> fulfillment = (List<Fulfillment>) sessionFactory.getCurrentSession()
				.createQuery("from Fulfillment").list();
		return fulfillment;
	};

	@Override
	public Fulfillment getSingleFulfillment(long id) {
		Fulfillment fulfillment = (Fulfillment) sessionFactory.getCurrentSession().get(Fulfillment.class, id);
		return fulfillment;
	};

	@Override
	public Fulfillment saveFulfillment(Fulfillment fulfillment) {
		Fulfillment fulfillment1 = (Fulfillment) sessionFactory.getCurrentSession().save(fulfillment);
		return fulfillment1;
	};

	@Override
	public List<Fulfillment> saveFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment fulfillment1 : fulfillment) {
			sessionFactory.getCurrentSession().save(fulfillment1);

		}
		return null;
	};

	@Override
	public Fulfillment updateFulfillment(Fulfillment fulfillment) {
		Fulfillment fulfillment1 = (Fulfillment) sessionFactory.getCurrentSession().byId(Fulfillment.class)
				.load(fulfillment.getId());
		fulfillment1.setName(fulfillment.getName());
		sessionFactory.getCurrentSession().flush();
		return fulfillment1;
	};

	@Override
	public List<Fulfillment> updateFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment fulfillment1 : fulfillment) {
			Fulfillment Fulfillment2 = (Fulfillment) sessionFactory.getCurrentSession().byId(Fulfillment.class)
					.load(fulfillment1.getId());
			Fulfillment2.setName(fulfillment1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Fulfillment delSingleFulfillment(long id) {
		Fulfillment fulfillment = (Fulfillment) sessionFactory.getCurrentSession().byId(Fulfillment.class).load(id);
		sessionFactory.getCurrentSession().delete(fulfillment);
		return fulfillment;
	};

	@Override
	public List<Fulfillment> delFulfillment(List<Fulfillment> fulfillment) {
		for (Fulfillment Fulfillment1 : fulfillment) {

			Fulfillment fulfillment2 = (Fulfillment) sessionFactory.getCurrentSession().byId(Fulfillment.class)
					.load(Fulfillment1.getId());
			sessionFactory.getCurrentSession().delete(fulfillment2);
		}
		return null;
	};

	@Override
	public List<FullfillmentAvailableColours> getListFullfillmentAvailableColours() {
		List<FullfillmentAvailableColours> fullfillmentavailablecolours = (List<FullfillmentAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from FullfillmentAvailableColours").list();
		return fullfillmentavailablecolours;
	};

	@Override
	public FullfillmentAvailableColours getSingleFullfillmentAvailableColours(long id) {
		FullfillmentAvailableColours fullfillmentavailablecolours = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().get(FullfillmentAvailableColours.class, id);
		return fullfillmentavailablecolours;
	};

	@Override
	public FullfillmentAvailableColours saveFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		FullfillmentAvailableColours fullfillmentavailablecolours1 = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().save(fullfillmentavailablecolours);
		return fullfillmentavailablecolours1;
	};

	@Override
	public List<FullfillmentAvailableColours> saveFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours fullfillmentavailablecolours1 : fullfillmentavailablecolours) {
			sessionFactory.getCurrentSession().save(fullfillmentavailablecolours1);

		}
		return null;
	};

	@Override
	public FullfillmentAvailableColours updateFullfillmentAvailableColours(
			FullfillmentAvailableColours fullfillmentavailablecolours) {
		FullfillmentAvailableColours fullfillmentavailablecolours1 = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().byId(FullfillmentAvailableColours.class)
				.load(fullfillmentavailablecolours.getId());
		fullfillmentavailablecolours1.setName(fullfillmentavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return fullfillmentavailablecolours1;
	};

	@Override
	public List<FullfillmentAvailableColours> updateFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours fullfillmentavailablecolours1 : fullfillmentavailablecolours) {
			FullfillmentAvailableColours FullfillmentAvailableColours2 = (FullfillmentAvailableColours) sessionFactory
					.getCurrentSession().byId(FullfillmentAvailableColours.class)
					.load(fullfillmentavailablecolours1.getId());
			FullfillmentAvailableColours2.setName(fullfillmentavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public FullfillmentAvailableColours delSingleFullfillmentAvailableColours(long id) {
		FullfillmentAvailableColours fullfillmentavailablecolours = (FullfillmentAvailableColours) sessionFactory
				.getCurrentSession().byId(FullfillmentAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(fullfillmentavailablecolours);
		return fullfillmentavailablecolours;
	};

	@Override
	public List<FullfillmentAvailableColours> delFullfillmentAvailableColours(
			List<FullfillmentAvailableColours> fullfillmentavailablecolours) {
		for (FullfillmentAvailableColours FullfillmentAvailableColours1 : fullfillmentavailablecolours) {

			FullfillmentAvailableColours fullfillmentavailablecolours2 = (FullfillmentAvailableColours) sessionFactory
					.getCurrentSession().byId(FullfillmentAvailableColours.class)
					.load(FullfillmentAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(fullfillmentavailablecolours2);
		}
		return null;
	};

	@Override
	public List<GlazingBead> getListGlazingBead() {
		List<GlazingBead> glazingbead = (List<GlazingBead>) sessionFactory.getCurrentSession()
				.createQuery("from GlazingBead").list();
		return glazingbead;
	};

	@Override
	public GlazingBead getSingleGlazingBead(long id) {
		GlazingBead glazingbead = (GlazingBead) sessionFactory.getCurrentSession().get(GlazingBead.class, id);
		return glazingbead;
	};

	@Override
	public GlazingBead saveGlazingBead(GlazingBead glazingbead) {
		GlazingBead glazingbead1 = (GlazingBead) sessionFactory.getCurrentSession().save(glazingbead);
		return glazingbead1;
	};

	@Override
	public List<GlazingBead> saveGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead glazingbead1 : glazingbead) {
			sessionFactory.getCurrentSession().save(glazingbead1);

		}
		return null;
	};

	@Override
	public GlazingBead updateGlazingBead(GlazingBead glazingbead) {
		GlazingBead glazingbead1 = (GlazingBead) sessionFactory.getCurrentSession().byId(GlazingBead.class)
				.load(glazingbead.getId());
		glazingbead1.setName(glazingbead.getName());
		sessionFactory.getCurrentSession().flush();
		return glazingbead1;
	};

	@Override
	public List<GlazingBead> updateGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead glazingbead1 : glazingbead) {
			GlazingBead GlazingBead2 = (GlazingBead) sessionFactory.getCurrentSession().byId(GlazingBead.class)
					.load(glazingbead1.getId());
			GlazingBead2.setName(glazingbead1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public GlazingBead delSingleGlazingBead(long id) {
		GlazingBead glazingbead = (GlazingBead) sessionFactory.getCurrentSession().byId(GlazingBead.class).load(id);
		sessionFactory.getCurrentSession().delete(glazingbead);
		return glazingbead;
	};

	@Override
	public List<GlazingBead> delGlazingBead(List<GlazingBead> glazingbead) {
		for (GlazingBead GlazingBead1 : glazingbead) {

			GlazingBead glazingbead2 = (GlazingBead) sessionFactory.getCurrentSession().byId(GlazingBead.class)
					.load(GlazingBead1.getId());
			sessionFactory.getCurrentSession().delete(glazingbead2);
		}
		return null;
	};

	@Override
	public List<GlazingBeadsAvailableColours> getListGlazingBeadsAvailableColours() {
		List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours = (List<GlazingBeadsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from GlazingBeadsAvailableColours").list();
		return glazingbeadsavailablecolours;
	};

	@Override
	public GlazingBeadsAvailableColours getSingleGlazingBeadsAvailableColours(long id) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().get(GlazingBeadsAvailableColours.class, id);
		return glazingbeadsavailablecolours;
	};

	@Override
	public GlazingBeadsAvailableColours saveGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours1 = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().save(glazingbeadsavailablecolours);
		return glazingbeadsavailablecolours1;
	};

	@Override
	public List<GlazingBeadsAvailableColours> saveGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours glazingbeadsavailablecolours1 : glazingbeadsavailablecolours) {
			sessionFactory.getCurrentSession().save(glazingbeadsavailablecolours1);

		}
		return null;
	};

	@Override
	public GlazingBeadsAvailableColours updateGlazingBeadsAvailableColours(
			GlazingBeadsAvailableColours glazingbeadsavailablecolours) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours1 = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().byId(GlazingBeadsAvailableColours.class)
				.load(glazingbeadsavailablecolours.getId());
		glazingbeadsavailablecolours1.setName(glazingbeadsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return glazingbeadsavailablecolours1;
	};

	@Override
	public List<GlazingBeadsAvailableColours> updateGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours glazingbeadsavailablecolours1 : glazingbeadsavailablecolours) {
			GlazingBeadsAvailableColours GlazingBeadsAvailableColours2 = (GlazingBeadsAvailableColours) sessionFactory
					.getCurrentSession().byId(GlazingBeadsAvailableColours.class)
					.load(glazingbeadsavailablecolours1.getId());
			GlazingBeadsAvailableColours2.setName(glazingbeadsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public GlazingBeadsAvailableColours delSingleGlazingBeadsAvailableColours(long id) {
		GlazingBeadsAvailableColours glazingbeadsavailablecolours = (GlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().byId(GlazingBeadsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(glazingbeadsavailablecolours);
		return glazingbeadsavailablecolours;
	};

	@Override
	public List<GlazingBeadsAvailableColours> delGlazingBeadsAvailableColours(
			List<GlazingBeadsAvailableColours> glazingbeadsavailablecolours) {
		for (GlazingBeadsAvailableColours GlazingBeadsAvailableColours1 : glazingbeadsavailablecolours) {

			GlazingBeadsAvailableColours glazingbeadsavailablecolours2 = (GlazingBeadsAvailableColours) sessionFactory
					.getCurrentSession().byId(GlazingBeadsAvailableColours.class)
					.load(GlazingBeadsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(glazingbeadsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Handle> getListHandle() {
		List<Handle> handle = (List<Handle>) sessionFactory.getCurrentSession().createQuery("from Handle").list();
		return handle;
	};

	@Override
	public Handle getSingleHandle(long id) {
		Handle handle = (Handle) sessionFactory.getCurrentSession().get(Handle.class, id);
		return handle;
	};

	@Override
	public Handle saveHandle(Handle handle) {
		Handle handle1 = (Handle) sessionFactory.getCurrentSession().save(handle);
		return handle1;
	};

	@Override
	public List<Handle> saveHandle(List<Handle> handle) {
		for (Handle handle1 : handle) {
			sessionFactory.getCurrentSession().save(handle1);

		}
		return null;
	};

	@Override
	public Handle updateHandle(Handle handle) {
		Handle handle1 = (Handle) sessionFactory.getCurrentSession().byId(Handle.class).load(handle.getId());
		handle1.setName(handle.getName());
		sessionFactory.getCurrentSession().flush();
		return handle1;
	};

	@Override
	public List<Handle> updateHandle(List<Handle> handle) {
		for (Handle handle1 : handle) {
			Handle Handle2 = (Handle) sessionFactory.getCurrentSession().byId(Handle.class).load(handle1.getId());
			Handle2.setName(handle1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Handle delSingleHandle(long id) {
		Handle handle = (Handle) sessionFactory.getCurrentSession().byId(Handle.class).load(id);
		sessionFactory.getCurrentSession().delete(handle);
		return handle;
	};

	@Override
	public List<Handle> delHandle(List<Handle> handle) {
		for (Handle Handle1 : handle) {

			Handle handle2 = (Handle) sessionFactory.getCurrentSession().byId(Handle.class).load(Handle1.getId());
			sessionFactory.getCurrentSession().delete(handle2);
		}
		return null;
	};

	@Override
	public List<HandlesAvailableColours> getListHandlesAvailableColours() {
		List<HandlesAvailableColours> handlesavailablecolours = (List<HandlesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from HandlesAvailableColours").list();
		return handlesavailablecolours;
	};

	@Override
	public HandlesAvailableColours getSingleHandlesAvailableColours(long id) {
		HandlesAvailableColours handlesavailablecolours = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.get(HandlesAvailableColours.class, id);
		return handlesavailablecolours;
	};

	@Override
	public HandlesAvailableColours saveHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		HandlesAvailableColours handlesavailablecolours1 = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.save(handlesavailablecolours);
		return handlesavailablecolours1;
	};

	@Override
	public List<HandlesAvailableColours> saveHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours handlesavailablecolours1 : handlesavailablecolours) {
			sessionFactory.getCurrentSession().save(handlesavailablecolours1);

		}
		return null;
	};

	@Override
	public HandlesAvailableColours updateHandlesAvailableColours(HandlesAvailableColours handlesavailablecolours) {
		HandlesAvailableColours handlesavailablecolours1 = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.byId(HandlesAvailableColours.class).load(handlesavailablecolours.getId());
		handlesavailablecolours1.setName(handlesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return handlesavailablecolours1;
	};

	@Override
	public List<HandlesAvailableColours> updateHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours handlesavailablecolours1 : handlesavailablecolours) {
			HandlesAvailableColours HandlesAvailableColours2 = (HandlesAvailableColours) sessionFactory
					.getCurrentSession().byId(HandlesAvailableColours.class).load(handlesavailablecolours1.getId());
			HandlesAvailableColours2.setName(handlesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public HandlesAvailableColours delSingleHandlesAvailableColours(long id) {
		HandlesAvailableColours handlesavailablecolours = (HandlesAvailableColours) sessionFactory.getCurrentSession()
				.byId(HandlesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(handlesavailablecolours);
		return handlesavailablecolours;
	};

	@Override
	public List<HandlesAvailableColours> delHandlesAvailableColours(
			List<HandlesAvailableColours> handlesavailablecolours) {
		for (HandlesAvailableColours HandlesAvailableColours1 : handlesavailablecolours) {

			HandlesAvailableColours handlesavailablecolours2 = (HandlesAvailableColours) sessionFactory
					.getCurrentSession().byId(HandlesAvailableColours.class).load(HandlesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(handlesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<InternalColor> getListInternalColor() {
		List<InternalColor> internalcolor = (List<InternalColor>) sessionFactory.getCurrentSession()
				.createQuery("from InternalColor").list();
		return internalcolor;
	};

	@Override
	public InternalColor getSingleInternalColor(long id) {
		InternalColor internalcolor = (InternalColor) sessionFactory.getCurrentSession().get(InternalColor.class, id);
		return internalcolor;
	};

	@Override
	public InternalColor saveInternalColor(InternalColor internalcolor) {
		InternalColor internalcolor1 = (InternalColor) sessionFactory.getCurrentSession().save(internalcolor);
		return internalcolor1;
	};

	@Override
	public List<InternalColor> saveInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor internalcolor1 : internalcolor) {
			sessionFactory.getCurrentSession().save(internalcolor1);

		}
		return null;
	};

	@Override
	public InternalColor updateInternalColor(InternalColor internalcolor) {
		InternalColor internalcolor1 = (InternalColor) sessionFactory.getCurrentSession().byId(InternalColor.class)
				.load(internalcolor.getId());
		internalcolor1.setName(internalcolor.getName());
		sessionFactory.getCurrentSession().flush();
		return internalcolor1;
	};

	@Override
	public List<InternalColor> updateInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor internalcolor1 : internalcolor) {
			InternalColor InternalColor2 = (InternalColor) sessionFactory.getCurrentSession().byId(InternalColor.class)
					.load(internalcolor1.getId());
			InternalColor2.setName(internalcolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public InternalColor delSingleInternalColor(long id) {
		InternalColor internalcolor = (InternalColor) sessionFactory.getCurrentSession().byId(InternalColor.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(internalcolor);
		return internalcolor;
	};

	@Override
	public List<InternalColor> delInternalColor(List<InternalColor> internalcolor) {
		for (InternalColor InternalColor1 : internalcolor) {

			InternalColor internalcolor2 = (InternalColor) sessionFactory.getCurrentSession().byId(InternalColor.class)
					.load(InternalColor1.getId());
			sessionFactory.getCurrentSession().delete(internalcolor2);
		}
		return null;
	};

	@Override
	public List<InterPaneFrame> getListInterPaneFrame() {
		List<InterPaneFrame> interpaneframe = (List<InterPaneFrame>) sessionFactory.getCurrentSession()
				.createQuery("from InterPaneFrame").list();
		return interpaneframe;
	};

	@Override
	public InterPaneFrame getSingleInterPaneFrame(long id) {
		InterPaneFrame interpaneframe = (InterPaneFrame) sessionFactory.getCurrentSession().get(InterPaneFrame.class,
				id);
		return interpaneframe;
	};

	@Override
	public InterPaneFrame saveInterPaneFrame(InterPaneFrame interpaneframe) {
		InterPaneFrame interpaneframe1 = (InterPaneFrame) sessionFactory.getCurrentSession().save(interpaneframe);
		return interpaneframe1;
	};

	@Override
	public List<InterPaneFrame> saveInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame interpaneframe1 : interpaneframe) {
			sessionFactory.getCurrentSession().save(interpaneframe1);

		}
		return null;
	};

	@Override
	public InterPaneFrame updateInterPaneFrame(InterPaneFrame interpaneframe) {
		InterPaneFrame interpaneframe1 = (InterPaneFrame) sessionFactory.getCurrentSession().byId(InterPaneFrame.class)
				.load(interpaneframe.getId());
		interpaneframe1.setName(interpaneframe.getName());
		sessionFactory.getCurrentSession().flush();
		return interpaneframe1;
	};

	@Override
	public List<InterPaneFrame> updateInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame interpaneframe1 : interpaneframe) {
			InterPaneFrame InterPaneFrame2 = (InterPaneFrame) sessionFactory.getCurrentSession()
					.byId(InterPaneFrame.class).load(interpaneframe1.getId());
			InterPaneFrame2.setName(interpaneframe1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public InterPaneFrame delSingleInterPaneFrame(long id) {
		InterPaneFrame interpaneframe = (InterPaneFrame) sessionFactory.getCurrentSession().byId(InterPaneFrame.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(interpaneframe);
		return interpaneframe;
	};

	@Override
	public List<InterPaneFrame> delInterPaneFrame(List<InterPaneFrame> interpaneframe) {
		for (InterPaneFrame InterPaneFrame1 : interpaneframe) {

			InterPaneFrame interpaneframe2 = (InterPaneFrame) sessionFactory.getCurrentSession()
					.byId(InterPaneFrame.class).load(InterPaneFrame1.getId());
			sessionFactory.getCurrentSession().delete(interpaneframe2);
		}
		return null;
	};

	@Override
	public List<InterPaneFramesAvailableColours> getListInterPaneFramesAvailableColours() {
		List<InterPaneFramesAvailableColours> interpaneframesavailablecolours = (List<InterPaneFramesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from InterPaneFramesAvailableColours").list();
		return interpaneframesavailablecolours;
	};

	@Override
	public InterPaneFramesAvailableColours getSingleInterPaneFramesAvailableColours(long id) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().get(InterPaneFramesAvailableColours.class, id);
		return interpaneframesavailablecolours;
	};

	@Override
	public InterPaneFramesAvailableColours saveInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours1 = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().save(interpaneframesavailablecolours);
		return interpaneframesavailablecolours1;
	};

	@Override
	public List<InterPaneFramesAvailableColours> saveInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours interpaneframesavailablecolours1 : interpaneframesavailablecolours) {
			sessionFactory.getCurrentSession().save(interpaneframesavailablecolours1);

		}
		return null;
	};

	@Override
	public InterPaneFramesAvailableColours updateInterPaneFramesAvailableColours(
			InterPaneFramesAvailableColours interpaneframesavailablecolours) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours1 = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().byId(InterPaneFramesAvailableColours.class)
				.load(interpaneframesavailablecolours.getId());
		interpaneframesavailablecolours1.setName(interpaneframesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return interpaneframesavailablecolours1;
	};

	@Override
	public List<InterPaneFramesAvailableColours> updateInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours interpaneframesavailablecolours1 : interpaneframesavailablecolours) {
			InterPaneFramesAvailableColours InterPaneFramesAvailableColours2 = (InterPaneFramesAvailableColours) sessionFactory
					.getCurrentSession().byId(InterPaneFramesAvailableColours.class)
					.load(interpaneframesavailablecolours1.getId());
			InterPaneFramesAvailableColours2.setName(interpaneframesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public InterPaneFramesAvailableColours delSingleInterPaneFramesAvailableColours(long id) {
		InterPaneFramesAvailableColours interpaneframesavailablecolours = (InterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().byId(InterPaneFramesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(interpaneframesavailablecolours);
		return interpaneframesavailablecolours;
	};

	@Override
	public List<InterPaneFramesAvailableColours> delInterPaneFramesAvailableColours(
			List<InterPaneFramesAvailableColours> interpaneframesavailablecolours) {
		for (InterPaneFramesAvailableColours InterPaneFramesAvailableColours1 : interpaneframesavailablecolours) {

			InterPaneFramesAvailableColours interpaneframesavailablecolours2 = (InterPaneFramesAvailableColours) sessionFactory
					.getCurrentSession().byId(InterPaneFramesAvailableColours.class)
					.load(InterPaneFramesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(interpaneframesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListBalconyLatch> getListListBalconyLatch() {
		List<ListBalconyLatch> listbalconylatch = (List<ListBalconyLatch>) sessionFactory.getCurrentSession()
				.createQuery("from ListBalconyLatch").list();
		return listbalconylatch;
	};

	@Override
	public ListBalconyLatch getSingleListBalconyLatch(long id) {
		ListBalconyLatch listbalconylatch = (ListBalconyLatch) sessionFactory.getCurrentSession()
				.get(ListBalconyLatch.class, id);
		return listbalconylatch;
	};

	@Override
	public ListBalconyLatch saveListBalconyLatch(ListBalconyLatch listbalconylatch) {
		ListBalconyLatch listbalconylatch1 = (ListBalconyLatch) sessionFactory.getCurrentSession()
				.save(listbalconylatch);
		return listbalconylatch1;
	};

	@Override
	public List<ListBalconyLatch> saveListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		for (ListBalconyLatch listbalconylatch1 : listbalconylatch) {
			sessionFactory.getCurrentSession().save(listbalconylatch1);

		}
		return null;
	};

	@Override
	public ListBalconyLatch updateListBalconyLatch(ListBalconyLatch listbalconylatch) {
		ListBalconyLatch listbalconylatch1 = (ListBalconyLatch) sessionFactory.getCurrentSession()
				.byId(ListBalconyLatch.class).load(listbalconylatch.getIdListBalconyLatch());
		listbalconylatch1.setName(listbalconylatch.getName());
		sessionFactory.getCurrentSession().flush();
		return listbalconylatch1;
	};

	@Override
	public List<ListBalconyLatch> updateListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		for (ListBalconyLatch listbalconylatch1 : listbalconylatch) {
			ListBalconyLatch ListBalconyLatch2 = (ListBalconyLatch) sessionFactory.getCurrentSession()
					.byId(ListBalconyLatch.class).load(listbalconylatch1.getIdListBalconyLatch());
			ListBalconyLatch2.setName(listbalconylatch1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListBalconyLatch delSingleListBalconyLatch(long id) {
		ListBalconyLatch listbalconylatch = (ListBalconyLatch) sessionFactory.getCurrentSession()
				.byId(ListBalconyLatch.class).load(id);
		sessionFactory.getCurrentSession().delete(listbalconylatch);
		return listbalconylatch;
	};

	@Override
	public List<ListBalconyLatch> delListBalconyLatch(List<ListBalconyLatch> listbalconylatch) {
		for (ListBalconyLatch ListBalconyLatch1 : listbalconylatch) {

			ListBalconyLatch listbalconylatch2 = (ListBalconyLatch) sessionFactory.getCurrentSession()
					.byId(ListBalconyLatch.class).load(ListBalconyLatch1.getIdListBalconyLatch());
			sessionFactory.getCurrentSession().delete(listbalconylatch2);
		}
		return null;
	};

	@Override
	public List<ListBalconyLatchAvailableColours> getListListBalconyLatchAvailableColours() {
		List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours = (List<ListBalconyLatchAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListBalconyLatchAvailableColours").list();
		return listbalconylatchavailablecolours;
	};

	@Override
	public ListBalconyLatchAvailableColours getSingleListBalconyLatchAvailableColours(long id) {
		ListBalconyLatchAvailableColours listbalconylatchavailablecolours = (ListBalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().get(ListBalconyLatchAvailableColours.class, id);
		return listbalconylatchavailablecolours;
	};

	@Override
	public ListBalconyLatchAvailableColours saveListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours) {
		ListBalconyLatchAvailableColours listbalconylatchavailablecolours1 = (ListBalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().save(listbalconylatchavailablecolours);
		return listbalconylatchavailablecolours1;
	};

	@Override
	public List<ListBalconyLatchAvailableColours> saveListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		for (ListBalconyLatchAvailableColours listbalconylatchavailablecolours1 : listbalconylatchavailablecolours) {
			sessionFactory.getCurrentSession().save(listbalconylatchavailablecolours1);

		}
		return null;
	};

	@Override
	public ListBalconyLatchAvailableColours updateListBalconyLatchAvailableColours(
			ListBalconyLatchAvailableColours listbalconylatchavailablecolours) {
		ListBalconyLatchAvailableColours listbalconylatchavailablecolours1 = (ListBalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().byId(ListBalconyLatchAvailableColours.class)
				.load(listbalconylatchavailablecolours.getId());
		listbalconylatchavailablecolours1.setName(listbalconylatchavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listbalconylatchavailablecolours1;
	};

	@Override
	public List<ListBalconyLatchAvailableColours> updateListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		for (ListBalconyLatchAvailableColours listbalconylatchavailablecolours1 : listbalconylatchavailablecolours) {
			ListBalconyLatchAvailableColours ListBalconyLatchAvailableColours2 = (ListBalconyLatchAvailableColours) sessionFactory
					.getCurrentSession().byId(ListBalconyLatchAvailableColours.class)
					.load(listbalconylatchavailablecolours1.getId());
			ListBalconyLatchAvailableColours2.setName(listbalconylatchavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListBalconyLatchAvailableColours delSingleListBalconyLatchAvailableColours(long id) {
		ListBalconyLatchAvailableColours listbalconylatchavailablecolours = (ListBalconyLatchAvailableColours) sessionFactory
				.getCurrentSession().byId(ListBalconyLatchAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listbalconylatchavailablecolours);
		return listbalconylatchavailablecolours;
	};

	@Override
	public List<ListBalconyLatchAvailableColours> delListBalconyLatchAvailableColours(
			List<ListBalconyLatchAvailableColours> listbalconylatchavailablecolours) {
		for (ListBalconyLatchAvailableColours ListBalconyLatchAvailableColours1 : listbalconylatchavailablecolours) {

			ListBalconyLatchAvailableColours listbalconylatchavailablecolours2 = (ListBalconyLatchAvailableColours) sessionFactory
					.getCurrentSession().byId(ListBalconyLatchAvailableColours.class)
					.load(ListBalconyLatchAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listbalconylatchavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListClient> getListListClient() {
		List<ListClient> listclient = (List<ListClient>) sessionFactory.getCurrentSession()
				.createQuery("from ListClient").list();
		return listclient;
	};

	@Override
	public ListClient getSingleListClient(long id) {
		ListClient listclient = (ListClient) sessionFactory.getCurrentSession().get(ListClient.class, id);
		return listclient;
	};

	@Override
	public ListClient saveListClient(ListClient listclient) {
		ListClient listclient1 = (ListClient) sessionFactory.getCurrentSession().save(listclient);
		return listclient1;
	};

	@Override
	public List<ListClient> saveListClient(List<ListClient> listclient) {
		for (ListClient listclient1 : listclient) {
			sessionFactory.getCurrentSession().save(listclient1);

		}
		return null;
	};

	@Override
	public ListClient updateListClient(ListClient listclient) {
		ListClient listclient1 = (ListClient) sessionFactory.getCurrentSession().byId(ListClient.class);
			
		return listclient1;
	};

	@Override
	public List<ListClient> updateListClient(List<ListClient> listclient) {
	
		return null;
	};

	@Override
	public ListClient delSingleListClient(long id) {
		ListClient listclient = (ListClient) sessionFactory.getCurrentSession().byId(ListClient.class).load(id);
		sessionFactory.getCurrentSession().delete(listclient);
		return listclient;
	};

	@Override
	public List<ListClient> delListClient(List<ListClient> listclient) {
	
		return null;
	};

	@Override
	public List<ListColorOfCasings> getListListColorOfCasings() {
		List<ListColorOfCasings> listcolorofcasings = (List<ListColorOfCasings>) sessionFactory.getCurrentSession()
				.createQuery("from ListColorOfCasings").list();
		return listcolorofcasings;
	};

	@Override
	public ListColorOfCasings getSingleListColorOfCasings(long id) {
		ListColorOfCasings listcolorofcasings = (ListColorOfCasings) sessionFactory.getCurrentSession()
				.get(ListColorOfCasings.class, id);
		return listcolorofcasings;
	};

	@Override
	public ListColorOfCasings saveListColorOfCasings(ListColorOfCasings listcolorofcasings) {
		ListColorOfCasings listcolorofcasings1 = (ListColorOfCasings) sessionFactory.getCurrentSession()
				.save(listcolorofcasings);
		return listcolorofcasings1;
	};

	@Override
	public List<ListColorOfCasings> saveListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		for (ListColorOfCasings listcolorofcasings1 : listcolorofcasings) {
			sessionFactory.getCurrentSession().save(listcolorofcasings1);

		}
		return null;
	};

	@Override
	public ListColorOfCasings updateListColorOfCasings(ListColorOfCasings listcolorofcasings) {
		ListColorOfCasings listcolorofcasings1 = (ListColorOfCasings) sessionFactory.getCurrentSession()
				.byId(ListColorOfCasings.class).load(listcolorofcasings.getIdListColorOfCasings());
		listcolorofcasings1.setName(listcolorofcasings.getName());
		sessionFactory.getCurrentSession().flush();
		return listcolorofcasings1;
	};

	@Override
	public List<ListColorOfCasings> updateListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		for (ListColorOfCasings listcolorofcasings1 : listcolorofcasings) {
			ListColorOfCasings ListColorOfCasings2 = (ListColorOfCasings) sessionFactory.getCurrentSession()
					.byId(ListColorOfCasings.class).load(listcolorofcasings1.getIdListColorOfCasings());
			ListColorOfCasings2.setName(listcolorofcasings1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListColorOfCasings delSingleListColorOfCasings(long id) {
		ListColorOfCasings listcolorofcasings = (ListColorOfCasings) sessionFactory.getCurrentSession()
				.byId(ListColorOfCasings.class).load(id);
		sessionFactory.getCurrentSession().delete(listcolorofcasings);
		return listcolorofcasings;
	};

	@Override
	public List<ListColorOfCasings> delListColorOfCasings(List<ListColorOfCasings> listcolorofcasings) {
		for (ListColorOfCasings ListColorOfCasings1 : listcolorofcasings) {

			ListColorOfCasings listcolorofcasings2 = (ListColorOfCasings) sessionFactory.getCurrentSession()
					.byId(ListColorOfCasings.class).load(ListColorOfCasings1.getIdListColorOfCasings());
			sessionFactory.getCurrentSession().delete(listcolorofcasings2);
		}
		return null;
	};

	@Override
	public List<ListColorOfCasingsAvailableColours> getListListColorOfCasingsAvailableColours() {
		List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours = (List<ListColorOfCasingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListColorOfCasingsAvailableColours").list();
		return listcolorofcasingsavailablecolours;
	};

	@Override
	public ListColorOfCasingsAvailableColours getSingleListColorOfCasingsAvailableColours(long id) {
		ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours = (ListColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().get(ListColorOfCasingsAvailableColours.class, id);
		return listcolorofcasingsavailablecolours;
	};

	@Override
	public ListColorOfCasingsAvailableColours saveListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours) {
		ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours1 = (ListColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().save(listcolorofcasingsavailablecolours);
		return listcolorofcasingsavailablecolours1;
	};

	@Override
	public List<ListColorOfCasingsAvailableColours> saveListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		for (ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours1 : listcolorofcasingsavailablecolours) {
			sessionFactory.getCurrentSession().save(listcolorofcasingsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListColorOfCasingsAvailableColours updateListColorOfCasingsAvailableColours(
			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours) {
		ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours1 = (ListColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListColorOfCasingsAvailableColours.class)
				.load(listcolorofcasingsavailablecolours.getId());
		listcolorofcasingsavailablecolours1.setName(listcolorofcasingsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listcolorofcasingsavailablecolours1;
	};

	@Override
	public List<ListColorOfCasingsAvailableColours> updateListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		for (ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours1 : listcolorofcasingsavailablecolours) {
			ListColorOfCasingsAvailableColours ListColorOfCasingsAvailableColours2 = (ListColorOfCasingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListColorOfCasingsAvailableColours.class)
					.load(listcolorofcasingsavailablecolours1.getId());
			ListColorOfCasingsAvailableColours2.setName(listcolorofcasingsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListColorOfCasingsAvailableColours delSingleListColorOfCasingsAvailableColours(long id) {
		ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours = (ListColorOfCasingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListColorOfCasingsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listcolorofcasingsavailablecolours);
		return listcolorofcasingsavailablecolours;
	};

	@Override
	public List<ListColorOfCasingsAvailableColours> delListColorOfCasingsAvailableColours(
			List<ListColorOfCasingsAvailableColours> listcolorofcasingsavailablecolours) {
		for (ListColorOfCasingsAvailableColours ListColorOfCasingsAvailableColours1 : listcolorofcasingsavailablecolours) {

			ListColorOfCasingsAvailableColours listcolorofcasingsavailablecolours2 = (ListColorOfCasingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListColorOfCasingsAvailableColours.class)
					.load(ListColorOfCasingsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listcolorofcasingsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListCrossbarProfile> getListListCrossbarProfile() {
		List<ListCrossbarProfile> listcrossbarprofile = (List<ListCrossbarProfile>) sessionFactory.getCurrentSession()
				.createQuery("from ListCrossbarProfile").list();
		return listcrossbarprofile;
	};

	@Override
	public ListCrossbarProfile getSingleListCrossbarProfile(long id) {
		ListCrossbarProfile listcrossbarprofile = (ListCrossbarProfile) sessionFactory.getCurrentSession()
				.get(ListCrossbarProfile.class, id);
		return listcrossbarprofile;
	};

	@Override
	public ListCrossbarProfile saveListCrossbarProfile(ListCrossbarProfile listcrossbarprofile) {
		ListCrossbarProfile listcrossbarprofile1 = (ListCrossbarProfile) sessionFactory.getCurrentSession()
				.save(listcrossbarprofile);
		return listcrossbarprofile1;
	};

	@Override
	public List<ListCrossbarProfile> saveListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		for (ListCrossbarProfile listcrossbarprofile1 : listcrossbarprofile) {
			sessionFactory.getCurrentSession().save(listcrossbarprofile1);

		}
		return null;
	};

	@Override
	public ListCrossbarProfile updateListCrossbarProfile(ListCrossbarProfile listcrossbarprofile) {
		ListCrossbarProfile listcrossbarprofile1 = (ListCrossbarProfile) sessionFactory.getCurrentSession()
				.byId(ListCrossbarProfile.class).load(listcrossbarprofile.getIdListCrossbarProfile());
		listcrossbarprofile1.setName(listcrossbarprofile.getName());
		sessionFactory.getCurrentSession().flush();
		return listcrossbarprofile1;
	};

	@Override
	public List<ListCrossbarProfile> updateListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		for (ListCrossbarProfile listcrossbarprofile1 : listcrossbarprofile) {
			ListCrossbarProfile ListCrossbarProfile2 = (ListCrossbarProfile) sessionFactory.getCurrentSession()
					.byId(ListCrossbarProfile.class).load(listcrossbarprofile1.getIdListCrossbarProfile());
			ListCrossbarProfile2.setName(listcrossbarprofile1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListCrossbarProfile delSingleListCrossbarProfile(long id) {
		ListCrossbarProfile listcrossbarprofile = (ListCrossbarProfile) sessionFactory.getCurrentSession()
				.byId(ListCrossbarProfile.class).load(id);
		sessionFactory.getCurrentSession().delete(listcrossbarprofile);
		return listcrossbarprofile;
	};

	@Override
	public List<ListCrossbarProfile> delListCrossbarProfile(List<ListCrossbarProfile> listcrossbarprofile) {
		for (ListCrossbarProfile ListCrossbarProfile1 : listcrossbarprofile) {

			ListCrossbarProfile listcrossbarprofile2 = (ListCrossbarProfile) sessionFactory.getCurrentSession()
					.byId(ListCrossbarProfile.class).load(ListCrossbarProfile1.getIdListCrossbarProfile());
			sessionFactory.getCurrentSession().delete(listcrossbarprofile2);
		}
		return null;
	};

	@Override
	public List<ListCrossbarProfileAvailableColours> getListListCrossbarProfileAvailableColours() {
		List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours = (List<ListCrossbarProfileAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListCrossbarProfileAvailableColours").list();
		return listcrossbarprofileavailablecolours;
	};

	@Override
	public ListCrossbarProfileAvailableColours getSingleListCrossbarProfileAvailableColours(long id) {
		ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours = (ListCrossbarProfileAvailableColours) sessionFactory
				.getCurrentSession().get(ListCrossbarProfileAvailableColours.class, id);
		return listcrossbarprofileavailablecolours;
	};

	@Override
	public ListCrossbarProfileAvailableColours saveListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours) {
		ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours1 = (ListCrossbarProfileAvailableColours) sessionFactory
				.getCurrentSession().save(listcrossbarprofileavailablecolours);
		return listcrossbarprofileavailablecolours1;
	};

	@Override
	public List<ListCrossbarProfileAvailableColours> saveListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		for (ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours1 : listcrossbarprofileavailablecolours) {
			sessionFactory.getCurrentSession().save(listcrossbarprofileavailablecolours1);

		}
		return null;
	};

	@Override
	public ListCrossbarProfileAvailableColours updateListCrossbarProfileAvailableColours(
			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours) {
		ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours1 = (ListCrossbarProfileAvailableColours) sessionFactory
				.getCurrentSession().byId(ListCrossbarProfileAvailableColours.class)
				.load(listcrossbarprofileavailablecolours.getId());
		listcrossbarprofileavailablecolours1.setName(listcrossbarprofileavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listcrossbarprofileavailablecolours1;
	};

	@Override
	public List<ListCrossbarProfileAvailableColours> updateListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		for (ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours1 : listcrossbarprofileavailablecolours) {
			ListCrossbarProfileAvailableColours ListCrossbarProfileAvailableColours2 = (ListCrossbarProfileAvailableColours) sessionFactory
					.getCurrentSession().byId(ListCrossbarProfileAvailableColours.class)
					.load(listcrossbarprofileavailablecolours1.getId());
			ListCrossbarProfileAvailableColours2.setName(listcrossbarprofileavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListCrossbarProfileAvailableColours delSingleListCrossbarProfileAvailableColours(long id) {
		ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours = (ListCrossbarProfileAvailableColours) sessionFactory
				.getCurrentSession().byId(ListCrossbarProfileAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listcrossbarprofileavailablecolours);
		return listcrossbarprofileavailablecolours;
	};

	@Override
	public List<ListCrossbarProfileAvailableColours> delListCrossbarProfileAvailableColours(
			List<ListCrossbarProfileAvailableColours> listcrossbarprofileavailablecolours) {
		for (ListCrossbarProfileAvailableColours ListCrossbarProfileAvailableColours1 : listcrossbarprofileavailablecolours) {

			ListCrossbarProfileAvailableColours listcrossbarprofileavailablecolours2 = (ListCrossbarProfileAvailableColours) sessionFactory
					.getCurrentSession().byId(ListCrossbarProfileAvailableColours.class)
					.load(ListCrossbarProfileAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listcrossbarprofileavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListDiffuserColor> getListListDiffuserColor() {
		List<ListDiffuserColor> listdiffusercolor = (List<ListDiffuserColor>) sessionFactory.getCurrentSession()
				.createQuery("from ListDiffuserColor").list();
		return listdiffusercolor;
	};

	@Override
	public ListDiffuserColor getSingleListDiffuserColor(long id) {
		ListDiffuserColor listdiffusercolor = (ListDiffuserColor) sessionFactory.getCurrentSession()
				.get(ListDiffuserColor.class, id);
		return listdiffusercolor;
	};

	@Override
	public ListDiffuserColor saveListDiffuserColor(ListDiffuserColor listdiffusercolor) {
		ListDiffuserColor listdiffusercolor1 = (ListDiffuserColor) sessionFactory.getCurrentSession()
				.save(listdiffusercolor);
		return listdiffusercolor1;
	};

	@Override
	public List<ListDiffuserColor> saveListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		for (ListDiffuserColor listdiffusercolor1 : listdiffusercolor) {
			sessionFactory.getCurrentSession().save(listdiffusercolor1);

		}
		return null;
	};

	@Override
	public ListDiffuserColor updateListDiffuserColor(ListDiffuserColor listdiffusercolor) {
		ListDiffuserColor listdiffusercolor1 = (ListDiffuserColor) sessionFactory.getCurrentSession()
				.byId(ListDiffuserColor.class).load(listdiffusercolor.getIdListDiffuserColor());
		listdiffusercolor1.setName(listdiffusercolor.getName());
		sessionFactory.getCurrentSession().flush();
		return listdiffusercolor1;
	};

	@Override
	public List<ListDiffuserColor> updateListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		for (ListDiffuserColor listdiffusercolor1 : listdiffusercolor) {
			ListDiffuserColor ListDiffuserColor2 = (ListDiffuserColor) sessionFactory.getCurrentSession()
					.byId(ListDiffuserColor.class).load(listdiffusercolor1.getIdListDiffuserColor());
			ListDiffuserColor2.setName(listdiffusercolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListDiffuserColor delSingleListDiffuserColor(long id) {
		ListDiffuserColor listdiffusercolor = (ListDiffuserColor) sessionFactory.getCurrentSession()
				.byId(ListDiffuserColor.class).load(id);
		sessionFactory.getCurrentSession().delete(listdiffusercolor);
		return listdiffusercolor;
	};

	@Override
	public List<ListDiffuserColor> delListDiffuserColor(List<ListDiffuserColor> listdiffusercolor) {
		for (ListDiffuserColor ListDiffuserColor1 : listdiffusercolor) {

			ListDiffuserColor listdiffusercolor2 = (ListDiffuserColor) sessionFactory.getCurrentSession()
					.byId(ListDiffuserColor.class).load(ListDiffuserColor1.getIdListDiffuserColor());
			sessionFactory.getCurrentSession().delete(listdiffusercolor2);
		}
		return null;
	};

	@Override
	public List<ListDoorHandleColor> getListListDoorHandleColor() {
		List<ListDoorHandleColor> listdoorhandlecolor = (List<ListDoorHandleColor>) sessionFactory.getCurrentSession()
				.createQuery("from ListDoorHandleColor").list();
		return listdoorhandlecolor;
	};

	@Override
	public ListDoorHandleColor getSingleListDoorHandleColor(long id) {
		ListDoorHandleColor listdoorhandlecolor = (ListDoorHandleColor) sessionFactory.getCurrentSession()
				.get(ListDoorHandleColor.class, id);
		return listdoorhandlecolor;
	};

	@Override
	public ListDoorHandleColor saveListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor) {
		ListDoorHandleColor listdoorhandlecolor1 = (ListDoorHandleColor) sessionFactory.getCurrentSession()
				.save(listdoorhandlecolor);
		return listdoorhandlecolor1;
	};

	@Override
	public List<ListDoorHandleColor> saveListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		for (ListDoorHandleColor listdoorhandlecolor1 : listdoorhandlecolor) {
			sessionFactory.getCurrentSession().save(listdoorhandlecolor1);

		}
		return null;
	};

	@Override
	public ListDoorHandleColor updateListDoorHandleColor(ListDoorHandleColor listdoorhandlecolor) {
		ListDoorHandleColor listdoorhandlecolor1 = (ListDoorHandleColor) sessionFactory.getCurrentSession()
				.byId(ListDoorHandleColor.class).load(listdoorhandlecolor.getId());
		listdoorhandlecolor1.setName(listdoorhandlecolor.getName());
		sessionFactory.getCurrentSession().flush();
		return listdoorhandlecolor1;
	};

	@Override
	public List<ListDoorHandleColor> updateListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		for (ListDoorHandleColor listdoorhandlecolor1 : listdoorhandlecolor) {
			ListDoorHandleColor ListDoorHandleColor2 = (ListDoorHandleColor) sessionFactory.getCurrentSession()
					.byId(ListDoorHandleColor.class).load(listdoorhandlecolor1.getId());
			ListDoorHandleColor2.setName(listdoorhandlecolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListDoorHandleColor delSingleListDoorHandleColor(long id) {
		ListDoorHandleColor listdoorhandlecolor = (ListDoorHandleColor) sessionFactory.getCurrentSession()
				.byId(ListDoorHandleColor.class).load(id);
		sessionFactory.getCurrentSession().delete(listdoorhandlecolor);
		return listdoorhandlecolor;
	};

	@Override
	public List<ListDoorHandleColor> delListDoorHandleColor(List<ListDoorHandleColor> listdoorhandlecolor) {
		for (ListDoorHandleColor ListDoorHandleColor1 : listdoorhandlecolor) {

			ListDoorHandleColor listdoorhandlecolor2 = (ListDoorHandleColor) sessionFactory.getCurrentSession()
					.byId(ListDoorHandleColor.class).load(ListDoorHandleColor1.getId());
			sessionFactory.getCurrentSession().delete(listdoorhandlecolor2);
		}
		return null;
	};

	@Override
	public List<ListExtension> getListListExtension() {
		List<ListExtension> listextension = (List<ListExtension>) sessionFactory.getCurrentSession()
				.createQuery("from ListExtension").list();
		return listextension;
	};

	@Override
	public ListExtension getSingleListExtension(long id) {
		ListExtension listextension = (ListExtension) sessionFactory.getCurrentSession().get(ListExtension.class, id);
		return listextension;
	};

	@Override
	public ListExtension saveListExtension(ListExtension listextension) {
		ListExtension listextension1 = (ListExtension) sessionFactory.getCurrentSession().save(listextension);
		return listextension1;
	};

	@Override
	public List<ListExtension> saveListExtension(List<ListExtension> listextension) {
		for (ListExtension listextension1 : listextension) {
			sessionFactory.getCurrentSession().save(listextension1);

		}
		return null;
	};

	@Override
	public ListExtension updateListExtension(ListExtension listextension) {
		ListExtension listextension1 = (ListExtension) sessionFactory.getCurrentSession().byId(ListExtension.class)
				.load(listextension.getIdListExtension());
		listextension1.setName(listextension.getName());
		sessionFactory.getCurrentSession().flush();
		return listextension1;
	};

	@Override
	public List<ListExtension> updateListExtension(List<ListExtension> listextension) {
		for (ListExtension listextension1 : listextension) {
			ListExtension ListExtension2 = (ListExtension) sessionFactory.getCurrentSession().byId(ListExtension.class)
					.load(listextension1.getIdListExtension());
			ListExtension2.setName(listextension1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListExtension delSingleListExtension(long id) {
		ListExtension listextension = (ListExtension) sessionFactory.getCurrentSession().byId(ListExtension.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(listextension);
		return listextension;
	};

	@Override
	public List<ListExtension> delListExtension(List<ListExtension> listextension) {
		for (ListExtension ListExtension1 : listextension) {

			ListExtension listextension2 = (ListExtension) sessionFactory.getCurrentSession().byId(ListExtension.class)
					.load(ListExtension1.getIdListExtension());
			sessionFactory.getCurrentSession().delete(listextension2);
		}
		return null;
	};

	@Override
	public List<ListExtensionAvailableColours> getListListExtensionAvailableColours() {
		List<ListExtensionAvailableColours> listextensionavailablecolours = (List<ListExtensionAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListExtensionAvailableColours").list();
		return listextensionavailablecolours;
	};

	@Override
	public ListExtensionAvailableColours getSingleListExtensionAvailableColours(long id) {
		ListExtensionAvailableColours listextensionavailablecolours = (ListExtensionAvailableColours) sessionFactory
				.getCurrentSession().get(ListExtensionAvailableColours.class, id);
		return listextensionavailablecolours;
	};

	@Override
	public ListExtensionAvailableColours saveListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours) {
		ListExtensionAvailableColours listextensionavailablecolours1 = (ListExtensionAvailableColours) sessionFactory
				.getCurrentSession().save(listextensionavailablecolours);
		return listextensionavailablecolours1;
	};

	@Override
	public List<ListExtensionAvailableColours> saveListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		for (ListExtensionAvailableColours listextensionavailablecolours1 : listextensionavailablecolours) {
			sessionFactory.getCurrentSession().save(listextensionavailablecolours1);

		}
		return null;
	};

	@Override
	public ListExtensionAvailableColours updateListExtensionAvailableColours(
			ListExtensionAvailableColours listextensionavailablecolours) {
		ListExtensionAvailableColours listextensionavailablecolours1 = (ListExtensionAvailableColours) sessionFactory
				.getCurrentSession().byId(ListExtensionAvailableColours.class)
				.load(listextensionavailablecolours.getId());
		listextensionavailablecolours1.setName(listextensionavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listextensionavailablecolours1;
	};

	@Override
	public List<ListExtensionAvailableColours> updateListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		for (ListExtensionAvailableColours listextensionavailablecolours1 : listextensionavailablecolours) {
			ListExtensionAvailableColours ListExtensionAvailableColours2 = (ListExtensionAvailableColours) sessionFactory
					.getCurrentSession().byId(ListExtensionAvailableColours.class)
					.load(listextensionavailablecolours1.getId());
			ListExtensionAvailableColours2.setName(listextensionavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListExtensionAvailableColours delSingleListExtensionAvailableColours(long id) {
		ListExtensionAvailableColours listextensionavailablecolours = (ListExtensionAvailableColours) sessionFactory
				.getCurrentSession().byId(ListExtensionAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listextensionavailablecolours);
		return listextensionavailablecolours;
	};

	@Override
	public List<ListExtensionAvailableColours> delListExtensionAvailableColours(
			List<ListExtensionAvailableColours> listextensionavailablecolours) {
		for (ListExtensionAvailableColours ListExtensionAvailableColours1 : listextensionavailablecolours) {

			ListExtensionAvailableColours listextensionavailablecolours2 = (ListExtensionAvailableColours) sessionFactory
					.getCurrentSession().byId(ListExtensionAvailableColours.class)
					.load(ListExtensionAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listextensionavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListExternalColor> getListListExternalColor() {
		List<ListExternalColor> listexternalcolor = (List<ListExternalColor>) sessionFactory.getCurrentSession()
				.createQuery("from ListExternalColor").list();
		return listexternalcolor;
	};

	@Override
	public ListExternalColor getSingleListExternalColor(long id) {
		ListExternalColor listexternalcolor = (ListExternalColor) sessionFactory.getCurrentSession()
				.get(ListExternalColor.class, id);
		return listexternalcolor;
	};

	@Override
	public ListExternalColor saveListExternalColor(ListExternalColor listexternalcolor) {
		ListExternalColor listexternalcolor1 = (ListExternalColor) sessionFactory.getCurrentSession()
				.save(listexternalcolor);
		return listexternalcolor1;
	};

	@Override
	public List<ListExternalColor> saveListExternalColor(List<ListExternalColor> listexternalcolor) {
		for (ListExternalColor listexternalcolor1 : listexternalcolor) {
			sessionFactory.getCurrentSession().save(listexternalcolor1);

		}
		return null;
	};

	@Override
	public ListExternalColor updateListExternalColor(ListExternalColor listexternalcolor) {
		ListExternalColor listexternalcolor1 = (ListExternalColor) sessionFactory.getCurrentSession()
				.byId(ListExternalColor.class).load(listexternalcolor.getId());
		listexternalcolor1.setName(listexternalcolor.getName());
		sessionFactory.getCurrentSession().flush();
		return listexternalcolor1;
	};

	@Override
	public List<ListExternalColor> updateListExternalColor(List<ListExternalColor> listexternalcolor) {
		for (ListExternalColor listexternalcolor1 : listexternalcolor) {
			ListExternalColor ListExternalColor2 = (ListExternalColor) sessionFactory.getCurrentSession()
					.byId(ListExternalColor.class).load(listexternalcolor1.getId());
			ListExternalColor2.setName(listexternalcolor1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListExternalColor delSingleListExternalColor(long id) {
		ListExternalColor listexternalcolor = (ListExternalColor) sessionFactory.getCurrentSession()
				.byId(ListExternalColor.class).load(id);
		sessionFactory.getCurrentSession().delete(listexternalcolor);
		return listexternalcolor;
	};

	@Override
	public List<ListExternalColor> delListExternalColor(List<ListExternalColor> listexternalcolor) {
		for (ListExternalColor ListExternalColor1 : listexternalcolor) {

			ListExternalColor listexternalcolor2 = (ListExternalColor) sessionFactory.getCurrentSession()
					.byId(ListExternalColor.class).load(ListExternalColor1.getId());
			sessionFactory.getCurrentSession().delete(listexternalcolor2);
		}
		return null;
	};

	@Override
	public List<ListFittings> getListListFittings() {
		List<ListFittings> listfittings = (List<ListFittings>) sessionFactory.getCurrentSession()
				.createQuery("from ListFittings").list();
		return listfittings;
	};

	@Override
	public ListFittings getSingleListFittings(long id) {
		ListFittings listfittings = (ListFittings) sessionFactory.getCurrentSession().get(ListFittings.class, id);
		return listfittings;
	};

	@Override
	public ListFittings saveListFittings(ListFittings listfittings) {
		ListFittings listfittings1 = (ListFittings) sessionFactory.getCurrentSession().save(listfittings);
		return listfittings1;
	};

	@Override
	public List<ListFittings> saveListFittings(List<ListFittings> listfittings) {
		for (ListFittings listfittings1 : listfittings) {
			sessionFactory.getCurrentSession().save(listfittings1);

		}
		return null;
	};

	@Override
	public ListFittings updateListFittings(ListFittings listfittings) {
		ListFittings listfittings1 = (ListFittings) sessionFactory.getCurrentSession().byId(ListFittings.class)
				.load(listfittings.getIdListFittings());
		listfittings1.setName(listfittings.getName());
		sessionFactory.getCurrentSession().flush();
		return listfittings1;
	};

	@Override
	public List<ListFittings> updateListFittings(List<ListFittings> listfittings) {
		for (ListFittings listfittings1 : listfittings) {
			ListFittings ListFittings2 = (ListFittings) sessionFactory.getCurrentSession().byId(ListFittings.class)
					.load(listfittings1.getIdListFittings());
			ListFittings2.setName(listfittings1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListFittings delSingleListFittings(long id) {
		ListFittings listfittings = (ListFittings) sessionFactory.getCurrentSession().byId(ListFittings.class).load(id);
		sessionFactory.getCurrentSession().delete(listfittings);
		return listfittings;
	};

	@Override
	public List<ListFittings> delListFittings(List<ListFittings> listfittings) {
		for (ListFittings ListFittings1 : listfittings) {

			ListFittings listfittings2 = (ListFittings) sessionFactory.getCurrentSession().byId(ListFittings.class)
					.load(ListFittings1.getIdListFittings());
			sessionFactory.getCurrentSession().delete(listfittings2);
		}
		return null;
	};

	@Override
	public List<ListFittingsAvailableColours> getListListFittingsAvailableColours() {
		List<ListFittingsAvailableColours> listfittingsavailablecolours = (List<ListFittingsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListFittingsAvailableColours").list();
		return listfittingsavailablecolours;
	};

	@Override
	public ListFittingsAvailableColours getSingleListFittingsAvailableColours(long id) {
		ListFittingsAvailableColours listfittingsavailablecolours = (ListFittingsAvailableColours) sessionFactory
				.getCurrentSession().get(ListFittingsAvailableColours.class, id);
		return listfittingsavailablecolours;
	};

	@Override
	public ListFittingsAvailableColours saveListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours) {
		ListFittingsAvailableColours listfittingsavailablecolours1 = (ListFittingsAvailableColours) sessionFactory
				.getCurrentSession().save(listfittingsavailablecolours);
		return listfittingsavailablecolours1;
	};

	@Override
	public List<ListFittingsAvailableColours> saveListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		for (ListFittingsAvailableColours listfittingsavailablecolours1 : listfittingsavailablecolours) {
			sessionFactory.getCurrentSession().save(listfittingsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListFittingsAvailableColours updateListFittingsAvailableColours(
			ListFittingsAvailableColours listfittingsavailablecolours) {
		ListFittingsAvailableColours listfittingsavailablecolours1 = (ListFittingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListFittingsAvailableColours.class)
				.load(listfittingsavailablecolours.getId());
		listfittingsavailablecolours1.setName(listfittingsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listfittingsavailablecolours1;
	};

	@Override
	public List<ListFittingsAvailableColours> updateListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		for (ListFittingsAvailableColours listfittingsavailablecolours1 : listfittingsavailablecolours) {
			ListFittingsAvailableColours ListFittingsAvailableColours2 = (ListFittingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListFittingsAvailableColours.class)
					.load(listfittingsavailablecolours1.getId());
			ListFittingsAvailableColours2.setName(listfittingsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListFittingsAvailableColours delSingleListFittingsAvailableColours(long id) {
		ListFittingsAvailableColours listfittingsavailablecolours = (ListFittingsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListFittingsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listfittingsavailablecolours);
		return listfittingsavailablecolours;
	};

	@Override
	public List<ListFittingsAvailableColours> delListFittingsAvailableColours(
			List<ListFittingsAvailableColours> listfittingsavailablecolours) {
		for (ListFittingsAvailableColours ListFittingsAvailableColours1 : listfittingsavailablecolours) {

			ListFittingsAvailableColours listfittingsavailablecolours2 = (ListFittingsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListFittingsAvailableColours.class)
					.load(ListFittingsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listfittingsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListFrameColors> getListListFrameColors() {
		List<ListFrameColors> listframecolors = (List<ListFrameColors>) sessionFactory.getCurrentSession()
				.createQuery("from ListFrameColors").list();
		return listframecolors;
	};

	@Override
	public ListFrameColors getSingleListFrameColors(long id) {
		ListFrameColors listframecolors = (ListFrameColors) sessionFactory.getCurrentSession()
				.get(ListFrameColors.class, id);
		return listframecolors;
	};

	@Override
	public ListFrameColors saveListFrameColors(ListFrameColors listframecolors) {
		ListFrameColors listframecolors1 = (ListFrameColors) sessionFactory.getCurrentSession().save(listframecolors);
		return listframecolors1;
	};

	@Override
	public List<ListFrameColors> saveListFrameColors(List<ListFrameColors> listframecolors) {
		for (ListFrameColors listframecolors1 : listframecolors) {
			sessionFactory.getCurrentSession().save(listframecolors1);

		}
		return null;
	};

	@Override
	public ListFrameColors updateListFrameColors(ListFrameColors listframecolors) {
		ListFrameColors listframecolors1 = (ListFrameColors) sessionFactory.getCurrentSession()
				.byId(ListFrameColors.class).load(listframecolors.getId());
		listframecolors1.setName(listframecolors.getName());
		sessionFactory.getCurrentSession().flush();
		return listframecolors1;
	};

	@Override
	public List<ListFrameColors> updateListFrameColors(List<ListFrameColors> listframecolors) {
		for (ListFrameColors listframecolors1 : listframecolors) {
			ListFrameColors ListFrameColors2 = (ListFrameColors) sessionFactory.getCurrentSession()
					.byId(ListFrameColors.class).load(listframecolors1.getId());
			ListFrameColors2.setName(listframecolors1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListFrameColors delSingleListFrameColors(long id) {
		ListFrameColors listframecolors = (ListFrameColors) sessionFactory.getCurrentSession()
				.byId(ListFrameColors.class).load(id);
		sessionFactory.getCurrentSession().delete(listframecolors);
		return listframecolors;
	};

	@Override
	public List<ListFrameColors> delListFrameColors(List<ListFrameColors> listframecolors) {
		for (ListFrameColors ListFrameColors1 : listframecolors) {

			ListFrameColors listframecolors2 = (ListFrameColors) sessionFactory.getCurrentSession()
					.byId(ListFrameColors.class).load(ListFrameColors1.getId());
			sessionFactory.getCurrentSession().delete(listframecolors2);
		}
		return null;
	};

	@Override
	public List<ListFullfillments> getListListFullfillments() {
		List<ListFullfillments> listfullfillments = (List<ListFullfillments>) sessionFactory.getCurrentSession()
				.createQuery("from ListFullfillments").list();
		return listfullfillments;
	};

	@Override
	public ListFullfillments getSingleListFullfillments(long id) {
		ListFullfillments listfullfillments = (ListFullfillments) sessionFactory.getCurrentSession()
				.get(ListFullfillments.class, id);
		return listfullfillments;
	};

	@Override
	public ListFullfillments saveListFullfillments(ListFullfillments listfullfillments) {
		ListFullfillments listfullfillments1 = (ListFullfillments) sessionFactory.getCurrentSession()
				.save(listfullfillments);
		return listfullfillments1;
	};

	@Override
	public List<ListFullfillments> saveListFullfillments(List<ListFullfillments> listfullfillments) {
		for (ListFullfillments listfullfillments1 : listfullfillments) {
			sessionFactory.getCurrentSession().save(listfullfillments1);

		}
		return null;
	};

	@Override
	public ListFullfillments updateListFullfillments(ListFullfillments listfullfillments) {
		ListFullfillments listfullfillments1 = (ListFullfillments) sessionFactory.getCurrentSession()
				.byId(ListFullfillments.class).load(listfullfillments.getIdListFullfillments());
		listfullfillments1.setName(listfullfillments.getName());
		sessionFactory.getCurrentSession().flush();
		return listfullfillments1;
	};

	@Override
	public List<ListFullfillments> updateListFullfillments(List<ListFullfillments> listfullfillments) {
		for (ListFullfillments listfullfillments1 : listfullfillments) {
			ListFullfillments ListFullfillments2 = (ListFullfillments) sessionFactory.getCurrentSession()
					.byId(ListFullfillments.class).load(listfullfillments1.getIdListFullfillments());
			ListFullfillments2.setName(listfullfillments1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListFullfillments delSingleListFullfillments(long id) {
		ListFullfillments listfullfillments = (ListFullfillments) sessionFactory.getCurrentSession()
				.byId(ListFullfillments.class).load(id);
		sessionFactory.getCurrentSession().delete(listfullfillments);
		return listfullfillments;
	};

	@Override
	public List<ListFullfillments> delListFullfillments(List<ListFullfillments> listfullfillments) {
		for (ListFullfillments ListFullfillments1 : listfullfillments) {

			ListFullfillments listfullfillments2 = (ListFullfillments) sessionFactory.getCurrentSession()
					.byId(ListFullfillments.class).load(ListFullfillments1.getIdListFullfillments());
			sessionFactory.getCurrentSession().delete(listfullfillments2);
		}
		return null;
	};

	@Override
	public List<ListFullfillmentsAvailableColours> getListListFullfillmentsAvailableColours() {
		List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours = (List<ListFullfillmentsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListFullfillmentsAvailableColours").list();
		return listfullfillmentsavailablecolours;
	};

	@Override
	public ListFullfillmentsAvailableColours getSingleListFullfillmentsAvailableColours(long id) {
		ListFullfillmentsAvailableColours listfullfillmentsavailablecolours = (ListFullfillmentsAvailableColours) sessionFactory
				.getCurrentSession().get(ListFullfillmentsAvailableColours.class, id);
		return listfullfillmentsavailablecolours;
	};

	@Override
	public ListFullfillmentsAvailableColours saveListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours) {
		ListFullfillmentsAvailableColours listfullfillmentsavailablecolours1 = (ListFullfillmentsAvailableColours) sessionFactory
				.getCurrentSession().save(listfullfillmentsavailablecolours);
		return listfullfillmentsavailablecolours1;
	};

	@Override
	public List<ListFullfillmentsAvailableColours> saveListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		for (ListFullfillmentsAvailableColours listfullfillmentsavailablecolours1 : listfullfillmentsavailablecolours) {
			sessionFactory.getCurrentSession().save(listfullfillmentsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListFullfillmentsAvailableColours updateListFullfillmentsAvailableColours(
			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours) {
		ListFullfillmentsAvailableColours listfullfillmentsavailablecolours1 = (ListFullfillmentsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListFullfillmentsAvailableColours.class)
				.load(listfullfillmentsavailablecolours.getId());
		listfullfillmentsavailablecolours1.setName(listfullfillmentsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listfullfillmentsavailablecolours1;
	};

	@Override
	public List<ListFullfillmentsAvailableColours> updateListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		for (ListFullfillmentsAvailableColours listfullfillmentsavailablecolours1 : listfullfillmentsavailablecolours) {
			ListFullfillmentsAvailableColours ListFullfillmentsAvailableColours2 = (ListFullfillmentsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListFullfillmentsAvailableColours.class)
					.load(listfullfillmentsavailablecolours1.getId());
			ListFullfillmentsAvailableColours2.setName(listfullfillmentsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListFullfillmentsAvailableColours delSingleListFullfillmentsAvailableColours(long id) {
		ListFullfillmentsAvailableColours listfullfillmentsavailablecolours = (ListFullfillmentsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListFullfillmentsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listfullfillmentsavailablecolours);
		return listfullfillmentsavailablecolours;
	};

	@Override
	public List<ListFullfillmentsAvailableColours> delListFullfillmentsAvailableColours(
			List<ListFullfillmentsAvailableColours> listfullfillmentsavailablecolours) {
		for (ListFullfillmentsAvailableColours ListFullfillmentsAvailableColours1 : listfullfillmentsavailablecolours) {

			ListFullfillmentsAvailableColours listfullfillmentsavailablecolours2 = (ListFullfillmentsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListFullfillmentsAvailableColours.class)
					.load(ListFullfillmentsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listfullfillmentsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListGlazingBeads> getListListGlazingBeads() {
		List<ListGlazingBeads> listglazingbeads = (List<ListGlazingBeads>) sessionFactory.getCurrentSession()
				.createQuery("from ListGlazingBeads").list();
		return listglazingbeads;
	};

	@Override
	public ListGlazingBeads getSingleListGlazingBeads(long id) {
		ListGlazingBeads listglazingbeads = (ListGlazingBeads) sessionFactory.getCurrentSession()
				.get(ListGlazingBeads.class, id);
		return listglazingbeads;
	};

	@Override
	public ListGlazingBeads saveListGlazingBeads(ListGlazingBeads listglazingbeads) {
		ListGlazingBeads listglazingbeads1 = (ListGlazingBeads) sessionFactory.getCurrentSession()
				.save(listglazingbeads);
		return listglazingbeads1;
	};

	@Override
	public List<ListGlazingBeads> saveListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		for (ListGlazingBeads listglazingbeads1 : listglazingbeads) {
			sessionFactory.getCurrentSession().save(listglazingbeads1);

		}
		return null;
	};

	@Override
	public ListGlazingBeads updateListGlazingBeads(ListGlazingBeads listglazingbeads) {
		ListGlazingBeads listglazingbeads1 = (ListGlazingBeads) sessionFactory.getCurrentSession()
				.byId(ListGlazingBeads.class).load(listglazingbeads.getIdListGlazingBeads());
		listglazingbeads1.setName(listglazingbeads.getName());
		sessionFactory.getCurrentSession().flush();
		return listglazingbeads1;
	};

	@Override
	public List<ListGlazingBeads> updateListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		for (ListGlazingBeads listglazingbeads1 : listglazingbeads) {
			ListGlazingBeads ListGlazingBeads2 = (ListGlazingBeads) sessionFactory.getCurrentSession()
					.byId(ListGlazingBeads.class).load(listglazingbeads1.getIdListGlazingBeads());
			ListGlazingBeads2.setName(listglazingbeads1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListGlazingBeads delSingleListGlazingBeads(long id) {
		ListGlazingBeads listglazingbeads = (ListGlazingBeads) sessionFactory.getCurrentSession()
				.byId(ListGlazingBeads.class).load(id);
		sessionFactory.getCurrentSession().delete(listglazingbeads);
		return listglazingbeads;
	};

	@Override
	public List<ListGlazingBeads> delListGlazingBeads(List<ListGlazingBeads> listglazingbeads) {
		for (ListGlazingBeads ListGlazingBeads1 : listglazingbeads) {

			ListGlazingBeads listglazingbeads2 = (ListGlazingBeads) sessionFactory.getCurrentSession()
					.byId(ListGlazingBeads.class).load(ListGlazingBeads1.getIdListGlazingBeads());
			sessionFactory.getCurrentSession().delete(listglazingbeads2);
		}
		return null;
	};

	@Override
	public List<ListGlazingBeadsAvailableColours> getListListGlazingBeadsAvailableColours() {
		List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours = (List<ListGlazingBeadsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListGlazingBeadsAvailableColours").list();
		return listglazingbeadsavailablecolours;
	};

	@Override
	public ListGlazingBeadsAvailableColours getSingleListGlazingBeadsAvailableColours(long id) {
		ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours = (ListGlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().get(ListGlazingBeadsAvailableColours.class, id);
		return listglazingbeadsavailablecolours;
	};

	@Override
	public ListGlazingBeadsAvailableColours saveListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours) {
		ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours1 = (ListGlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().save(listglazingbeadsavailablecolours);
		return listglazingbeadsavailablecolours1;
	};

	@Override
	public List<ListGlazingBeadsAvailableColours> saveListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		for (ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours1 : listglazingbeadsavailablecolours) {
			sessionFactory.getCurrentSession().save(listglazingbeadsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListGlazingBeadsAvailableColours updateListGlazingBeadsAvailableColours(
			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours) {
		ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours1 = (ListGlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListGlazingBeadsAvailableColours.class)
				.load(listglazingbeadsavailablecolours.getId());
		listglazingbeadsavailablecolours1.setName(listglazingbeadsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listglazingbeadsavailablecolours1;
	};

	@Override
	public List<ListGlazingBeadsAvailableColours> updateListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		for (ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours1 : listglazingbeadsavailablecolours) {
			ListGlazingBeadsAvailableColours ListGlazingBeadsAvailableColours2 = (ListGlazingBeadsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListGlazingBeadsAvailableColours.class)
					.load(listglazingbeadsavailablecolours1.getId());
			ListGlazingBeadsAvailableColours2.setName(listglazingbeadsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListGlazingBeadsAvailableColours delSingleListGlazingBeadsAvailableColours(long id) {
		ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours = (ListGlazingBeadsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListGlazingBeadsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listglazingbeadsavailablecolours);
		return listglazingbeadsavailablecolours;
	};

	@Override
	public List<ListGlazingBeadsAvailableColours> delListGlazingBeadsAvailableColours(
			List<ListGlazingBeadsAvailableColours> listglazingbeadsavailablecolours) {
		for (ListGlazingBeadsAvailableColours ListGlazingBeadsAvailableColours1 : listglazingbeadsavailablecolours) {

			ListGlazingBeadsAvailableColours listglazingbeadsavailablecolours2 = (ListGlazingBeadsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListGlazingBeadsAvailableColours.class)
					.load(ListGlazingBeadsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listglazingbeadsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListHandles> getListListHandles() {
		List<ListHandles> listhandles = (List<ListHandles>) sessionFactory.getCurrentSession()
				.createQuery("from ListHandles").list();
		return listhandles;
	};

	@Override
	public ListHandles getSingleListHandles(long id) {
		ListHandles listhandles = (ListHandles) sessionFactory.getCurrentSession().get(ListHandles.class, id);
		return listhandles;
	};

	@Override
	public ListHandles saveListHandles(ListHandles listhandles) {
		ListHandles listhandles1 = (ListHandles) sessionFactory.getCurrentSession().save(listhandles);
		return listhandles1;
	};

	@Override
	public List<ListHandles> saveListHandles(List<ListHandles> listhandles) {
		for (ListHandles listhandles1 : listhandles) {
			sessionFactory.getCurrentSession().save(listhandles1);

		}
		return null;
	};

	@Override
	public ListHandles updateListHandles(ListHandles listhandles) {
		ListHandles listhandles1 = (ListHandles) sessionFactory.getCurrentSession().byId(ListHandles.class)
				.load(listhandles.getIdListHandles());
		listhandles1.setName(listhandles.getName());
		sessionFactory.getCurrentSession().flush();
		return listhandles1;
	};

	@Override
	public List<ListHandles> updateListHandles(List<ListHandles> listhandles) {
		for (ListHandles listhandles1 : listhandles) {
			ListHandles ListHandles2 = (ListHandles) sessionFactory.getCurrentSession().byId(ListHandles.class)
					.load(listhandles1.getIdListHandles());
			ListHandles2.setName(listhandles1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListHandles delSingleListHandles(long id) {
		ListHandles listhandles = (ListHandles) sessionFactory.getCurrentSession().byId(ListHandles.class).load(id);
		sessionFactory.getCurrentSession().delete(listhandles);
		return listhandles;
	};

	@Override
	public List<ListHandles> delListHandles(List<ListHandles> listhandles) {
		for (ListHandles ListHandles1 : listhandles) {

			ListHandles listhandles2 = (ListHandles) sessionFactory.getCurrentSession().byId(ListHandles.class)
					.load(ListHandles1.getIdListHandles());
			sessionFactory.getCurrentSession().delete(listhandles2);
		}
		return null;
	};

	@Override
	public List<ListHandlesAvailableColours> getListListHandlesAvailableColours() {
		List<ListHandlesAvailableColours> listhandlesavailablecolours = (List<ListHandlesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListHandlesAvailableColours").list();
		return listhandlesavailablecolours;
	};

	@Override
	public ListHandlesAvailableColours getSingleListHandlesAvailableColours(long id) {
		ListHandlesAvailableColours listhandlesavailablecolours = (ListHandlesAvailableColours) sessionFactory
				.getCurrentSession().get(ListHandlesAvailableColours.class, id);
		return listhandlesavailablecolours;
	};

	@Override
	public ListHandlesAvailableColours saveListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours) {
		ListHandlesAvailableColours listhandlesavailablecolours1 = (ListHandlesAvailableColours) sessionFactory
				.getCurrentSession().save(listhandlesavailablecolours);
		return listhandlesavailablecolours1;
	};

	@Override
	public List<ListHandlesAvailableColours> saveListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		for (ListHandlesAvailableColours listhandlesavailablecolours1 : listhandlesavailablecolours) {
			sessionFactory.getCurrentSession().save(listhandlesavailablecolours1);

		}
		return null;
	};

	@Override
	public ListHandlesAvailableColours updateListHandlesAvailableColours(
			ListHandlesAvailableColours listhandlesavailablecolours) {
		ListHandlesAvailableColours listhandlesavailablecolours1 = (ListHandlesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListHandlesAvailableColours.class).load(listhandlesavailablecolours.getId());
		listhandlesavailablecolours1.setName(listhandlesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listhandlesavailablecolours1;
	};

	@Override
	public List<ListHandlesAvailableColours> updateListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		for (ListHandlesAvailableColours listhandlesavailablecolours1 : listhandlesavailablecolours) {
			ListHandlesAvailableColours ListHandlesAvailableColours2 = (ListHandlesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListHandlesAvailableColours.class)
					.load(listhandlesavailablecolours1.getId());
			ListHandlesAvailableColours2.setName(listhandlesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListHandlesAvailableColours delSingleListHandlesAvailableColours(long id) {
		ListHandlesAvailableColours listhandlesavailablecolours = (ListHandlesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListHandlesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listhandlesavailablecolours);
		return listhandlesavailablecolours;
	};

	@Override
	public List<ListHandlesAvailableColours> delListHandlesAvailableColours(
			List<ListHandlesAvailableColours> listhandlesavailablecolours) {
		for (ListHandlesAvailableColours ListHandlesAvailableColours1 : listhandlesavailablecolours) {

			ListHandlesAvailableColours listhandlesavailablecolours2 = (ListHandlesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListHandlesAvailableColours.class)
					.load(ListHandlesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listhandlesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListInternalColors> getListListInternalColors() {
		List<ListInternalColors> listinternalcolors = (List<ListInternalColors>) sessionFactory.getCurrentSession()
				.createQuery("from ListInternalColors").list();
		return listinternalcolors;
	};

	@Override
	public ListInternalColors getSingleListInternalColors(long id) {
		ListInternalColors listinternalcolors = (ListInternalColors) sessionFactory.getCurrentSession()
				.get(ListInternalColors.class, id);
		return listinternalcolors;
	};

	@Override
	public ListInternalColors saveListInternalColors(ListInternalColors listinternalcolors) {
		ListInternalColors listinternalcolors1 = (ListInternalColors) sessionFactory.getCurrentSession()
				.save(listinternalcolors);
		return listinternalcolors1;
	};

	@Override
	public List<ListInternalColors> saveListInternalColors(List<ListInternalColors> listinternalcolors) {
		for (ListInternalColors listinternalcolors1 : listinternalcolors) {
			sessionFactory.getCurrentSession().save(listinternalcolors1);

		}
		return null;
	};

	@Override
	public ListInternalColors updateListInternalColors(ListInternalColors listinternalcolors) {
		ListInternalColors listinternalcolors1 = (ListInternalColors) sessionFactory.getCurrentSession()
				.byId(ListInternalColors.class).load(listinternalcolors.getId());
		listinternalcolors1.setName(listinternalcolors.getName());
		sessionFactory.getCurrentSession().flush();
		return listinternalcolors1;
	};

	@Override
	public List<ListInternalColors> updateListInternalColors(List<ListInternalColors> listinternalcolors) {
		for (ListInternalColors listinternalcolors1 : listinternalcolors) {
			ListInternalColors ListInternalColors2 = (ListInternalColors) sessionFactory.getCurrentSession()
					.byId(ListInternalColors.class).load(listinternalcolors1.getId());
			ListInternalColors2.setName(listinternalcolors1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListInternalColors delSingleListInternalColors(long id) {
		ListInternalColors listinternalcolors = (ListInternalColors) sessionFactory.getCurrentSession()
				.byId(ListInternalColors.class).load(id);
		sessionFactory.getCurrentSession().delete(listinternalcolors);
		return listinternalcolors;
	};

	@Override
	public List<ListInternalColors> delListInternalColors(List<ListInternalColors> listinternalcolors) {
		for (ListInternalColors ListInternalColors1 : listinternalcolors) {

			ListInternalColors listinternalcolors2 = (ListInternalColors) sessionFactory.getCurrentSession()
					.byId(ListInternalColors.class).load(ListInternalColors1.getId());
			sessionFactory.getCurrentSession().delete(listinternalcolors2);
		}
		return null;
	};

	@Override
	public List<ListInterPaneFrames> getListListInterPaneFrames() {
		List<ListInterPaneFrames> listinterpaneframes = (List<ListInterPaneFrames>) sessionFactory.getCurrentSession()
				.createQuery("from ListInterPaneFrames").list();
		return listinterpaneframes;
	};

	@Override
	public ListInterPaneFrames getSingleListInterPaneFrames(long id) {
		ListInterPaneFrames listinterpaneframes = (ListInterPaneFrames) sessionFactory.getCurrentSession()
				.get(ListInterPaneFrames.class, id);
		return listinterpaneframes;
	};

	@Override
	public ListInterPaneFrames saveListInterPaneFrames(ListInterPaneFrames listinterpaneframes) {
		ListInterPaneFrames listinterpaneframes1 = (ListInterPaneFrames) sessionFactory.getCurrentSession()
				.save(listinterpaneframes);
		return listinterpaneframes1;
	};

	@Override
	public List<ListInterPaneFrames> saveListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		for (ListInterPaneFrames listinterpaneframes1 : listinterpaneframes) {
			sessionFactory.getCurrentSession().save(listinterpaneframes1);

		}
		return null;
	};

	@Override
	public ListInterPaneFrames updateListInterPaneFrames(ListInterPaneFrames listinterpaneframes) {
		ListInterPaneFrames listinterpaneframes1 = (ListInterPaneFrames) sessionFactory.getCurrentSession()
				.byId(ListInterPaneFrames.class).load(listinterpaneframes.getIdListInterPaneFrames());
		listinterpaneframes1.setName(listinterpaneframes.getName());
		sessionFactory.getCurrentSession().flush();
		return listinterpaneframes1;
	};

	@Override
	public List<ListInterPaneFrames> updateListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		for (ListInterPaneFrames listinterpaneframes1 : listinterpaneframes) {
			ListInterPaneFrames ListInterPaneFrames2 = (ListInterPaneFrames) sessionFactory.getCurrentSession()
					.byId(ListInterPaneFrames.class).load(listinterpaneframes1.getIdListInterPaneFrames());
			ListInterPaneFrames2.setName(listinterpaneframes1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListInterPaneFrames delSingleListInterPaneFrames(long id) {
		ListInterPaneFrames listinterpaneframes = (ListInterPaneFrames) sessionFactory.getCurrentSession()
				.byId(ListInterPaneFrames.class).load(id);
		sessionFactory.getCurrentSession().delete(listinterpaneframes);
		return listinterpaneframes;
	};

	@Override
	public List<ListInterPaneFrames> delListInterPaneFrames(List<ListInterPaneFrames> listinterpaneframes) {
		for (ListInterPaneFrames ListInterPaneFrames1 : listinterpaneframes) {

			ListInterPaneFrames listinterpaneframes2 = (ListInterPaneFrames) sessionFactory.getCurrentSession()
					.byId(ListInterPaneFrames.class).load(ListInterPaneFrames1.getIdListInterPaneFrames());
			sessionFactory.getCurrentSession().delete(listinterpaneframes2);
		}
		return null;
	};

	@Override
	public List<ListInterPaneFramesAvailableColours> getListListInterPaneFramesAvailableColours() {
		List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours = (List<ListInterPaneFramesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListInterPaneFramesAvailableColours").list();
		return listinterpaneframesavailablecolours;
	};

	@Override
	public ListInterPaneFramesAvailableColours getSingleListInterPaneFramesAvailableColours(long id) {
		ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours = (ListInterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().get(ListInterPaneFramesAvailableColours.class, id);
		return listinterpaneframesavailablecolours;
	};

	@Override
	public ListInterPaneFramesAvailableColours saveListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours) {
		ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours1 = (ListInterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().save(listinterpaneframesavailablecolours);
		return listinterpaneframesavailablecolours1;
	};

	@Override
	public List<ListInterPaneFramesAvailableColours> saveListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		for (ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours1 : listinterpaneframesavailablecolours) {
			sessionFactory.getCurrentSession().save(listinterpaneframesavailablecolours1);

		}
		return null;
	};

	@Override
	public ListInterPaneFramesAvailableColours updateListInterPaneFramesAvailableColours(
			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours) {
		ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours1 = (ListInterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListInterPaneFramesAvailableColours.class)
				.load(listinterpaneframesavailablecolours.getId());
		listinterpaneframesavailablecolours1.setName(listinterpaneframesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listinterpaneframesavailablecolours1;
	};

	@Override
	public List<ListInterPaneFramesAvailableColours> updateListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		for (ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours1 : listinterpaneframesavailablecolours) {
			ListInterPaneFramesAvailableColours ListInterPaneFramesAvailableColours2 = (ListInterPaneFramesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListInterPaneFramesAvailableColours.class)
					.load(listinterpaneframesavailablecolours1.getId());
			ListInterPaneFramesAvailableColours2.setName(listinterpaneframesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListInterPaneFramesAvailableColours delSingleListInterPaneFramesAvailableColours(long id) {
		ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours = (ListInterPaneFramesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListInterPaneFramesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listinterpaneframesavailablecolours);
		return listinterpaneframesavailablecolours;
	};

	@Override
	public List<ListInterPaneFramesAvailableColours> delListInterPaneFramesAvailableColours(
			List<ListInterPaneFramesAvailableColours> listinterpaneframesavailablecolours) {
		for (ListInterPaneFramesAvailableColours ListInterPaneFramesAvailableColours1 : listinterpaneframesavailablecolours) {

			ListInterPaneFramesAvailableColours listinterpaneframesavailablecolours2 = (ListInterPaneFramesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListInterPaneFramesAvailableColours.class)
					.load(ListInterPaneFramesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listinterpaneframesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListMullionPatterns> getListListMullionPatterns() {
		List<ListMullionPatterns> listmullionpatterns = (List<ListMullionPatterns>) sessionFactory.getCurrentSession()
				.createQuery("from ListMullionPatterns").list();
		return listmullionpatterns;
	};

	@Override
	public ListMullionPatterns getSingleListMullionPatterns(long id) {
		ListMullionPatterns listmullionpatterns = (ListMullionPatterns) sessionFactory.getCurrentSession()
				.get(ListMullionPatterns.class, id);
		return listmullionpatterns;
	};

	@Override
	public ListMullionPatterns saveListMullionPatterns(ListMullionPatterns listmullionpatterns) {
		ListMullionPatterns listmullionpatterns1 = (ListMullionPatterns) sessionFactory.getCurrentSession()
				.save(listmullionpatterns);
		return listmullionpatterns1;
	};

	@Override
	public List<ListMullionPatterns> saveListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		for (ListMullionPatterns listmullionpatterns1 : listmullionpatterns) {
			sessionFactory.getCurrentSession().save(listmullionpatterns1);

		}
		return null;
	};

	@Override
	public ListMullionPatterns updateListMullionPatterns(ListMullionPatterns listmullionpatterns) {
		ListMullionPatterns listmullionpatterns1 = (ListMullionPatterns) sessionFactory.getCurrentSession()
				.byId(ListMullionPatterns.class).load(listmullionpatterns.getIdListMullionPatterns());
		listmullionpatterns1.setName(listmullionpatterns.getName());
		sessionFactory.getCurrentSession().flush();
		return listmullionpatterns1;
	};

	@Override
	public List<ListMullionPatterns> updateListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		for (ListMullionPatterns listmullionpatterns1 : listmullionpatterns) {
			ListMullionPatterns ListMullionPatterns2 = (ListMullionPatterns) sessionFactory.getCurrentSession()
					.byId(ListMullionPatterns.class).load(listmullionpatterns1.getIdListMullionPatterns());
			ListMullionPatterns2.setName(listmullionpatterns1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListMullionPatterns delSingleListMullionPatterns(long id) {
		ListMullionPatterns listmullionpatterns = (ListMullionPatterns) sessionFactory.getCurrentSession()
				.byId(ListMullionPatterns.class).load(id);
		sessionFactory.getCurrentSession().delete(listmullionpatterns);
		return listmullionpatterns;
	};

	@Override
	public List<ListMullionPatterns> delListMullionPatterns(List<ListMullionPatterns> listmullionpatterns) {
		for (ListMullionPatterns ListMullionPatterns1 : listmullionpatterns) {

			ListMullionPatterns listmullionpatterns2 = (ListMullionPatterns) sessionFactory.getCurrentSession()
					.byId(ListMullionPatterns.class).load(ListMullionPatterns1.getIdListMullionPatterns());
			sessionFactory.getCurrentSession().delete(listmullionpatterns2);
		}
		return null;
	};

	@Override
	public List<ListMullionPatternsAvailableColours> getListListMullionPatternsAvailableColours() {
		List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours = (List<ListMullionPatternsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListMullionPatternsAvailableColours").list();
		return listmullionpatternsavailablecolours;
	};

	@Override
	public ListMullionPatternsAvailableColours getSingleListMullionPatternsAvailableColours(long id) {
		ListMullionPatternsAvailableColours listmullionpatternsavailablecolours = (ListMullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().get(ListMullionPatternsAvailableColours.class, id);
		return listmullionpatternsavailablecolours;
	};

	@Override
	public ListMullionPatternsAvailableColours saveListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours) {
		ListMullionPatternsAvailableColours listmullionpatternsavailablecolours1 = (ListMullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().save(listmullionpatternsavailablecolours);
		return listmullionpatternsavailablecolours1;
	};

	@Override
	public List<ListMullionPatternsAvailableColours> saveListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		for (ListMullionPatternsAvailableColours listmullionpatternsavailablecolours1 : listmullionpatternsavailablecolours) {
			sessionFactory.getCurrentSession().save(listmullionpatternsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListMullionPatternsAvailableColours updateListMullionPatternsAvailableColours(
			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours) {
		ListMullionPatternsAvailableColours listmullionpatternsavailablecolours1 = (ListMullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListMullionPatternsAvailableColours.class)
				.load(listmullionpatternsavailablecolours.getId());
		listmullionpatternsavailablecolours1.setName(listmullionpatternsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listmullionpatternsavailablecolours1;
	};

	@Override
	public List<ListMullionPatternsAvailableColours> updateListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		for (ListMullionPatternsAvailableColours listmullionpatternsavailablecolours1 : listmullionpatternsavailablecolours) {
			ListMullionPatternsAvailableColours ListMullionPatternsAvailableColours2 = (ListMullionPatternsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListMullionPatternsAvailableColours.class)
					.load(listmullionpatternsavailablecolours1.getId());
			ListMullionPatternsAvailableColours2.setName(listmullionpatternsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListMullionPatternsAvailableColours delSingleListMullionPatternsAvailableColours(long id) {
		ListMullionPatternsAvailableColours listmullionpatternsavailablecolours = (ListMullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListMullionPatternsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listmullionpatternsavailablecolours);
		return listmullionpatternsavailablecolours;
	};

	@Override
	public List<ListMullionPatternsAvailableColours> delListMullionPatternsAvailableColours(
			List<ListMullionPatternsAvailableColours> listmullionpatternsavailablecolours) {
		for (ListMullionPatternsAvailableColours ListMullionPatternsAvailableColours1 : listmullionpatternsavailablecolours) {

			ListMullionPatternsAvailableColours listmullionpatternsavailablecolours2 = (ListMullionPatternsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListMullionPatternsAvailableColours.class)
					.load(ListMullionPatternsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listmullionpatternsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListOpeningFunctions> getListListOpeningFunctions() {
		List<ListOpeningFunctions> listopeningfunctions = (List<ListOpeningFunctions>) sessionFactory
				.getCurrentSession().createQuery("from ListOpeningFunctions").list();
		return listopeningfunctions;
	};

	@Override
	public ListOpeningFunctions getSingleListOpeningFunctions(long id) {
		ListOpeningFunctions listopeningfunctions = (ListOpeningFunctions) sessionFactory.getCurrentSession()
				.get(ListOpeningFunctions.class, id);
		return listopeningfunctions;
	};

	@Override
	public ListOpeningFunctions saveListOpeningFunctions(ListOpeningFunctions listopeningfunctions) {
		ListOpeningFunctions listopeningfunctions1 = (ListOpeningFunctions) sessionFactory.getCurrentSession()
				.save(listopeningfunctions);
		return listopeningfunctions1;
	};

	@Override
	public List<ListOpeningFunctions> saveListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		for (ListOpeningFunctions listopeningfunctions1 : listopeningfunctions) {
			sessionFactory.getCurrentSession().save(listopeningfunctions1);

		}
		return null;
	};

	@Override
	public ListOpeningFunctions updateListOpeningFunctions(ListOpeningFunctions listopeningfunctions) {
		ListOpeningFunctions listopeningfunctions1 = (ListOpeningFunctions) sessionFactory.getCurrentSession()
				.byId(ListOpeningFunctions.class).load(listopeningfunctions.getIdListOpeningFunctions());
		listopeningfunctions1.setName(listopeningfunctions.getName());
		sessionFactory.getCurrentSession().flush();
		return listopeningfunctions1;
	};

	@Override
	public List<ListOpeningFunctions> updateListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		for (ListOpeningFunctions listopeningfunctions1 : listopeningfunctions) {
			ListOpeningFunctions ListOpeningFunctions2 = (ListOpeningFunctions) sessionFactory.getCurrentSession()
					.byId(ListOpeningFunctions.class).load(listopeningfunctions1.getIdListOpeningFunctions());
			ListOpeningFunctions2.setName(listopeningfunctions1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListOpeningFunctions delSingleListOpeningFunctions(long id) {
		ListOpeningFunctions listopeningfunctions = (ListOpeningFunctions) sessionFactory.getCurrentSession()
				.byId(ListOpeningFunctions.class).load(id);
		sessionFactory.getCurrentSession().delete(listopeningfunctions);
		return listopeningfunctions;
	};

	@Override
	public List<ListOpeningFunctions> delListOpeningFunctions(List<ListOpeningFunctions> listopeningfunctions) {
		for (ListOpeningFunctions ListOpeningFunctions1 : listopeningfunctions) {

			ListOpeningFunctions listopeningfunctions2 = (ListOpeningFunctions) sessionFactory.getCurrentSession()
					.byId(ListOpeningFunctions.class).load(ListOpeningFunctions1.getIdListOpeningFunctions());
			sessionFactory.getCurrentSession().delete(listopeningfunctions2);
		}
		return null;
	};

	@Override
	public List<ListOpeningFunctionsAvailableColours> getListListOpeningFunctionsAvailableColours() {
		List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours = (List<ListOpeningFunctionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListOpeningFunctionsAvailableColours").list();
		return listopeningfunctionsavailablecolours;
	};

	@Override
	public ListOpeningFunctionsAvailableColours getSingleListOpeningFunctionsAvailableColours(long id) {
		ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours = (ListOpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().get(ListOpeningFunctionsAvailableColours.class, id);
		return listopeningfunctionsavailablecolours;
	};

	@Override
	public ListOpeningFunctionsAvailableColours saveListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours) {
		ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours1 = (ListOpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().save(listopeningfunctionsavailablecolours);
		return listopeningfunctionsavailablecolours1;
	};

	@Override
	public List<ListOpeningFunctionsAvailableColours> saveListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		for (ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours1 : listopeningfunctionsavailablecolours) {
			sessionFactory.getCurrentSession().save(listopeningfunctionsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListOpeningFunctionsAvailableColours updateListOpeningFunctionsAvailableColours(
			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours) {
		ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours1 = (ListOpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListOpeningFunctionsAvailableColours.class)
				.load(listopeningfunctionsavailablecolours.getId());
		listopeningfunctionsavailablecolours1.setName(listopeningfunctionsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listopeningfunctionsavailablecolours1;
	};

	@Override
	public List<ListOpeningFunctionsAvailableColours> updateListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		for (ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours1 : listopeningfunctionsavailablecolours) {
			ListOpeningFunctionsAvailableColours ListOpeningFunctionsAvailableColours2 = (ListOpeningFunctionsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListOpeningFunctionsAvailableColours.class)
					.load(listopeningfunctionsavailablecolours1.getId());
			ListOpeningFunctionsAvailableColours2.setName(listopeningfunctionsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListOpeningFunctionsAvailableColours delSingleListOpeningFunctionsAvailableColours(long id) {
		ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours = (ListOpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListOpeningFunctionsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listopeningfunctionsavailablecolours);
		return listopeningfunctionsavailablecolours;
	};

	@Override
	public List<ListOpeningFunctionsAvailableColours> delListOpeningFunctionsAvailableColours(
			List<ListOpeningFunctionsAvailableColours> listopeningfunctionsavailablecolours) {
		for (ListOpeningFunctionsAvailableColours ListOpeningFunctionsAvailableColours1 : listopeningfunctionsavailablecolours) {

			ListOpeningFunctionsAvailableColours listopeningfunctionsavailablecolours2 = (ListOpeningFunctionsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListOpeningFunctionsAvailableColours.class)
					.load(ListOpeningFunctionsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listopeningfunctionsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListReeds> getListListReeds() {
		List<ListReeds> listreeds = (List<ListReeds>) sessionFactory.getCurrentSession().createQuery("from ListReeds")
				.list();
		return listreeds;
	};

	@Override
	public ListReeds getSingleListReeds(long id) {
		ListReeds listreeds = (ListReeds) sessionFactory.getCurrentSession().get(ListReeds.class, id);
		return listreeds;
	};

	@Override
	public ListReeds saveListReeds(ListReeds listreeds) {
		ListReeds listreeds1 = (ListReeds) sessionFactory.getCurrentSession().save(listreeds);
		return listreeds1;
	};

	@Override
	public List<ListReeds> saveListReeds(List<ListReeds> listreeds) {
		for (ListReeds listreeds1 : listreeds) {
			sessionFactory.getCurrentSession().save(listreeds1);

		}
		return null;
	};

	@Override
	public ListReeds updateListReeds(ListReeds listreeds) {
		ListReeds listreeds1 = (ListReeds) sessionFactory.getCurrentSession().byId(ListReeds.class)
				.load(listreeds.getIdListReeds());
		listreeds1.setName(listreeds.getName());
		sessionFactory.getCurrentSession().flush();
		return listreeds1;
	};

	@Override
	public List<ListReeds> updateListReeds(List<ListReeds> listreeds) {
		for (ListReeds listreeds1 : listreeds) {
			ListReeds ListReeds2 = (ListReeds) sessionFactory.getCurrentSession().byId(ListReeds.class)
					.load(listreeds1.getIdListReeds());
			ListReeds2.setName(listreeds1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListReeds delSingleListReeds(long id) {
		ListReeds listreeds = (ListReeds) sessionFactory.getCurrentSession().byId(ListReeds.class).load(id);
		sessionFactory.getCurrentSession().delete(listreeds);
		return listreeds;
	};

	@Override
	public List<ListReeds> delListReeds(List<ListReeds> listreeds) {
		for (ListReeds ListReeds1 : listreeds) {

			ListReeds listreeds2 = (ListReeds) sessionFactory.getCurrentSession().byId(ListReeds.class)
					.load(ListReeds1.getIdListReeds());
			sessionFactory.getCurrentSession().delete(listreeds2);
		}
		return null;
	};

	@Override
	public List<ListReedsAvailableColours> getListListReedsAvailableColours() {
		List<ListReedsAvailableColours> listreedsavailablecolours = (List<ListReedsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListReedsAvailableColours").list();
		return listreedsavailablecolours;
	};

	@Override
	public ListReedsAvailableColours getSingleListReedsAvailableColours(long id) {
		ListReedsAvailableColours listreedsavailablecolours = (ListReedsAvailableColours) sessionFactory
				.getCurrentSession().get(ListReedsAvailableColours.class, id);
		return listreedsavailablecolours;
	};

	@Override
	public ListReedsAvailableColours saveListReedsAvailableColours(
			ListReedsAvailableColours listreedsavailablecolours) {
		ListReedsAvailableColours listreedsavailablecolours1 = (ListReedsAvailableColours) sessionFactory
				.getCurrentSession().save(listreedsavailablecolours);
		return listreedsavailablecolours1;
	};

	@Override
	public List<ListReedsAvailableColours> saveListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		for (ListReedsAvailableColours listreedsavailablecolours1 : listreedsavailablecolours) {
			sessionFactory.getCurrentSession().save(listreedsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListReedsAvailableColours updateListReedsAvailableColours(
			ListReedsAvailableColours listreedsavailablecolours) {
		ListReedsAvailableColours listreedsavailablecolours1 = (ListReedsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListReedsAvailableColours.class).load(listreedsavailablecolours.getId());
		listreedsavailablecolours1.setName(listreedsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listreedsavailablecolours1;
	};

	@Override
	public List<ListReedsAvailableColours> updateListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		for (ListReedsAvailableColours listreedsavailablecolours1 : listreedsavailablecolours) {
			ListReedsAvailableColours ListReedsAvailableColours2 = (ListReedsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListReedsAvailableColours.class).load(listreedsavailablecolours1.getId());
			ListReedsAvailableColours2.setName(listreedsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListReedsAvailableColours delSingleListReedsAvailableColours(long id) {
		ListReedsAvailableColours listreedsavailablecolours = (ListReedsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListReedsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listreedsavailablecolours);
		return listreedsavailablecolours;
	};

	@Override
	public List<ListReedsAvailableColours> delListReedsAvailableColours(
			List<ListReedsAvailableColours> listreedsavailablecolours) {
		for (ListReedsAvailableColours ListReedsAvailableColours1 : listreedsavailablecolours) {

			ListReedsAvailableColours listreedsavailablecolours2 = (ListReedsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListReedsAvailableColours.class).load(ListReedsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listreedsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListReiforcements> getListListReiforcements() {
		List<ListReiforcements> listreiforcements = (List<ListReiforcements>) sessionFactory.getCurrentSession()
				.createQuery("from ListReiforcements").list();
		return listreiforcements;
	};

	@Override
	public ListReiforcements getSingleListReiforcements(long id) {
		ListReiforcements listreiforcements = (ListReiforcements) sessionFactory.getCurrentSession()
				.get(ListReiforcements.class, id);
		return listreiforcements;
	};

	@Override
	public ListReiforcements saveListReiforcements(ListReiforcements listreiforcements) {
		ListReiforcements listreiforcements1 = (ListReiforcements) sessionFactory.getCurrentSession()
				.save(listreiforcements);
		return listreiforcements1;
	};

	@Override
	public List<ListReiforcements> saveListReiforcements(List<ListReiforcements> listreiforcements) {
		for (ListReiforcements listreiforcements1 : listreiforcements) {
			sessionFactory.getCurrentSession().save(listreiforcements1);

		}
		return null;
	};

	@Override
	public ListReiforcements updateListReiforcements(ListReiforcements listreiforcements) {
		ListReiforcements listreiforcements1 = (ListReiforcements) sessionFactory.getCurrentSession()
				.byId(ListReiforcements.class).load(listreiforcements.getIdListReiforcements());
		listreiforcements1.setName(listreiforcements.getName());
		sessionFactory.getCurrentSession().flush();
		return listreiforcements1;
	};

	@Override
	public List<ListReiforcements> updateListReiforcements(List<ListReiforcements> listreiforcements) {
		for (ListReiforcements listreiforcements1 : listreiforcements) {
			ListReiforcements ListReiforcements2 = (ListReiforcements) sessionFactory.getCurrentSession()
					.byId(ListReiforcements.class).load(listreiforcements1.getIdListReiforcements());
			ListReiforcements2.setName(listreiforcements1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListReiforcements delSingleListReiforcements(long id) {
		ListReiforcements listreiforcements = (ListReiforcements) sessionFactory.getCurrentSession()
				.byId(ListReiforcements.class).load(id);
		sessionFactory.getCurrentSession().delete(listreiforcements);
		return listreiforcements;
	};

	@Override
	public List<ListReiforcements> delListReiforcements(List<ListReiforcements> listreiforcements) {
		for (ListReiforcements ListReiforcements1 : listreiforcements) {

			ListReiforcements listreiforcements2 = (ListReiforcements) sessionFactory.getCurrentSession()
					.byId(ListReiforcements.class).load(ListReiforcements1.getIdListReiforcements());
			sessionFactory.getCurrentSession().delete(listreiforcements2);
		}
		return null;
	};

	@Override
	public List<ListReiforcementsAvailableColours> getListListReiforcementsAvailableColours() {
		List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours = (List<ListReiforcementsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListReiforcementsAvailableColours").list();
		return listreiforcementsavailablecolours;
	};

	@Override
	public ListReiforcementsAvailableColours getSingleListReiforcementsAvailableColours(long id) {
		ListReiforcementsAvailableColours listreiforcementsavailablecolours = (ListReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().get(ListReiforcementsAvailableColours.class, id);
		return listreiforcementsavailablecolours;
	};

	@Override
	public ListReiforcementsAvailableColours saveListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours) {
		ListReiforcementsAvailableColours listreiforcementsavailablecolours1 = (ListReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().save(listreiforcementsavailablecolours);
		return listreiforcementsavailablecolours1;
	};

	@Override
	public List<ListReiforcementsAvailableColours> saveListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		for (ListReiforcementsAvailableColours listreiforcementsavailablecolours1 : listreiforcementsavailablecolours) {
			sessionFactory.getCurrentSession().save(listreiforcementsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListReiforcementsAvailableColours updateListReiforcementsAvailableColours(
			ListReiforcementsAvailableColours listreiforcementsavailablecolours) {
		ListReiforcementsAvailableColours listreiforcementsavailablecolours1 = (ListReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListReiforcementsAvailableColours.class)
				.load(listreiforcementsavailablecolours.getId());
		listreiforcementsavailablecolours1.setName(listreiforcementsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listreiforcementsavailablecolours1;
	};

	@Override
	public List<ListReiforcementsAvailableColours> updateListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		for (ListReiforcementsAvailableColours listreiforcementsavailablecolours1 : listreiforcementsavailablecolours) {
			ListReiforcementsAvailableColours ListReiforcementsAvailableColours2 = (ListReiforcementsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListReiforcementsAvailableColours.class)
					.load(listreiforcementsavailablecolours1.getId());
			ListReiforcementsAvailableColours2.setName(listreiforcementsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListReiforcementsAvailableColours delSingleListReiforcementsAvailableColours(long id) {
		ListReiforcementsAvailableColours listreiforcementsavailablecolours = (ListReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListReiforcementsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listreiforcementsavailablecolours);
		return listreiforcementsavailablecolours;
	};

	@Override
	public List<ListReiforcementsAvailableColours> delListReiforcementsAvailableColours(
			List<ListReiforcementsAvailableColours> listreiforcementsavailablecolours) {
		for (ListReiforcementsAvailableColours ListReiforcementsAvailableColours1 : listreiforcementsavailablecolours) {

			ListReiforcementsAvailableColours listreiforcementsavailablecolours2 = (ListReiforcementsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListReiforcementsAvailableColours.class)
					.load(ListReiforcementsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listreiforcementsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListSillStripes> getListListSillStripes() {
		List<ListSillStripes> listsillstripes = (List<ListSillStripes>) sessionFactory.getCurrentSession()
				.createQuery("from ListSillStripes").list();
		return listsillstripes;
	};

	@Override
	public ListSillStripes getSingleListSillStripes(long id) {
		ListSillStripes listsillstripes = (ListSillStripes) sessionFactory.getCurrentSession()
				.get(ListSillStripes.class, id);
		return listsillstripes;
	};

	@Override
	public ListSillStripes saveListSillStripes(ListSillStripes listsillstripes) {
		ListSillStripes listsillstripes1 = (ListSillStripes) sessionFactory.getCurrentSession().save(listsillstripes);
		return listsillstripes1;
	};

	@Override
	public List<ListSillStripes> saveListSillStripes(List<ListSillStripes> listsillstripes) {
		for (ListSillStripes listsillstripes1 : listsillstripes) {
			sessionFactory.getCurrentSession().save(listsillstripes1);

		}
		return null;
	};

	@Override
	public ListSillStripes updateListSillStripes(ListSillStripes listsillstripes) {
		ListSillStripes listsillstripes1 = (ListSillStripes) sessionFactory.getCurrentSession()
				.byId(ListSillStripes.class).load(listsillstripes.getIdListSillStripes());
		listsillstripes1.setName(listsillstripes.getName());
		sessionFactory.getCurrentSession().flush();
		return listsillstripes1;
	};

	@Override
	public List<ListSillStripes> updateListSillStripes(List<ListSillStripes> listsillstripes) {
		for (ListSillStripes listsillstripes1 : listsillstripes) {
			ListSillStripes ListSillStripes2 = (ListSillStripes) sessionFactory.getCurrentSession()
					.byId(ListSillStripes.class).load(listsillstripes1.getIdListSillStripes());
			ListSillStripes2.setName(listsillstripes1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListSillStripes delSingleListSillStripes(long id) {
		ListSillStripes listsillstripes = (ListSillStripes) sessionFactory.getCurrentSession()
				.byId(ListSillStripes.class).load(id);
		sessionFactory.getCurrentSession().delete(listsillstripes);
		return listsillstripes;
	};

	@Override
	public List<ListSillStripes> delListSillStripes(List<ListSillStripes> listsillstripes) {
		for (ListSillStripes ListSillStripes1 : listsillstripes) {

			ListSillStripes listsillstripes2 = (ListSillStripes) sessionFactory.getCurrentSession()
					.byId(ListSillStripes.class).load(ListSillStripes1.getIdListSillStripes());
			sessionFactory.getCurrentSession().delete(listsillstripes2);
		}
		return null;
	};

	@Override
	public List<ListSillStripesAvailableColours> getListListSillStripesAvailableColours() {
		List<ListSillStripesAvailableColours> listsillstripesavailablecolours = (List<ListSillStripesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListSillStripesAvailableColours").list();
		return listsillstripesavailablecolours;
	};

	@Override
	public ListSillStripesAvailableColours getSingleListSillStripesAvailableColours(long id) {
		ListSillStripesAvailableColours listsillstripesavailablecolours = (ListSillStripesAvailableColours) sessionFactory
				.getCurrentSession().get(ListSillStripesAvailableColours.class, id);
		return listsillstripesavailablecolours;
	};

	@Override
	public ListSillStripesAvailableColours saveListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours) {
		ListSillStripesAvailableColours listsillstripesavailablecolours1 = (ListSillStripesAvailableColours) sessionFactory
				.getCurrentSession().save(listsillstripesavailablecolours);
		return listsillstripesavailablecolours1;
	};

	@Override
	public List<ListSillStripesAvailableColours> saveListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		for (ListSillStripesAvailableColours listsillstripesavailablecolours1 : listsillstripesavailablecolours) {
			sessionFactory.getCurrentSession().save(listsillstripesavailablecolours1);

		}
		return null;
	};

	@Override
	public ListSillStripesAvailableColours updateListSillStripesAvailableColours(
			ListSillStripesAvailableColours listsillstripesavailablecolours) {
		ListSillStripesAvailableColours listsillstripesavailablecolours1 = (ListSillStripesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListSillStripesAvailableColours.class)
				.load(listsillstripesavailablecolours.getId());
		listsillstripesavailablecolours1.setName(listsillstripesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listsillstripesavailablecolours1;
	};

	@Override
	public List<ListSillStripesAvailableColours> updateListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		for (ListSillStripesAvailableColours listsillstripesavailablecolours1 : listsillstripesavailablecolours) {
			ListSillStripesAvailableColours ListSillStripesAvailableColours2 = (ListSillStripesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListSillStripesAvailableColours.class)
					.load(listsillstripesavailablecolours1.getId());
			ListSillStripesAvailableColours2.setName(listsillstripesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListSillStripesAvailableColours delSingleListSillStripesAvailableColours(long id) {
		ListSillStripesAvailableColours listsillstripesavailablecolours = (ListSillStripesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListSillStripesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listsillstripesavailablecolours);
		return listsillstripesavailablecolours;
	};

	@Override
	public List<ListSillStripesAvailableColours> delListSillStripesAvailableColours(
			List<ListSillStripesAvailableColours> listsillstripesavailablecolours) {
		for (ListSillStripesAvailableColours ListSillStripesAvailableColours1 : listsillstripesavailablecolours) {

			ListSillStripesAvailableColours listsillstripesavailablecolours2 = (ListSillStripesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListSillStripesAvailableColours.class)
					.load(ListSillStripesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listsillstripesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListSpecialShapes> getListListSpecialShapes() {
		List<ListSpecialShapes> listspecialshapes = (List<ListSpecialShapes>) sessionFactory.getCurrentSession()
				.createQuery("from ListSpecialShapes").list();
		return listspecialshapes;
	};

	@Override
	public ListSpecialShapes getSingleListSpecialShapes(long id) {
		ListSpecialShapes listspecialshapes = (ListSpecialShapes) sessionFactory.getCurrentSession()
				.get(ListSpecialShapes.class, id);
		return listspecialshapes;
	};

	@Override
	public ListSpecialShapes saveListSpecialShapes(ListSpecialShapes listspecialshapes) {
		ListSpecialShapes listspecialshapes1 = (ListSpecialShapes) sessionFactory.getCurrentSession()
				.save(listspecialshapes);
		return listspecialshapes1;
	};

	@Override
	public List<ListSpecialShapes> saveListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		for (ListSpecialShapes listspecialshapes1 : listspecialshapes) {
			sessionFactory.getCurrentSession().save(listspecialshapes1);

		}
		return null;
	};

	@Override
	public ListSpecialShapes updateListSpecialShapes(ListSpecialShapes listspecialshapes) {
		ListSpecialShapes listspecialshapes1 = (ListSpecialShapes) sessionFactory.getCurrentSession()
				.byId(ListSpecialShapes.class).load(listspecialshapes.getIdListSpecialShapes());
		listspecialshapes1.setName(listspecialshapes.getName());
		sessionFactory.getCurrentSession().flush();
		return listspecialshapes1;
	};

	@Override
	public List<ListSpecialShapes> updateListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		for (ListSpecialShapes listspecialshapes1 : listspecialshapes) {
			ListSpecialShapes ListSpecialShapes2 = (ListSpecialShapes) sessionFactory.getCurrentSession()
					.byId(ListSpecialShapes.class).load(listspecialshapes1.getIdListSpecialShapes());
			ListSpecialShapes2.setName(listspecialshapes1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListSpecialShapes delSingleListSpecialShapes(long id) {
		ListSpecialShapes listspecialshapes = (ListSpecialShapes) sessionFactory.getCurrentSession()
				.byId(ListSpecialShapes.class).load(id);
		sessionFactory.getCurrentSession().delete(listspecialshapes);
		return listspecialshapes;
	};

	@Override
	public List<ListSpecialShapes> delListSpecialShapes(List<ListSpecialShapes> listspecialshapes) {
		for (ListSpecialShapes ListSpecialShapes1 : listspecialshapes) {

			ListSpecialShapes listspecialshapes2 = (ListSpecialShapes) sessionFactory.getCurrentSession()
					.byId(ListSpecialShapes.class).load(ListSpecialShapes1.getIdListSpecialShapes());
			sessionFactory.getCurrentSession().delete(listspecialshapes2);
		}
		return null;
	};

	@Override
	public List<ListSpecialShapesAvailableColours> getListListSpecialShapesAvailableColours() {
		List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours = (List<ListSpecialShapesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListSpecialShapesAvailableColours").list();
		return listspecialshapesavailablecolours;
	};

	@Override
	public ListSpecialShapesAvailableColours getSingleListSpecialShapesAvailableColours(long id) {
		ListSpecialShapesAvailableColours listspecialshapesavailablecolours = (ListSpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().get(ListSpecialShapesAvailableColours.class, id);
		return listspecialshapesavailablecolours;
	};

	@Override
	public ListSpecialShapesAvailableColours saveListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours) {
		ListSpecialShapesAvailableColours listspecialshapesavailablecolours1 = (ListSpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().save(listspecialshapesavailablecolours);
		return listspecialshapesavailablecolours1;
	};

	@Override
	public List<ListSpecialShapesAvailableColours> saveListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		for (ListSpecialShapesAvailableColours listspecialshapesavailablecolours1 : listspecialshapesavailablecolours) {
			sessionFactory.getCurrentSession().save(listspecialshapesavailablecolours1);

		}
		return null;
	};

	@Override
	public ListSpecialShapesAvailableColours updateListSpecialShapesAvailableColours(
			ListSpecialShapesAvailableColours listspecialshapesavailablecolours) {
		ListSpecialShapesAvailableColours listspecialshapesavailablecolours1 = (ListSpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListSpecialShapesAvailableColours.class)
				.load(listspecialshapesavailablecolours.getId());
		listspecialshapesavailablecolours1.setName(listspecialshapesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listspecialshapesavailablecolours1;
	};

	@Override
	public List<ListSpecialShapesAvailableColours> updateListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		for (ListSpecialShapesAvailableColours listspecialshapesavailablecolours1 : listspecialshapesavailablecolours) {
			ListSpecialShapesAvailableColours ListSpecialShapesAvailableColours2 = (ListSpecialShapesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListSpecialShapesAvailableColours.class)
					.load(listspecialshapesavailablecolours1.getId());
			ListSpecialShapesAvailableColours2.setName(listspecialshapesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListSpecialShapesAvailableColours delSingleListSpecialShapesAvailableColours(long id) {
		ListSpecialShapesAvailableColours listspecialshapesavailablecolours = (ListSpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().byId(ListSpecialShapesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listspecialshapesavailablecolours);
		return listspecialshapesavailablecolours;
	};

	@Override
	public List<ListSpecialShapesAvailableColours> delListSpecialShapesAvailableColours(
			List<ListSpecialShapesAvailableColours> listspecialshapesavailablecolours) {
		for (ListSpecialShapesAvailableColours ListSpecialShapesAvailableColours1 : listspecialshapesavailablecolours) {

			ListSpecialShapesAvailableColours listspecialshapesavailablecolours2 = (ListSpecialShapesAvailableColours) sessionFactory
					.getCurrentSession().byId(ListSpecialShapesAvailableColours.class)
					.load(ListSpecialShapesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listspecialshapesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListThreeSholds> getListListThreeSholds() {
		List<ListThreeSholds> listthreesholds = (List<ListThreeSholds>) sessionFactory.getCurrentSession()
				.createQuery("from ListThreeSholds").list();
		return listthreesholds;
	};

	@Override
	public ListThreeSholds getSingleListThreeSholds(long id) {
		ListThreeSholds listthreesholds = (ListThreeSholds) sessionFactory.getCurrentSession()
				.get(ListThreeSholds.class, id);
		return listthreesholds;
	};

	@Override
	public ListThreeSholds saveListThreeSholds(ListThreeSholds listthreesholds) {
		ListThreeSholds listthreesholds1 = (ListThreeSholds) sessionFactory.getCurrentSession().save(listthreesholds);
		return listthreesholds1;
	};

	@Override
	public List<ListThreeSholds> saveListThreeSholds(List<ListThreeSholds> listthreesholds) {
		for (ListThreeSholds listthreesholds1 : listthreesholds) {
			sessionFactory.getCurrentSession().save(listthreesholds1);

		}
		return null;
	};

	@Override
	public ListThreeSholds updateListThreeSholds(ListThreeSholds listthreesholds) {
		ListThreeSholds listthreesholds1 = (ListThreeSholds) sessionFactory.getCurrentSession()
				.byId(ListThreeSholds.class).load(listthreesholds.getIdListThreeSholds());
		listthreesholds1.setName(listthreesholds.getName());
		sessionFactory.getCurrentSession().flush();
		return listthreesholds1;
	};

	@Override
	public List<ListThreeSholds> updateListThreeSholds(List<ListThreeSholds> listthreesholds) {
		for (ListThreeSholds listthreesholds1 : listthreesholds) {
			ListThreeSholds ListThreeSholds2 = (ListThreeSholds) sessionFactory.getCurrentSession()
					.byId(ListThreeSholds.class).load(listthreesholds1.getIdListThreeSholds());
			ListThreeSholds2.setName(listthreesholds1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListThreeSholds delSingleListThreeSholds(long id) {
		ListThreeSholds listthreesholds = (ListThreeSholds) sessionFactory.getCurrentSession()
				.byId(ListThreeSholds.class).load(id);
		sessionFactory.getCurrentSession().delete(listthreesholds);
		return listthreesholds;
	};

	@Override
	public List<ListThreeSholds> delListThreeSholds(List<ListThreeSholds> listthreesholds) {
		for (ListThreeSholds ListThreeSholds1 : listthreesholds) {

			ListThreeSholds listthreesholds2 = (ListThreeSholds) sessionFactory.getCurrentSession()
					.byId(ListThreeSholds.class).load(ListThreeSholds1.getIdListThreeSholds());
			sessionFactory.getCurrentSession().delete(listthreesholds2);
		}
		return null;
	};

	@Override
	public List<ListThreeSholdsAvailableColours> getListListThreeSholdsAvailableColours() {
		List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours = (List<ListThreeSholdsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListThreeSholdsAvailableColours").list();
		return listthreesholdsavailablecolours;
	};

	@Override
	public ListThreeSholdsAvailableColours getSingleListThreeSholdsAvailableColours(long id) {
		ListThreeSholdsAvailableColours listthreesholdsavailablecolours = (ListThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().get(ListThreeSholdsAvailableColours.class, id);
		return listthreesholdsavailablecolours;
	};

	@Override
	public ListThreeSholdsAvailableColours saveListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours) {
		ListThreeSholdsAvailableColours listthreesholdsavailablecolours1 = (ListThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().save(listthreesholdsavailablecolours);
		return listthreesholdsavailablecolours1;
	};

	@Override
	public List<ListThreeSholdsAvailableColours> saveListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		for (ListThreeSholdsAvailableColours listthreesholdsavailablecolours1 : listthreesholdsavailablecolours) {
			sessionFactory.getCurrentSession().save(listthreesholdsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListThreeSholdsAvailableColours updateListThreeSholdsAvailableColours(
			ListThreeSholdsAvailableColours listthreesholdsavailablecolours) {
		ListThreeSholdsAvailableColours listthreesholdsavailablecolours1 = (ListThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListThreeSholdsAvailableColours.class)
				.load(listthreesholdsavailablecolours.getId());
		listthreesholdsavailablecolours1.setName(listthreesholdsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listthreesholdsavailablecolours1;
	};

	@Override
	public List<ListThreeSholdsAvailableColours> updateListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		for (ListThreeSholdsAvailableColours listthreesholdsavailablecolours1 : listthreesholdsavailablecolours) {
			ListThreeSholdsAvailableColours ListThreeSholdsAvailableColours2 = (ListThreeSholdsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListThreeSholdsAvailableColours.class)
					.load(listthreesholdsavailablecolours1.getId());
			ListThreeSholdsAvailableColours2.setName(listthreesholdsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListThreeSholdsAvailableColours delSingleListThreeSholdsAvailableColours(long id) {
		ListThreeSholdsAvailableColours listthreesholdsavailablecolours = (ListThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListThreeSholdsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listthreesholdsavailablecolours);
		return listthreesholdsavailablecolours;
	};

	@Override
	public List<ListThreeSholdsAvailableColours> delListThreeSholdsAvailableColours(
			List<ListThreeSholdsAvailableColours> listthreesholdsavailablecolours) {
		for (ListThreeSholdsAvailableColours ListThreeSholdsAvailableColours1 : listthreesholdsavailablecolours) {

			ListThreeSholdsAvailableColours listthreesholdsavailablecolours2 = (ListThreeSholdsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListThreeSholdsAvailableColours.class)
					.load(ListThreeSholdsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listthreesholdsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListTypesOfMullions> getListListTypesOfMullions() {
		List<ListTypesOfMullions> listtypesofmullions = (List<ListTypesOfMullions>) sessionFactory.getCurrentSession()
				.createQuery("from ListTypesOfMullions").list();
		return listtypesofmullions;
	};

	@Override
	public ListTypesOfMullions getSingleListTypesOfMullions(long id) {
		ListTypesOfMullions listtypesofmullions = (ListTypesOfMullions) sessionFactory.getCurrentSession()
				.get(ListTypesOfMullions.class, id);
		return listtypesofmullions;
	};

	@Override
	public ListTypesOfMullions saveListTypesOfMullions(ListTypesOfMullions listtypesofmullions) {
		ListTypesOfMullions listtypesofmullions1 = (ListTypesOfMullions) sessionFactory.getCurrentSession()
				.save(listtypesofmullions);
		return listtypesofmullions1;
	};

	@Override
	public List<ListTypesOfMullions> saveListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		for (ListTypesOfMullions listtypesofmullions1 : listtypesofmullions) {
			sessionFactory.getCurrentSession().save(listtypesofmullions1);

		}
		return null;
	};

	@Override
	public ListTypesOfMullions updateListTypesOfMullions(ListTypesOfMullions listtypesofmullions) {
		ListTypesOfMullions listtypesofmullions1 = (ListTypesOfMullions) sessionFactory.getCurrentSession()
				.byId(ListTypesOfMullions.class).load(listtypesofmullions.getIdListTypesOfMullions());
		listtypesofmullions1.setName(listtypesofmullions.getName());
		sessionFactory.getCurrentSession().flush();
		return listtypesofmullions1;
	};

	@Override
	public List<ListTypesOfMullions> updateListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		for (ListTypesOfMullions listtypesofmullions1 : listtypesofmullions) {
			ListTypesOfMullions ListTypesOfMullions2 = (ListTypesOfMullions) sessionFactory.getCurrentSession()
					.byId(ListTypesOfMullions.class).load(listtypesofmullions1.getIdListTypesOfMullions());
			ListTypesOfMullions2.setName(listtypesofmullions1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListTypesOfMullions delSingleListTypesOfMullions(long id) {
		ListTypesOfMullions listtypesofmullions = (ListTypesOfMullions) sessionFactory.getCurrentSession()
				.byId(ListTypesOfMullions.class).load(id);
		sessionFactory.getCurrentSession().delete(listtypesofmullions);
		return listtypesofmullions;
	};

	@Override
	public List<ListTypesOfMullions> delListTypesOfMullions(List<ListTypesOfMullions> listtypesofmullions) {
		for (ListTypesOfMullions ListTypesOfMullions1 : listtypesofmullions) {

			ListTypesOfMullions listtypesofmullions2 = (ListTypesOfMullions) sessionFactory.getCurrentSession()
					.byId(ListTypesOfMullions.class).load(ListTypesOfMullions1.getIdListTypesOfMullions());
			sessionFactory.getCurrentSession().delete(listtypesofmullions2);
		}
		return null;
	};

	@Override
	public List<ListTypesOfMullionsAvailableColours> getListListTypesOfMullionsAvailableColours() {
		List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours = (List<ListTypesOfMullionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListTypesOfMullionsAvailableColours").list();
		return listtypesofmullionsavailablecolours;
	};

	@Override
	public ListTypesOfMullionsAvailableColours getSingleListTypesOfMullionsAvailableColours(long id) {
		ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours = (ListTypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().get(ListTypesOfMullionsAvailableColours.class, id);
		return listtypesofmullionsavailablecolours;
	};

	@Override
	public ListTypesOfMullionsAvailableColours saveListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours) {
		ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours1 = (ListTypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().save(listtypesofmullionsavailablecolours);
		return listtypesofmullionsavailablecolours1;
	};

	@Override
	public List<ListTypesOfMullionsAvailableColours> saveListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		for (ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours1 : listtypesofmullionsavailablecolours) {
			sessionFactory.getCurrentSession().save(listtypesofmullionsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListTypesOfMullionsAvailableColours updateListTypesOfMullionsAvailableColours(
			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours) {
		ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours1 = (ListTypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListTypesOfMullionsAvailableColours.class)
				.load(listtypesofmullionsavailablecolours.getId());
		listtypesofmullionsavailablecolours1.setName(listtypesofmullionsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listtypesofmullionsavailablecolours1;
	};

	@Override
	public List<ListTypesOfMullionsAvailableColours> updateListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		for (ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours1 : listtypesofmullionsavailablecolours) {
			ListTypesOfMullionsAvailableColours ListTypesOfMullionsAvailableColours2 = (ListTypesOfMullionsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListTypesOfMullionsAvailableColours.class)
					.load(listtypesofmullionsavailablecolours1.getId());
			ListTypesOfMullionsAvailableColours2.setName(listtypesofmullionsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListTypesOfMullionsAvailableColours delSingleListTypesOfMullionsAvailableColours(long id) {
		ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours = (ListTypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListTypesOfMullionsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listtypesofmullionsavailablecolours);
		return listtypesofmullionsavailablecolours;
	};

	@Override
	public List<ListTypesOfMullionsAvailableColours> delListTypesOfMullionsAvailableColours(
			List<ListTypesOfMullionsAvailableColours> listtypesofmullionsavailablecolours) {
		for (ListTypesOfMullionsAvailableColours ListTypesOfMullionsAvailableColours1 : listtypesofmullionsavailablecolours) {

			ListTypesOfMullionsAvailableColours listtypesofmullionsavailablecolours2 = (ListTypesOfMullionsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListTypesOfMullionsAvailableColours.class)
					.load(ListTypesOfMullionsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listtypesofmullionsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListVentilators> getListListVentilators() {
		List<ListVentilators> listventilators = (List<ListVentilators>) sessionFactory.getCurrentSession()
				.createQuery("from ListVentilators").list();
		return listventilators;
	};

	@Override
	public ListVentilators getSingleListVentilators(long id) {
		ListVentilators listventilators = (ListVentilators) sessionFactory.getCurrentSession()
				.get(ListVentilators.class, id);
		return listventilators;
	};

	@Override
	public ListVentilators saveListVentilators(ListVentilators listventilators) {
		ListVentilators listventilators1 = (ListVentilators) sessionFactory.getCurrentSession().save(listventilators);
		return listventilators1;
	};

	@Override
	public List<ListVentilators> saveListVentilators(List<ListVentilators> listventilators) {
		for (ListVentilators listventilators1 : listventilators) {
			sessionFactory.getCurrentSession().save(listventilators1);

		}
		return null;
	};

	@Override
	public ListVentilators updateListVentilators(ListVentilators listventilators) {
		ListVentilators listventilators1 = (ListVentilators) sessionFactory.getCurrentSession()
				.byId(ListVentilators.class).load(listventilators.getIdListVentilators());
		listventilators1.setName(listventilators.getName());
		sessionFactory.getCurrentSession().flush();
		return listventilators1;
	};

	@Override
	public List<ListVentilators> updateListVentilators(List<ListVentilators> listventilators) {
		for (ListVentilators listventilators1 : listventilators) {
			ListVentilators ListVentilators2 = (ListVentilators) sessionFactory.getCurrentSession()
					.byId(ListVentilators.class).load(listventilators1.getIdListVentilators());
			ListVentilators2.setName(listventilators1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListVentilators delSingleListVentilators(long id) {
		ListVentilators listventilators = (ListVentilators) sessionFactory.getCurrentSession()
				.byId(ListVentilators.class).load(id);
		sessionFactory.getCurrentSession().delete(listventilators);
		return listventilators;
	};

	@Override
	public List<ListVentilators> delListVentilators(List<ListVentilators> listventilators) {
		for (ListVentilators ListVentilators1 : listventilators) {

			ListVentilators listventilators2 = (ListVentilators) sessionFactory.getCurrentSession()
					.byId(ListVentilators.class).load(ListVentilators1.getIdListVentilators());
			sessionFactory.getCurrentSession().delete(listventilators2);
		}
		return null;
	};

	@Override
	public List<ListVentilatorsAvailableColours> getListListVentilatorsAvailableColours() {
		List<ListVentilatorsAvailableColours> listventilatorsavailablecolours = (List<ListVentilatorsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListVentilatorsAvailableColours").list();
		return listventilatorsavailablecolours;
	};

	@Override
	public ListVentilatorsAvailableColours getSingleListVentilatorsAvailableColours(long id) {
		ListVentilatorsAvailableColours listventilatorsavailablecolours = (ListVentilatorsAvailableColours) sessionFactory
				.getCurrentSession().get(ListVentilatorsAvailableColours.class, id);
		return listventilatorsavailablecolours;
	};

	@Override
	public ListVentilatorsAvailableColours saveListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours) {
		ListVentilatorsAvailableColours listventilatorsavailablecolours1 = (ListVentilatorsAvailableColours) sessionFactory
				.getCurrentSession().save(listventilatorsavailablecolours);
		return listventilatorsavailablecolours1;
	};

	@Override
	public List<ListVentilatorsAvailableColours> saveListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		for (ListVentilatorsAvailableColours listventilatorsavailablecolours1 : listventilatorsavailablecolours) {
			sessionFactory.getCurrentSession().save(listventilatorsavailablecolours1);

		}
		return null;
	};

	@Override
	public ListVentilatorsAvailableColours updateListVentilatorsAvailableColours(
			ListVentilatorsAvailableColours listventilatorsavailablecolours) {
		ListVentilatorsAvailableColours listventilatorsavailablecolours1 = (ListVentilatorsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListVentilatorsAvailableColours.class)
				.load(listventilatorsavailablecolours.getId());
		listventilatorsavailablecolours1.setName(listventilatorsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listventilatorsavailablecolours1;
	};

	@Override
	public List<ListVentilatorsAvailableColours> updateListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		for (ListVentilatorsAvailableColours listventilatorsavailablecolours1 : listventilatorsavailablecolours) {
			ListVentilatorsAvailableColours ListVentilatorsAvailableColours2 = (ListVentilatorsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListVentilatorsAvailableColours.class)
					.load(listventilatorsavailablecolours1.getId());
			ListVentilatorsAvailableColours2.setName(listventilatorsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListVentilatorsAvailableColours delSingleListVentilatorsAvailableColours(long id) {
		ListVentilatorsAvailableColours listventilatorsavailablecolours = (ListVentilatorsAvailableColours) sessionFactory
				.getCurrentSession().byId(ListVentilatorsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listventilatorsavailablecolours);
		return listventilatorsavailablecolours;
	};

	@Override
	public List<ListVentilatorsAvailableColours> delListVentilatorsAvailableColours(
			List<ListVentilatorsAvailableColours> listventilatorsavailablecolours) {
		for (ListVentilatorsAvailableColours ListVentilatorsAvailableColours1 : listventilatorsavailablecolours) {

			ListVentilatorsAvailableColours listventilatorsavailablecolours2 = (ListVentilatorsAvailableColours) sessionFactory
					.getCurrentSession().byId(ListVentilatorsAvailableColours.class)
					.load(ListVentilatorsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listventilatorsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ListWingLocks> getListListWingLocks() {
		List<ListWingLocks> listwinglocks = (List<ListWingLocks>) sessionFactory.getCurrentSession()
				.createQuery("from ListWingLocks").list();
		return listwinglocks;
	};

	@Override
	public ListWingLocks getSingleListWingLocks(long id) {
		ListWingLocks listwinglocks = (ListWingLocks) sessionFactory.getCurrentSession().get(ListWingLocks.class, id);
		return listwinglocks;
	};

	@Override
	public ListWingLocks saveListWingLocks(ListWingLocks listwinglocks) {
		ListWingLocks listwinglocks1 = (ListWingLocks) sessionFactory.getCurrentSession().save(listwinglocks);
		return listwinglocks1;
	};

	@Override
	public List<ListWingLocks> saveListWingLocks(List<ListWingLocks> listwinglocks) {
		for (ListWingLocks listwinglocks1 : listwinglocks) {
			sessionFactory.getCurrentSession().save(listwinglocks1);

		}
		return null;
	};

	@Override
	public ListWingLocks updateListWingLocks(ListWingLocks listwinglocks) {
		ListWingLocks listwinglocks1 = (ListWingLocks) sessionFactory.getCurrentSession().byId(ListWingLocks.class)
				.load(listwinglocks.getIdListWingLocks());
		listwinglocks1.setName(listwinglocks.getName());
		sessionFactory.getCurrentSession().flush();
		return listwinglocks1;
	};

	@Override
	public List<ListWingLocks> updateListWingLocks(List<ListWingLocks> listwinglocks) {
		for (ListWingLocks listwinglocks1 : listwinglocks) {
			ListWingLocks ListWingLocks2 = (ListWingLocks) sessionFactory.getCurrentSession().byId(ListWingLocks.class)
					.load(listwinglocks1.getIdListWingLocks());
			ListWingLocks2.setName(listwinglocks1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListWingLocks delSingleListWingLocks(long id) {
		ListWingLocks listwinglocks = (ListWingLocks) sessionFactory.getCurrentSession().byId(ListWingLocks.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(listwinglocks);
		return listwinglocks;
	};

	@Override
	public List<ListWingLocks> delListWingLocks(List<ListWingLocks> listwinglocks) {
		for (ListWingLocks ListWingLocks1 : listwinglocks) {

			ListWingLocks listwinglocks2 = (ListWingLocks) sessionFactory.getCurrentSession().byId(ListWingLocks.class)
					.load(ListWingLocks1.getIdListWingLocks());
			sessionFactory.getCurrentSession().delete(listwinglocks2);
		}
		return null;
	};

	@Override
	public List<ListWingLocksAvailableColours> getListListWingLocksAvailableColours() {
		List<ListWingLocksAvailableColours> listwinglocksavailablecolours = (List<ListWingLocksAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ListWingLocksAvailableColours").list();
		return listwinglocksavailablecolours;
	};

	@Override
	public ListWingLocksAvailableColours getSingleListWingLocksAvailableColours(long id) {
		ListWingLocksAvailableColours listwinglocksavailablecolours = (ListWingLocksAvailableColours) sessionFactory
				.getCurrentSession().get(ListWingLocksAvailableColours.class, id);
		return listwinglocksavailablecolours;
	};

	@Override
	public ListWingLocksAvailableColours saveListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours) {
		ListWingLocksAvailableColours listwinglocksavailablecolours1 = (ListWingLocksAvailableColours) sessionFactory
				.getCurrentSession().save(listwinglocksavailablecolours);
		return listwinglocksavailablecolours1;
	};

	@Override
	public List<ListWingLocksAvailableColours> saveListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		for (ListWingLocksAvailableColours listwinglocksavailablecolours1 : listwinglocksavailablecolours) {
			sessionFactory.getCurrentSession().save(listwinglocksavailablecolours1);

		}
		return null;
	};

	@Override
	public ListWingLocksAvailableColours updateListWingLocksAvailableColours(
			ListWingLocksAvailableColours listwinglocksavailablecolours) {
		ListWingLocksAvailableColours listwinglocksavailablecolours1 = (ListWingLocksAvailableColours) sessionFactory
				.getCurrentSession().byId(ListWingLocksAvailableColours.class)
				.load(listwinglocksavailablecolours.getId());
		listwinglocksavailablecolours1.setName(listwinglocksavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return listwinglocksavailablecolours1;
	};

	@Override
	public List<ListWingLocksAvailableColours> updateListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		for (ListWingLocksAvailableColours listwinglocksavailablecolours1 : listwinglocksavailablecolours) {
			ListWingLocksAvailableColours ListWingLocksAvailableColours2 = (ListWingLocksAvailableColours) sessionFactory
					.getCurrentSession().byId(ListWingLocksAvailableColours.class)
					.load(listwinglocksavailablecolours1.getId());
			ListWingLocksAvailableColours2.setName(listwinglocksavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ListWingLocksAvailableColours delSingleListWingLocksAvailableColours(long id) {
		ListWingLocksAvailableColours listwinglocksavailablecolours = (ListWingLocksAvailableColours) sessionFactory
				.getCurrentSession().byId(ListWingLocksAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(listwinglocksavailablecolours);
		return listwinglocksavailablecolours;
	};

	@Override
	public List<ListWingLocksAvailableColours> delListWingLocksAvailableColours(
			List<ListWingLocksAvailableColours> listwinglocksavailablecolours) {
		for (ListWingLocksAvailableColours ListWingLocksAvailableColours1 : listwinglocksavailablecolours) {

			ListWingLocksAvailableColours listwinglocksavailablecolours2 = (ListWingLocksAvailableColours) sessionFactory
					.getCurrentSession().byId(ListWingLocksAvailableColours.class)
					.load(ListWingLocksAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(listwinglocksavailablecolours2);
		}
		return null;
	};

	@Override
	public List<MullionPattern> getListMullionPattern() {
		List<MullionPattern> mullionpattern = (List<MullionPattern>) sessionFactory.getCurrentSession()
				.createQuery("from MullionPattern").list();
		return mullionpattern;
	};

	@Override
	public MullionPattern getSingleMullionPattern(long id) {
		MullionPattern mullionpattern = (MullionPattern) sessionFactory.getCurrentSession().get(MullionPattern.class,
				id);
		return mullionpattern;
	};

	@Override
	public MullionPattern saveMullionPattern(MullionPattern mullionpattern) {
		MullionPattern mullionpattern1 = (MullionPattern) sessionFactory.getCurrentSession().save(mullionpattern);
		return mullionpattern1;
	};

	@Override
	public List<MullionPattern> saveMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern mullionpattern1 : mullionpattern) {
			sessionFactory.getCurrentSession().save(mullionpattern1);

		}
		return null;
	};

	@Override
	public MullionPattern updateMullionPattern(MullionPattern mullionpattern) {
		MullionPattern mullionpattern1 = (MullionPattern) sessionFactory.getCurrentSession().byId(MullionPattern.class)
				.load(mullionpattern.getId());
		mullionpattern1.setName(mullionpattern.getName());
		sessionFactory.getCurrentSession().flush();
		return mullionpattern1;
	};

	@Override
	public List<MullionPattern> updateMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern mullionpattern1 : mullionpattern) {
			MullionPattern MullionPattern2 = (MullionPattern) sessionFactory.getCurrentSession()
					.byId(MullionPattern.class).load(mullionpattern1.getId());
			MullionPattern2.setName(mullionpattern1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public MullionPattern delSingleMullionPattern(long id) {
		MullionPattern mullionpattern = (MullionPattern) sessionFactory.getCurrentSession().byId(MullionPattern.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(mullionpattern);
		return mullionpattern;
	};

	@Override
	public List<MullionPattern> delMullionPattern(List<MullionPattern> mullionpattern) {
		for (MullionPattern MullionPattern1 : mullionpattern) {

			MullionPattern mullionpattern2 = (MullionPattern) sessionFactory.getCurrentSession()
					.byId(MullionPattern.class).load(MullionPattern1.getId());
			sessionFactory.getCurrentSession().delete(mullionpattern2);
		}
		return null;
	};

	@Override
	public List<MullionPatternsAvailableColours> getListMullionPatternsAvailableColours() {
		List<MullionPatternsAvailableColours> mullionpatternsavailablecolours = (List<MullionPatternsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from MullionPatternsAvailableColours").list();
		return mullionpatternsavailablecolours;
	};

	@Override
	public MullionPatternsAvailableColours getSingleMullionPatternsAvailableColours(long id) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().get(MullionPatternsAvailableColours.class, id);
		return mullionpatternsavailablecolours;
	};

	@Override
	public MullionPatternsAvailableColours saveMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours1 = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().save(mullionpatternsavailablecolours);
		return mullionpatternsavailablecolours1;
	};

	@Override
	public List<MullionPatternsAvailableColours> saveMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours mullionpatternsavailablecolours1 : mullionpatternsavailablecolours) {
			sessionFactory.getCurrentSession().save(mullionpatternsavailablecolours1);

		}
		return null;
	};

	@Override
	public MullionPatternsAvailableColours updateMullionPatternsAvailableColours(
			MullionPatternsAvailableColours mullionpatternsavailablecolours) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours1 = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().byId(MullionPatternsAvailableColours.class)
				.load(mullionpatternsavailablecolours.getId());
		mullionpatternsavailablecolours1.setName(mullionpatternsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return mullionpatternsavailablecolours1;
	};

	@Override
	public List<MullionPatternsAvailableColours> updateMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours mullionpatternsavailablecolours1 : mullionpatternsavailablecolours) {
			MullionPatternsAvailableColours MullionPatternsAvailableColours2 = (MullionPatternsAvailableColours) sessionFactory
					.getCurrentSession().byId(MullionPatternsAvailableColours.class)
					.load(mullionpatternsavailablecolours1.getId());
			MullionPatternsAvailableColours2.setName(mullionpatternsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public MullionPatternsAvailableColours delSingleMullionPatternsAvailableColours(long id) {
		MullionPatternsAvailableColours mullionpatternsavailablecolours = (MullionPatternsAvailableColours) sessionFactory
				.getCurrentSession().byId(MullionPatternsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(mullionpatternsavailablecolours);
		return mullionpatternsavailablecolours;
	};

	@Override
	public List<MullionPatternsAvailableColours> delMullionPatternsAvailableColours(
			List<MullionPatternsAvailableColours> mullionpatternsavailablecolours) {
		for (MullionPatternsAvailableColours MullionPatternsAvailableColours1 : mullionpatternsavailablecolours) {

			MullionPatternsAvailableColours mullionpatternsavailablecolours2 = (MullionPatternsAvailableColours) sessionFactory
					.getCurrentSession().byId(MullionPatternsAvailableColours.class)
					.load(MullionPatternsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(mullionpatternsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<OpeningFunctions> getListOpeningFunctions() {
		List<OpeningFunctions> openingfunctions = (List<OpeningFunctions>) sessionFactory.getCurrentSession()
				.createQuery("from OpeningFunctions").list();
		return openingfunctions;
	};

	@Override
	public OpeningFunctions getSingleOpeningFunctions(long id) {
		OpeningFunctions openingfunctions = (OpeningFunctions) sessionFactory.getCurrentSession()
				.get(OpeningFunctions.class, id);
		return openingfunctions;
	};

	@Override
	public OpeningFunctions saveOpeningFunctions(OpeningFunctions openingfunctions) {
		OpeningFunctions openingfunctions1 = (OpeningFunctions) sessionFactory.getCurrentSession()
				.save(openingfunctions);
		return openingfunctions1;
	};

	@Override
	public List<OpeningFunctions> saveOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions openingfunctions1 : openingfunctions) {
			sessionFactory.getCurrentSession().save(openingfunctions1);

		}
		return null;
	};

	@Override
	public OpeningFunctions updateOpeningFunctions(OpeningFunctions openingfunctions) {
		OpeningFunctions openingfunctions1 = (OpeningFunctions) sessionFactory.getCurrentSession()
				.byId(OpeningFunctions.class).load(openingfunctions.getId());
		openingfunctions1.setName(openingfunctions.getName());
		sessionFactory.getCurrentSession().flush();
		return openingfunctions1;
	};

	@Override
	public List<OpeningFunctions> updateOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions openingfunctions1 : openingfunctions) {
			OpeningFunctions OpeningFunctions2 = (OpeningFunctions) sessionFactory.getCurrentSession()
					.byId(OpeningFunctions.class).load(openingfunctions1.getId());
			OpeningFunctions2.setName(openingfunctions1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public OpeningFunctions delSingleOpeningFunctions(long id) {
		OpeningFunctions openingfunctions = (OpeningFunctions) sessionFactory.getCurrentSession()
				.byId(OpeningFunctions.class).load(id);
		sessionFactory.getCurrentSession().delete(openingfunctions);
		return openingfunctions;
	};

	@Override
	public List<OpeningFunctions> delOpeningFunctions(List<OpeningFunctions> openingfunctions) {
		for (OpeningFunctions OpeningFunctions1 : openingfunctions) {

			OpeningFunctions openingfunctions2 = (OpeningFunctions) sessionFactory.getCurrentSession()
					.byId(OpeningFunctions.class).load(OpeningFunctions1.getId());
			sessionFactory.getCurrentSession().delete(openingfunctions2);
		}
		return null;
	};

	@Override
	public List<OpeningFunctionsAvailableColours> getListOpeningFunctionsAvailableColours() {
		List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours = (List<OpeningFunctionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from OpeningFunctionsAvailableColours").list();
		return openingfunctionsavailablecolours;
	};

	@Override
	public OpeningFunctionsAvailableColours getSingleOpeningFunctionsAvailableColours(long id) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().get(OpeningFunctionsAvailableColours.class, id);
		return openingfunctionsavailablecolours;
	};

	@Override
	public OpeningFunctionsAvailableColours saveOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours1 = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().save(openingfunctionsavailablecolours);
		return openingfunctionsavailablecolours1;
	};

	@Override
	public List<OpeningFunctionsAvailableColours> saveOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours openingfunctionsavailablecolours1 : openingfunctionsavailablecolours) {
			sessionFactory.getCurrentSession().save(openingfunctionsavailablecolours1);

		}
		return null;
	};

	@Override
	public OpeningFunctionsAvailableColours updateOpeningFunctionsAvailableColours(
			OpeningFunctionsAvailableColours openingfunctionsavailablecolours) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours1 = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().byId(OpeningFunctionsAvailableColours.class)
				.load(openingfunctionsavailablecolours.getId());
		openingfunctionsavailablecolours1.setName(openingfunctionsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return openingfunctionsavailablecolours1;
	};

	@Override
	public List<OpeningFunctionsAvailableColours> updateOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours openingfunctionsavailablecolours1 : openingfunctionsavailablecolours) {
			OpeningFunctionsAvailableColours OpeningFunctionsAvailableColours2 = (OpeningFunctionsAvailableColours) sessionFactory
					.getCurrentSession().byId(OpeningFunctionsAvailableColours.class)
					.load(openingfunctionsavailablecolours1.getId());
			OpeningFunctionsAvailableColours2.setName(openingfunctionsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public OpeningFunctionsAvailableColours delSingleOpeningFunctionsAvailableColours(long id) {
		OpeningFunctionsAvailableColours openingfunctionsavailablecolours = (OpeningFunctionsAvailableColours) sessionFactory
				.getCurrentSession().byId(OpeningFunctionsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(openingfunctionsavailablecolours);
		return openingfunctionsavailablecolours;
	};

	@Override
	public List<OpeningFunctionsAvailableColours> delOpeningFunctionsAvailableColours(
			List<OpeningFunctionsAvailableColours> openingfunctionsavailablecolours) {
		for (OpeningFunctionsAvailableColours OpeningFunctionsAvailableColours1 : openingfunctionsavailablecolours) {

			OpeningFunctionsAvailableColours openingfunctionsavailablecolours2 = (OpeningFunctionsAvailableColours) sessionFactory
					.getCurrentSession().byId(OpeningFunctionsAvailableColours.class)
					.load(OpeningFunctionsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(openingfunctionsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Orders> getListOrders() {
		List<Orders> orders = (List<Orders>) sessionFactory.getCurrentSession().createQuery("from Orders").list();
		return orders;
	};

	@Override
	public Orders getSingleOrders(long id) {
		Orders orders = (Orders) sessionFactory.getCurrentSession().get(Orders.class, id);
		return orders;
	};

	@Override
	public Orders saveOrders(Orders orders) {
		Orders orders1 = (Orders) sessionFactory.getCurrentSession().save(orders);
		return orders1;
	};

	@Override
	public List<Orders> saveOrders(List<Orders> orders) {
		for (Orders orders1 : orders) {
			sessionFactory.getCurrentSession().save(orders1);

		}
		return null;
	};

	@Override
	public Orders updateOrders(Orders orders) {
		Orders orders1 = (Orders) sessionFactory.getCurrentSession().byId(Orders.class).load(orders.getId_order());
		orders1=orders;
		sessionFactory.getCurrentSession().flush();
		return orders1;
	};

	@Override
	public List<Orders> updateOrders(List<Orders> orders) {
		for (Orders orders1 : orders) {
			Orders Orders2 = (Orders) sessionFactory.getCurrentSession().byId(Orders.class).load(orders1.getId_order());
			Orders2.setClient(orders1.getClient());
			Orders2.setGrossPrice(orders1.getGrossPrice());
			Orders2.setNetPrice(orders1.getNetPrice());
			Orders2.setOrderNumber(orders1.getOrderNumber());
			Orders2.setWindows(orders1.getWindows());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Orders delSingleOrders(long id) {
		Orders orders = (Orders) sessionFactory.getCurrentSession().byId(Orders.class).load(id);
		sessionFactory.getCurrentSession().delete(orders);
		return orders;
	};

	@Override
	public List<Orders> delOrders(List<Orders> orders) {
		for (Orders Orders1 : orders) {

			Orders orders2 = (Orders) sessionFactory.getCurrentSession().byId(Orders.class).load(Orders1.getId_order());
			sessionFactory.getCurrentSession().delete(orders2);
		}
		return null;
	};

	@Override
	public List<Reed> getListReed() {
		List<Reed> reed = (List<Reed>) sessionFactory.getCurrentSession().createQuery("from Reed").list();
		return reed;
	};

	@Override
	public Reed getSingleReed(long id) {
		Reed reed = (Reed) sessionFactory.getCurrentSession().get(Reed.class, id);
		return reed;
	};

	@Override
	public Reed saveReed(Reed reed) {
		Reed reed1 = (Reed) sessionFactory.getCurrentSession().save(reed);
		return reed1;
	};

	@Override
	public List<Reed> saveReed(List<Reed> reed) {
		for (Reed reed1 : reed) {
			sessionFactory.getCurrentSession().save(reed1);

		}
		return null;
	};

	@Override
	public Reed updateReed(Reed reed) {
		Reed reed1 = (Reed) sessionFactory.getCurrentSession().byId(Reed.class).load(reed.getId());
		reed1.setName(reed.getName());
		sessionFactory.getCurrentSession().flush();
		return reed1;
	};

	@Override
	public List<Reed> updateReed(List<Reed> reed) {
		for (Reed reed1 : reed) {
			Reed Reed2 = (Reed) sessionFactory.getCurrentSession().byId(Reed.class).load(reed1.getId());
			Reed2.setName(reed1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Reed delSingleReed(long id) {
		Reed reed = (Reed) sessionFactory.getCurrentSession().byId(Reed.class).load(id);
		sessionFactory.getCurrentSession().delete(reed);
		return reed;
	};

	@Override
	public List<Reed> delReed(List<Reed> reed) {
		for (Reed Reed1 : reed) {

			Reed reed2 = (Reed) sessionFactory.getCurrentSession().byId(Reed.class).load(Reed1.getId());
			sessionFactory.getCurrentSession().delete(reed2);
		}
		return null;
	};

	@Override
	public List<ReedsAvailableColours> getListReedsAvailableColours() {
		List<ReedsAvailableColours> reedsavailablecolours = (List<ReedsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ReedsAvailableColours").list();
		return reedsavailablecolours;
	};

	@Override
	public ReedsAvailableColours getSingleReedsAvailableColours(long id) {
		ReedsAvailableColours reedsavailablecolours = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.get(ReedsAvailableColours.class, id);
		return reedsavailablecolours;
	};

	@Override
	public ReedsAvailableColours saveReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		ReedsAvailableColours reedsavailablecolours1 = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.save(reedsavailablecolours);
		return reedsavailablecolours1;
	};

	@Override
	public List<ReedsAvailableColours> saveReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours reedsavailablecolours1 : reedsavailablecolours) {
			sessionFactory.getCurrentSession().save(reedsavailablecolours1);

		}
		return null;
	};

	@Override
	public ReedsAvailableColours updateReedsAvailableColours(ReedsAvailableColours reedsavailablecolours) {
		ReedsAvailableColours reedsavailablecolours1 = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.byId(ReedsAvailableColours.class).load(reedsavailablecolours.getId());
		reedsavailablecolours1.setName(reedsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return reedsavailablecolours1;
	};

	@Override
	public List<ReedsAvailableColours> updateReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours reedsavailablecolours1 : reedsavailablecolours) {
			ReedsAvailableColours ReedsAvailableColours2 = (ReedsAvailableColours) sessionFactory.getCurrentSession()
					.byId(ReedsAvailableColours.class).load(reedsavailablecolours1.getId());
			ReedsAvailableColours2.setName(reedsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ReedsAvailableColours delSingleReedsAvailableColours(long id) {
		ReedsAvailableColours reedsavailablecolours = (ReedsAvailableColours) sessionFactory.getCurrentSession()
				.byId(ReedsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(reedsavailablecolours);
		return reedsavailablecolours;
	};

	@Override
	public List<ReedsAvailableColours> delReedsAvailableColours(List<ReedsAvailableColours> reedsavailablecolours) {
		for (ReedsAvailableColours ReedsAvailableColours1 : reedsavailablecolours) {

			ReedsAvailableColours reedsavailablecolours2 = (ReedsAvailableColours) sessionFactory.getCurrentSession()
					.byId(ReedsAvailableColours.class).load(ReedsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(reedsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ReiforcementsAvailableColours> getListReiforcementsAvailableColours() {
		List<ReiforcementsAvailableColours> reiforcementsavailablecolours = (List<ReiforcementsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ReiforcementsAvailableColours").list();
		return reiforcementsavailablecolours;
	};

	@Override
	public ReiforcementsAvailableColours getSingleReiforcementsAvailableColours(long id) {
		ReiforcementsAvailableColours reiforcementsavailablecolours = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().get(ReiforcementsAvailableColours.class, id);
		return reiforcementsavailablecolours;
	};

	@Override
	public ReiforcementsAvailableColours saveReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		ReiforcementsAvailableColours reiforcementsavailablecolours1 = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().save(reiforcementsavailablecolours);
		return reiforcementsavailablecolours1;
	};

	@Override
	public List<ReiforcementsAvailableColours> saveReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours reiforcementsavailablecolours1 : reiforcementsavailablecolours) {
			sessionFactory.getCurrentSession().save(reiforcementsavailablecolours1);

		}
		return null;
	};

	@Override
	public ReiforcementsAvailableColours updateReiforcementsAvailableColours(
			ReiforcementsAvailableColours reiforcementsavailablecolours) {
		ReiforcementsAvailableColours reiforcementsavailablecolours1 = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().byId(ReiforcementsAvailableColours.class)
				.load(reiforcementsavailablecolours.getId());
		reiforcementsavailablecolours1.setName(reiforcementsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return reiforcementsavailablecolours1;
	};

	@Override
	public List<ReiforcementsAvailableColours> updateReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours reiforcementsavailablecolours1 : reiforcementsavailablecolours) {
			ReiforcementsAvailableColours ReiforcementsAvailableColours2 = (ReiforcementsAvailableColours) sessionFactory
					.getCurrentSession().byId(ReiforcementsAvailableColours.class)
					.load(reiforcementsavailablecolours1.getId());
			ReiforcementsAvailableColours2.setName(reiforcementsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ReiforcementsAvailableColours delSingleReiforcementsAvailableColours(long id) {
		ReiforcementsAvailableColours reiforcementsavailablecolours = (ReiforcementsAvailableColours) sessionFactory
				.getCurrentSession().byId(ReiforcementsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(reiforcementsavailablecolours);
		return reiforcementsavailablecolours;
	};

	@Override
	public List<ReiforcementsAvailableColours> delReiforcementsAvailableColours(
			List<ReiforcementsAvailableColours> reiforcementsavailablecolours) {
		for (ReiforcementsAvailableColours ReiforcementsAvailableColours1 : reiforcementsavailablecolours) {

			ReiforcementsAvailableColours reiforcementsavailablecolours2 = (ReiforcementsAvailableColours) sessionFactory
					.getCurrentSession().byId(ReiforcementsAvailableColours.class)
					.load(ReiforcementsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(reiforcementsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Reinforcement> getListReinforcement() {
		List<Reinforcement> reinforcement = (List<Reinforcement>) sessionFactory.getCurrentSession()
				.createQuery("from Reinforcement").list();
		return reinforcement;
	};

	@Override
	public Reinforcement getSingleReinforcement(long id) {
		Reinforcement reinforcement = (Reinforcement) sessionFactory.getCurrentSession().get(Reinforcement.class, id);
		return reinforcement;
	};

	@Override
	public Reinforcement saveReinforcement(Reinforcement reinforcement) {
		Reinforcement reinforcement1 = (Reinforcement) sessionFactory.getCurrentSession().save(reinforcement);
		return reinforcement1;
	};

	@Override
	public List<Reinforcement> saveReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement reinforcement1 : reinforcement) {
			sessionFactory.getCurrentSession().save(reinforcement1);

		}
		return null;
	};

	@Override
	public Reinforcement updateReinforcement(Reinforcement reinforcement) {
		Reinforcement reinforcement1 = (Reinforcement) sessionFactory.getCurrentSession().byId(Reinforcement.class)
				.load(reinforcement.getId());
		reinforcement1.setName(reinforcement.getName());
		sessionFactory.getCurrentSession().flush();
		return reinforcement1;
	};

	@Override
	public List<Reinforcement> updateReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement reinforcement1 : reinforcement) {
			Reinforcement Reinforcement2 = (Reinforcement) sessionFactory.getCurrentSession().byId(Reinforcement.class)
					.load(reinforcement1.getId());
			Reinforcement2.setName(reinforcement1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Reinforcement delSingleReinforcement(long id) {
		Reinforcement reinforcement = (Reinforcement) sessionFactory.getCurrentSession().byId(Reinforcement.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(reinforcement);
		return reinforcement;
	};

	@Override
	public List<Reinforcement> delReinforcement(List<Reinforcement> reinforcement) {
		for (Reinforcement Reinforcement1 : reinforcement) {

			Reinforcement reinforcement2 = (Reinforcement) sessionFactory.getCurrentSession().byId(Reinforcement.class)
					.load(Reinforcement1.getId());
			sessionFactory.getCurrentSession().delete(reinforcement2);
		}
		return null;
	};

	@Override
	public List<SillStrip> getListSillStrip() {
		List<SillStrip> sillstrip = (List<SillStrip>) sessionFactory.getCurrentSession().createQuery("from SillStrip")
				.list();
		return sillstrip;
	};

	@Override
	public SillStrip getSingleSillStrip(long id) {
		SillStrip sillstrip = (SillStrip) sessionFactory.getCurrentSession().get(SillStrip.class, id);
		return sillstrip;
	};

	@Override
	public SillStrip saveSillStrip(SillStrip sillstrip) {
		SillStrip sillstrip1 = (SillStrip) sessionFactory.getCurrentSession().save(sillstrip);
		return sillstrip1;
	};

	@Override
	public List<SillStrip> saveSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip sillstrip1 : sillstrip) {
			sessionFactory.getCurrentSession().save(sillstrip1);

		}
		return null;
	};

	@Override
	public SillStrip updateSillStrip(SillStrip sillstrip) {
		SillStrip sillstrip1 = (SillStrip) sessionFactory.getCurrentSession().byId(SillStrip.class)
				.load(sillstrip.getId());
		sillstrip1.setName(sillstrip.getName());
		sessionFactory.getCurrentSession().flush();
		return sillstrip1;
	};

	@Override
	public List<SillStrip> updateSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip sillstrip1 : sillstrip) {
			SillStrip SillStrip2 = (SillStrip) sessionFactory.getCurrentSession().byId(SillStrip.class)
					.load(sillstrip1.getId());
			SillStrip2.setName(sillstrip1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public SillStrip delSingleSillStrip(long id) {
		SillStrip sillstrip = (SillStrip) sessionFactory.getCurrentSession().byId(SillStrip.class).load(id);
		sessionFactory.getCurrentSession().delete(sillstrip);
		return sillstrip;
	};

	@Override
	public List<SillStrip> delSillStrip(List<SillStrip> sillstrip) {
		for (SillStrip SillStrip1 : sillstrip) {

			SillStrip sillstrip2 = (SillStrip) sessionFactory.getCurrentSession().byId(SillStrip.class)
					.load(SillStrip1.getId());
			sessionFactory.getCurrentSession().delete(sillstrip2);
		}
		return null;
	};

	@Override
	public List<SillStripesAvailableColours> getListSillStripesAvailableColours() {
		List<SillStripesAvailableColours> sillstripesavailablecolours = (List<SillStripesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from SillStripesAvailableColours").list();
		return sillstripesavailablecolours;
	};

	@Override
	public SillStripesAvailableColours getSingleSillStripesAvailableColours(long id) {
		SillStripesAvailableColours sillstripesavailablecolours = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().get(SillStripesAvailableColours.class, id);
		return sillstripesavailablecolours;
	};

	@Override
	public SillStripesAvailableColours saveSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		SillStripesAvailableColours sillstripesavailablecolours1 = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().save(sillstripesavailablecolours);
		return sillstripesavailablecolours1;
	};

	@Override
	public List<SillStripesAvailableColours> saveSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours sillstripesavailablecolours1 : sillstripesavailablecolours) {
			sessionFactory.getCurrentSession().save(sillstripesavailablecolours1);

		}
		return null;
	};

	@Override
	public SillStripesAvailableColours updateSillStripesAvailableColours(
			SillStripesAvailableColours sillstripesavailablecolours) {
		SillStripesAvailableColours sillstripesavailablecolours1 = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().byId(SillStripesAvailableColours.class).load(sillstripesavailablecolours.getId());
		sillstripesavailablecolours1.setName(sillstripesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return sillstripesavailablecolours1;
	};

	@Override
	public List<SillStripesAvailableColours> updateSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours sillstripesavailablecolours1 : sillstripesavailablecolours) {
			SillStripesAvailableColours SillStripesAvailableColours2 = (SillStripesAvailableColours) sessionFactory
					.getCurrentSession().byId(SillStripesAvailableColours.class)
					.load(sillstripesavailablecolours1.getId());
			SillStripesAvailableColours2.setName(sillstripesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public SillStripesAvailableColours delSingleSillStripesAvailableColours(long id) {
		SillStripesAvailableColours sillstripesavailablecolours = (SillStripesAvailableColours) sessionFactory
				.getCurrentSession().byId(SillStripesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(sillstripesavailablecolours);
		return sillstripesavailablecolours;
	};

	@Override
	public List<SillStripesAvailableColours> delSillStripesAvailableColours(
			List<SillStripesAvailableColours> sillstripesavailablecolours) {
		for (SillStripesAvailableColours SillStripesAvailableColours1 : sillstripesavailablecolours) {

			SillStripesAvailableColours sillstripesavailablecolours2 = (SillStripesAvailableColours) sessionFactory
					.getCurrentSession().byId(SillStripesAvailableColours.class)
					.load(SillStripesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(sillstripesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<SpecialShapes> getListSpecialShapes() {
		List<SpecialShapes> specialshapes = (List<SpecialShapes>) sessionFactory.getCurrentSession()
				.createQuery("from SpecialShapes").list();
		return specialshapes;
	};

	@Override
	public SpecialShapes getSingleSpecialShapes(long id) {
		SpecialShapes specialshapes = (SpecialShapes) sessionFactory.getCurrentSession().get(SpecialShapes.class, id);
		return specialshapes;
	};

	@Override
	public SpecialShapes saveSpecialShapes(SpecialShapes specialshapes) {
		SpecialShapes specialshapes1 = (SpecialShapes) sessionFactory.getCurrentSession().save(specialshapes);
		return specialshapes1;
	};

	@Override
	public List<SpecialShapes> saveSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes specialshapes1 : specialshapes) {
			sessionFactory.getCurrentSession().save(specialshapes1);

		}
		return null;
	};

	@Override
	public SpecialShapes updateSpecialShapes(SpecialShapes specialshapes) {
		SpecialShapes specialshapes1 = (SpecialShapes) sessionFactory.getCurrentSession().byId(SpecialShapes.class)
				.load(specialshapes.getId());
		specialshapes1.setName(specialshapes.getName());
		sessionFactory.getCurrentSession().flush();
		return specialshapes1;
	};

	@Override
	public List<SpecialShapes> updateSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes specialshapes1 : specialshapes) {
			SpecialShapes SpecialShapes2 = (SpecialShapes) sessionFactory.getCurrentSession().byId(SpecialShapes.class)
					.load(specialshapes1.getId());
			SpecialShapes2.setName(specialshapes1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public SpecialShapes delSingleSpecialShapes(long id) {
		SpecialShapes specialshapes = (SpecialShapes) sessionFactory.getCurrentSession().byId(SpecialShapes.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(specialshapes);
		return specialshapes;
	};

	@Override
	public List<SpecialShapes> delSpecialShapes(List<SpecialShapes> specialshapes) {
		for (SpecialShapes SpecialShapes1 : specialshapes) {

			SpecialShapes specialshapes2 = (SpecialShapes) sessionFactory.getCurrentSession().byId(SpecialShapes.class)
					.load(SpecialShapes1.getId());
			sessionFactory.getCurrentSession().delete(specialshapes2);
		}
		return null;
	};

	@Override
	public List<SpecialShapesAvailableColours> getListSpecialShapesAvailableColours() {
		List<SpecialShapesAvailableColours> specialshapesavailablecolours = (List<SpecialShapesAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from SpecialShapesAvailableColours").list();
		return specialshapesavailablecolours;
	};

	@Override
	public SpecialShapesAvailableColours getSingleSpecialShapesAvailableColours(long id) {
		SpecialShapesAvailableColours specialshapesavailablecolours = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().get(SpecialShapesAvailableColours.class, id);
		return specialshapesavailablecolours;
	};

	@Override
	public SpecialShapesAvailableColours saveSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		SpecialShapesAvailableColours specialshapesavailablecolours1 = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().save(specialshapesavailablecolours);
		return specialshapesavailablecolours1;
	};

	@Override
	public List<SpecialShapesAvailableColours> saveSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours specialshapesavailablecolours1 : specialshapesavailablecolours) {
			sessionFactory.getCurrentSession().save(specialshapesavailablecolours1);

		}
		return null;
	};

	@Override
	public SpecialShapesAvailableColours updateSpecialShapesAvailableColours(
			SpecialShapesAvailableColours specialshapesavailablecolours) {
		SpecialShapesAvailableColours specialshapesavailablecolours1 = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().byId(SpecialShapesAvailableColours.class)
				.load(specialshapesavailablecolours.getId());
		specialshapesavailablecolours1.setName(specialshapesavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return specialshapesavailablecolours1;
	};

	@Override
	public List<SpecialShapesAvailableColours> updateSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours specialshapesavailablecolours1 : specialshapesavailablecolours) {
			SpecialShapesAvailableColours SpecialShapesAvailableColours2 = (SpecialShapesAvailableColours) sessionFactory
					.getCurrentSession().byId(SpecialShapesAvailableColours.class)
					.load(specialshapesavailablecolours1.getId());
			SpecialShapesAvailableColours2.setName(specialshapesavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public SpecialShapesAvailableColours delSingleSpecialShapesAvailableColours(long id) {
		SpecialShapesAvailableColours specialshapesavailablecolours = (SpecialShapesAvailableColours) sessionFactory
				.getCurrentSession().byId(SpecialShapesAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(specialshapesavailablecolours);
		return specialshapesavailablecolours;
	};

	@Override
	public List<SpecialShapesAvailableColours> delSpecialShapesAvailableColours(
			List<SpecialShapesAvailableColours> specialshapesavailablecolours) {
		for (SpecialShapesAvailableColours SpecialShapesAvailableColours1 : specialshapesavailablecolours) {

			SpecialShapesAvailableColours specialshapesavailablecolours2 = (SpecialShapesAvailableColours) sessionFactory
					.getCurrentSession().byId(SpecialShapesAvailableColours.class)
					.load(SpecialShapesAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(specialshapesavailablecolours2);
		}
		return null;
	};

	@Override
	public List<ThreeSholdsAvailableColours> getListThreeSholdsAvailableColours() {
		List<ThreeSholdsAvailableColours> threesholdsavailablecolours = (List<ThreeSholdsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from ThreeSholdsAvailableColours").list();
		return threesholdsavailablecolours;
	};

	@Override
	public ThreeSholdsAvailableColours getSingleThreeSholdsAvailableColours(long id) {
		ThreeSholdsAvailableColours threesholdsavailablecolours = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().get(ThreeSholdsAvailableColours.class, id);
		return threesholdsavailablecolours;
	};

	@Override
	public ThreeSholdsAvailableColours saveThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		ThreeSholdsAvailableColours threesholdsavailablecolours1 = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().save(threesholdsavailablecolours);
		return threesholdsavailablecolours1;
	};

	@Override
	public List<ThreeSholdsAvailableColours> saveThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours threesholdsavailablecolours1 : threesholdsavailablecolours) {
			sessionFactory.getCurrentSession().save(threesholdsavailablecolours1);

		}
		return null;
	};

	@Override
	public ThreeSholdsAvailableColours updateThreeSholdsAvailableColours(
			ThreeSholdsAvailableColours threesholdsavailablecolours) {
		ThreeSholdsAvailableColours threesholdsavailablecolours1 = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().byId(ThreeSholdsAvailableColours.class).load(threesholdsavailablecolours.getId());
		threesholdsavailablecolours1.setName(threesholdsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return threesholdsavailablecolours1;
	};

	@Override
	public List<ThreeSholdsAvailableColours> updateThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours threesholdsavailablecolours1 : threesholdsavailablecolours) {
			ThreeSholdsAvailableColours ThreeSholdsAvailableColours2 = (ThreeSholdsAvailableColours) sessionFactory
					.getCurrentSession().byId(ThreeSholdsAvailableColours.class)
					.load(threesholdsavailablecolours1.getId());
			ThreeSholdsAvailableColours2.setName(threesholdsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public ThreeSholdsAvailableColours delSingleThreeSholdsAvailableColours(long id) {
		ThreeSholdsAvailableColours threesholdsavailablecolours = (ThreeSholdsAvailableColours) sessionFactory
				.getCurrentSession().byId(ThreeSholdsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(threesholdsavailablecolours);
		return threesholdsavailablecolours;
	};

	@Override
	public List<ThreeSholdsAvailableColours> delThreeSholdsAvailableColours(
			List<ThreeSholdsAvailableColours> threesholdsavailablecolours) {
		for (ThreeSholdsAvailableColours ThreeSholdsAvailableColours1 : threesholdsavailablecolours) {

			ThreeSholdsAvailableColours threesholdsavailablecolours2 = (ThreeSholdsAvailableColours) sessionFactory
					.getCurrentSession().byId(ThreeSholdsAvailableColours.class)
					.load(ThreeSholdsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(threesholdsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Threshold> getListThreshold() {
		List<Threshold> threshold = (List<Threshold>) sessionFactory.getCurrentSession().createQuery("from Threshold")
				.list();
		return threshold;
	};

	@Override
	public Threshold getSingleThreshold(long id) {
		Threshold threshold = (Threshold) sessionFactory.getCurrentSession().get(Threshold.class, id);
		return threshold;
	};

	@Override
	public Threshold saveThreshold(Threshold threshold) {
		Threshold threshold1 = (Threshold) sessionFactory.getCurrentSession().save(threshold);
		return threshold1;
	};

	@Override
	public List<Threshold> saveThreshold(List<Threshold> threshold) {
		for (Threshold threshold1 : threshold) {
			sessionFactory.getCurrentSession().save(threshold1);

		}
		return null;
	};

	@Override
	public Threshold updateThreshold(Threshold threshold) {
		Threshold threshold1 = (Threshold) sessionFactory.getCurrentSession().byId(Threshold.class)
				.load(threshold.getId());
		threshold1.setName(threshold.getName());
		sessionFactory.getCurrentSession().flush();
		return threshold1;
	};

	@Override
	public List<Threshold> updateThreshold(List<Threshold> threshold) {
		for (Threshold threshold1 : threshold) {
			Threshold Threshold2 = (Threshold) sessionFactory.getCurrentSession().byId(Threshold.class)
					.load(threshold1.getId());
			Threshold2.setName(threshold1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Threshold delSingleThreshold(long id) {
		Threshold threshold = (Threshold) sessionFactory.getCurrentSession().byId(Threshold.class).load(id);
		sessionFactory.getCurrentSession().delete(threshold);
		return threshold;
	};

	@Override
	public List<Threshold> delThreshold(List<Threshold> threshold) {
		for (Threshold Threshold1 : threshold) {

			Threshold threshold2 = (Threshold) sessionFactory.getCurrentSession().byId(Threshold.class)
					.load(Threshold1.getId());
			sessionFactory.getCurrentSession().delete(threshold2);
		}
		return null;
	};

	@Override
	public List<TypeOfMullion> getListTypeOfMullion() {
		List<TypeOfMullion> typeofmullion = (List<TypeOfMullion>) sessionFactory.getCurrentSession()
				.createQuery("from TypeOfMullion").list();
		return typeofmullion;
	};

	@Override
	public TypeOfMullion getSingleTypeOfMullion(long id) {
		TypeOfMullion typeofmullion = (TypeOfMullion) sessionFactory.getCurrentSession().get(TypeOfMullion.class, id);
		return typeofmullion;
	};

	@Override
	public TypeOfMullion saveTypeOfMullion(TypeOfMullion typeofmullion) {
		TypeOfMullion typeofmullion1 = (TypeOfMullion) sessionFactory.getCurrentSession().save(typeofmullion);
		return typeofmullion1;
	};

	@Override
	public List<TypeOfMullion> saveTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion typeofmullion1 : typeofmullion) {
			sessionFactory.getCurrentSession().save(typeofmullion1);

		}
		return null;
	};

	@Override
	public TypeOfMullion updateTypeOfMullion(TypeOfMullion typeofmullion) {
		TypeOfMullion typeofmullion1 = (TypeOfMullion) sessionFactory.getCurrentSession().byId(TypeOfMullion.class)
				.load(typeofmullion.getId());
		typeofmullion1.setName(typeofmullion.getName());
		sessionFactory.getCurrentSession().flush();
		return typeofmullion1;
	};

	@Override
	public List<TypeOfMullion> updateTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion typeofmullion1 : typeofmullion) {
			TypeOfMullion TypeOfMullion2 = (TypeOfMullion) sessionFactory.getCurrentSession().byId(TypeOfMullion.class)
					.load(typeofmullion1.getId());
			TypeOfMullion2.setName(typeofmullion1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public TypeOfMullion delSingleTypeOfMullion(long id) {
		TypeOfMullion typeofmullion = (TypeOfMullion) sessionFactory.getCurrentSession().byId(TypeOfMullion.class)
				.load(id);
		sessionFactory.getCurrentSession().delete(typeofmullion);
		return typeofmullion;
	};

	@Override
	public List<TypeOfMullion> delTypeOfMullion(List<TypeOfMullion> typeofmullion) {
		for (TypeOfMullion TypeOfMullion1 : typeofmullion) {

			TypeOfMullion typeofmullion2 = (TypeOfMullion) sessionFactory.getCurrentSession().byId(TypeOfMullion.class)
					.load(TypeOfMullion1.getId());
			sessionFactory.getCurrentSession().delete(typeofmullion2);
		}
		return null;
	};

	@Override
	public List<TypesOfMullionsAvailableColours> getListTypesOfMullionsAvailableColours() {
		List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours = (List<TypesOfMullionsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from TypesOfMullionsAvailableColours").list();
		return typesofmullionsavailablecolours;
	};

	@Override
	public TypesOfMullionsAvailableColours getSingleTypesOfMullionsAvailableColours(long id) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().get(TypesOfMullionsAvailableColours.class, id);
		return typesofmullionsavailablecolours;
	};

	@Override
	public TypesOfMullionsAvailableColours saveTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours1 = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().save(typesofmullionsavailablecolours);
		return typesofmullionsavailablecolours1;
	};

	@Override
	public List<TypesOfMullionsAvailableColours> saveTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours typesofmullionsavailablecolours1 : typesofmullionsavailablecolours) {
			sessionFactory.getCurrentSession().save(typesofmullionsavailablecolours1);

		}
		return null;
	};

	@Override
	public TypesOfMullionsAvailableColours updateTypesOfMullionsAvailableColours(
			TypesOfMullionsAvailableColours typesofmullionsavailablecolours) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours1 = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().byId(TypesOfMullionsAvailableColours.class)
				.load(typesofmullionsavailablecolours.getId());
		typesofmullionsavailablecolours1.setName(typesofmullionsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return typesofmullionsavailablecolours1;
	};

	@Override
	public List<TypesOfMullionsAvailableColours> updateTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours typesofmullionsavailablecolours1 : typesofmullionsavailablecolours) {
			TypesOfMullionsAvailableColours TypesOfMullionsAvailableColours2 = (TypesOfMullionsAvailableColours) sessionFactory
					.getCurrentSession().byId(TypesOfMullionsAvailableColours.class)
					.load(typesofmullionsavailablecolours1.getId());
			TypesOfMullionsAvailableColours2.setName(typesofmullionsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public TypesOfMullionsAvailableColours delSingleTypesOfMullionsAvailableColours(long id) {
		TypesOfMullionsAvailableColours typesofmullionsavailablecolours = (TypesOfMullionsAvailableColours) sessionFactory
				.getCurrentSession().byId(TypesOfMullionsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(typesofmullionsavailablecolours);
		return typesofmullionsavailablecolours;
	};

	@Override
	public List<TypesOfMullionsAvailableColours> delTypesOfMullionsAvailableColours(
			List<TypesOfMullionsAvailableColours> typesofmullionsavailablecolours) {
		for (TypesOfMullionsAvailableColours TypesOfMullionsAvailableColours1 : typesofmullionsavailablecolours) {

			TypesOfMullionsAvailableColours typesofmullionsavailablecolours2 = (TypesOfMullionsAvailableColours) sessionFactory
					.getCurrentSession().byId(TypesOfMullionsAvailableColours.class)
					.load(TypesOfMullionsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(typesofmullionsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Ventilator> getListVentilator() {
		List<Ventilator> ventilator = (List<Ventilator>) sessionFactory.getCurrentSession()
				.createQuery("from Ventilator").list();
		return ventilator;
	};

	@Override
	public Ventilator getSingleVentilator(long id) {
		Ventilator ventilator = (Ventilator) sessionFactory.getCurrentSession().get(Ventilator.class, id);
		return ventilator;
	};

	@Override
	public Ventilator saveVentilator(Ventilator ventilator) {
		Ventilator ventilator1 = (Ventilator) sessionFactory.getCurrentSession().save(ventilator);
		return ventilator1;
	};

	@Override
	public List<Ventilator> saveVentilator(List<Ventilator> ventilator) {
		for (Ventilator ventilator1 : ventilator) {
			sessionFactory.getCurrentSession().save(ventilator1);

		}
		return null;
	};

	@Override
	public Ventilator updateVentilator(Ventilator ventilator) {
		Ventilator ventilator1 = (Ventilator) sessionFactory.getCurrentSession().byId(Ventilator.class)
				.load(ventilator.getId());
		ventilator1.setName(ventilator.getName());
		sessionFactory.getCurrentSession().flush();
		return ventilator1;
	};

	@Override
	public List<Ventilator> updateVentilator(List<Ventilator> ventilator) {
		for (Ventilator ventilator1 : ventilator) {
			Ventilator Ventilator2 = (Ventilator) sessionFactory.getCurrentSession().byId(Ventilator.class)
					.load(ventilator1.getId());
			Ventilator2.setName(ventilator1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public Ventilator delSingleVentilator(long id) {
		Ventilator ventilator = (Ventilator) sessionFactory.getCurrentSession().byId(Ventilator.class).load(id);
		sessionFactory.getCurrentSession().delete(ventilator);
		return ventilator;
	};

	@Override
	public List<Ventilator> delVentilator(List<Ventilator> ventilator) {
		for (Ventilator Ventilator1 : ventilator) {

			Ventilator ventilator2 = (Ventilator) sessionFactory.getCurrentSession().byId(Ventilator.class)
					.load(Ventilator1.getId());
			sessionFactory.getCurrentSession().delete(ventilator2);
		}
		return null;
	};

	@Override
	public List<VentilatorsAvailableColours> getListVentilatorsAvailableColours() {
		List<VentilatorsAvailableColours> ventilatorsavailablecolours = (List<VentilatorsAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from VentilatorsAvailableColours").list();
		return ventilatorsavailablecolours;
	};

	@Override
	public VentilatorsAvailableColours getSingleVentilatorsAvailableColours(long id) {
		VentilatorsAvailableColours ventilatorsavailablecolours = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().get(VentilatorsAvailableColours.class, id);
		return ventilatorsavailablecolours;
	};

	@Override
	public VentilatorsAvailableColours saveVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		VentilatorsAvailableColours ventilatorsavailablecolours1 = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().save(ventilatorsavailablecolours);
		return ventilatorsavailablecolours1;
	};

	@Override
	public List<VentilatorsAvailableColours> saveVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours ventilatorsavailablecolours1 : ventilatorsavailablecolours) {
			sessionFactory.getCurrentSession().save(ventilatorsavailablecolours1);

		}
		return null;
	};

	@Override
	public VentilatorsAvailableColours updateVentilatorsAvailableColours(
			VentilatorsAvailableColours ventilatorsavailablecolours) {
		VentilatorsAvailableColours ventilatorsavailablecolours1 = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().byId(VentilatorsAvailableColours.class).load(ventilatorsavailablecolours.getId());
		ventilatorsavailablecolours1.setName(ventilatorsavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return ventilatorsavailablecolours1;
	};

	@Override
	public List<VentilatorsAvailableColours> updateVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours ventilatorsavailablecolours1 : ventilatorsavailablecolours) {
			VentilatorsAvailableColours VentilatorsAvailableColours2 = (VentilatorsAvailableColours) sessionFactory
					.getCurrentSession().byId(VentilatorsAvailableColours.class)
					.load(ventilatorsavailablecolours1.getId());
			VentilatorsAvailableColours2.setName(ventilatorsavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public VentilatorsAvailableColours delSingleVentilatorsAvailableColours(long id) {
		VentilatorsAvailableColours ventilatorsavailablecolours = (VentilatorsAvailableColours) sessionFactory
				.getCurrentSession().byId(VentilatorsAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(ventilatorsavailablecolours);
		return ventilatorsavailablecolours;
	};

	@Override
	public List<VentilatorsAvailableColours> delVentilatorsAvailableColours(
			List<VentilatorsAvailableColours> ventilatorsavailablecolours) {
		for (VentilatorsAvailableColours VentilatorsAvailableColours1 : ventilatorsavailablecolours) {

			VentilatorsAvailableColours ventilatorsavailablecolours2 = (VentilatorsAvailableColours) sessionFactory
					.getCurrentSession().byId(VentilatorsAvailableColours.class)
					.load(VentilatorsAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(ventilatorsavailablecolours2);
		}
		return null;
	};

	@Override
	public List<Windows> getListWindows() {
		List<Windows> windows = (List<Windows>) sessionFactory.getCurrentSession().createQuery("from Windows").list();
		return windows;
	};

	@Override
	public Windows getSingleWindows(long id) {
		Windows windows = (Windows) sessionFactory.getCurrentSession().get(Windows.class, id);
		return windows;
	};

	@Override
	public Windows saveWindows(Windows windows) {
		Windows windows1 = (Windows) sessionFactory.getCurrentSession().save(windows);
		return windows1;
	};

	@Override
	public List<Windows> saveWindows(List<Windows> windows) {
		for (Windows windows1 : windows) {
			sessionFactory.getCurrentSession().save(windows1);

		}
		return null;
	};

	

	@Override
	public List<Windows> updateWindows(List<Windows> windows) {
	
		return null;
	};

	@Override
	public Windows delSingleWindows(long id) {
		Windows windows = (Windows) sessionFactory.getCurrentSession().byId(Windows.class).load(id);
		sessionFactory.getCurrentSession().delete(windows);
		return windows;
	};

	@Override
	public List<Windows> delWindows(List<Windows> windows) {
		for (Windows Windows1 : windows) {

			Windows windows2 = (Windows) sessionFactory.getCurrentSession().byId(Windows.class).load(Windows1.getId_window());
			sessionFactory.getCurrentSession().delete(windows2);
		}
		return null;
	};

	@Override
	public List<WingLock> getListWingLock() {
		List<WingLock> winglock = (List<WingLock>) sessionFactory.getCurrentSession().createQuery("from WingLock")
				.list();
		return winglock;
	};

	@Override
	public WingLock getSingleWingLock(long id) {
		WingLock winglock = (WingLock) sessionFactory.getCurrentSession().get(WingLock.class, id);
		return winglock;
	};

	@Override
	public WingLock saveWingLock(WingLock winglock) {
		WingLock winglock1 = (WingLock) sessionFactory.getCurrentSession().save(winglock);
		return winglock1;
	};

	@Override
	public List<WingLock> saveWingLock(List<WingLock> winglock) {
		for (WingLock winglock1 : winglock) {
			sessionFactory.getCurrentSession().save(winglock1);

		}
		return null;
	};

	@Override
	public WingLock updateWingLock(WingLock winglock) {
		WingLock winglock1 = (WingLock) sessionFactory.getCurrentSession().byId(WingLock.class).load(winglock.getId());
		winglock1.setName(winglock.getName());
		sessionFactory.getCurrentSession().flush();
		return winglock1;
	};

	@Override
	public List<WingLock> updateWingLock(List<WingLock> winglock) {
		for (WingLock winglock1 : winglock) {
			WingLock WingLock2 = (WingLock) sessionFactory.getCurrentSession().byId(WingLock.class)
					.load(winglock1.getId());
			WingLock2.setName(winglock1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public WingLock delSingleWingLock(long id) {
		WingLock winglock = (WingLock) sessionFactory.getCurrentSession().byId(WingLock.class).load(id);
		sessionFactory.getCurrentSession().delete(winglock);
		return winglock;
	};

	@Override
	public List<WingLock> delWingLock(List<WingLock> winglock) {
		for (WingLock WingLock1 : winglock) {

			WingLock winglock2 = (WingLock) sessionFactory.getCurrentSession().byId(WingLock.class)
					.load(WingLock1.getId());
			sessionFactory.getCurrentSession().delete(winglock2);
		}
		return null;
	};

	@Override
	public List<WingLocksAvailableColours> getListWingLocksAvailableColours() {
		List<WingLocksAvailableColours> winglocksavailablecolours = (List<WingLocksAvailableColours>) sessionFactory
				.getCurrentSession().createQuery("from WingLocksAvailableColours").list();
		return winglocksavailablecolours;
	};

	@Override
	public WingLocksAvailableColours getSingleWingLocksAvailableColours(long id) {
		WingLocksAvailableColours winglocksavailablecolours = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().get(WingLocksAvailableColours.class, id);
		return winglocksavailablecolours;
	};

	@Override
	public WingLocksAvailableColours saveWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		WingLocksAvailableColours winglocksavailablecolours1 = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().save(winglocksavailablecolours);
		return winglocksavailablecolours1;
	};

	@Override
	public List<WingLocksAvailableColours> saveWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours winglocksavailablecolours1 : winglocksavailablecolours) {
			sessionFactory.getCurrentSession().save(winglocksavailablecolours1);

		}
		return null;
	};

	@Override
	public WingLocksAvailableColours updateWingLocksAvailableColours(
			WingLocksAvailableColours winglocksavailablecolours) {
		WingLocksAvailableColours winglocksavailablecolours1 = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().byId(WingLocksAvailableColours.class).load(winglocksavailablecolours.getId());
		winglocksavailablecolours1.setName(winglocksavailablecolours.getName());
		sessionFactory.getCurrentSession().flush();
		return winglocksavailablecolours1;
	};

	@Override
	public List<WingLocksAvailableColours> updateWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours winglocksavailablecolours1 : winglocksavailablecolours) {
			WingLocksAvailableColours WingLocksAvailableColours2 = (WingLocksAvailableColours) sessionFactory
					.getCurrentSession().byId(WingLocksAvailableColours.class).load(winglocksavailablecolours1.getId());
			WingLocksAvailableColours2.setName(winglocksavailablecolours1.getName());
			sessionFactory.getCurrentSession().flush();

		}
		return null;
	};

	@Override
	public WingLocksAvailableColours delSingleWingLocksAvailableColours(long id) {
		WingLocksAvailableColours winglocksavailablecolours = (WingLocksAvailableColours) sessionFactory
				.getCurrentSession().byId(WingLocksAvailableColours.class).load(id);
		sessionFactory.getCurrentSession().delete(winglocksavailablecolours);
		return winglocksavailablecolours;
	};

	@Override
	public List<WingLocksAvailableColours> delWingLocksAvailableColours(
			List<WingLocksAvailableColours> winglocksavailablecolours) {
		for (WingLocksAvailableColours WingLocksAvailableColours1 : winglocksavailablecolours) {

			WingLocksAvailableColours winglocksavailablecolours2 = (WingLocksAvailableColours) sessionFactory
					.getCurrentSession().byId(WingLocksAvailableColours.class).load(WingLocksAvailableColours1.getId());
			sessionFactory.getCurrentSession().delete(winglocksavailablecolours2);
		}
		return null;
	}

	@Override
	public Windows updateWindows(Windows windows) {
Windows windows1=(Windows)sessionFactory.getCurrentSession().byId(Windows.class).load(windows.getId_window());		return windows1;
	
	};

}