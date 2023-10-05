
public class E2{
    int j;
    E2(){
        //we can not update value in constructor
        //++j=1;
        j=1;
    }
    public static void main (String args[]){
        E2 e=new E2();
        System.out.print(e.j);
    }
}