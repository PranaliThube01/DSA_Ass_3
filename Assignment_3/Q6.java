import java.util.*;
class demo{
	public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = sc.nextInt();

	boolean isDuck = false;
	int temp=num;

	while(temp>0){
		int digit = temp % 10;
		if(digit == 0){
			isDuck = true;
			break;
		}
		temp =temp/10;
	}

	if(num ==0){
		System.out.println("Number is not Duck");
	}else if(isDuck){
		System.out.println("Numbeer is Duck");
	}else{
		System.out.println("Number is not Duck");
	}

	}
}

			


