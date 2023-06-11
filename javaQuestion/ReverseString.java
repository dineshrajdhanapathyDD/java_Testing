package javaInterviewQuestion.javaInterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "dineshraj";
        String outputString = "";
        /* writing loop & loop reverse order */
        for(int i =inputString.length()-1; i>=0; i--){
            outputString =outputString +inputString.charAt(i);
        }
        System.out.println(outputString);

        String str = "helloworld"; //method function
        printReverseofString(str); //calling
    }
    private static void printReverseofString(String str) //method
    {
        for(int i=str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }


}
