package week1.assignment3;

public class FindTypes {	
	
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		// TODO Auto-generated method stub
		int letter = 0,space = 0, num = 0,specialChar =0;
		char[]charAt = test.toCharArray();
		for (int i = 0; i < charAt.length; i++) {
			if( Character.isLetter(charAt[i])) {
				letter++;
			}
			else if(Character.isDigit(charAt[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(charAt[i])) {
				space++;

			}
			else {
				specialChar++;
			}
			}
				System.out.println("Letter Count is "+ letter);
				System.out.println("Digit Count is "+ num);
				System.out.println("Space Count is "+ space);
				System.out.println("Special Character Count is "+ specialChar);
			}



}
