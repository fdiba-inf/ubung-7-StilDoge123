package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
            System.out.println();
        }
        for (int line = n; line >= 0; line--) {
            printLine(1, line - 1);
            System.out.println();
        }

    }

    public static void printLine(int start, int end) {
        for(int i = start; i <= end; i++)
        {
            System.out.print(i + " ");
        }
    }
}
