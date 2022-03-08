package com.java;

public class SavingAccount {

	private static double annualInterestRate;
	private static double savingBalance;

	/* get method for saving Balance */
	public double getSavingBalance() {
		return savingBalance;
	}

	/* Set method for saving Balance */

	public void setSavingBalance(double savingBalance) {
		SavingAccount.savingBalance = savingBalance;
	}

	/* get method for Annual Interest Rate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/* set method for Annual Interest Rate */
	public void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	/* method CalculateMonthly interest */
	public double calculateMonthlyInterest() {

		double monthlyInterest = (savingBalance * (annualInterestRate) / 100) / 12; // (P*R/100)%12 Interest calculate
																					// formula

		savingBalance = savingBalance + monthlyInterest;

		return monthlyInterest;
	}

	/* method ModifyInterestRate */

	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;

	}

}
