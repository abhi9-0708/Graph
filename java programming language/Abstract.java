public class Abstract {
    public static void main(String args[]){
        //Animal a1=new Animal();
        //we  can not define as above because in abstract class we can not create object
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        Mustang m=new Mustang();
        m.eat();
        //System.out.println(c.changecolor());
        c.changecolor();
       //it is showing error bcz we are trying to access a method with a object;
    }
}
//abstract class we can not create new instances/objects
abstract class Animal{
    String color;
    //constructor is used here to define something for its child class
    Animal(){
        System.out.println("Animal constructor called");
        color="brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    //every animal has walk function but its subclass will define how they walk
    abstract void walk();
    //here walk is an abastraction bcz it is just an idea the implementation depend on its subclass
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is acalled");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor is called");
    }
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }

}