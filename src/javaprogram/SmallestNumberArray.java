package javaprogram;

import java.util.Arrays;

public class SmallestNumberArray {

	
		//method using this program
		int givenarray [] = {2,1,3,4,5};
		public void findsmallest() {
			int smallest= Integer.MAX_VALUE;
			for (int i=0; i<givenarray.length; i++) {
				if(givenarray[i]<smallest) {
					smallest=givenarray[i];
				}
			}
			
			System.out.println("smallest is:"+smallest);
					}
	//second method 	
		public void usingarray() {
			Arrays.sort(givenarray);
			System.out.println(givenarray[0]);
			
			
		}
		
		
		public static void main(String[] args) {
			SmallestNumberArray array =  new SmallestNumberArray();
			array.findsmallest();

			array.usingarray();
	}

}
