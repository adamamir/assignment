package Assignment;
import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pricetotal=0, discount=0, totalprice=0;
		
		System.out.print("Welcome to Jewellery Shop. What is you name? ");
		String name = sc.next();
		System.out.print("Hello, " +name +". Would you like to look some recomendation from our shop? (Choose Y or N) ");
		char choose = sc.next().charAt(0);
		
		if (choose == 'Y') {
			System.out.println("Here we have 3 recommendations which are:");
			System.out.println("1. COLOVIS 			| Price before: RM627.00 | Price after: RM259.00 | [TOP SALE!!]");
			System.out.println("2. Her Jewellery 		| Price before: RM109.90 | Price after: RM87.92");
			System.out.println("2. ALDO 			| Price before: RM129.00 | Price after: RM87.90");
			System.out.println("\n");
			System.out.print("Which one do you want to buy? (Enter number) ");
			int item = sc.nextInt();
			if (item == 1) {
				System.out.print("Would you want to look on details for this item? (Choose Y or N) ");
				char ask = sc.next().charAt(0);
				if (ask == 'Y') {
					System.out.println("Material : Imported Titanium, 18K Rose Gold Plated, Zirconia");
					System.out.println("\n");
					System.out.print("Would you want to buy this item?");
					char ask2 = sc.next().charAt(0);
					if (ask2 == 'Y') {
						System.out.print("The price is RM259.00. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 259*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
					else if (ask == 'N') {
						System.out.println("Alright. Thank you.");
					}
				}
				else if (ask == 'N') {
					System.out.print("The price is RM259.00. How many quantity of this item you want? ");
					int quantity = sc.nextInt();
					pricetotal = 259*quantity;
					System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
				}
			}
			else if (item == 2) {
				System.out.print("Would you want to look on details for this item? (Choose Y or N)");
				char ask = sc.next().charAt(0);
				if (ask == 'Y') {
					System.out.println("Material of Ring: High Quality Brass with 18K Rose / White Gold Plated (Extra coating plating 0.05mil thickness for long lasting shine)");
					System.out.println("\n");
					System.out.print("Would you want to buy this item? (Choose Y or N) ");
					char ask2 = sc.next().charAt(0);
					if (ask2 == 'Y') {
						System.out.print("The price is RM87.92. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 87.92*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
					else if (ask == 'N') {
						System.out.println("Alright. Thank you.");
					}
				}
				else if (ask == 'N') {
					System.out.print("The price is RM87.92. How many quantity of this item you want? ");
					int quantity = sc.nextInt();
					pricetotal = 87.92*quantity;
					System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
				}
			}
			else if (item == 3) {
				System.out.println("Would you want to look on details for this item? (Choose Y or N) ");
				char ask = sc.next().charAt(0);
				if (ask == 'Y') {
					System.out.println("Assorted cuff bracelets of different designs. Metal blend");
					System.out.println("\n");
					System.out.print("Would you want to buy this item? (Choose Y or N) ");
					char ask2 = sc.next().charAt(0);
					if (ask2 == 'Y') {
						System.out.print("The price is RM87.90. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 87.90*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
					else if (ask == 'N') {
						System.out.println("Alright. Thank you.");
					}
				}
				else if (ask == 'N') {
					System.out.print("The price is RM87.90. How many quantity of this item you want? ");
					int quantity = sc.nextInt();
					pricetotal = 87.90*quantity;
					System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
				}
			}
		}
		
		else if (choose == 'N') {
			System.out.println("Thank you. Please come again.");
		}
		
		if (pricetotal<=450) {
			discount = pricetotal*0.15;
			totalprice = pricetotal-discount;
		}
		
		System.out.println("\n");
		System.out.println("Can you give me you nickname and IC number?");
		System.out.print("Nickname: ");
		String nickname = sc.next();
		System.out.print("IC Number (without '-'): ");
		String ic = sc.next();
		
		System.out.println("\n");
		System.out.println("\t\t*****************************************************************");
		System.out.println("\t\t\t\t\tYOUR RECEIPT");
		System.out.println("\t\tName						: " +nickname);
		System.out.println("\t\tIC Number					: " +ic);
		System.out.println("\t\tTotal price					: " +pricetotal);
		System.out.println("\t\tDiscount					: " +discount);
		System.out.println("\t\tTotal price after discount			: " +totalprice);
		System.out.println("\t\t\t\tTHANK YOU. PLEASE COME AGAIN");
		System.out.println("\t\t*****************************************************************");
		sc.close();
	}

}
