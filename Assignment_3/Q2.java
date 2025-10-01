import java.util.*;
class demo{

        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int num = sc.nextInt();

        int sum =0;
        while(num>0){
                int digit = num % 10;

		if(digit % 2 != 0){
		       sum += digit * digit;
		       
		}
		
                num = num / 10;
                
        }
        System.out.println(sum);
}
}
