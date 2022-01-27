package week1.assignment3;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		
		int len = str.length();

	    for (int i = (len - 1); i >=0; --i) {
	      
	    	rev = rev + str.charAt(i);
	    }

	    if (str.equalsIgnoreCase(rev)) {
	    	
	      System.out.println(str + " is a Palindrome String.");
	      
	    }
	    else {
	    	
	      System.out.println(str + " is not a Palindrome String.");
	      
	    }
	}

}
