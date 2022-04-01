package io.codelex.advancedTest.Exercise2;

public class Basket<T> {
    private Object[] basket = new Object[10];
    private int counter = 0;

    public void addToBasket(T item) throws BasketFullException {
        try {
            basket[counter] = item;
            counter++;
        } catch (RuntimeException e) {
            throw new BasketFullException("Basket is Full!");
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        try {
            basket[counter] = item;
            counter--;
        } catch (RuntimeException e) {
            throw new BasketEmptyException("Basket is Empty!");
        }
    }
}
