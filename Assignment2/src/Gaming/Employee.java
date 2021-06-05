package Gaming;

import java.util.Scanner;
public class Employee extends Company{
	
	private int age[];
	private char gender[];
	private String name[],position[];
	private double salary[],a,total=0,income=20000,profit;
	double tax;
	
	Scanner sc=new Scanner (System.in);
	Employee(int num){
		
		name=new String [num];
		age=new int [num];
		gender=new char[num];
		position =new String [num];
		salary = new double[num];
		
		for(int i=0; i<num ;i++) {	
			System.out.print("\nEnter your name: ");
			this.name[i] = sc.next();
			System.out.print("Enter your age: ");
			this.age [i]= sc.nextInt();
			System.out.print("What is your gender (M/F): ");
			this.gender[i] = sc.next().toCharArray()[0];
			System.out.print("Enter your position in this company: ");
			this.position[i] = sc.next();
			System.out.print("Enter your salary: ");
			this.salary [i]= sc.nextDouble();
			this.total=this.total+this.salary[i];
		}
		printinfo(num);
		
	}
	
	public void printinfo(int num) {
		System.out.println();
		System.out.print("Staff List :- ");
		for(int i=0; i<num ;i++) {	
			System.out.println("\nName: "+this.name[i]);
			System.out.println("Age: "+this.age [i]);
			System.out.println("Gender: "+this.gender[i]);
			System.out.println("Position: "+this.position[i]);
			System.out.println("Gross Salary: Rm"+this.salary[i]);
			a=this.salary[i];
			GetPayment aa= new EmployeeGetPayment();
			tax=aa.Payment();
			System.out.println("Net Salary : Rm"+CalculateSalary());
			System.out.println();
		}
	}
	
	public double CalculateSalary() {
		return a-(a*tax);
	}

}
