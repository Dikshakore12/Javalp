package Abstraction;

import java.util.Scanner;

// Abstract class Bank
public abstract class Abstraction44 {
    String Name = "myBank";
    String IFSC = "myBank123";

    public void bankDetail() {
        System.out.println("Bank Name: " + Name + ", Bank IFSC Code: " + IFSC);
    }

    abstract void Deposite();
    abstract void Withdraw();
    abstract void checkBal();
}

 class BankService extends Abstraction44 {
    protected double bal = 5000;
    protected int pwd;
    protected double money;

    public void Deposite() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Password: ");
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.print("Enter Deposit Amount: ");
            money = s.nextDouble();
            bal = bal + money;
            System.out.println("Deposited: " + money);
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password!");
        }
    }

    public void Withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Password: ");
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.print("Enter Withdraw Amount: ");
            money = s.nextDouble();
            if (money <= bal) {
                bal = bal - money;
                System.out.println("Withdrawn: " + money);
                System.out.println("Total Balance: " + bal);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Incorrect Password!");
        }
    }

    public void checkBal() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Password: ");
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password!");
        }
    }
}


class Customer {
    public static void main(String[] args) {
    	BankService b = new BankService();
        b.bankDetail();

        Scanner s2 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = s2.nextInt();

            switch (ch) {
                case 1:
                    b.Deposite();
                    break;
                case 2:
                    b.Withdraw();
                    break;
                case 3:
                    b.checkBal();
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 4);
    }
}
