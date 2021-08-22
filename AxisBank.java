package week3.day1;

public class AxisBank extends BankInfo
{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Method is called from Axis Bank - Overrided ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AxisBank abObj = new AxisBank();
		abObj.deposit(); //overrides BankInfo deposit method
		abObj.saving();
		abObj.fixed();

	}

}
