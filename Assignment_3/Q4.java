import java.util.*;

class demo{
       	public static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(" Number is Strong Number");
        } else {
            System.out.println("Number is not Strong Number");
        }
    }
}

