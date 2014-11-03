package DAO.DERBY_DAO;

import DAO.interfaces.CityDAO;
import Domain.City;

import javax.sql.RowSet;
import java.util.Collection;

/**
 * Created by Shevtsov on 03.11.14.
 */
public class DerbyCityDAO implements CityDAO{
    @Override
    public Integer insertCity(City city) {
        return null;
    }

    @Override
    public boolean deleteCity(Integer id) {
        return false;
    }

    @Override
    public City findCity(Integer id) {
        return null;
    }

    @Override
    public boolean updateCity(City city) {
        return false;
    }

    @Override
    public RowSet selectCitiesRS(City city) {
        return null;
    }

    @Override
    public Collection<City> selectCitiesTO(City city) {
        return null;
    }
}
