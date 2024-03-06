package exception;

import java.util.Locale;

public class ExceptionService {
    public  String greet (String input){
        String upperCase = null;
        try {

            upperCase = input.toUpperCase();

        }finally {
            System.out.println("from fiallay block with out cathch block");
        }
        return upperCase;
    }
}
