package Homework_7;

public class Cat {
    private final String name;
    private final int appetite;
    public boolean isFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.eatingFood(appetite);
            isFull = true;
        } else {
            System.out.println("There is not enough food on the plate!");
            System.out.println(name + " says: MEOW!!!");
            isFull = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}