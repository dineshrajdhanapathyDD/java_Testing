 package javaInterviewQuestion;

import java.util.ArrayList;

public class cloneMethod {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        ArrayList a12 = new ArrayList();

        a1.add(10);
        a1.add(13);
        a1.add(20);

        a12 = (ArrayList) a1.clone();
        System.out.println(a12);
    }
}
