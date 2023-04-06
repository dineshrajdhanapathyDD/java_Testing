package javaInterviewQuestion;

public class reverseSentence {
    public static void main(String[] args) {
        String str = "i am dineshraj dhanapathy";
        printreverseSentence(str);
    }
 private static void printreverseSentence(String str)
 {
     String [] strsplit = str.split("\\s");
     for(int i= strsplit.length-1; i>=0; i--){
     System.out.print(strsplit[i]+" ");
 }
 }
}
