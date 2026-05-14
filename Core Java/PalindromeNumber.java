public class PalindromeNumber {

    public void palindromeNumber(int num){
        int original = num;
        int temp = 0;
        int reverse = 0;
        while(num!=0){
            temp = num % 10;
            reverse = (reverse * 10) + temp;
            num/=10;
        }
        if (reverse==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        obj.palindromeNumber(1);
    }
}
