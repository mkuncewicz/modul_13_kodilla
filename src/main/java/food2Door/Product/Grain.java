package food2Door.Product;

public class Grain implements Product {

    private String name;
    public Grain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Grain{" +
                "name='" + name + '\'' +
                '}';
    }
}
