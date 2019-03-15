package testbanking;

import banking.*;

public class TestBanking3 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;

		//
		// Create bank customers and their accounts
		//

		System.out.println("Creating the customer Jane Smith.");
		bank.addCustomer("Jane", "Simms");
		// code
		account = new Account(500);
		account.deposit(100);
		customer = new Customer("Jane", "Simms");
		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ "] has a balance of " + account.getBalance());

	}
}
