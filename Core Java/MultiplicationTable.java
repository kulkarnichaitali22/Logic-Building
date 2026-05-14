public class MultiplicationTable {
    public void multiplicationTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i +" = " + num * i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.multiplicationTable(12);
    }
}
