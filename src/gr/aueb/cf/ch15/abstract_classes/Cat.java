package gr.aueb.cf.ch15.abstract_classes;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Miau!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating meat...");
    }
}
