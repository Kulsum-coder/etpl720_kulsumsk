package com.evergent.corejava.kulsum.application2;


import java.io.IOException;
import java.util.Scanner;

public class EvenManagement {

	enum module1 {O,P,I,H};
	enum submodule1 {F,R,H};
	enum submodule2  {B,D,H};
	enum submodule3  {G,S,H};
	enum flowers_c {R,T,L};
	enum extra {X,Y,Z};
	static int flowercost;
	static int amount;
	static int no_of_flowers;
	static int amountdisc;
	static int extraitemcost;
	public static void main(String[] args) throws IOException {
		  String module = null;
		
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t\t\t*********Create your own bouquet*******");
	    
		while(true)
		{
	
	  
	    System.out.println("<><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><>");
		System.out.println(" \tHOME ");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("O->Order Your Flowers");
		System.out.println("P->Payment Details");
		System.out.println("I->Invoice Details");
		System.out.println("H->Exit");
		System.out.println("<><><><><><><><><><><>");
	    System.out.println("Enter your Module code (O,P,I,H) : ");


module=br.nextLine();
System.out.println("You entered module is  : " );  
switch(module1.valueOf(module))
{

case O:
	
System.out.println(" Order Your Flowers");
System.out.println("<><><><><><><><><><><>");
System.out.println("F-To choose Your Flowers");
System.out.println("R-To choose Extra Items");
System.out.println("H-Return to HomePage");
System.out.println("<><><><><><><><><><><>");
System.out.println("Enter your Module code (F,R,H) : ");

	module=br.nextLine();
switch(submodule1.valueOf(module))
{
		case F:
			
			
			System.out.println("Flowers \t Description \t Charge for 5Units ");
			System.out.println("===============================================");
			System.out.println("R \t\t Red Rose \n \t Pink Rose \n\t YellowRose \n\t white Rose \n\t Orange Rose \t\t\t Rs50.00");
			System.out.println("");
			System.out.println("T \t Pink Tulip \n \t White Tulip \n\t Orange Tulip \n\t Red Tulip \n\t Yellow Tulip  \t\t\t RM50.00");
			System.out.println("");
			System.out.println("L \t White Lily \n \t Pink Lily \n\t Purple Lily \n\t Red Hibiscus \n\t Orange Hibiscus  \t\t RM50.00");
			System.out.println("===============================================");
			System.out.println("Enter your Menu code (R,T,L) : ");
			
			
			module=br.nextLine();
			switch(flowers_c.valueOf(module))
			{

			case R:
				flowercost=50;
				break;
			case T:
				flowercost=50;
				break;
			case L:
				flowercost=50;
				break;
			}
			
			
			
			System.out.println("Enter No.Of Flowers : ");
			
			no_of_flowers =Integer.parseInt( br.nextLine());
			System.out.println("you selected no of flowers are "+no_of_flowers);
			 amount=flowercost*no_of_flowers;
			
			System.out.println("Amount for flowers before discount is Rs"+amount);
			if(no_of_flowers >= 1 && no_of_flowers <=25) 
				amountdisc=(int) (amount-(amount*0.02));
			if( no_of_flowers>= 26 && no_of_flowers <=50)
				amountdisc=(int) (amount-(amount*0.03));
			else if(no_of_flowers >= 51 && no_of_flowers <=100)
				amountdisc=(int) ((amount-amount*0.05));
			else if(no_of_flowers >= 101 && no_of_flowers <=200)
				amountdisc=(int) ((amount-amount*0.08));
			System.out.println("Amount of flowers after Discount for selected flowersis  Rs"+amountdisc);
			
			
			
		break;
		case R:
			
			System.out.println("Item \t Description  \t Charge per Unit ");
			System.out.println("========================================================================");
			System.out.println("L \t Leaves for\n\tBoquet  Rs 40.00 per unit of 1Bunch ");
			System.out.println("");
			System.out.println("W \t Wrapper Covers \t Rs10.00 per unit of 1 Cover");
			System.out.println("");
			System.out.println("R \t Ribbons \t Rs20.00 per unit of 1Ribbon");
			System.out.println("");
			System.out.println("========================================================================");
			System.out.println("Enter your Menu code (X,Y,Z) : ");
			
			module=br.nextLine();
			
			switch(extra.valueOf(module))
			{

			case X:
				extraitemcost=40;
				break;
			case Y:
				extraitemcost=10;
				break;
			case Z:
				extraitemcost=20;
				break;
			}
			
			System.out.println("Your Extra Cost : Rs "+extraitemcost);
			
			
		break;
default:
	break;	
		}
		 break;
		 
		case P:
			System.out.println("  For Payment ");
			System.out.println("<><><><><><><><><><><>");
			System.out.println("B-To display total amount to be paid");
			System.out.println("D-To display amount after discount to be paid");
			System.out.println("H-Return to Main Menu");
			System.out.println("<><><><><><><><><><><>");
			System.out.println("Enter your Module code (B,D,H) : ");

			module=br.nextLine();
			switch(submodule2.valueOf(module))
			{

			case B:
				System.out.println("Total Amount to be Paid : Rs"+(amount+extraitemcost));
			break;
			case D:System.out.println("To Make Payment : Rs"+(amountdisc+extraitemcost));
			break;
			default:
				break;	
			}
			break;
			
					
		case I:

		System.out.println(" Payment Module");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("G-To dispaly invoice for Flower Order");
		System.out.println("S-To display the summary of orders and Discounts");
		System.out.println("H-Return to Main Menu");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("Enter your Module code (G,S,H) : ");

			module=br.nextLine();
		switch(submodule3.valueOf(module))
		{
		case G:
		System.out.println("Summary Of Ordered flowers");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("you selected flowers  cost Rs"+amount);
		System.out.println("you selected no of flowers are "+no_of_flowers);
		System.out.println("Amount for ordered flowers after Discount for selected flowers is  Rs"+amountdisc);
		System.out.println("Your extra Cost : Rs "+extraitemcost);
		System.out.println("\n");
		System.out.println("Total Amount to be Paid : Rs"+(amount+extraitemcost));
		System.out.println("To Make Payment : Rs"+(amountdisc+extraitemcost));
		System.out.println("<><><><><><><><><><><>");
		case S:
			System.out.println("Summary Of Order");
			System.out.println("<><><><><><><><><><><>");
		System.out.println("you selected Food item cost Rs"+amount);
		System.out.println("you selected no of guests are "+no_of_flowers);
		System.out.println("Amount for ordered food after Discount for selected guests is  Rs"+amountdisc);
		System.out.println("Your Additional Cost : Rs "+extraitemcost);
		System.out.println("\n");
		System.out.println("Total Amount to be Paid : Rs"+(amount+extraitemcost));
		System.out.println("To Make Payment : Rs"+(amountdisc+extraitemcost));
		System.out.println("<><><><><><><><><><><>");

		break;	
		}
		break;
		case H:
		System.out.println("EXIT");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("THANK YOU FOR SHOPPING");
		System.exit(0);
			break;

				
				}
				

				
				}
			}

		}


	
