package DAO.interfaces;

import Domain.Street;

import javax.sql.RowSet;
import java.util.Collection;

/**
 * Created by Shevtsov on 14.10.14.
 */
public interface StreetDAO {
    public Integer insertStreet(Street street); //
    public boolean deleteStreet(Integer id);
    public Street findStreet(Integer id);
    public boolean updateStreet(Street street);
    public RowSet selectStreetsRS(Street street); //search streets here using the supplied criteria Return a RowSet
    public Collection selectStreetsTO(Street street); //search streets here using the supplied criteria, return a Collection of Transfer Objects
}
