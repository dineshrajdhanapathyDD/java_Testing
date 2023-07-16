package javaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameelement {
	
	public static <object> boolean Arraysameelement(object[] arr1, object[] arr2) {
		Set<object> findelement1= new HashSet<>(Arrays.asList(arr1));
		Set<object>findelement2 = new HashSet<>(Arrays.asList(arr2));
		
		if(findelement1.size()!= findelement2.size()) {
		return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3,5 };
		System.out.println(Arraysameelement(a1,a2));
	}

}
