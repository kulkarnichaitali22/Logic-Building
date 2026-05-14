public class ReverseNumber {

    public void reverseNumber(int num){
        int reverse=0;
        int temp = 0;
        while(num!=0){
            temp = num%10;
            reverse=(reverse*10)+temp;
            num=num/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.reverseNumber(123212);
    }
}
