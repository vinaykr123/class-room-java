



              // Encapsulation only uses for security purpose

import java.util.*;
class encapsulation  {
	
	//public encapsulation() {
		// TODO Auto-generated constructor stub
//	}
	

	public static void main(String[] args) {
	//	System.out.println(bal);
		bank b=new bank();
		//System.out.println(b.bal);
		int ch;
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.check balance");
		System.out.println(" enter your choice");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		switch(ch)
		{
		case 1: b.deposite();
		break;
		case 2: b.withdraw();
		break;
		
		case 3: b.check_balance();
		break;
		default: System.out.println("invalid choice");
		
		
		}
		

	}

}
class bank
{
	private int bal=5000;
	private int pwd;
	public void deposite() 
	{
		int money;
		System.out.println("enter the amount");
		Scanner s1=new Scanner(System.in);
		money=s1.nextInt();
		System.out.println("enter the possword ");
		Scanner sc= new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==124)
		{
			bal=bal+money;
			System.out.println("Deposite money"+money);
			System.out.println("Total balance"+bal);
		}
		else
			System.out.println("incorrect possword");
	}
	public void withdraw() 
	{
		int money;
		System.out.println("enter the amount");
		Scanner s1=new Scanner(System.in);
		money=s1.nextInt();
		System.out.println("enter the possword ");
		Scanner sc= new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==124)
		{
			bal=bal-money;
			System.out.println("Withdraw money"+money);
			System.out.println("Total balance"+bal);
		}
		else
			System.out.println("incorrect possword");
	}
	public void check_balance() 
	{
		System.out.println("enter the possword ");
		Scanner sc= new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==124)
		{
			//bal=bal+money;
			//System.out.println("Deposite money"+money);
			System.out.println("Total balance"+bal);
		}
		else
			System.out.println("incorrect possword");
	}

	
}
