package SEPT_TASK;

import java.util.Scanner;

public class Codechef12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of test cases
        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Loop through each test case
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter string " + i + ": ");
            String str = sc.nextLine();

            // Reverse the string
            String rev = new StringBuilder(str).reverse().toString();

            // Check palindrome
            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }

        sc.close();
    }
}
