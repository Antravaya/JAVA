import java.util.Scanner;
import java.util.Date;

public class Game_ATM_Machine {

	public class ATM {
	    private static Game_ATM_Machine[] accounts = new Game_ATM_Machine[10];

	    public static void main(String[] args) {
	        for (int i = 0; i < accounts.length; i++) {
	            accounts[i] = new Game_ATM_Machine(i, 100);
	        }

	        try (Scanner input = new Scanner(System.in)) {
				int id;

				while (true) {
				    System.out.print("Enter an id: ");
				    id = input.nextInt();

				    if (id < 0 || id >= accounts.length || accounts[id] == null) {
				        System.out.println("Incorrect id, try again.");
				        continue;
				    }

				    int choice;
				    do {
				        System.out.println("\nMain menu:");
				        System.out.println("1. View balance");
				        System.out.println("2. Withdraw");
				        System.out.println("3. Deposit");
				        System.out.println("4. Exit");
				        System.out.print("Enter a choice: ");
				        choice = input.nextInt();

				        switch (choice) {
				            case 1:
				                System.out.println("The balance is " + accounts[id].getBalance());
				                break;
				            case 2:
				                System.out.print("Enter an amount to withdraw: ");
				                double amount1 = input.nextDouble();
				                accounts[id].withdraw(amount1);
				                break;
				            case 3:
				                System.out.print("Enter an amount to deposit: ");
				                double amount2 = input.nextDouble();
				                accounts[id].deposit(amount2);
				                break;
				            case 4:
				                break;
				            default:
				                System.out.println("Invalid choice, try again.");
				                break;
				        }
				    } while (choice != 4);
				}
			}
	    }
	}


	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Game_ATM_Machine() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public Game_ATM_Machine(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100.0;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
