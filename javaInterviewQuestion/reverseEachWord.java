package javaInterviewQuestion;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class reverseEachWord {
    public static void main(String[] args) {
        String str = "dineshraj dhanpathy";
        printEachWordreverse(str);
    }
    private static void printEachWordreverse(String str)
    {
        String [] arr =str.split(" ");
        String reverse = "";
        String reverseString = "";
        for (int i=0; i<arr.length;i++)
        {
            int lengthofEachWord = arr[i].length();
            for (int j=lengthofEachWord-1; j>=0; j--)
            {
                reverse = String.valueOf(arr[i].charAt(j));
                System.out.print(reverse);
                reverseString += reverse;

            }

        }
    }
}
