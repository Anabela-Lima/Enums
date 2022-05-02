package Loglevel;
public class EnumMain {



/*
        TODO 6a Implement the method's logic so that getLogLevelMessageUsingIf returns:

        getLogLevelMessageUsingIf(LogLevel.DEBUG)   -> "It's DEBUG!"
        getLogLevelMessageUsingIf(LogLevel.INFO)    -> "It's INFO!"
        getLogLevelMessageUsingIf(LogLevel.WARNING) -> "It's WARNING!"

 */


    // method- we want it to be a string so that we can run the tests- if void, will not return anything


   public String getLogLevelMessageUsingIf(LogLevel logLevel) {
       if (logLevel == LogLevel.DEBUG) {
           return "It's DEBUG!";
       } else if (logLevel == LogLevel.INFO) {
           return "It's INFO!";
       } else if (logLevel == LogLevel.WARNING) {
           return "It's WARNING!";

       } else {
           throw new RuntimeException("error! please use Debug, info or Warning");

       }


   }


/*

    TODO 6b Implement the method's logic so that getLogLevelMessageUsingSwitchCase returns:
    getLogLevelMessageUsingSwitchCase(LogLevel.DEBUG)   -> "It's DEBUG!"
    getLogLevelMessageUsingSwitchCase(LogLevel.INFO)    -> "It's INFO!"
    getLogLevelMessageUsingSwitchCase(LogLevel.WARNING) -> "It's WARNING!"


 */



    public String getLogLevelMessageUsingSwitchCase(LogLevel logLevel) {

        switch (logLevel) {
            case DEBUG:
            { return "It's DEBUG!";}


            case INFO:
            {   return "It's INFO!";}

            // Default case is always warning
             default:
            { return "It's WARNING!";}
        }

    }




}
   
   
