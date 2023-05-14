package week3.day1;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("Deposit method from AxisBank class");
	}
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.saving();
		axis.fixed();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
	}

}
