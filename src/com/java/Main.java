package com.java;

public class Main {

	public static void main(String[] args) {

		System.out.println("welcome");

		/* creating 2 object */
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();

		saver1.setSavingBalance(2000.00);

		saver2.setSavingBalance(3000.00);

		/* rate of interest 4 */
		SavingAccount.modifyInterestRate(4);

		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1 Balance with interest 4 is : " + saver1.getSavingBalance() + "\n");

		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 Balance with interest 4 is : " + saver2.getSavingBalance() + "\n");

		/* Rate of interest 5 */

		SavingAccount.modifyInterestRate(5);

		saver1.calculateMonthlyInterest();
		System.out.println("Saver1 Balance for Interest 5 is : " + saver1.getSavingBalance() + "\n");

		saver2.calculateMonthlyInterest();
		System.out.println("Saver2 Balance for Interest 5 is : " + saver2.getSavingBalance() + "\n");

	}
}
