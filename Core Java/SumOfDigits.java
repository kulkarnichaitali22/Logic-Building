public class SumOfDigits {
    public void sumOfDigits(int num){
        int sum = 0;
        int temp=0;
        while(num!=0){
            temp = num % 10;
            sum+= temp;
            num/=10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        obj.sumOfDigits(1234);
    }
}
