import java.util.*;
public class else_if {

	public static void main(String[] args) {
		System.out.println("enter marks");
		Scanner a= new Scanner(System.in);
		
		int d,b,c;
		d=a.nextInt();
		
		if(d>=60)
		{
			System.out.println("passed by first class");
		}
		else if(d<60&&d>=40)
		{
			System.out.println("passed by  second class");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
