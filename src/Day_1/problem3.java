package Day_1;//Problem : find sum of first N numbers
//Approach : for loop

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = mynum.nextInt();
        int sum = 0;

        for(int i=0; i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+num+" numbers is "+sum);
    }
}
