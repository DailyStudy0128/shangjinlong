package testbanking;

import banking.*;

public class TestBanking2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Simms", "Jane");
		bank.addCustomer("Bryant", "Owen ");

		for (int i = 0; i < bank.getNumOfCustomers(); i++) {
			Customer customer = bank.getCustomer(i);
			System.out.println(customer.getFirstName() + "," + customer.getLastName());
			System.gc();

		}
	}
}
