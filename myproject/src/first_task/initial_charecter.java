package first_task;

public class initial_charecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char m1='*';
		if(m1>='a' && m1<='z' || m1>='A' && m1<='Z')
			System.out.print("initialized value is charecter");
	else if(m1>=0 && m1<=9)
		System.out.print("initialized value is number");
	else
		System.out.print("initialized value is special charecter");

	}

}
