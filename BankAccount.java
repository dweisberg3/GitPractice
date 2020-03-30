package dumdum;

"This is making a change in git!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"


"I am making my second change!!!!!!!!!!!!"



public class BankAccount {

	private String owner;
	private double currentBalance;

	public BankAccount(String name, double balance) {
		owner = name;
		currentBalance = balance;
	}

	public void deposit(double amount) {
		currentBalance += amount;
	}

	public void withdraw(double amount) {
		if (amount < currentBalance) {
			currentBalance -= amount;
		}
		else {
			System.out.println("you tried to withdraw too much. Your balance is 0 now"
					+ "and we will fine you");
			currentBalance = 0;
		}
	}

	public double getCurrentBalance() {
		return currentBalance;
	}


}
