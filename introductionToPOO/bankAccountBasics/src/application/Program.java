package application;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		BankAccount bk = new BankAccount(123, "Luiz Gustavo", 123.23);
		System.out.println(bk);
		
		if (!bk.withdraw(200)) {
            System.out.println("Insufficient balance for withdrawal.");
        }
		
		System.out.println(bk.toString());
		
		bk.deposit(100);
		
		System.out.println(bk.toString());
	}

}
