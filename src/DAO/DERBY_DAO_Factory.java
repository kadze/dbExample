package DAO;

import DAO.interfaces.AddressDAO;
import DAO.interfaces.CityDAO;
import DAO.interfaces.StreetDAO;

/**
 * Created by Shevtsov on 14.10.14.
 */
public class DERBY_DAO_Factory extends DAOFactory {

    @Override
    public StreetDAO getStreetDAO() {
        return null;
    }

    @Override
    public CityDAO getCityDAO() {
        return null;
    }

    @Override
    public AddressDAO getAddressDAO() {
        return null;
    }
}
