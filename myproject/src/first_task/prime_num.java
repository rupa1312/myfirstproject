package first_task;

public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=22,i,c=0;
		for(i=2;i<=23/2;i++) {
			if(n%2==0)
				c++;
			
		}
		if(c>=1)
			System.out.print("give input is not a prime");
		else
			System.out.print("give input is a prime");
	}

}
