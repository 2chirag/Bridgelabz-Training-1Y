class Vehicle {
    void display(){
        System.out.println("vehicle class");
    }
}
class Maruti extends Vehicle {
    void speed(){
        System.out.println("car run fast");
    }
}
class Main2 {
    public static void main(String[] args){
        Vehicle obj = new Maruti();
        Maruti m = (Maruti) obj;
        obj.display();
        m.speed();
    }
}
