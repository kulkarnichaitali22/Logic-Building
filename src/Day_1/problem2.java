package Day_1;//Problem : check even or odd
//Approach : Use modulus operator

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = mynum.nextInt();

        if(num%2==0)
            System.out.println(num + " is a even number.");
        else
            System.out.println(num + " is a odd number.");

    }
}
