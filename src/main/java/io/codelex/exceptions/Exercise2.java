package io.codelex.exceptions;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        //System.out.println(10 / 0);
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Exception at method A");
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("Exception at method B");
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception at method C: " + e);
        }
    }

    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        test.methodA();
    }
}
