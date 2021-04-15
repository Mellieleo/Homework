package Homework_6;

public class Dog extends Animal{
    static int dogCounter;

    @Override
    public int max_swim() {
        return 10;
    }

    @Override
    public int max_run() {
        return 500;
    }

    public Dog() {
        dogCounter++;
    }
}
