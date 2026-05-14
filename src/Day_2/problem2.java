package Day_2;
//largest of 3 numbers
//equality operator

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Second number");
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter third number");
        int c = sc3.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is largest");
        } else if (b>a && b>c) {
            System.out.println(b+" is largest");
        }else{
            System.out.println(c+" is largest");
        }
    }
}
