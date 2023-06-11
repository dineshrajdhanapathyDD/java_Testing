package javaconcept.javaQuestion;

import java.util.HashMap;
import java.util.Map;

public class Countwords {
    public static void main(String[] args) {
        String str = " i am dinesh dinesh raj raj raj dd dd";

        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer count =1;
        String[] arr = str.split(" ");
        for (int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], count);
            }
            else{
            map.put(arr[i], map.get(arr[i])+1);
        }}

        //printing the output
        for(String x:map.keySet()){
            System.out.println("count of word:"+x+"="+map.get(x));
        }
    }
}


/*output:
count of word:=1
count of word:dd=2
count of word:i=1
count of word:raj=3
count of word:am=1
count of word:dinesh=2
 */