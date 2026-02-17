package com.GLA.Abstraction;
abstract class Fruit {
    abstract void taste();

    public void colour() {
        System.out.println("yellow");
    }
}
class Mango extends Fruit{

    @Override
    void taste() {
        System.out.println("Taste is Sweat");
    }

}
public class AbstractionPractice {
    public static void main(String[] args){
        Mango m1 =new Mango();
        m1.taste();
        Fruit f1 =new Mango();
        f1.colour();
        f1.taste();


    }
}