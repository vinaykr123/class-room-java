
public class control_flow {

	public static void main(String[] args) {
		/* break- break works for outside the current loop
		 continue-continue use skip element what no print of output
		 return- return is return the value of return type
		 */
		for(int i=1;i<=10;++i)
		{
			if(i==5)//in this break break from 5
				break;
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i=1;i<=10;++i)
		{
			if(i==5)// continue skip 5
				continue;
			System.out.print(i+" ");
		}

	}

}
