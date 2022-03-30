package io.codelex.StudyExercises.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MyAdvancedInterface<Integer> myFunction = (Integer number) -> number * 2;
        System.out.println(myFunction.calculate(10));
        UnaryOperator<Integer> multiplyByTwo = Main::multiplyNum; // atsauce uz metodi


        //Songs
        Song song1 = new Song("Queen", 128, "Freddie");
        Song song2 = new Song("I am not afraid", 150, "Eminem");
        Song song3 = new Song("Candy Shop", 150, "50Cent");

        List<Song> songList = new ArrayList<>();
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);

        List<String> songTitles = songList.stream().map(Song::getTitle).toList();
        System.out.println(songTitles);

        songTitles.forEach(System.out::println);

        Map<Integer, List<Song>> songsByDuration = songList.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(songsByDuration);
    }

    public static Integer multiplyNum(int a) {
        return a * 2;
    }
}
