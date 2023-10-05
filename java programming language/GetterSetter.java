public class GetterSetter {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(7);
        System.out.println(p1.getTip());

    }
    
}
class Pen{
    private String color;
    private int tip;

    //getter
    String getColor(){
        return this.color;//keyword used to refer to current object
        
    }
    int getTip(){
        return this.tip;
    }
    //setter
    void setColor(String color){
        this.color=color;//this:more useful when variables have same name
        //this.color shows that it is a property inside class pen here
        //color shows it is a external variable

    }
    void setTip(int tip){
        this.tip=tip;
    }
}