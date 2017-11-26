package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.Projet;
import com.bootcamp.jpa.repositories.ProjetRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class ProjetCRUD {

    /* Crud for projet */
    public static void create(Projet projet) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        pr.create(projet);
    }

    public static void update(Projet projet) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        pr.update(projet);
    }

    public static void delete(Projet projet) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        pr.delete(projet);
    }

    public static List<Projet> findAll() throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        List<Projet> liste = pr.findAll();
        return liste;
    }

    public static List<Projet> findByProperty(String propertyName, Object value) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        List<Projet> projets = pr.findByProperty(propertyName, value);

        return projets;
    }

    public static Projet findByUniqueProperty(String propertyName, Object value) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        Projet projet = pr.findByPropertyUnique(propertyName, value);

        return projet;
    }

    public static Projet findById(int id) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        Projet projet = pr.findById(id);

        return projet;
    }

    public static List<Projet> search(Object o, Object value) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        List<Projet> projets = pr.search(o, value);

        return projets;
    }

    public static List<Projet> findByCriterias(String attr, String sens, int offset, int limit) throws SQLException {
        ProjetRepository pr = new ProjetRepository(PERSISTENCE_UNIT);
        List<Projet> projets = pr.findByCriterias(attr, sens, offset, limit);

        return projets;
    }

}
