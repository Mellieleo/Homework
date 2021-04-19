package Homework_7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void eatingFood(int apt) {
        if (food >= apt) {
            food -= apt;
        }
    }

    public void plateFull() {
        System.out.println("Food left: " + food);
    }

    public int getFood() {
        return food;
    }

    public void refill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to refill the plate? (y/n)");
        String fill = in.nextLine();
        if (fill.equals("y")) {
            food = 100;
        }
    }
}