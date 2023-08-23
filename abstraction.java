import java.util.*;
abstract class bank
{
	public String s= "sbi";
	public String t= "sbino132425";
	public void bankdetail() {
		System.out.println("my bank is"+s+"my ifsc code is"+t);
	}
	
	abstract void Deposite();
	abstract void Withdraw();
	abstract void check_balance();
	
	
}
class bankservice extends bank
{
	private int bal=5000;
	private int pos;
	int money;
	public void Deposite()
	{
		System.out.println("enter the amount");
		Scanner s1=new Scanner(System.in);
		money=s1.nextInt();
		System.out.println("enter the possword");
		pos=s1.nextInt();
		if(pos==124)
		{
			bal=bal+money;
			System.out.println("withdraw money"+money);
			System.out.println("total amount"+bal);
			
			
		}
		else 
			System.out.println("invalideposswor");
	}
	public void Withdraw()
	{
		System.out.println("enter the amount");
		Scanner s1=new Scanner(System.in);
		money=s1.nextInt();
		System.out.println("enter the possword");
		pos=s1.nextInt();
		if(pos==124)
		{
			bal=bal-money;
			System.out.println("deposite money"+money);
			System.out.println("total amount"+bal);
			
			
		}
		else 
			System.out.println("invalideposswor");
	}
	public void check_balance()
	{
		
		if(pos==124)
		{
			System.out.println("enter the possword");
			pos=s1.nextInt();
		//al=bal+money;
	//System.out.println("deposite money"+money);
			System.out.println("total amount"+bal);
			
			
		}
		else 
			System.out.println("invalid posswor");
	}

}
public class abstraction {

	
	public static void main(String[] args) {
		bankservice b=new bankservice();
	//1.bankdetail();
		int ch;
		
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.check balance");
		
		System.out.println("enter the choice");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		switch(ch)
		{
		case 1: b.Deposite();
		break;
		case 2: b.Withdraw();
		break;
		case 3: b.check_balance();
		break;
		default:System.out.println("invalid choice");
		
		}
		
		

	}

}
