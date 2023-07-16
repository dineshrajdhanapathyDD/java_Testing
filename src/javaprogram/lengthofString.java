package javaprogram;

public class lengthofString {

	public static void main(String[] args) {
		// using with length
		String givenstring = "dineshrajd";
		System.out.println(givenstring.length());

		
		//without using length
		char[] charArray = givenstring.toCharArray();
		int length = 0;
		for (char c : charArray) {
			length++;
		System.out.print(length);
		}

	}

}
