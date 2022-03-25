package io.codelex.polymorphism.practice.exercise2;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        Sound[] sounds = {parrot, radio, firework};

        for (Sound typeOfSound : sounds) {
            typeOfSound.playSound();
        }
    }
}
