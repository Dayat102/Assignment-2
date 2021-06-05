package Gaming;

import java.util.Scanner;

public class Event_Description extends Description {
	
	private int age[];
	private char gender[];
	private String name[];
	double discount;

	Scanner sc=new Scanner (System.in);
	Event_Description(int num){
		
		name=new String [num];
		age=new int [num];
		gender=new char[num];
		
		System.out.println();
		System.out.println("*******************************************************************");
		System.out.println("*                    GAMING DESCRIPTION!!!!                       *");
		System.out.println("*              -------------------------------                    *");
		System.out.println("*                                                                 *");
		System.out.println("*          OPEN TO ALL REGARDLESS OF GENDER AND ALSO AGE          *");
		System.out.println("*                    FEE : RM 200 PER PERSON                      *");
		System.out.println("*                      TIME: 22 July 2021                         *");
		System.out.println("*                                                                 *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
		
		for(int i=0; i<num ;i++) {	
			
			if(i<2) {
				System.out.print("\nEnter your name: ");
				this.name[i] = sc.next();
				System.out.print("Enter your age: ");
				this.age [i]= sc.nextInt();
				System.out.print("What is your gender (M/F): ");
				this.gender[i] = sc.next().toCharArray()[0];
				GetPayment BB= new Event_DescriptionGetPayment();
				discount=BB.Payment();
				System.out.println("Congratulations because you are one of the earliest participants, ");
				System.out.println("You only need to pay : Rm" + CalculateFee());
			}
			else {
				System.out.print("\nEnter your name: ");
				this.name[i] = sc.next();
				System.out.print("Enter your age: ");
				this.age [i]= sc.nextInt();
				System.out.print("What is your gender (M/F): ");
				this.gender[i] = sc.next().toCharArray()[0];
				System.out.println("You need to pay : Rm 200");
			}
		}
		printinfo(num);
	}
	
	public void printinfo(int num) {
		System.out.println();
		System.out.print("Participant List :- ");
		for(int i=0; i<num ;i++) {	
			System.out.println("\nName: "+this.name[i]);
			System.out.println("Age: "+this.age [i]);
			System.out.println("Gender: "+this.gender[i]);
		}
	}
	
	public double CalculateFee() {
		return 200-(discount*200);
	}
	
}

