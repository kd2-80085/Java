import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuilder and append the characters in reverse order
        StringBuilder reversed = new StringBuilder(input).reverse();
        
        // Convert the StringBuilder back to a String
        String result = reversed.toString();

        System.out.println("Reversed string: " + result);
    }
}
