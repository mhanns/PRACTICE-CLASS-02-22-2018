//Maurice Hanns CS 242 02-22-2018

	//String UserName;
	//int Pin;
	//double Balance;

import java.util.Scanner;

public class mainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		SavingsAccount savingA = new SavingsAccount("Jay", 100134, 100);
		SavingsAccount savingB = new SavingsAccount("Aileen", 100190, 1000);
		SavingsAccount savingC = new SavingsAccount("John", 100153, 3213);
		
		System.out.println("Welcome to Bank of HANNS\n");
		System.out.println("Please enter your name: ");
		String nameCHK = input.next();
		System.out.println("Please enter your Pin Number# ");
		int Pien = input.nextInt();
		
		if  (savingA.UserName == "Jay" && savingA.Pin == 100134){
			System.out.println("Hello Jay, would you like to make a deposit (1) or a withdraw (2)");
			int answer = input.nextInt();
			
			if (answer == 1){
				System.out.println("How much would you like to withdraw Jay: ");
				double amount = input.nextInt();
				double Tot = SavingsAccount.withdraw(savingA.Balance, amount);
				System.out.println(Tot);
			}
			else if (answer == 2){
				System.out.println("How much would you like to deposit Jay: ");
				double amount = input.nextInt();				
				double Tot = SavingsAccount.deposit(savingA.Balance, amount);		
				System.out.println(Tot);
			}
			else {
				System.out.println("Invalid choice ");
			}
			
		}
		
			
		else if  (savingB.UserName == "Aileen" && savingB.Pin == 100134){
			System.out.println("Hello Aileen, would you like to make a deposit (1) or a withdraw (2)");
			int answer = input.nextInt();
			
			if (answer == 1){
				System.out.println("How much would you like to withdraw Aileen: ");
				double amount = input.nextInt();
				double Tot = SavingsAccount.withdraw(savingB.Balance, amount);
				System.out.println(Tot);
			}
			else if (answer == 2){
				System.out.println("How much would you like to deposit Aileen: ");
				double amount = input.nextInt();				
				double Tot = SavingsAccount.deposit(savingB.Balance, amount);		
				System.out.println(Tot);
			}
			else {
				System.out.println("Invalid choice ");
			}
			
		}
		
		else if  (savingC.UserName == "John" && savingC.Pin == 100134){
			System.out.println("Hello John, would you like to make a deposit (1) or a withdraw (2)");
			int answer = input.nextInt();
			
			if (answer == 1){
				System.out.println("How much would you like to withdraw John: ");
				double amount = input.nextInt();
				double Tot = SavingsAccount.withdraw(savingC.Balance, amount);
				System.out.println(Tot);
			}
			else if (answer == 2){
				System.out.println("How much would you like to deposit John: ");
				double amount = input.nextInt();				
				double Tot = SavingsAccount.deposit(savingC.Balance, amount);		
				System.out.println(Tot);
			}
			else {
				System.out.println("Invalid choice ");
			}
			
		}
		
		
		else {

			System.out.println("Please enter a name");
			String name1 = input.nextLine();
			System.out.println("Please enter a pin");	
			int pine = input.nextInt();
			System.out.println("Please enter an amount");
			double balc = input.nextDouble();	
			
			System.out.println("Hello John, would you like to access Current Account (1) or an OverDraft Account (2)");
			int answer = input.nextInt();
			
			if (answer == 1){
			SavingsAccount CurrentAccount = new SavingsAccount(name1, pine, balc);
			}
			else if (answer == 2){
			SavingsAccount OverDraft = new SavingsAccount(name1, pine, balc);
			}
		}
		
	}//main
	


}//mainAccount
