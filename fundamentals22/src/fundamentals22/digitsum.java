package fundamentals22;

public class digitsum {

	public static void main(String[] args) {
   int n,sum;
   n=Integer.parseInt(args[0]);
   System.out.println("Enter the number");
   for(sum=0;n!=0;n/=10)
   {
	sum+=n%10;   
   }
   System.out.println("sum of digits of a number is " +sum);
	}

}
