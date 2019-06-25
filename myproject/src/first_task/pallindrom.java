package first_task;

public class pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int rev = 0, remainder, original;
        original = num;
               while( num != 0 )
        {
            remainder = num % 10;
            rev = rev* 10 + remainder;
            num  /= 10;
        }
               
               if (original == rev)
                   System.out.println(original+ " is a palindrome.");
               else
                   System.out.println(original+ " is not a palindrome.");
	}

}
