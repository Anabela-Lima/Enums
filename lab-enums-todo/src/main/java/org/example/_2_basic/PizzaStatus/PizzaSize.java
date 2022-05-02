package PizzaStatus;

public enum PizzaSize {


    Small(1),
    Medium(2),
    Large(3),;


// property of pizza size- is final, cant be changed, pizza is either small, medium or large
    private final int pizzaSize;

// constructor for pizza size
    PizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

//  getters and setters


    public int getPizzaSize() {
        return pizzaSize;
    }


}


