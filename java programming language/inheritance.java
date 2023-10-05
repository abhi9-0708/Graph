public class inheritance {
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("animals eat");

    }
    void breath(){
        System.out.println("animals breath");
    }
}
class Mammal extends Animal{
    int legs;

}
class Dog extends Mammal{
    String breed;

}
