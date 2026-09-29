package strings;

// Problem: Extract the order ID from a success message.
public class ExtractOrderID {

    public static void main(String[] args) {


        String text = "Your order #ORD48213 has been placed successfully";


        int start = text.indexOf("#") + 1;


        int end = text.indexOf(" ", start);


        if (end == -1) {
            end = text.length();
        }

        String orderId = text.substring(start, end);

        System.out.println("Order ID: " + orderId);
    }
}