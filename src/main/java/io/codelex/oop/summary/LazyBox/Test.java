package io.codelex.oop.summary.LazyBox;

public class Test {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(Test::doLargeCalculation); // metode tiek palaista tad ka to pieprasa
        printOutBoxContents(box);
        Integer result = 0;
        for (int i = 0; i < 10000; i++) {
            result = box.get();// metode tada ka reikins notiek tikai pirmo reiz
        }
        System.out.println(result);

        LazyBox<String> textBox = box.map(Object::toString);
        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);
        LazyBox<String> fullTextBox = upperTextBox.map((String s) -> "Result: " + s);
        String finish = fullTextBox.get();
        System.out.println(finish);
    }

    private static Integer doLargeCalculation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return 153;
    }

    public static <A> void printOutBoxContents(LazyBox<A> box) {
        System.out.println(box.get());
    }
}
