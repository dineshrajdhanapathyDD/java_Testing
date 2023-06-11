package javaconcept.javaQuestion;

public class SwapTwoString {
    public static void main(String[] args) {
        // take 2 strings
        String s1 = "Dinesh";
        String s2 = "raj";
        //combine both strings
        s1 = s1 +s2;

        //substring method to set the subset of combined string
        s2 = s1.substring(0,s1.length()-s2.length());
        s1= s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}



/*output:
raj
Dinesh
 */