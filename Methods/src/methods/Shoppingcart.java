package methods;
import java.util.Scanner;

public class Shoppingcart {
	static Scanner sc=new Scanner(System.in);
	static String storeName="ABC";
	
	String customerName;
	String productName;
	double price;
	int quantity;
	double finalAmount;
	
	
	void addproduct(String pname , double pr, int qty) {
		System.out.print("Enter Customer Name  :");
		customerName=sc.next();
		System.out.print("Enter product Name   :");
		productName=sc.next();
		System.out.print("Enter price          :");
		price=sc.nextDouble();
		System.out.print("Enter Quantity       :");
		quantity =sc.nextInt();
		System.out.print("Product added succesfully");
		System.out.println();
	}
	void calculateTotal(double discount){
		
	    double total = price * quantity;
	    System.out.println("total amount             : "+total);
        
        
        double discountAmount = total * discount / 100;
        System.out.println(" discount amount    : "+discountAmount);
       
        
        finalAmount = total - discountAmount;
        System.out.println("Final Amount             : "+finalAmount);
      	
	}
    void displaycart() {
    	System.out.println("Store Name      : "+storeName);
    	System.out.println("Customer name   : "+customerName);
    	System.out.println("Product Name    : "+productName);
    	System.out.println("Price           : "+price);
    	System.out.println("Quantity        : "+quantity);
    	System.out.println();
		
	}
	

	public static void main(String[] args) {
		
		Shoppingcart c1 = new Shoppingcart();

        c1.addproduct("Laptop", 50000, 1);
        c1.displaycart();
        c1.calculateTotal(10);


        Shoppingcart c2 = new Shoppingcart();

        c2.addproduct("Mouse", 1000, 2);
        c2.displaycart();
        c2.calculateTotal(20);

	}

}
