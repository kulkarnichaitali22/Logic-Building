public class EvenOdd {

    public void evenOdd(int a){
        if(a % 2 == 0 ){
            System.out.println(a +" is Even number");
        }else{
            System.out.println(a +" is Odd number");
        }
    }
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.evenOdd(110);
    }
}
