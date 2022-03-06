package io.codelex.classesandobjects.practice.videostore;

public class Video {
    protected String title;
    protected boolean flag = false;
    protected int userRating;

    public Video(String title, boolean flag, int userRating) {
        this.title = title;
        this.flag = flag;
        this.userRating = userRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void receivingRating(int rating) {
        this.userRating = rating;
    }

    public void checkedOut() {
        this.flag = true;
    }

    public void returned() {
        this.flag = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title = '" + title + '\'' +
                ", rented = " + flag +
                ", userRating = " + userRating +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
}
