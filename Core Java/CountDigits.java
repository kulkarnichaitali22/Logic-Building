public class CountDigits {
    public void countDigits(int num){
        int count=0;
        if(num==0){
            System.out.println("1 digit");
        }else{
        while(num!=0){
            count++;
            num/=10;
        }
        System.out.println(count + " digits");
    }}

    public static void main(String[] args) {
        CountDigits obj = new CountDigits();
        obj.countDigits(0);
    }
}
