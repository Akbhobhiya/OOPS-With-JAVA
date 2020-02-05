//Write a java program to demonstrate the working of a banking-system where we deposit and
//withdraw amount from our account.
// Create an Account class which has deposit() and withdraw() methods.
// Create method to check the balance of the account.

public class Prob1
{  
	int balance;
	public Prob1(int balance)
	{
		this.balance=balance;
	}
	public void deposit(int value)
	{ 
		balance+=value; 
	}
	public int withdraw(int value)
	{
		balance-=value;
		return balance;
	}
	public void show()
	{
		System.out.println("balance is:"+balance);
		//System.out.println(num1+"and"+num2+"is:");  
	}
	public static void main(String[] args) 
	{
		Prob1 acc = new Prob1(1000);
		acc.deposit(1000);
		acc.withdraw(500);
	    acc.show(); 
	}
}