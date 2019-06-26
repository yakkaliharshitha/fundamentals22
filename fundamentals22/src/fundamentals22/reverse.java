package fundamentals22;

public class reverse {

	public static void main(String[] args) {
		int num=12345,reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
			System.out.println("Reversed number is " + reverse);
		}

	}

}
