package fundamentals22;

public class primeorcomp {

	public static void main(String[] args) {
	 int n=1,count=0,i=1;
	 n=Integer.parseInt(args[0]);
	 if(n==1) {
		 System.out.println("neither composite nor prime");
	 }
	  if(n%i==0) {
		 i++;
		 count++;
		 }
	  if(count==2) {
		 System.out.println("prime number");
	 }
	  if(n%2==0) {
		 System.out.println("composite number"); 
	 }

	}

}
