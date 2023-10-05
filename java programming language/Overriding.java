public class Overriding {
    public static void main(String args[]){
        Animals d1=new Deer();
        //both animal and deer have eat function but
        // due to method overriding eat function of child is called
        d1.eat();

    }
    
}
class Animals{
    int color;
    void eat(){
        System.out.println("animals eat food");
    }
}
class Deer extends Animals{
    int legs;
    void eat(){
        System.out.println("Deer eat grass");
    }
}