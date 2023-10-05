import java.util.Collections;
public class E3 {
    public static void main(String args[]){
        child c=new child();
        c.method(100);
        int a[]={2,4,6,3,9,11};
        
    }
    
}
class base{
    void method(int a ){
        System.out.println(1);
    }
    void method(double d ){
        System.out.println(2);

    }
}
class child extends base{
    void method(double d ){
        System.out.println(3);
    }

}

