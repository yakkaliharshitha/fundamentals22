package fundamentals22;

public class patterns {

	public static void printstars(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}

	}
	public static void main(String[]args) {
		int n=3;
		printstars(n);
	}

}
