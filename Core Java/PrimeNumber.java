public class PrimeNumber {
    public void checkPrime(int num) {
        if(num<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime=true;

        for (int i = 2 ; i < num ; i++){
            if(num % i == 0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.checkPrime(7);
    }
}
