package food2Door.Product;

public class Vegetables implements Product {

    private String name;

    public Vegetables(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                '}';
    }
}
