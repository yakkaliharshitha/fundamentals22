package fundamentals22;

public class prime {

	public static void main(String[] args) {
	int num = 13;
	boolean flag = false;
	int i;
	for(i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag = true;
			break;
		}
	}
	if(!flag) {
		System.out.println(num+ " is a prime number ");
	}
	else {
		System.out.println(num+ " is  not a  prime number ");	
	}

	}

}
