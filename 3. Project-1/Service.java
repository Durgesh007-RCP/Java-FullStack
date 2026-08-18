public class Service {

    private int id;
    private String Name;

    private int price;

    public Service(int id, String name, int price) {
        this.id = id;
        this.Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(int price) {

        this.price = price;
    }
}
