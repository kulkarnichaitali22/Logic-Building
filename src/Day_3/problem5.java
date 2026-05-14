package Day_3;
//problem lowest common factor

import java.util.Scanner;

public class problem5 {
        public static void main(String[] args) {
            System.out.print("Enter 1st number : ");
            Scanner sc = new Scanner(System.in);
            int num1=sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2=sc.nextInt();

            int lcm=1;
            for (int i = 2; i < num1 && i < num2; i++) {
                if(num1 % i == 0 && num2 % i == 0){
                    lcm=i;
                    break;
                }
            }
            System.out.println("LCM = "+lcm);
        }
    }


