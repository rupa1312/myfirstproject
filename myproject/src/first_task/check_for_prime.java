package first_task;

public class check_for_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
int n=1,i,c=0;
for(i=1;i<=n;i++) {
	if(n%i==0)
		c++;
	}
	if(c==2) {
		System.out.print(n+" is a prime number");
	}
	if(c==n)
	{
		System.out.print(n+" is neither prime nor composite");
	}
	if(c==1)
	{
		System.out.print(n+" is neither prime nor composite");
	}
	if(c>2)
	{
		System.out.print(n+" is not a prime number");
	}

	}

}
