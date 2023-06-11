package javaconcept.javaQuestion;

public class removeWhiteSPace {
    public static void main(String[] args) {
        String str = "       DINESh";
        System.out.print(removeWhiteSpace(str));
    }
    private static String removeWhiteSpace(String str)
    {
        String newstr =str.replaceAll("\\s", "");
        return newstr;
    }
}


/*output:
DINESh
 */