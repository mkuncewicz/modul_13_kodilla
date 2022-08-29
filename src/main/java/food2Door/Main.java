package food2Door;

import food2Door.Product.Grain;
import food2Door.Product.Meat;
import food2Door.Product.Product;
import food2Door.Product.Vegetables;
import food2Door.manufacturer.ExtraFoodShop;
import food2Door.manufacturer.GlutenFreeShop;
import food2Door.manufacturer.HealthyShop;
import food2Door.manufacturer.Manufacturer;

public class Main {
    public static void main(String[] args) {

        OrderMaker orderMaker = new OrderMaker();
        Manufacturer manufacturer1 = new ExtraFoodShop();
        Manufacturer manufacturer2 = new GlutenFreeShop();
        Manufacturer manufacturer3 = new HealthyShop();

        Product product1 = new Grain("Chleb");
        Product product2 = new Meat("Steak");
        Product product3 = new Vegetables("Pomidory");

        orderMaker.order(product1, 5, manufacturer1);
        orderMaker.order(product3, 5, manufacturer2);
        orderMaker.order(product2, 25, manufacturer3);

    }
}
