package Day_3;
//reverse string

public class problem1 {


    public static void main(String[] args) {
        String name = "Panda";
        StringBuilder rev= new StringBuilder();
        for (int i = name.length()-1; i >= 0 ; i--) {
            rev = rev.append(name.charAt(i));
        }
        System.out.println(rev);
    }
}
