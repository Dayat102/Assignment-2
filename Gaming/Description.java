package Gaming;

public abstract class Description {
	
	public Description() {
		System.out.println("Welcome To Tournament Magic Chess");
		printinfo();
	}
	
	public void printinfo() {
		System.out.println("*******************************************************************");
		System.out.println("*                      SPECIAL OFFER!!!!                          *");
		System.out.println("*              -------------------------------                    *");
		System.out.println("*                                                                 *");
		System.out.println("*           TO 2 PARTICIPANTS WHO REGISTER EARLY                  *");
		System.out.println("*             YOU WILL GET A DISCOUNT UP TO 10%                   *");
		System.out.println("*                 OF THE PARTICIPATION PRICE                      *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
	}
	
	public abstract double CalculateFee();

}
