public class FibonacciSeries {
    public void fibonacci(int num){
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);

        for (int i = 0; i < num - 2; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries obj = new FibonacciSeries();
        obj.fibonacci(6);
    }
}
