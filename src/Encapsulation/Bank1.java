package Encapsulation;

import java.util.Scanner;

class Bank1{
    private double bal = 5000;
    private int pwd;

    // Deposit
    public void Deposit(double money) {
        System.out.println("Enter Password :");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123) {
            bal = bal + money;
            System.out.println("Deposited Money :" + money);
            System.out.println("Total Balance :" + bal);
        }
        else {
            System.out.println("Incorrect Password :");
        }
    }
    
    // Withdrawal
    public void Withdraw(double money) {
        System.out.println("Enter Password :");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123) {
            bal = bal - money;
            System.out.println("Withdrawn Money :" + money);
            System.out.println("Total Balance :" + bal);
        }
        else {
            System.out.println("Incorrect Password :");
        }
    }

    // Check Balance
    public void checkBal() {
        System.out.println("Enter Password :");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123) {
            System.out.println("Total Balance :" + bal);
        }
        else {
            System.out.println("Incorrect Password !!!");
        }
    }
}

 class Customer43 {
    public static void main(String[] args) {
        Bank1 b = new Bank1();

        int ch;
        double amount;
        Scanner s2 = new Scanner(System.in);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.println("\nEnter Your Choice :");
        ch = s2.nextInt();

        switch(ch) {
            case 1:
                System.out.println("Enter amount to deposit:");
                amount = s2.nextDouble();
                b.Deposit(amount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                amount = s2.nextDouble();
                b.Withdraw(amount);
                break;
            case 3:
                b.checkBal();
                break;
            default:
                System.out.println("Invalid Choice :");
        }
    }
}

/*package Encapsulation;

import java.util.Scanner;

public class EncapsulationBank43 {
	public static void main(String[] args) {
		
	}
	//Every java class is an encapsulation class
//	binding data members and data methods called encapsulation, 
//	properties will be private means hidden only service will show
	
	private double bal=5000;
	private int pwd;
	
	//Deposit
	public void Deposit(double money)
	{
		System.out.println("Enter Password :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123) {
			bal=bal+money;
			System.out.println("Deposited Money :"+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password :");
		}
	}
	
	//Withdrawl
	public void Withdraw(double money) {
		System.out.println("Enter Password :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123) {
			bal=bal-money;
			System.out.println("Deposited Money :"+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password :");
		}
	}
	
	//Check Balance
	public void checkBal() {
		System.out.println("Enter Password :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123) {
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect Password !!!");
		}
	}
	
}

class Customer{
	public static void main(String[] args) {
		EncapsulationBank43 bnk=new EncapsulationBank43();
		
		int ch;
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.CheckBalance");
		
		System.out.println("\n Enter Your Choice :");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch) {
		case 1: bnk.Deposit();
		break;
		case 2: bnk.Withdraw();
		break;
		case 3: bnk.checkBal();
		break;

		default: System.out.println("Invalid Choice :");
		}
	}
}


EncapsulationBank43*/