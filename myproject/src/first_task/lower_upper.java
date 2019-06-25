package first_task;

public class lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char m1='g';
		if(m1>='A' && m1<='Z') 
			m1=(char) (m1+32);
			
		else 
			m1=(char) (m1-32);
			
		System.out.print(m1);
	}

}
