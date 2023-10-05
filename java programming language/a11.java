import java.util.ArrayList;
import java.util.Scanner;

class User {
    protected String userID;
    protected String name;
    protected String dateOfBirth;
    protected String address;
    protected String PAN;

    User(String userID, String name, String dateOfBirth, String address, String PAN) {
        this.userID = userID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.PAN = PAN;
    }
}

class Admin extends User {
    private String dateOfJoining;
    private double salary;
    private int permissibleOperations;

    Admin(String userID, String name, String dateOfBirth, String address, String PAN, String dateOfJoining, double salary, int permissibleOperations) {
        super(userID, name, dateOfBirth, address, PAN);
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.permissibleOperations = permissibleOperations;
    }

    public void addNewStock(Item item, ArrayList<Item> stock) {
        stock.add(item);
    }

    public void deleteStock(int itemCode, ArrayList<Item> stock) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode && item.getAvailableQty() == 0) {
                stock.remove(item);
                break;
            }
        }
    }

    public void modifyStock(int itemCode, double newPrice, int newAvailableQty, ArrayList<Item> stock) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode) {
                item.setPrice(newPrice);
                item.setAvailableQty(newAvailableQty);
                break;
            }
        }
    }
}

class General extends User {
    private String dateOfJoining;
    private double salary;
    private int dutyHourPerDay;

    General(String userID, String name, String dateOfBirth, String address, String PAN, String dateOfJoining, double salary, int dutyHourPerDay) {
        super(userID, name, dateOfBirth, address, PAN);
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.dutyHourPerDay = dutyHourPerDay;
    }

    public void sellItem(int itemCode, int quantity, ArrayList<Item> stock, ArrayList<Sell> soldItems) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode && item.getAvailableQty() >= quantity) {
                item.setAvailableQty(item.getAvailableQty() - quantity);
                Sell sell = new Sell(itemCode, quantity);
                soldItems.add(sell);
                break;
            }
        }
    }

    public void returnItem(int itemCode, int quantity, ArrayList<Item> stock, ArrayList<Return> returnedItems) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode && !(item instanceof FoodItem)) {
                item.setAvailableQty(item.getAvailableQty() + quantity);
                Return returnObj = new Return(itemCode, quantity);
                returnedItems.add(returnObj);
                break;
            }
        }
    }

    public void displayStock(int itemCode, ArrayList<Item> stock) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode) {
                System.out.println("Item Details:");
                System.out.println("Item Code: " + item.getItemCode());
                System.out.println("Price: " + item.getPrice());
                System.out.println("Available Quantity: " + item.getAvailableQty());
                if (item instanceof FoodItem) {
                    System.out.println("Date of Expiry: " + ((FoodItem) item).getDateOfExpiry());
                }
                break;
            }
        }
    }

    public void displaySell(String startDate, String endDate, ArrayList<Sell> soldItems) {
        System.out.println("Sold Items within the date range:");
        for (Sell sell : soldItems) {
            if (sell.getDateOfSell().compareTo(startDate) >= 0 && sell.getDateOfSell().compareTo(endDate) <= 0) {
                System.out.println("Item Code: " + sell.getItemCode());
                System.out.println("Quantity: " + sell.getQuantity());
                System.out.println("Total Amount: " + sell.getTotalAmount());
                System.out.println("Date of Sell: " + sell.getDateOfSell());
            }
        }
    }
}

class Item {
    private int itemCode;
    private double price;
    private int availableQty;

    Item(int itemCode, double price, int availableQty) {
        this.itemCode = itemCode;
        this.price = price;
        this.availableQty = availableQty;
    }

    public int getItemCode() {
        return itemCode;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }
}

class FoodItem extends Item {
    private String dateOfExpiry;

    FoodItem(int itemCode, double price, int availableQty, String dateOfExpiry) {
        super(itemCode, price, availableQty);
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }
}

class NonFoodItem extends Item {
    private int returnCount;

    NonFoodItem(int itemCode, double price, int availableQty, int returnCount) {
        super(itemCode, price, availableQty);
        this.returnCount = returnCount;
    }

    public int getReturnCount() {
        return returnCount;
    }
}

class Sell {
    private String dateOfSell;
    private int itemCode;
    private int quantity;
    private double totalAmount;

    Sell(int itemCode, int quantity) {
        this.dateOfSell = "CurrentDate"; // Replace with actual date if needed
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.totalAmount = calculateTotalAmount(itemCode, quantity);
    }

    public String getDateOfSell() {
        return dateOfSell;
    }

    public int getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private double calculateTotalAmount(int itemCode, int quantity) {
        // Implement the logic to calculate total amount based on itemCode and quantity
        return 0.0; // Replace with actual calculation
    }
}

