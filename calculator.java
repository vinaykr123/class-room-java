import java.util.Scanner;
public class calculator {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter two values");
		a=s.nextInt();
		b=s.nextInt();
		/*System.out.println("enter you choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			c=a+b;
		
			System.out.println("addition"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("subtraction"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("multiplication"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("divide"+c);
			break;
		case 5:
			c=a%b;
			System.out.println("addition"+c);
			break;
		default:
			
			System.out.println("invalid choice");
			break;
			}
			*/
	   //relation operator     
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		//System.out.println(a==b);
		
		
		
		//logical operator
		System.out.println(a==b && a!=b);
		System.out.println(a==b || a!=b);
		System.out.println(!(a==b));
		
		
		
		//increment operator
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(++a);//a=a+1
		System.out.println(a+=10);//a=a+10
		
		
		//ternary operator
		int m=5;
		int r=(a>b)?(a>m?a:m):(b>m?b:m);
		System.out.println(r);
		
		
		
		
		
		
		
		
	
	

	}

}
