package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean isInStore;
    private int userRating;

    public Video(String title, boolean flag, int userRating) {
        this.title = title;
        this.isInStore = flag;
        this.userRating = userRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void receivingRating(int rating) {
        this.userRating = rating;
    }

    public void checkedOut() {
        this.isInStore = true;
    }

    public void returned() {
        this.isInStore = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title = '" + title + '\'' +
                ", rented = " + isInStore +
                ", userRating = " + userRating +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setInStore(boolean inStore) {
        this.isInStore = inStore;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
}
