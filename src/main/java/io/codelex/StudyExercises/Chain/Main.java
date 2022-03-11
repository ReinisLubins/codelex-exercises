package io.codelex.StudyExercises.Chain;

public class Main {
    public static void main(String[] args) {
        Link l1 = new Link("Jhon");
        Link l2 = new Link("Liza");
        Link l3 = new Link("Peter");

        /*l1.setNextLink(l2);
        l2.setNextLink(l3);*/

        Chain chain = new Chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);

        chain.printOut();
    }
}
