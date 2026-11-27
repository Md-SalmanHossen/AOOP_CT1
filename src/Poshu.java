
class Animal{
    void makeSound(){
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat mews");
    }
}


public class Poshu {
    public static void main(String[] args) {

        System.out.println("======Practice Polymorphism");

        Animal a=new Animal();
        a.makeSound();

        Animal d1=new Dog();
        d1.makeSound();//which class=dog
        Dog d2=new Dog();
        d2.makeSound();//which class will call=dog

        Animal c1=new Cat();
        c1.makeSound();//which class will call=cat
        Cat c2=new Cat();
        c2.makeSound();//which class will call =cat
        c2.makeSound();//which class will call =cat

    }
}
