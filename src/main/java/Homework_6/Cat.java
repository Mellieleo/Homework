package Homework_6;

public class Cat extends Animal{
    static int catCounter;

    @Override
    public int max_swim() {
        return 0;
    }

    @Override
    public int max_run() {
        return 200;
    }

    public Cat() {
        catCounter++;
    }
}
