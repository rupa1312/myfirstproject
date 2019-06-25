package first_task;

public class all_prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,i,c=0;
		while(n1<99) {
			for(i=2;i<=n1/2;i++)
			{
				if(n1%i==0)
					c++;
			}
			
			if(c<1)
				System.out.print(n1+" ");
			c=0;
			n1++;
		}
	}

}
