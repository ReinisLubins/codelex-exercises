package io.codelex.advancedTest.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> basket = new ArrayList<>(10);

    public void addToBasket(T item) throws BasketFullException {
        try {
            basket.add(item);
            if (basket.size() > 10) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new BasketFullException("Basket is Full!");
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        try {
            if (!basket.isEmpty()) {
                basket.remove(item);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new BasketEmptyException("Basket is Empty!");
        }
    }
}
