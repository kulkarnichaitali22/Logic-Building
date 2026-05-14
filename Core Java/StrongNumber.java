//Addition of each factorial of each digit == number
public class StrongNumber {

    public void strongNumber(int num){
        int check = num;
        int temp = 0;
        int total = 0;

        while(num!=0){
            temp = num % 10;
            int fact = 1;
            for (int i = temp; i > 0; i--) {
                fact*=i;
            }
            total+=fact;
            num/=10;
        }
        if(check == total){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }

    public static void main(String[] args) {
        StrongNumber obj = new StrongNumber();
        obj.strongNumber(145);
    }

}
