package javaprogram;

public class fibonacciSeries {
	
	public static int findfibonacci(int n) {
		if (n<=1)
			
		return n;
		return findfibonacci(n-1)+findfibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findfibonacci(9));

	}

}
