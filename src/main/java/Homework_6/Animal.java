package Homework_6;

public abstract class Animal {
    static int animalCounter;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int max_swim();
    public void swim(int distance) {
        if (distance<=max_swim()) {
            System.out.println(this.getName() + " swam " + distance + " metres.");
        } else {
            System.out.println(this.getName() + " can't swim this far.");
        }
    }
    public abstract int max_run();
    public void run(int distance) {
        if (distance<=max_run()) {
            System.out.println(this.getName() + " ran " + distance + " metres.");
        } else {
            System.out.println(this.getName() + " can't run this far.");
        }
    }

    public Animal() {
        animalCounter++;
    }
}