class Return {
    private String dateOfReturn;
    private int itemCode;
    private int quantity;
    private double returnAmount;

    Return(int itemCode, int quantity) {
        this.dateOfReturn = "CurrentDate"; // Replace with actual date if needed
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.returnAmount = calculateReturnAmount(itemCode, quantity);
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public int getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getReturnAmount() {
        return returnAmount;
    }

    private double calculateReturnAmount(int itemCode, int quantity) {
        // Implement the logic to calculate return amount based on itemCode and quantity
        return 0.0; // Replace with actual calculation
    }
}

public class a11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Type (Admin/General): ");
        String userType = scanner.nextLine();
        System.out.println("Enter User Name: ");
        String userName = scanner.nextLine();

        if (userType.equalsIgnoreCase("Admin")) {
            // Create an Admin instance and perform Admin operations
            Admin admin = new Admin("adminID", userName, "01-01-1990", "Address", "PAN123", "01-01-2022", 50000, 5);
            ArrayList<Item> stock = new ArrayList<>();
            ArrayList<Sell> soldItems = new ArrayList<>();
            ArrayList<Return> returnedItems = new ArrayList<>();

            // Admin operations
            while (true) {
                System.out.println("Admin Options:");
                System.out.println("1. Add New Stock");
                System.out.println("2. Delete Stock");
                System.out.println("3. Modify Stock");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter Item Details:");
                        System.out.print("Item Code: ");
                        int itemCode = scanner.nextInt();
                        System.out.print("Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Available Quantity: ");
                        int availableQty = scanner.nextInt();
                        System.out.print("Enter Date of Expiry (if FoodItem, else press Enter): ");
                        scanner.nextLine(); // Consume newline
                        String dateOfExpiry = scanner.nextLine();
                        Item newItem;
                        if (dateOfExpiry.isEmpty()) {
                            newItem = new NonFoodItem(itemCode, price, availableQty, 0);
                        } else {
                            newItem = new FoodItem(itemCode, price, availableQty, dateOfExpiry);
                        }
                        admin.addNewStock(newItem, stock);
                        break;
                    case 2:
                        System.out.print("Enter Item Code to delete: ");
                        int deleteItemCode = scanner.nextInt();
                        admin.deleteStock(deleteItemCode, stock);
                        break;
                    case 3:
                        System.out.print("Enter Item Code to modify: ");
                        int modifyItemCode = scanner.nextInt();
                        System.out.print("Enter New Price: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("Enter New Available Quantity: ");
                        int newAvailableQty = scanner.nextInt();
                        admin.modifyStock(modifyItemCode, newPrice, newAvailableQty, stock);
                        break;
                    case 4:
                        System.out.println("Exiting Admin Mode...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else if (userType.equalsIgnoreCase("General")) {
            // Create a General instance and perform General operations
            General general = new General("generalID", userName, "01-01-1990", "Address", "PAN123", "01-01-2022", 30000, 8);
            ArrayList<Item> stock = new ArrayList<>();
            ArrayList<Sell> soldItems = new ArrayList<>();
            ArrayList<Return> returnedItems = new ArrayList<>();

            // General operations
            while (true) {
                System.out.println("General Options:");
                System.out.println("1. Sell Item");
                System.out.println("2. Return Item");
                System.out.println("3. Display Stock");
                System.out.println("4. Display Sold Items (Within Date Range)");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Item Code to sell: ");
                        int sellItemCode = scanner.nextInt();
                        System.out.print("Enter Quantity to sell: ");
                        int sellQuantity = scanner.nextInt();
                        general.sellItem(sellItemCode, sellQuantity, stock, soldItems);
                        break;
                    case 2:
                        System.out.print("Enter Item Code to return: ");
                        int returnItemCode = scanner.nextInt();
                        System.out.print("Enter Quantity to return: ");
                        int returnQuantity = scanner.nextInt();
                        general.returnItem(returnItemCode, returnQuantity, stock, returnedItems);
                        break;
                    case 3:
                        System.out.print("Enter Item Code to display: ");
                        int displayItemCode = scanner.nextInt();
                        general.displayStock(displayItemCode, stock);
                        break;
                    case 4:
                        System.out.print("Enter Start Date (YYYY-MM-DD): ");
                        String startDate = scanner.nextLine();
                        System.out.print("Enter End Date (YYYY-MM-DD): ");
                        String endDate = scanner.nextLine();
                        general.displaySell(startDate, endDate, soldItems);
                        break;
                    case 5:
                        System.out.println("Exiting General Mode...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Invalid User Type. Exiting...");
        }
    }
}
