package Homework_7;

public class FeedingCats {

    public static void feed(Cat cat, Plate plate) {
        if (!cat.isFull) {
            cat.eat(plate);
        }
    }

    public static void eatOut(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            feed(cat, plate);
        }
        for (Cat cat : cats) {
            if (cat.isFull) {
                System.out.println(cat.getName() + " is full");
            } else {
                System.out.println(cat.getName() + " is hungry");
            }
        }
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", (int) (Math.random() * 100));
        cats[1] = new Cat("Vaska", (int) (Math.random() * 100));
        cats[2] = new Cat("Murzik", (int) (Math.random() * 100));
        cats[3] = new Cat("Fluffy", (int) (Math.random() * 100));
        cats[4] = new Cat("Lucky", (int) (Math.random() * 100));
        Plate plate = new Plate(100);
        plate.plateFull();
        for (Cat cat : cats
        ) {
            while (!cat.isFull) {
                eatOut(cats, plate);
                plate.refill();
            }
        }
    }
}