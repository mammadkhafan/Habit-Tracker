package UtilityPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public boolean isPasswordValid(String password) {
        
        int numCheck = 0;
        int letterCheck = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numCheck = 1;
            }
            else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                letterCheck = 1;
            }
            else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                letterCheck = 1;
            }
        }

        if (letterCheck == 1 && numCheck == 1) 
            return true;
        
        else   
            return false;
    }

    public boolean isEmailValid(String gmail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        /*the expresion of this string
         that i have found it on google
         for all email formats
         is in the zip file*/

         String gmailRegex = "@gmail.com";  //this is just for gmail

        Pattern pattern = Pattern.compile(gmailRegex);
        return pattern.matcher(gmail).matches();
    }
}
