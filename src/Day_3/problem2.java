package Day_3;
//palindrome string

public class problem2 {
    public static void main(String[] args) {
        String name = "Madam";
        String rev = "";
        for (int i = name.length()-1 ; i>=0;i--){
            rev+=name.charAt(i);
        }

        System.out.println(name);
        System.out.println(rev);

        if(rev.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
