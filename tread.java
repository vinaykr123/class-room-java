class thread1 extends Thread{
	public void run() {
		int i=0;
		while(i<35 )
		{
			System.out.println("vinay");
			i++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                                                                                                                                                                                                                           
			
		}
		
	}
}
public class tread {

	public static void main(String[] args) throws InterruptedException {
		thread1 t=new thread1();
		t.start();
		int i=0;
		while(i<50 )
		{
			System.out.println("arun");
			i++;
			Thread.sleep(12);
			
		}

	}

}
