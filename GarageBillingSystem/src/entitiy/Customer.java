package entitiy;

public class Customer {
    public Customer() {

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  " Customer id " + id + ", name  "+name+",  Phone  "+phone;
    }

    public Customer(int id, String name, String phone) {
    }

    public Customer( String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private int id;
    private String name;
    private String phone;
}
