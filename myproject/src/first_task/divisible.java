package first_task;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,c=0;
		while(c<5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
				c++;

			}
							i++;
		}
	}

}
