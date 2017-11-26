
package com.bootcamp.crud;

import static com.bootcamp.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.jpa.entities.User;
import com.bootcamp.jpa.repositories.UserRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class UserCRUD
{
    public static void create(User user) throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
        pr.create(user);
    }
    
    public static void update(User user) throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
        pr.update(user);
    }
    
    public static void delete(User user) throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
        pr.delete(user);
    }
    
    public static List<User> findAll() throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
        List<User> liste =pr.findAll();
        return liste;
    }
    
    public static List<User> findByProperty(String propertyName, Object value) throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
        List<User> users = pr.findByProperty(propertyName, value);
        
        return users;
    }
    
    public static User findByPropertyUnique(String propertyName, Object value) throws SQLException{
        UserRepository pr = new UserRepository(PERSISTENCE_UNIT);
       User user = pr.findByPropertyUnique(propertyName, value);
        
        return user;
    }
}
