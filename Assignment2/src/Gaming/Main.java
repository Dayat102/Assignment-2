package Gaming;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int menu,num=0,staff=0;
		
		do
        {        
            System.out.println();
            System.out.println(":::::::::::: Menu ::::::::::::");
            System.out.println("1. Staff .");
            System.out.println("2. Registration.");
            System.out.println("3. Finance .");
            System.out.println("0. Exit");
                  
            System.out.print("\nEnter your choice (1 - 3) or 0 to Exit: ");
            menu = sc.nextInt();
               
            if (menu == 1)
            {
            	System.out.print("Enter number of your Staff: ");
            	staff=sc.nextInt();
            	Company b =new Employee(staff);
            	
            }
            
            else if (menu == 2)
            {
            	System.out.print("Enter number of Participant: ");
            	num=sc.nextInt();
            	Description a =new Event_Description(num);
            	
    	
            }
            
            else if (menu == 3)
            {
            	Company c=new Finance(num);
            }

            else if (menu < 0  || menu >= 5)
                System.out.println("Invalid! Please try again!");
        }
		while (menu != 0);
		System.out.println("\n--- PROGRAM END. THANK YOU FOR USING THIS APPLICATION ---");
	}
	
}
