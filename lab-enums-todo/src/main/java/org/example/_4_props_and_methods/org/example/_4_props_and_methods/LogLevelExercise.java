package org.example._4_props_and_methods;

public enum LogLevelExercise {

      /*
        TODO 8 add the below properties and set them in the constructor
         -String displayName
         -boolean sendSMSToAdmin

        +──────────+────────────────────+─────────────────+
        |          | displayName        | sendSmsToAdmin  |
        +──────────+────────────────────+─────────────────+
        | DEBUG    | "It's DEBUG!"      |      no         |
        | INFO     | "It's INFO!"       |      no         |
        | WARNING  | "It's WARNING!"    |     yes         |
        +──────────+────────────────────+─────────────────+

*/


    DEBUG("It's DEBUG!", false   ),
    INFO("It's INFO!", false),
    WARNING("It's WARNING!", true),;



   // properties:

    private final String displayName;
    private final boolean sendSmsToAdmin;


    // constructor:

    LogLevelExercise(String displayName, boolean sendSmsToAdmin) {
        this.displayName = displayName;
        this.sendSmsToAdmin = sendSmsToAdmin;
    }




/*
        TODO 9 add two methods, returning the above properties' values
        - getDisplayName
        - isSendSMSToAdmin
 */


//    - getDisplayName


    public String getDisplayName(){                    // string so we can see when run test

        System.out.println("The display name is: ");
        return displayName;
    }

//      - isSendSMSToAdmin

    public Boolean isSendSMSToAdmin(){

        return sendSmsToAdmin;
    }



 /*
        TODO 10 to sum up, your enum should have:
        -3 constants
        -2 extra fields
        -2 methods
        -1, 2-parameter constructor

        run the tests in org.gexample._4_usage.EnumUsageExamplesTest to verify your work
*/

}
