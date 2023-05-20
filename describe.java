import java.util.Scanner;

public class WordTokenizer {
    public static void main(String[] args) {
        String sentence = "Describe, your experience in the distance learning programme. I am enjoying every bit of it!.";
        String[] words = sentence.split("\\W+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}