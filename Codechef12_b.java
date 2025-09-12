package SEPT_TASK;

import java.util.Scanner;

public class Codechef12_b {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        // Ask for number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("\nEnter size of array for test case " + i + ": ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.print("Enter " + n + " elements: ");
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.print("Enter key element to search: ");
            int key = sc.nextInt();

            // Linear Search
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] == key) {
                    index = j;
                    break;
                }
            }

            System.out.println("Result: " + index);
        }

        sc.close();
    }
}
