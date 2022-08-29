package food2Door.manufacturer;

import food2Door.Product.Product;

import java.time.LocalDateTime;

public class ExtraFoodShop implements Manufacturer{

    private String name = "ExtraFoodShop";

    @Override
    public boolean process() {
        System.out.println("Check DB");
        System.out.println("Check Date");
        return true;
    }


    @Override
    public String toString() {
        return name;
    }
}
