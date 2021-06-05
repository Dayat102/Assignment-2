package Gaming;

public abstract class Company {
	
	Company(){
		System.out.println();
		printinfo();
	}
	
	public void printinfo() {
		System.out.println("Welcome To Meliodas Enterprice");
	}
	public abstract double CalculateSalary();

}
