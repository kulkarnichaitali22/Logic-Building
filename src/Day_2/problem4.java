package Day_2;
//problem : sum of digits in number

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit :");
        int num = sc.nextInt();
        int sum=0;

        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}
