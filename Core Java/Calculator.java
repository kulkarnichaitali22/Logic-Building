import java.util.Scanner;

public class Calculator {

    public void calculate(int a, int b, String operator){
        switch(operator){
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if(b!=0) {
                    System.out.println(a / b);
                }else{
                    System.out.println("Division by zero not allowed");
                }
                break;
            default:
                System.out.println("Please chose the correct operator!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 positive numbers");
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Please chose the operator : \n+ (addition)\n- (subtraction)\n*(Multiplication)\n/(Division)");
        String operator = sc.next();

        Calculator obj = new Calculator();
        obj.calculate(a,b,operator);

    }
}
