package food2Door.Product;

public class Meat implements Product {

    private String name;

    public Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + name + '\'' +
                '}';
    }
}
