package javaconcept.javaQuestion;

public class ExtractLast4CharofString {
    public static void main(String[] args) {
        String str = "dinesh";
        printLast4Chars(str);
    }
    private static void printLast4Chars(String str)
    {
        int size = str.length();
        int counter =size-4;
        for(int i=counter;i<size;i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}


/*output :
n
e
s
h
 */