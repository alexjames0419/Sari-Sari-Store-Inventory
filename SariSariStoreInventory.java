import java.util.Scanner;


public class SariSariStoreInventory {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     
     System.out.print("Enter item name: ");
     String itemName = scanner.nextLine();
     
     System.out.print("Enter quantity: ");
     int quantity = scanner.nextInt();
     
     System.out.print("Enter price per item: ");
     double pricePerItem = scanner.nextDouble();
     
     scanner .nextLine(); //Consume newline
     
     System.out.print("Enter supplier name: ");
     String supplierName = scanner.nextLine();
     
     System.out.print("Enter purchace date: ");
     String purchaceDate = scanner.nextLine();
     
     System.out.print("Enter expiry date: ");
     String expiryDate = scanner.nextLine();
     
     System.out.print("Enter item description: ");
     String itemDescription = scanner.nextLine();
     
     System.out.print("Enter category: ");
     String category = scanner.nextLine();
     
     System.out.print("Enter selling price: ");
     double sellingPrice = scanner.nextDouble();
     
     System.out.print("Enter discount %: ");
     double discount = scanner.nextDouble();
     
     //Output results
     System.out.println("Item Name: " + itemName);
     System.out.println("Quantity: " + quantity);
     System.out.println("Price Per Item: " + pricePerItem);
     System.out.println("Supplier Name: " + supplierName);
     System.out.println("Purchace Date: " + purchaceDate);
     System.out.println("Expiry Date: " + expiryDate);
     System.out.println("Item Description: " + itemDescription);
     System.out.println("Category: " + category);
     System.out.println("Selling Price: " + sellingPrice);
     System.out.println("Discount: " + discount);
             
     
    }
    
}
