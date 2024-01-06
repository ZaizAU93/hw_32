package org.example.PatternDTO;

public class OrderDTO {
    String food;
    String drink;

    public OrderDTO(String food, String drink) {
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

