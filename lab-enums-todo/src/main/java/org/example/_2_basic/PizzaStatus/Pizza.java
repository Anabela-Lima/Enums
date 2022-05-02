package PizzaStatus;

import PizzaStatus.PizzaSize;

public class Pizza {

    // properties

    private String customerName;
    private PizzaSize size;
    private int numberOfToppings;
    private PizzaStatus status;

    // constructor for pizza


    public Pizza(String customerName, PizzaSize size, int numberOfToppings, PizzaStatus status) {
        this.customerName = customerName;
        this.size = size;
        this.numberOfToppings = numberOfToppings;
        this.status = status;
    }


    // getters and setters


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    // to-string


    @Override
    public String toString() {
        return "Pizza{" +
                "customerName='" + customerName + '\'' +
                ", size=" + size +
                ", numberOfToppings=" + numberOfToppings +
                ", status=" + status +
                '}';
    }
}
