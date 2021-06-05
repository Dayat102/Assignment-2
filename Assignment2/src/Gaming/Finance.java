package Gaming;

import java.util.Scanner;
public class Finance extends Company{

	private double Sponsor,total,budget,profit,tax;
	private int a;
	Scanner sc=new Scanner (System.in);
	Finance(int num){
		System.out.print("Please enter amount of sponsorship : Rm");
		this.Sponsor=sc.nextDouble();
		System.out.print("Please enter this month's cost of goods : Rm");
		this.budget=sc.nextDouble();
		this.a=num;
		printinfo(num);
	}
	
	public void printinfo(int num) {

		System.out.println();
		this.a=num;
		GetPayment aa= new FinanceGetPayment();
		tax=aa.Payment();
		this.total=CalculateSalary();
		this.profit=profit();
		System.out.println("Income for This Company (Sponsorship): Rm"+this.Sponsor);
		System.out.println("Total Fee Registration: Rm"+this.total);
		System.out.println("This month's cost of goods: RM"+this.budget);
		System.out.println("Gross Profit : RM"+this.profit);
		System.out.println("Net Profit : Rm"+netprofit());
	}
	
	public double CalculateSalary() {
		return this.a*200;
	}
	
	public double profit() {
		return this.Sponsor+this.total-this.budget;
	}
	
	public double netprofit() {
		return this.profit-(this.profit*tax);
	}
	
}
