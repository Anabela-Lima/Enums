package Months;

import java.time.Month;

public class EnumMain {


    public static void main(String[] args) {

        // let's create a Party


        Party anaParty = new Party("Ana's 25th", 35, Months.MARCH);

        // lets print the party

        System.out.println(anaParty);


        //------------------------------------------------------------------------------------------------------------


        // TO-DO 5

//     1. use an enum variable in an if-else statement

        Months month = Months.DECEMBER;

        // if Month is of instance JANUARY;

        if (month == Months.JANUARY)
        { System.out.println("It's January- the start of a new year!");}
        else if (month == Months.FEBRUARY)
        {System.out.println(" It is February, 2nd month of the year!");}
        else if (month == Months.MARCH)
        {System.out.println("its almost the twin's bday!");}
        else if (month== Months.APRIL)
        { System.out.println("April fools!");}
        else if (month== Months.MAY)
        { System.out.println("Spring season!");}
        else if (month== Months.JUNE)
        { System.out.println("Fun fact: The birthstone for June is Pearl");}
        else if (month == Months.JULY)
        {System.out.println("Carla's Birthday month, lets have a bash!");}
        else if (month == Months.AUGUST)
        {System.out.println("Summer time! Lets go on vacation !");}
        else if (month == Months.SEPTEMBER)
        {System.out.println("Back to school kids!");}
        else if (month == Months.OCTOBER)
        {System.out.println("0OOoooOOhhh halloween");}
        else if (month == Months.NOVEMBER)
        {System.out.println("Almost the end of the year");}
        else if (month == Months.DECEMBER)
        {System.out.println("put that Turkey in the OVEN! christmas is near!");}

//     2. use of Enum in Switch-Case Statements------------------------------------------------------------------------

// check enum using switch

        // breaks prevent you from falling through the next lines of code but it will print previous lines until
        // we reach desired case of month. IF we dont write breaks, it will print all the lines even if we
        // have arrived at dryerTemperature month ( we used when we created  a new month line 25)

    // recall we set our month to december when we created a new month object - see line 25
        switch (month){
            case JANUARY :
                System.out.println("It's January- the start of a new year!");
                break;

            case FEBRUARY:
                System.out.println(" It is February, 2nd month of the year!");
                break;

            case MARCH :
                System.out.println("its almost the twin's bday!");
                break;

            case APRIL:
                System.out.println("April fools!");
                break;

            case MAY:
                System.out.println("Spring season!");
                break;
            case JUNE:
                System.out.println("Fun fact: The birthstone for June is Pearl");
                break;

            case JULY:
                System.out.println("Carla's Birthday month, lets have a bash!");
                break;
            case AUGUST:
                System.out.println("Summer time! Lets go on vacation !");
                break;
            case SEPTEMBER:
                System.out.println("Back to school kids!");
                break;
            case OCTOBER:
                System.out.println("0OOoooOOhhh halloween");
                break;
            case NOVEMBER:
                System.out.println("Almost the end of the year");
                break;

            case DECEMBER:
                System.out.println("put that Turkey in the OVEN! christmas is near!");
                break;

            default:
                System.out.println("I do not recognise this month");

        }







    }










}
