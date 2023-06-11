package javaInterviewQuestion.javaInterviewQuestion;

import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        //Scanner scanner = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("enter the elements of array");
        for (int i =0; i<n; i++)
        {
            array[i]= scanner.nextInt();
        }
        SmallestNumberInArray smallestNumberInArray = new SmallestNumberInArray();
        smallestNumberInArray.findSmallestNumber(array);
    }
    
    public void findSmallestNumber(int[] givenarray){
        int smallest = Integer.MAX_VALUE;
        for (int i =0; i<givenarray.length; i++){
            if (givenarray[i] < smallest){
                smallest =givenarray[i];
            }
        }
        System.out.println("smallest no:"+smallest);
    }
}
