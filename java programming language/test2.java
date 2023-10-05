public class test2 {
    public static void main(String args[]){
        //Horse a1=new Animal();
        Animal h1=new Horse();

        h1.print();


    }
    
}
class Animal{
    int leg;
    Animal(){

    }
    void print(){
        
        System.out.println("horse is an animal");
    }


}
class Horse extends Animal{
    int skin;
    Horse(){

    }
    
    
}