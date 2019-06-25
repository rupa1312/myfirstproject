package first_task;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=Integer.parseInt(args[0]);
        int n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
	}

}
