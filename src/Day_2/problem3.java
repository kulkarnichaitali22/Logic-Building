package Day_2;
//Count digits in a number
//while loop, modulus operator

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit :");
        int num = sc.nextInt();
        int count=0;

        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("The total number of digits are "+count);
    }
}
