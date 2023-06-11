package javaInterviewQuestion.javaInterviewQuestion;

public class ChangeSpecialChar1 {
    public static void main(String[] args) {
        String str = "Hello@Dinesh";
        System.out.print(printDifferentspecialChar(str));

    }
    private static String printDifferentspecialChar(String str)
    {
        return str.replaceAll("@", "_");
    }
}
