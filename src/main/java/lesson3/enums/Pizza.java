package lesson3.enums;

public class Pizza {
    private PizzaSize size;
    private int cheese, pepperoni, ham;

    public Pizza(PizzaSize size, int cheese, int pepperoni, int ham) {
            this.size = size;
            this.cheese = cheese;
            this.pepperoni = pepperoni;
            this.ham = ham;
    }

    public double calculatePrice() {
        double price = 0;
        switch (size){
            case SMALL:  price += 10.; break;
            case MEDIUM: price += 12.; break;
            case LARGE:  price += 14.; break;
        }

        price += (cheese  + pepperoni  + ham) * 2;
        return price;

    }

    @Override
    public String toString() {
        return String.format("Pizza [size = %s], cheese = %d, pepperoni = %d, ham = %d", size, cheese, pepperoni, ham);
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }
}
