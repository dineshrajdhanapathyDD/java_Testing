package javaprogram;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String given = " i mess DD";
    
    String replaceText =  given.replaceAll("[AEIOUaeiou]", "*");
    System.out.println(replaceText);
	}

}
