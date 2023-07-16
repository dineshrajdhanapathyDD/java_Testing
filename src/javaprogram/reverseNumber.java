package javaprogram;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int givennumber  = 123 ;
int reversenumber  =0;
while (givennumber != 0) {
	reversenumber = reversenumber *10;
	reversenumber = reversenumber %10;
	givennumber = givennumber/10;
}
		System.out.println(reversenumber);
	}

}
