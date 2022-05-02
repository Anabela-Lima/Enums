package Months;

public enum Months {

    // lets create a set of allowed values

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12),
    ;

// property of enum----------------------------------------------------------------------------------------------------

    // associate values with months- for order
    // final means can not change them -fixed- we have 12 months and they all have
    // their own associated values (order)
    private final int monthNumber;

    // constructor for enum--------------------------------------------------------------------------------------------

      // we created a constructor (before we had red underlines on the blue numbers above)
     // because we used a constructor, they are now objects and objects have properties

    Months(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    // getters and setters--------------------------------------------------------------------------------------------

   // program only allows us to use the getter because a final means you cant set anything, you are given a set of
    // fixed options
    public int getMonthNumber() {
        return monthNumber;
    }
}
