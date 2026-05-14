public class Factors {
    public void findFactors(int num){
        for (int i = 1; i <= num; i++) {
            if(num % i == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Factors obj = new Factors();
        obj.findFactors(12);
    }
}
