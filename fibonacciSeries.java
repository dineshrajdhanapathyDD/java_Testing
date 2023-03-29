package javaInterviewQuestion;
import java.util.Scanner;



public class fibonacciSeries  {
    public static void main(String[] args) {
        int fiblength;
        //use scanner class to set user input45
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        fiblength = sc.nextInt();
        int [] num = new int[fiblength];

        //assign value 0 & 1 define array using

        num[0]=0;
        num[1]=1;
        //logic get value indices of array using for loop
        for(int i=2;i<fiblength;i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
            System.out.println("fibonacci series");
            //print fibonacci series
            for(int i = 0;i<fiblength; i++)
            {
                System.out.println(num[i]+"");
            }

        }


    }

