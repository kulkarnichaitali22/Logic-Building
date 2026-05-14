public class PerfectNumber {
    public void perfectNumber(int num){
        int total = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                total+=i;
            }
        }
        if(total == num ){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }

    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        obj.perfectNumber(8);
    }
}
