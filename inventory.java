package gg;

public class inventory {
    // Private attributes
    private String itemName;
    private int itemID;
    private int quantity;
    private double price;

    // Constructor
    public inventory(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods to retrieve attributes
    public String getItemName(String itemName) {
    	
        return itemName;
    }

    public int getItemID(int itemID) {
        return itemID;
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    public double getPrice(double price) {
        return price;
    }

    // Setter methods to update attributes
    public void setItemName(String itemName) {
    
        this.itemName = itemName;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to add items to the inventory
    public void addItems(int quantityToAdd) {
    	
        if (quantityToAdd > 0) {
            quantity += quantityToAdd;
        }
    }

    // Method to update the price of the item
    public void updatePrice(double newPrice) {
    	
        if (newPrice >= 0) {
            price = newPrice;
        }
    }

    // Method to display information about the inventory item
    public void displayInfo() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item ID: " + itemID);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("First");
		inventory item=new inventory("mobile",102, 5, 10000);
		inventory item2=new inventory("laptop",101, 5, 10000);
		System.out.println("2nd");
//		System.out.println(item);
		
		item.setItemName("johnny");
		item.displayInfo();
		item2.displayInfo();
		item.updatePrice(20000);
		System.out.println(item);
		item.displayInfo();
		
	}
}