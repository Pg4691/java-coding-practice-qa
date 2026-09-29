package strings;

//Palindrome check
public class Palindrome {

    public static void main(String[] args) {
        String input = "madam";

        StringBuilder s = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--){

            s.append(input.charAt(i));

        }

        if(s.toString().equals(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }

}
