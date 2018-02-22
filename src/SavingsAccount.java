
public class SavingsAccount {

	String UserName;
	int Pin;
	double Balance;
	
	public SavingsAccount(String UN, int PN, double Bal){
		
		UserName = UN;
		Pin = PN;
		Balance = Bal;	
	}
	
	
	public static double withdraw(double a, double b){
		double Tot = (a - b);
		return Tot;
	}
		
		public static double deposit(double a, double b){
			double Tot = (a + b);
			return Tot;
			
	}
}
