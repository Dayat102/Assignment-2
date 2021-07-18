package Gaming;

class EmployeeGetPayment implements GetPayment{
	
	public double Payment() {
		return 0.15;
	}
}

class Event_DescriptionGetPayment implements GetPayment{
	
	public double Payment() {
		return 0.10;
	}
}

class FinanceGetPayment implements GetPayment{
	
	public double Payment() {
		return 0.20;
	}
}
