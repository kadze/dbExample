package Domain;

/**
 * Created by Shevtsov on 14.10.14.
 */
public class Address {
    private Integer id;
    private City city;
    private Street street;
    private int houseNumber;

    public Address(Integer id, City city, Street street, int houseNumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
