package programs;

// Problem:Swap a = 10 and b = 25 without a third variable. Print the values before and after.
public class SwapWithoutTemp {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("before swap "+ a + " " +b);
        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swap "+ a + " " +b);
    }

}
