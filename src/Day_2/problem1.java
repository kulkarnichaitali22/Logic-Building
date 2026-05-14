package Day_2;

//problem : check palindrome
//approach : reverse the number and check for equal

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome :");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num/=10;
        }

        if(rev==temp)
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");

    }
}
