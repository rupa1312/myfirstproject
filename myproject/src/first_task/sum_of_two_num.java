package first_task;

public class sum_of_two_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i;
		for(i=0;i<=args.length-1;i++) {
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.print(sum);
	}

}
