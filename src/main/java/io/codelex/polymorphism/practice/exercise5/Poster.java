package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int widthOfPoster;
    private int heightOfPoster;
    private int pricePerCopy;
    private int numberOfCopies;

    public Poster(int fee, int widthOfPoster, int heightOfPoster, int pricePerCopy, int numberOfCopies) {
        super(fee);
        this.widthOfPoster = widthOfPoster;
        this.heightOfPoster = heightOfPoster;
        this.pricePerCopy = pricePerCopy;
        this.numberOfCopies = numberOfCopies;
    }

    public int cost() {
        return super.cost() * (pricePerCopy * numberOfCopies);
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: " +
                "widthOfPoster=" + widthOfPoster +
                ", heightOfPoster=" + heightOfPoster +
                ", pricePerCopy=" + pricePerCopy +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
