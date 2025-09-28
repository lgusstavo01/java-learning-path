package entities;

public class BankAccount {
	private Integer accountNumber;
	private String holderName;
	private Double balance;

	public BankAccount() {
	};

	public BankAccount(Integer accountNumber, String holderName, Double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Double getBalance() {
		return balance;
	}

	public boolean withdraw(double value) {
		if (value > balance) {
			return false;
		}
		balance -= value;
		return true;
	}

	public void deposit(double value) {
		balance += value;
	}

	@Override
	public String toString() {
		return String.format("\n-----Account data-----\n\n" + "Account: %d\n" + "Holder: %s\n" + "Balance: %.2f",
				accountNumber, holderName, balance);
	}
}
