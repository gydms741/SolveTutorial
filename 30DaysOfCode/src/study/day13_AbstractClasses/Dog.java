package study.day13_AbstractClasses;

public class Dog extends Animal {

    public Dog(){
        super(15);
        System.out.println("A dog has been created");
    }

    //public abstract eat();

    public void ruff(){
        System.out.println("The dog says ruff");
    }

    public void run(){
        System.out.println("A dog is running");
    }

    @Override
    public void eat() {
        System.out.println("A dog is eating");
    }

    public void sleep(){
        System.out.println("A dog is sleeping");
    }
}
