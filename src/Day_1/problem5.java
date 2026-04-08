package Day_1;//Problem : reverse a number
//Approach: Modulus and while loop

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        int rev = 0;

        while(num!=0){
            rev=rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);

    }
}
