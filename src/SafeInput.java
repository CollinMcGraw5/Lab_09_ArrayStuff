import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(String prompt, int low, int high) {
        Scanner in = new Scanner(System.in);
        int userInt;

        while (true) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                userInt = in.nextInt();
                if (userInt >= low && userInt <= high) {
                    break;
                } else {
                    System.out.println("Error: Please enter an integer between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                in.next();
            }
        }
        return userInt;
    }
}
