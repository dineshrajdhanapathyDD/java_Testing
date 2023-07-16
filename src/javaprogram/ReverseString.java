package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String given = "dinesh";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
*/
		String given = "dinesh";
		char [] charArray =given.toCharArray();
		String reversed = "";
		for(int i = charArray.length-1; i>=0; i--) {
			reversed = reversed +charArray[i];
		}
		
		System.out.println(reversed);
	}

}
