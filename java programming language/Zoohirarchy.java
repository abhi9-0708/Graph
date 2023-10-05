import java.util.*;
public class Zoohirarchy {
//     Create a class hierarchy for a zoo simulation. Define a base class "Animal" with
// attributes like name, age, and habitat. Create subclasses like "Mammal", "Bird" and
// "Reptile" with specific attributes and methods. Implement a Java program to
// demonstrate the inheritance hierarchy and instantiate objects of different animal types.
    public static void main(String args[]){
        ArrayList <Animal>list=new ArrayList<>();
        int ch=0;
        while(ch!=5){
            Scanner sc=new Scanner(System.in);
            System.out.println("1->setdata mammal");
            System.out.println("2->setdata bird");
            System.out.println("3->setdata reptile");
            System.out.println("4->getdata");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    Mammal m=new Mammal();
                    m.setdetails();
                    list.add(m);
                    break;
                case 2:
                    Bird b=new Bird();
                    b.setdetails();
                    list.add(b);
                    break;

                case 3:
                    Reptile r=new Reptile();
                    r.setdetails();
                    list.add(r);
                    break;
                
                case 4:    
                    sc.nextLine();
                    System.out.println("enter the name of animal to get data:");
                    String s=sc.nextLine();
                    for(Animal a:list){
                        if(s.equals(a.getName())){
                            a.getDetails();
                        }
                    }
                    break;
            }           
        }

    }
}
class Animal{
    private String name;
    private int age;
    private String habitat;

    public void setdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of animal");
        this.name=sc.nextLine();
        System.out.println("enter the age");
        this.age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the habitat");
        this.habitat=sc.nextLine();
        //sc.close();

    }
    public void getDetails(){
        System.out.println("name of animal:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("habitat:"+this.habitat);

    }
    public String getName(){
        return this.name;
    }


    
}
class Mammal extends Animal{
    private int legs;

    public void setdetails(){
        super.setdetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of legs:");
        legs=sc.nextInt();
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("legs of animal:"+this.legs);

    }

    public void feed(){
        System.out.println("they feed milk to their children");
    }


}
class Bird extends Animal{
    private String food;

    public void setdetails(){
        super.setdetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the food:");
        this.food=sc.nextLine();
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("food of animal:"+this.food);
    }

    public void fly(){
        System.out.println("birds fly.");
    }


}
class Reptile extends Animal{
    private String color;

    public void setdetails(){
        super.setdetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color:");
        this.color=sc.nextLine();
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("color of animal:"+this.color);
    }

    public void crawl(){
        System.out.println("Reptiles crawls");
    }


}
