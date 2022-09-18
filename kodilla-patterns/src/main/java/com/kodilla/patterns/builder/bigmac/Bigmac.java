package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private boolean bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder{
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean sesame) {
            this.bun = sesame;
            return this;
        }

        public BigmacBuilder burgers(int quantity) {
            this.burgers = quantity;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    private Bigmac(boolean bun, int burgers, String sauce, List<String> ingredients) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
