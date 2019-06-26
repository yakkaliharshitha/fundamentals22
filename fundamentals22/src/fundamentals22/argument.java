package fundamentals22;

public class argument {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("NO VALUES");
			
		}
		else {
			int j;
	         for(j = 0; j<args.length-1;j++)    
	             System.out.print(args[j]+",");
	         System.out.print(args[j]);
	     
				
			
		}

	}

}
