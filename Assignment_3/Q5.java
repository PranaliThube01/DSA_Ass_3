import java.util.*;
class demo{
	public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		int originalNum=num;
		int temp=num;
		int digits =0;

		while(temp>0){
			digits++;
			temp=temp/10;
		}

		temp =num;
		int sum =0;
		while(temp>0){
			int digit =temp%10;
			int pow=1;
			int i=1;
			while(i<=digits){
				pow *=digit;
				i++;
			}
			sum +=pow;
			temp = temp/10;
		}

		if(sum == originalNum){
			System.out.println("No is armstrong");
		}else{
			System.out.println("No is not Armstrong");
		}
	}
}


