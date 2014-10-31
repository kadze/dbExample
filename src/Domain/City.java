package Domain;

/**
 * Created by Shevtsov on 14.10.14.
 */
public class City {
    private Integer id;
    private String Name;

    public City(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
