package edu.aurora.ocp;

public class OCPTest {

    public static void main(String[] args) {

        JavaCourse javaCourse = new JavaDiscountCourse(1,"JAVA",100.0);
        System.out.println(((JavaDiscountCourse) javaCourse).getOriginPrice());
        System.out.println( javaCourse.getPrice());
    }
}
