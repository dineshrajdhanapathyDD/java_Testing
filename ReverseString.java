package javaInterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "dineshraj";
        String outputString = "";
        /* writing loop & loop reverse order */
        for(int i =inputString.length()-1; i>=0; i--){
            outputString =outputString +inputString.charAt(i);
        }
        System.out.println(outputString);
    }
}
