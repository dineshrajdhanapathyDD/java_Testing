package javaprogram;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 20;
		int supersalary = 30;
		
		System.out.println("before swap:"+salary + " "+supersalary);
		int temp =salary;
		salary = supersalary;
		supersalary = temp;
		System.out.println("After swap:"+salary +" " + supersalary);

	}

}
