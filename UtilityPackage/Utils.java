package UtilityPackage;

public class Utils {
    public boolean isPasswordValid(String password) {
        
        int numCheck = 0;
        int charCheck = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numCheck = 1;
            }
            else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                charCheck = 1;
            }
            else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                charCheck = 1;
            }
        }

        if (charCheck == 1 && numCheck == 1) 
            return true;
        
        else   
            return false;
    }
}
