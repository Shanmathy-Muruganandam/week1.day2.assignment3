package week1.assignment3;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		char[]charArray = str.toCharArray();
		str.length();
		for (int i = 0; i < charArray.length; i++) {
			char c = str.charAt(i);
			if(c == 'e') {
				count++;
				System.out.println("CharOcurence is  "+count);
			}

		}
		System.out.println("Total CharOcurence of 'e' is  "+count);

	}
	
}