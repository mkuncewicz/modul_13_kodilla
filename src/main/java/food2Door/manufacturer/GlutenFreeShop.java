package food2Door.manufacturer;

import food2Door.Product.Product;

import java.time.LocalDateTime;

public class GlutenFreeShop implements Manufacturer{

    private String name = "GlutenFreeShop";

    @Override
    public boolean process() {
        return true;
    }


    @Override
    public String toString() {
        return name;
    }
}
