public class ArmstrongNumber {
    public void armstrong(int num){
        int check = 0;
        int temp = 0 ;
        int original = num;

        while(num!=0){
            temp = num % 10;
            check += (temp * temp * temp);
            num/=10;
        }

        if(original == check){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not armstrong number");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.armstrong(153);
    }
}
