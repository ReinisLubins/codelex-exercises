package io.codelex.exceptions;

public class Exercise2 {
    public void methodA() {
        //System.out.println(10 / 0);
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception object: " + e);
        }
    }

    public void methodB() {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("Exception object: " + e);
        }
    }

    public void methodC() {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception object: " + e);
        }
    }

    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        test.methodA();
    }
}
