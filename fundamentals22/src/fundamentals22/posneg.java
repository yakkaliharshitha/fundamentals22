package fundamentals22;

public class posneg {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number you want to check:");
		n=Integer.parseInt(args[0]);
		if(n>0) {
			System.out.println("The given number"+n+" is positive ");
		}
		else if(n<0) {
			System.out.println("The given number"+n+" is negative");
		}
		else {
			System.out.println("The given number"+n+" is zero");	
		}

	}

}
