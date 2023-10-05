import java.util.*;
public class ASS4_LIB {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book bookitems[]=new Book[5];
        for(int index=0;index<bookitems.length;index++){
            bookitems[index]=new Book();
            System.out.println("\nenter the detail of book:"+ (index+1));
            bookitems[index].setDetails();
        }
        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Set Details");
            System.out.println("2. Get Details");
            System.out.println("3. Issue");
            System.out.println("4. Return");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                
                case 1:
                    System.out.print("Enter bookId to set details: ");
                    int getId = sc.nextInt();
                    for(Book book:bookitems){
                        if(book.getBookId()==getId){
                            book.setDetails();

                        }
                    }
                    break;
                 case 2:
                    System.out.print("Enter book ID to get details: ");
                    int Id= sc.nextInt();
                    for(Book book:bookitems){
                        if(Id==book.getBookId()){
                            book.getDetails(Id);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter book ID to issue: ");
                    int issueId = sc.nextInt();
                    for(Book book:bookitems){
                        if(issueId==book.getBookId()){
                            book.issue(issueId);
                        }
                    }
                    break;
                       
                case 4:
                    System.out.print("Enter book ID to return: ");
                    int returnId = sc.nextInt();
                    for (Book book : bookitems) {
                        if(book.getBookId()==returnId){
                            book.Return(returnId);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

class Book{
    private int  bookId;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private int totalCopies;
    //default constructor
    Book(){
        bookId=00;
        
    }
    //parameterized constructor
    Book(int totalCopy){
        totalCopies=totalCopy;
    }
    int getBookId(){
        return this.bookId;
    }
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.bookId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Book Title: ");
        this.bookTitle = sc.nextLine();
        System.out.print("Enter Year of Publication: ");
        this.yearOfPublication = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Author Name: ");
        this.authorName = sc.nextLine();
        System.out.print("Enter Publisher Name: ");
        this.publisherName = sc.nextLine();
        System.out.print("Enter Total Copies: ");
        totalCopies = sc.nextInt();
        this.numberOfAvailableCopies = totalCopies;
        //sc.close();
         
    }
     

    public void setDetails(int id,String title,int year,String author,String publisher,int count){
        bookId=id;
        bookTitle=title;
        yearOfPublication=year;
        authorName=author;
        publisherName=publisher;
        totalCopies=count;
    }
    public void getDetails(int id){
        System.out.println("bookId ="+ bookId);
        System.out.println("bookTitle ="+  bookTitle);
        System.out.println("yearOfPublication = "+ yearOfPublication );
        System.out.println("authorName = "+ authorName);
        System.out.println("publisherName = "+ publisherName);
        System.out.println("numberOfAvailableCopies = "+numberOfAvailableCopies);
        System.out.println("totalCopies = "+ totalCopies);

    }
    public void issue(int id){
        if(bookId==id && numberOfAvailableCopies>0){
            numberOfAvailableCopies=numberOfAvailableCopies-1;
        }
        System.out.println("book is issued successfully");
    }
    public void Return(int id){
        numberOfAvailableCopies=numberOfAvailableCopies+1;
        System.out.println("book is returned successfully");

    }
    
}
