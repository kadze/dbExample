package DAO.interfaces;

import Domain.City;
import javax.sql.RowSet;
import java.util.Collection;

/**
 * Created by Shevtsov on 30.10.14.
 */
public interface CityDAO {
    public Integer insertCity(City city); //
    public boolean deleteCity(Integer id);
    public City findCity(Integer id);
    public boolean updateCity(City city);
    public RowSet selectCitiesRS(City city); //search streets here using the supplied criteria Return a RowSet
    public Collection<City> selectCitiesTO(City city); //search streets here using the supplied criteria, return a Collection of Transfer Objects
}
