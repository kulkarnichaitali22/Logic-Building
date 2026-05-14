public class Factorial {
    public void factorial(int num){
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.factorial(5);
    }
}
