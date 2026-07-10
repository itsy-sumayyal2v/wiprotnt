class Animal {

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping.");
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Animal object
        Animal a = new Animal();
        System.out.println("Animal Object:");
        a.eat();
        a.sleep();

        System.out.println();

        // Bird object
        Bird b = new Bird();
        System.out.println("Bird Object:");
        b.eat();
        b.sleep();
        b.fly();
    }
}