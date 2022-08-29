package food2Door.manufacturer;

public class HealthyShop implements Manufacturer{

    private String name = "HealthyShop";

    @Override
    public boolean process() {
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
