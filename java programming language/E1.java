public class E1 {
    
}
class base {
    final void m(){
        System.out.println(1);
    }
}
public class test extends base{
    public void m(){
        System.out.println(2);
    }
    public static void main(String args[]){
        new test().m();
    }
}