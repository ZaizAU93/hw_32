package org.example;

public class Order {
    String food;
    String drink;
    double priceFood;
    double priceDrink;

    double price;

    public double getPrice() {
        return price;
    }

    public Order(String food, String drink, double price) {
        this.food = food;
        this.drink = drink;
        this.price = price;
    }

    public double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(double priceFood) {
        this.priceFood = priceFood;
    }

    public double getPriceDrink() {
        return priceDrink;
    }

    public void setPriceDrink(double priceDrink) {
        this.priceDrink = priceDrink;
    }




    public Order(String food, String drink) {
        this.food = food;
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
