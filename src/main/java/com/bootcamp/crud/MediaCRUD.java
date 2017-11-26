
package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.Media;
import com.bootcamp.jpa.repositories.MediaRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class MediaCRUD
{
    public static void create(Media media) throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
        pr.create(media);
    }
    
    public static void update(Media media) throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
        pr.update(media);
    }
    
    public static void delete(Media media) throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
        pr.delete(media);
    }
    
    public static List<Media> findAll() throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
        List<Media> liste =pr.findAll();
        return liste;
    }
    
    public static List<Media> findByProperty(String propertyName, Object value) throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
        List<Media> medias = pr.findByProperty(propertyName, value);
        
        return medias;
    }
    
    public static Media findByPropertyUnique(String propertyName, Object value) throws SQLException{
        MediaRepository pr = new MediaRepository(PERSISTENCE_UNIT);
       Media media = pr.findByPropertyUnique(propertyName, value);
        
        return media;
    }
}
