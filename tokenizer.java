import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Use "\\b" as the delimiter to split the sentence into tokens
        String[] tokens = sentence.split("\\b");
        
        System.out.println("Tokens:");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
        
        scanner.close();
    }
}
