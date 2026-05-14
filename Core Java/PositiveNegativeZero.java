public class PositiveNegativeZero {

    public void checkNumberType(int a){
        if(a==0){
            System.out.println(a + " is zero");
        }else if(a>0){
            System.out.println(a + " is positive");
        }else{
            System.out.println(a + " is negative");
        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero obj = new PositiveNegativeZero();
        obj.checkNumberType(0);
    }
}
