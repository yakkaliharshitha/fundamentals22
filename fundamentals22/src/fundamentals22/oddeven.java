package fundamentals22;

public class oddeven {

	public static void main(String[] args) {
	int m;
	System.out.println("Enter the number you want to check");
	m=Integer.parseInt(args[0]);
	if(m%2==0) {
		System.out.println("The given number " +m+ " is even");	
	}
	else {
		System.out.println("The given number " +m+" is odd");
	}

	}

}
