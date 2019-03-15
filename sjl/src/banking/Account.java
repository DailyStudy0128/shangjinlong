package banking;

public class Account {
	protected double balance;

	public Account(double init_balance) {
		balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	// 存钱操作
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}

	// 取钱操作
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			return true;
		} else {
			System.out.println("余额不足:请确保余额充足在取款");
		}
		return false;

	}
}
