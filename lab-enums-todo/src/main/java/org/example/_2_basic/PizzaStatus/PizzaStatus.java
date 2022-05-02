package PizzaStatus;

public enum PizzaStatus {


    // our 3 fixed drop down values for pizza status
    ORDERED(1),
    READY(2),
    DELIVERED(3),
    ;


    // property of enum----------------------------------------------------------------------------------------------------

    // associate values with months- for order
    // final means can not change them -fixed- we have 12 months and they all have
    // their own associated values (order)
    // since we gave enum a
    private final int pizzaStatusNumber;


    // we created a constructor for say this is how you create a pizzaStatus

    PizzaStatus(int pizzaStatusNumber) {
        this.pizzaStatusNumber = pizzaStatusNumber;
    }
}
