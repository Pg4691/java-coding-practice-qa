package strings;

// Problem: Check whether one string is a rotation of another.
public class StringRotation {

    public static void main(String[] args) {

        String original = "automation";
        String rotated = "auto";
        String doubled = original + original;

        boolean isRotation = original.length() == rotated.length() && doubled.contains(rotated);
        System.out.println("Is rotation: " + isRotation);
    }
}
