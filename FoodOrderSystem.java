package Gaurav;

//FoodOrderSystem.java
//FoodOrderSystem.java
import java.util.Scanner;

public class FoodOrderSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Starters starters = new Starters();
     MainCourse mainCourse = new MainCourse();
     Desserts desserts = new Desserts();
     Drinks drinks = new Drinks();

     System.out.println("Welcome to the Food Ordering System!");
     System.out.println("Menu Options:");
     System.out.println("1: Starters");
     System.out.println("2: Main Course Recipes");
     System.out.println("3: Desserts");
     System.out.println("4: Drinks");
     System.out.println("0: Exit");
     Order[] orders = new Order[50];
     int orderIndex = 0;
     double totalBill = 0.0;

     while (true) {
         System.out.print("Enter your choice (0 to exit): ");
         int choice = scanner.nextInt();

         if (choice == 0) {
             break;
         } else if (choice == 1) {
             System.out.println("Starters:");
             FoodItem[] starterItems = starters.getStarters();
             int itemIndex = 1;
             for (FoodItem item : starterItems) {
                 System.out.println(itemIndex + ": " + item.getName() + " - Rs. " + item.getPrice());
                 itemIndex++;
             }

             System.out.print("Enter the item number: ");
             int itemNumber = scanner.nextInt();
             System.out.print("Enter the quantity: ");
             int quantity = scanner.nextInt();

             if (itemNumber >= 1 && itemNumber <= starterItems.length) {
                 orders[orderIndex] = new Order(starterItems[itemNumber - 1], quantity);
                 totalBill += orders[orderIndex].getTotalPrice();
                 orderIndex++;
             } else {
                 System.out.println("Invalid item number. Please try again.");
             }
         } else if (choice == 2) {
             // Similar process for Main Course Recipes
         } else if (choice == 3) {
             // Similar process for Desserts
         } else if (choice == 4) {
             // Similar process for Drinks
         } else {
             System.out.println("Invalid choice. Please try again.");
         }
     }

     // Display the bill
     System.out.println("Your order summary:");
     for (int i = 0; i < orderIndex; i++) {
         Order order = orders[i];
         System.out.println(order.getItem().getName() + " x " + order.getQuantity() + " - Rs. " + order.getTotalPrice());
     }
     System.out.println("----------------------------");
     System.out.println("Total Bill: Rs. " + totalBill);
     System.out.println("Thank you for using the Food Ordering System!");
 }
}


