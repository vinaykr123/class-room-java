import java.util.*;
public class threenum_check {

	public static void main(String[] args) {
		  System.out.println("enter the three value");
		  Scanner d=new Scanner(System.in);
		  int a,b,c;
		  a=d.nextInt();
		  b=d.nextInt();
		  c=d.nextInt();
		  if(a>b) {
			  if(a>c)
				  System.out.println("a is greater");
			  else
				  System.out.println("c is greater");
		  }
		  else if(b>c)
		  {
			  if(b>a)
				  System.out.println("b is greater");
			  else
				  System.out.println("a is greater");
		  }
		  else
			  System.out.println("c is greater");
				  

	}

}
