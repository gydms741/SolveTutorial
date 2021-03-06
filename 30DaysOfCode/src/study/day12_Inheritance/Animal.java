package study.day12_Inheritance;

//Object is the superclass of things we create in Java
/*
Object = SuperClass
Animal = SubClass

A subclass can be generalized to a superclass.
A superclass cannot become a more specific subclass.
 */

public class Animal {
    private int age; // VS public int age;

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void eat(){
        System.out.println("An animal is eating");
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
       Animal a = new Animal(5);
       Dog d = new Dog();
       Cat c = new Cat();
       d.ruff();
       System.out.println(d.getAge());
       c.meow();
       System.out.println(c.getAge());
       a.eat();
       d.eat();
       c.eat();
       d.run();
       c.prance();

       // What happens if...
        // Dog o = new Animal(3);
       //Animal o = new Dog();


    }
}
