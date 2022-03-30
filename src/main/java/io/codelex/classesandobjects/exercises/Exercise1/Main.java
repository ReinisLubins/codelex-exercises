package io.codelex.classesandobjects.exercises.Exercise1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product camera = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        mouse.setAmount(16);
        mouse.printProduct();

        System.out.println();

        phone.printProduct();
        phone.setPrice(600);
        phone.printProduct();

        System.out.println();

        camera.printProduct();
        camera.setPrice(2000);
        camera.setAmount(4);
        camera.printProduct();
    }
}


