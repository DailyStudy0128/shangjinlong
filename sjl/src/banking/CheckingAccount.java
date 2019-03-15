package banking;

public class CheckingAccount extends Account {

	private double overdraftProtection;// 透支余额

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}

	@Override
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			return true;
		} else if (overdraftProtection >= (amt - balance)) {
			overdraftProtection -= (amt - balance);
		} else {
			return false;
		}
		return true;
	}

}
