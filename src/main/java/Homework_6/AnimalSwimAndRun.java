package Homework_6;

public class AnimalSwimAndRun{
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        cat1.setName("Barsik");
        Animal cat2 = new Cat();
        cat2.setName("Murzik");
        Animal dog1 = new Dog();
        dog1.setName("Bobik");
        Animal dog2 = new Dog();
        dog2.setName("Barbos");
        cat1.swim(500);
        cat1.run(150);
        cat2.swim(0);
        cat2.run(400);
        dog1.swim(20);
        dog1.run(300);
        dog2.swim(5);
        dog2.run(600);
        System.out.println("Animals in total: " + Animal.animalCounter + ", including " + Dog.dogCounter + " dogs and " + Cat.catCounter + " cats.");
    }
}
