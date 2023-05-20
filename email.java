import java.util.Scanner;

public class EmailAddressParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();

        int atIndex = emailAddress.indexOf('@');

        if (atIndex != -1) {
            String username = emailAddress.substring(0, atIndex);
            String domain = emailAddress.substring(atIndex + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email address format.");
        }

        scanner.close();
    }
}
