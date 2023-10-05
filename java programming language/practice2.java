import java.util.*;
public class practice2{
    public static void main(String args[]){
        ArrayList<SportPerson>array=new ArrayList<>();
        
    }

}

class SportsPerson {
    protected String name;
    protected String address;

    public void displaySportsPerson() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public void inputSportsPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
    }
}

class Cricketer extends SportsPerson {
    static String type = "Cricketer";
    protected int matchesPlayed;
    protected int catches;

    public void displayCricketer() {
        System.out.println("Type: " + type);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Catches: " + catches);
    }

    public void inputCricketer() {
        inputSportsPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Matches Played: ");
        matchesPlayed = scanner.nextInt();
        System.out.print("Enter Catches: ");
        catches = scanner.nextInt();
    }
}

class Footballer extends SportsPerson {
    static String type = "Footballer";
    protected int matchesPlayed;
    protected int goals;
    protected int tackles;

    public void displayFootballer() {
        System.out.println("Type: " + type);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Goals: " + goals);
        System.out.println("Tackles: " + tackles);
    }

    public void inputFootballer() {
        inputSportsPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Matches Played: ");
        matchesPlayed = scanner.nextInt();
        System.out.print("Enter Goals: ");
        goals = scanner.nextInt();
        System.out.print("Enter Tackles: ");
        tackles = scanner.nextInt();
    }
}
