package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.Axe;
import com.bootcamp.jpa.entities.Secteur;
import com.bootcamp.jpa.entities.Pilier;
import com.bootcamp.jpa.repositories.AxeRepository;
import com.bootcamp.jpa.repositories.SecteurRepository;
import com.bootcamp.jpa.repositories.PilierRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CategorieCRUD {

    /* Crud for pilier */

    public static void create(Pilier pilier) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        pr.create(pilier);
    }

    public static void update(Pilier pilier) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        pr.update(pilier);
    }

    public static void delete(Pilier pilier) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        pr.delete(pilier);
    }

    public static List<Pilier> findAll() throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        List<Pilier> liste = pr.findAll();
        return liste;
    }

    public static List<Pilier> findByProperty(String propertyName, Object value) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        List<Pilier> piliers = pr.findByProperty(propertyName, value);

        return piliers;
    }

    public static Pilier findByUniqueProperty(String propertyName, Object value) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        Pilier pilier = pr.findByPropertyUnique(propertyName, value);

        return pilier;
    }

    public static Pilier findById(int id) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        Pilier pilier = pr.findById(id);

        return pilier;
    }

    public static List<Pilier> search(Object o, Object value) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        List<Pilier> piliers = pr.search(o, value);

        return piliers;
    }

    public static List<Pilier> findByCriterias(String attr, String sens, int offset, int limit) throws SQLException {
        PilierRepository pr = new PilierRepository(PERSISTENCE_UNIT);
        List<Pilier> piliers = pr.findByCriterias(attr, sens, offset, limit);

        return piliers;
    }
    
    /* Crud for axe */

    public static void createAxe(Axe axe) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        pr.create(axe);
    }

    public static void updateAxe(Axe axe) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        pr.update(axe);
    }

    public static void deleteAxe(Axe axe) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        pr.delete(axe);
    }

    public static List<Axe> findAllAxe() throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        List<Axe> liste = pr.findAll();
        return liste;
    }

    public static List<Axe> findByPropertyAxe(String propertyName, Object value) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        List<Axe> axes = pr.findByProperty(propertyName, value);

        return axes;
    }

    public static Axe findByUniquePropertyAxe(String propertyName, Object value) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        Axe axe = pr.findByPropertyUnique(propertyName, value);

        return axe;
    }

    public static Axe findByIdAxe(int id) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        Axe axe = pr.findById(id);

        return axe;
    }

    public static List<Axe> searchAxe(Object o, Object value) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        List<Axe> axes = pr.search(o, value);

        return axes;
    }

    public static List<Axe> findByCriteriasAxe(String attr, String sens, int offset, int limit) throws SQLException {
        AxeRepository pr = new AxeRepository(PERSISTENCE_UNIT);
        List<Axe> axes = pr.findByCriterias(attr, sens, offset, limit);

        return axes;
    }

    /* Crud for secteur */

    public static void createSecteur(Secteur secteur) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        pr.create(secteur);
    }

    public static void updateSecteur(Secteur secteur) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        pr.update(secteur);
    }

    public static void deleteSecteur(Secteur secteur) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        pr.delete(secteur);
    }

    public static List<Secteur> findAllSecteur() throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        List<Secteur> liste = pr.findAll();
        return liste;
    }

    public static List<Secteur> findByPropertySecteur(String propertyName, Object value) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        List<Secteur> secteurs = pr.findByProperty(propertyName, value);

        return secteurs;
    }

    public static Secteur findByUniquePropertySecteur(String propertyName, Object value) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        Secteur secteur = pr.findByPropertyUnique(propertyName, value);

        return secteur;
    }

    public static Secteur findByIdSecteur(int id) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        Secteur secteur = pr.findById(id);

        return secteur;
    }

    public static List<Secteur> searchSecteur(Object o, Object value) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        List<Secteur> secteurs = pr.search(o, value);

        return secteurs;
    }

    public static List<Secteur> findByCriteriasSecteur(String attr, String sens, int offset, int limit) throws SQLException {
        SecteurRepository pr = new SecteurRepository(PERSISTENCE_UNIT);
        List<Secteur> secteurs = pr.findByCriterias(attr, sens, offset, limit);

        return secteurs;
    }
}
