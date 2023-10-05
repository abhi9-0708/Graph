import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ass6Arraylist
 {
    public static void main(String[] args) {
        stringMech();
    }
    public static void stringMech(){
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to input Name");
        System.out.println("Press 2 to remove any info");
        System.out.println("Press 3 to remove any info from particular index");
        System.out.println("Press 4 to view all info");
        System.out.println("Press 5 to input details at particular index");
        System.out.println("Press 6 to check whether list is empty");
        System.out.println("Press 7 to check the size of list");
        System.out.println("Press 8 to sort the Names");
        System.out.println("Press 9 to check whether any Name is present or not");
        System.out.println("Press 10 to clear the list");

        System.out.println("Press -1 to Exit");
        int choice = scanner.nextInt();

        while(choice != -1){
            switch (choice){
                    case 1:
                        inputName(arr);
                        break;

                    case 2:
                        removeAnyInfo(arr);
                        break;

                    case 3:
                        removeFromParticularIndex(arr);
                        break;

                    case 4:
                        viewInfo(arr);
                        break;

                    case 5:
                        inputDetailsAtParticularInd(arr);
                        break;

                    case 6:
                        isEmptyList(arr);
                        break;

                    case 7:
                        sizeOfList(arr);
                        break;

                    case 8:
                        sortTheNames(arr);
                        break;

                    case 9:
                        checkAParticularName(arr);
                        break;

                    case 10:
                        clearList(arr);
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                System.out.println("Press 1 to input Name");
                System.out.println("Press 2 to remove any info");
                System.out.println("Press 3 to remove any info from particular index");
                System.out.println("Press 4 to view all info");
                System.out.println("Press 5 to input details at particular index");
                System.out.println("Press 6 to check whether list is empty");
                System.out.println("Press 7 to check the size of list");
                System.out.println("Press 8 to sort the Names");
                System.out.println("Press 9 to check whether any Name is present or not");
                System.out.println("Press 10 to clear the list");
                System.out.println("Press -1 to Exit");

                choice = scanner.nextInt();
            }
        }

        public static void inputName(ArrayList<String> arr){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your Name");
            String name = scanner.nextLine();

            arr.add(name);
            System.out.println(name + " added successfully");
        }

        public static void removeAnyInfo(ArrayList<String> arr){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Name which you want to remove from the List");
            String name = scanner.nextLine();

            if(arr.contains(name)) {
                arr.remove(name);
                System.out.println(name + " removed successfully");
            }
            else{
                System.out.println("Name is not there in the list");
            }
        }

        public static void removeFromParticularIndex(ArrayList<String> arr){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter index whose value you want to remove");
            int index = scanner.nextInt();

            if(index >= 0 && index < arr.size()) {
                arr.remove(index);
                System.out.println("Name at index: " + index + " removed successfully");
            }
            else{
                System.out.println("Invalid index");
            }
        }

        public static void viewInfo(ArrayList<String> arr){
            System.out.println("info: ");

            for(String st: arr){
                System.out.println(st);
            }
        }

        public static void inputDetailsAtParticularInd(ArrayList<String> arr){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter index where you have to input new Name, and new Name");
            int index = scanner.nextInt();
            scanner.nextLine();

            String name = scanner.nextLine();

            if(index >= 0 && index < arr.size()) {
                arr.add(index, name);
                System.out.println(name+ " at index: " + index + " added successfully");
            }
            else{
                System.out.println("Invalid index");
            }

        }
        public static void isEmptyList(ArrayList<String> arr){
            if(arr.isEmpty()){
                System.out.println("Yes empty");
            }
            else {
                System.out.println("Not empty");
            }
        }
        public static void sizeOfList(ArrayList<String> arr){
            System.out.println("Size of List is: "+ arr.size());
        }

        public static void sortTheNames(ArrayList<String> arr){
            if(arr.isEmpty()){
                System.out.println("Empty");
            }
            else{
                Collections.sort(arr);
                System.out.println("sorted successfully");
            }
        }

        public static void checkAParticularName(ArrayList<String> arr){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name");
            String name = scanner.nextLine();

            if(arr.contains(name)){
                System.out.println("yes it exists");
            }
            else{
                System.out.println("Not exist");
            }
        }

        public static void clearList(ArrayList<String> arr){
            arr.clear();
            System.out.println("Cleared successfully");
        }
}