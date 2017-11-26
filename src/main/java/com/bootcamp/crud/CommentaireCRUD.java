package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.Commentaire;
import com.bootcamp.jpa.repositories.CommentaireRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CommentaireCRUD {

    /* Crud for commentaire */

    public static void create(Commentaire commentaire) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        pr.create(commentaire);
    }

    public static void update(Commentaire commentaire) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        pr.update(commentaire);
    }

    public static void delete(Commentaire commentaire) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        pr.delete(commentaire);
    }

    public static List<Commentaire> findAll() throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        List<Commentaire> liste = pr.findAll();
        return liste;
    }

    public static List<Commentaire> findByProperty(String propertyName, Object value) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        List<Commentaire> commentaires = pr.findByProperty(propertyName, value);

        return commentaires;
    }

    public static Commentaire findByUniqueProperty(String propertyName, Object value) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        Commentaire commentaire = pr.findByPropertyUnique(propertyName, value);

        return commentaire;
    }

    public static Commentaire findById(int id) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        Commentaire commentaire = pr.findById(id);

        return commentaire;
    }

    public static List<Commentaire> search(Object o, Object value) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        List<Commentaire> commentaires = pr.search(o, value);

        return commentaires;
    }

    public static List<Commentaire> findByCriterias(String attr, String sens, int offset, int limit) throws SQLException {
        CommentaireRepository pr = new CommentaireRepository(PERSISTENCE_UNIT);
        List<Commentaire> commentaires = pr.findByCriterias(attr, sens, offset, limit);

        return commentaires;
    }
}
