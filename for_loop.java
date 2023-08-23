import java.util.*;
public class for_loop {

	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int i,x;
		for(i=1;i<=10;i++)
		{
			x=a*i;
			System.out.println(x);
		}

	}

}
