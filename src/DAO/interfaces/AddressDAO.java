package DAO.interfaces;

import Domain.Address;
import javax.sql.RowSet;
import java.util.Collection;

/**
 * Created by Shevtsov on 30.10.14.
 */
public interface AddressDAO {
    public Integer insertCity(Address address); //
    public boolean deleteCity(Integer id);
    public Address findCity(Integer id);
    public boolean updateCity(Address address);
    public RowSet selectCitiesRS(Address address); //search cities here using the supplied criteria Return a RowSet
    public Collection<Address> selectCitiesTO(Address address); //search cities here using the supplied criteria, return a Collection of Transfer Objects
}
