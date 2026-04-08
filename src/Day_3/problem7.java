package Day_3;
//armstrong number

public class problem7 {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int a,sum=0;

        while(temp!=0){
            a=temp%10;
            temp=temp/10;
            sum+=a*a*a;
        }

        if(num==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }
}
