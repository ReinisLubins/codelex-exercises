package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    protected ArrayList<Video> videoList;

    public VideoStore() {
        videoList = new ArrayList<>();
    }

    public void addVideo(String videoName) {
        videoList.add(new Video(videoName));
    }

    public void userRating(String nameOfVideo, int rating) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).receivingRating(rating);
            }
        }
    }

    public void checkOutVideo(String nameOfVideo) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).checkedOut();
            }
        }
    }

    public void returnVideo(String nameOfVideo) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).returned();
            }
        }
    }

    @Override
    public String toString() {
        return "VideoStore list = {" + videoList + '}';
    }
}
