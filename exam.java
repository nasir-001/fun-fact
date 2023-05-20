import java.util.Scanner;

public class ExamQ2C {
    public static void main( String[] args) {
        int x1;
        String s1, s2, password;
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter your first name, last name and age: ");
        s1 = keyboard.next();
        s2 = keyboard.next();
        x1 = keyboard.nextInt();
        password = s1.charAt(0) + s2.substring(2) + (x1 % 3);
        System.out.println("Your password is: " password);
    }
}

// Output (Your password is: Ys2)

// The first character of the first name is 'Y'.
// The substring of the last name starting from index 2 is "s".
// The remainder of x1 divided by 3 is 2.
// Combining these values gives the password "Ys2".