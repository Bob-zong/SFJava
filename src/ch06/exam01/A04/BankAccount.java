package ch06.exam01.A04;

public class BankAccount {
	public int balance;
	public BankAccount() {
		this.balance = 0;
	}
	public void deposit(int balance) {
		this.balance += balance;
	}
	public void withdrawl(int balance) {
		this.balance -= balance;
	}
	public void printBalance() {
		System.out.println("남은 잔고: " + this.balance + "원");
	}
}
