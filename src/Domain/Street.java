package Domain;

/**
 * Created by Shevtsov on 08.10.14.
 */
public class Street {

    private Integer id;
    private String name;

    public Street(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
