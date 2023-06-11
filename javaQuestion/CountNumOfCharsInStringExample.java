//Write a Java Program to count the number of characters in a given String.

package javaconcept.javaQuestion;
import java.util.HashMap;

public class CountNumOfCharsInStringExample {

    public static void main(String[] args) {
// Input value which needs to be passed in the below method.
        characterCount("Dineshraj dhanapathy");

    }
    static void characterCount(String inputString) {

// Creating a hashmap object.
        HashMap<Character, Integer> hash_map = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (hash_map.containsKey(c)) {
                hash_map.put(c, hash_map.get(c) + 1);
            }

            else {
                hash_map.put(c, 1);
            }

        }
// Print the hashmap object which gives the number of each character in String.
        System.out.println(hash_map);

    }



}


/*output :
{ =1, a=4, D=1, d=1, e=1, h=3, i=1, j=1, n=2, p=1, r=1, s=1, t=1, y=1}
 */
