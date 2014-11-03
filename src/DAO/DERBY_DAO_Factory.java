package DAO;

import DAO.interfaces.AddressDAO;
import DAO.interfaces.CityDAO;
import DAO.interfaces.StreetDAO;
import org.apache.derby.jdbc.EmbeddedDataSource40;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Shevtsov on 14.10.14.
 */
public class DERBY_DAO_Factory extends DAOFactory {

    public static final String DRIVER = "";
    public static final String DBURL = "";
    public static final String dbName = "D:/Шевцов/JAVA/Projects/dbTrainTemp/database/shubaduba";

    public static Connection createConnection() throws SQLException {
        //DERBY 10.10; embedded
        //http://db.apache.org/derby/docs/10.10/devguide/
        //http://db.apache.org/derby/docs/10.10/ref/index.html
        EmbeddedDataSource40 dataSource = new EmbeddedDataSource40();
        dataSource.setDatabaseName(dbName);
        Connection connection = dataSource.getConnection();
        return connection;
    }

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
