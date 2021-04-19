package assessment;

class UserMainCode{
	public static boolean checkPassword(String password){
	     if (!((password.length() >= 8)
	              && (password.length() <= 15))) {
	            return false;
	        }
	  
	        
	        
	            int count = 0;
	  
	            for (int i = 0; i <= 9; i++) {
	  
	                String str1 = Integer.toString(i);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        
	  
	        if (!(password.contains("@") || password.contains("#")
	              || password.contains("!") || password.contains("~")
	              || password.contains("$") || password.contains("%")
	              || password.contains("^") || password.contains("&")
	              || password.contains("*") || password.contains("(")
	              || password.contains(")") || password.contains("-")
	              || password.contains("+") || password.contains("/")
	              || password.contains(":") || password.contains(".")
	              || password.contains(", ") || password.contains("<")
	              || password.contains(">") || password.contains("?")
	              || password.contains("|"))) {
	            return false;
	        }
	  
	        
	             count = 0;
	  
	            for (int i = 65; i <= 90; i++) {
	  
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        
	  
	       
	             count = 0;
	  
	            for (int i = 90; i <= 122; i++) {
	  
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return false;
	            }
	        
	  
	        return true;
	}
}
public class program2 {
	public static void main(String[] args)
    {
        String password1 = "Night#321";
        System.out.println("Input 1: "+ password1);
        if (UserMainCode.checkPassword(password1)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
  
        String password2 = "night#321";
        System.out.println("Input 1: "+ password2);

        if (UserMainCode.checkPassword(password2)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
