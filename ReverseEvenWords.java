package week1.assignment3;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		String test = "I am a software tester";
		String [] txt = test.split(" ");

		for(int i=0;i<txt.length;i++) {
			if(i % 2 == 1) {
			char[] split = txt[i].toCharArray();

			for(int j=split.length-1;j>=0;j--)
			{
				System.out.print(split[j]);

			}
			System.out.print(" ");

			}	
				else{
				System.out.print(txt[i] + " ");
			}
		}
	}	
}
