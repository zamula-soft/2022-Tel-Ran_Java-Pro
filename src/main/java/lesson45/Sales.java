package lesson45;

public class Sales {
    private int id;
    private String name;
    private String city;
    private int commission;

    public Sales(int id, String name, String city, int commission) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.commission = commission;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getCommission() {
        return commission;
    }
}
