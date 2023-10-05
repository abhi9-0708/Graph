import java.util.Scanner;
class Book{
    public int bookId;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private int totalCopies;

    Book(){};

    Book(int totalCopies){
        this.totalCopies = totalCopies;
    }

    public void setDetails(){
        this.bookId = -1;
    }

    public void setDetails(int id, String title, int year, String author, String publisher, int count){
        this.bookId = id;
        this.bookTitle = title;
        this.yearOfPublication = year;
        this.authorName = author;
        this.publisherName = publisher;
        this.numberOfAvailableCopies = count;
        this.totalCopies = count;
    }

    public void getDetails(int id){
        System.out.println("The book id number: "+this.bookId);
        System.out.println("The title of the book: "+this.bookTitle);
        System.out.println("The book's year of publication: "+this.yearOfPublication);
        System.out.println("The author of the book: "+this.authorName);
        System.out.println("The publisher of the book: "+this.publisherName);
        System.out.println("Total number of copies initially: "+this.totalCopies);
        System.out.println("The number of available copies: "+this.numberOfAvailableCopies);
    }

    public void issueBook(int id){
        if(this.numberOfAvailableCopies > 0){
            this.numberOfAvailableCopies--;
            System.out.println("Book issued successfully!");
        }
        else{
            System.out.println("Books are not available!");
        }
    }

    public void returnBook(int id){
        this.numberOfAvailableCopies++;
        System.out.println("Book returned successfully!");
    }
}

public class Librarymanage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of different types of books.");
        
        int bookTypes = sc.nextInt();
        Book[] bookitem = new Book[bookTypes];

        for(int i = 0; i<bookTypes; i++)
            bookitem[i] = new Book(0);
        
        System.out.println("Press 1:"+" To set the details of book.");
        System.out.println("Press 2:"+" To get the details of book.");
        System.out.println("Press 3:"+" To issue the book.");
        System.out.println("Press 4:"+" To return the book.");
        System.out.println("Press 5:"+" To Exit.");

        int choice = sc.nextInt();

        while(choice != 5){
            switch (choice){
                case 1:
                    fillDetails(bookitem);
                    break;

                case 2:
                    displayDetails(bookitem);
                    break;

                case 3:
                    issuance(bookitem);
                    break;

                case 4:
                    returnOfBook(bookitem);
                    break;
                
                case 5:
                    break;

                default:
                    System.out.println("wrong choice!");
                    break;
            }
            System.out.println("Enter your choice!");
            choice = sc.nextInt();
        }
    }

    public static void fillDetails(Book[] bookitem){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<bookitem.length; i++){
            System.out.println("Enter the new info:");

            System.out.println("Enter the id no.");
            int id = sc.nextInt();
            sc.nextLine(); //remove the next line

            System.out.println("Enter the title of the book.");
            String title = sc.nextLine();

            System.out.println("Year of publication of the book.");
            int publicationYear = sc.nextInt();
            sc.nextLine();//remove the next line

            System.out.println("Enter the author of the book.");
            String author = sc.nextLine();

            System.out.println("Enter the publisher of the book.");
            String publisher = sc.nextLine();

            System.out.println("Enter the total number of copies of the book.");
            int totalCopies = sc.nextInt();

            bookitem[i].setDetails(id, title, publicationYear, author, publisher, totalCopies);
            System.out.println();
        }
    }

    public static void displayDetails(Book[] bookitem){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book id number whose details are to be viewed.");

        int id = sc.nextInt();

        for(int i = 0; i<bookitem.length; i++){
            if(bookitem[i].bookId == id){
                bookitem[i].getDetails(id);
                return;
            }
        }
        System.out.println("Invalid id number.");
    }

    public static void issuance(Book[] bookitem){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book id number which is to be issued.");

        int id = sc.nextInt();

        for(int i = 0; i<bookitem.length; i++){
            if(bookitem[i].bookId == id){
                bookitem[i].issueBook(id);
                return;
            }
        }
        System.out.println("Invalid id number.");
    }

    public static void returnOfBook(Book[] bookitem){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book id number which is to be returned.");

        int id = sc.nextInt();

        for(int i = 0; i<bookitem.length; i++){
            if(bookitem[i].bookId == id){
                bookitem[i].returnBook(id);
                return;
            }
        }
        System.out.println("Invalid id number.");
    }
}
