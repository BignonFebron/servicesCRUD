package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.Commune;
import com.bootcamp.jpa.entities.Departement;
import com.bootcamp.jpa.repositories.CommuneRepository;
import com.bootcamp.jpa.repositories.DepartementRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class GeographieCRUD {

    /* Crud for departement */

    public static void createDepartement(Departement departement) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        pr.create(departement);
    }

    public static void updateDepartement(Departement departement) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        pr.update(departement);
    }

    public static void deleteDepartement(Departement departement) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        pr.delete(departement);
    }

    public static List<Departement> findAllDepartement() throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> liste = pr.findAll();
        return liste;
    }

    public static List<Departement> findByPropertyDepartement(String propertyName, Object value) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> departements = pr.findByProperty(propertyName, value);

        return departements;
    }

    public static Departement findByUniquePropertyDepartement(String propertyName, Object value) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        Departement departement = pr.findByPropertyUnique(propertyName, value);

        return departement;
    }

    public static Departement findByIdDepartement(int id) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        Departement departement = pr.findById(id);

        return departement;
    }

    public static List<Departement> searchDepartement(Object o, Object value) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> departements = pr.search(o, value);

        return departements;
    }

    public static List<Departement> findByCriteriasDepartement(String attr, String sens, int offset, int limit) throws SQLException {
        DepartementRepository pr = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> departements = pr.findByCriterias(attr, sens, offset, limit);

        return departements;
    }
    
    /* Crud for commune */

    public static void create(Commune commune) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        pr.create(commune);
    }

    public static void update(Commune commune) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        pr.update(commune);
    }

    public static void delete(Commune commune) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        pr.delete(commune);
    }

    public static List<Commune> findAllCommune() throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> liste = pr.findAll();
        return liste;
    }

    public static List<Commune> findByPropertyCommune(String propertyName, Object value) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> communes = pr.findByProperty(propertyName, value);

        return communes;
    }

    public static Commune findByUniquePropertyCommune(String propertyName, Object value) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        Commune commune = pr.findByPropertyUnique(propertyName, value);

        return commune;
    }

    public static Commune findByIdCommune(int id) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        Commune commune = pr.findById(id);

        return commune;
    }

    public static List<Commune> searchCommune(Object o, Object value) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> communes = pr.search(o, value);

        return communes;
    }

    public static List<Commune> findByCriteriasCommune(String attr, String sens, int offset, int limit) throws SQLException {
        CommuneRepository pr = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> communes = pr.findByCriterias(attr, sens, offset, limit);

        return communes;
    }
}
