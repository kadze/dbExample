package DAO;

import DAO.interfaces.AddressDAO;
import DAO.interfaces.CityDAO;
import DAO.interfaces.StreetDAO;

/**
 * Created by Shevtsov on 14.10.14.
 */
public abstract class DAOFactory {

    public static final int mySQL = 1;
    public static final int DERBY = 2;

    public abstract StreetDAO getStreetDAO();
    public abstract CityDAO getCityDAO();
    public abstract AddressDAO getAddressDAO();

    public static DAOFactory getDADaoFactory(int whichFactory){
        switch (whichFactory){
            case mySQL :
                return new mySQL_DAOFactory();
            case DERBY :
                return new DERBY_DAO_Factory();
            default:
                return null;
        }
    }

}
