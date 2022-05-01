package io.codelex.advancedTest.Exercise2;

public class Tests {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {
        Basket<Apple> basket1 = new Basket<>();
        Basket<Mushroom> basket2 = new Basket<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        Apple apple11 = new Apple();

        basket1.addToBasket(apple1);
        basket1.addToBasket(apple2);
        basket1.addToBasket(apple3);
        basket1.addToBasket(apple4);
        basket1.addToBasket(apple5);
        basket1.addToBasket(apple6);
        basket1.addToBasket(apple7);
        basket1.addToBasket(apple8);
        basket1.addToBasket(apple9);
        basket1.addToBasket(apple10);
        //basket1.addToBasket(apple11);


        Mushroom mushroom1 = new Mushroom();

        basket2.addToBasket(mushroom1);
        basket2.removeFromBasket(mushroom1);
        basket2.removeFromBasket(mushroom1);


    }
}
