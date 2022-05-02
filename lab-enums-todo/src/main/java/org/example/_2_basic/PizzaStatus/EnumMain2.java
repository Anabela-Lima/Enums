package PizzaStatus;

public class EnumMain2 {

    public static void main(String[] args) {
        // lets create a new pizza- this pizza has 2 enums- pizza size and pizza status

        Pizza pizza1 = new Pizza("Crem",PizzaSize.Large,6,PizzaStatus.ORDERED);

        // print the new pizza

        System.out.println(pizza1);


        //------------------------------------------------------------------------------------------------------------


        // TO-DO 5

        // setting pizza status

        PizzaStatus pizzaStatus1 = PizzaStatus.ORDERED;

//     1. use an enum variable in an if-else statement

        if(pizzaStatus1 == PizzaStatus.ORDERED)
        {  System.out.println("Order Received, great choice!");}
        else if (pizzaStatus1 == PizzaStatus.READY)
        {  System.out.println("Hmmm... do you smell that? Your pizza is ready!");}
        else if (pizzaStatus1 == PizzaStatus.DELIVERED)
        {  System.out.println("Your pizza has been delivered. Enjoy and come again!");}

//        2. use of Enum in Switch-Case Statements

        switch (pizzaStatus1){
            case ORDERED:
                System.out.println("Order Received, great choice!");
                break;

            case READY:
                System.out.println("Hmmm... do you smell that? Your pizza is ready!");
                break;

            case DELIVERED:
                System.out.println("Your pizza has been delivered. Enjoy and come again!");
                break;

            default:
                System.out.println("I do not recognise this pizzastatus!");



        }










    }

}
