package javaprogram;

import java.util.HashMap;
import java.util.Map;

public class DistinctValueString {
	
	public static void finddistinctvalue(String text) {
		char[] chars =text .toCharArray();
		Map<Character, Integer> charcount = new HashMap<>();
		
		for (char c : chars) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}
			else {
				charcount.put(c, 1);
			}
		}
		System.out.println(charcount);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "abcdABCDabcd";
		 finddistinctvalue(text);
	}

}
