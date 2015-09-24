/*
 * Simple text-based user interface for the Counter class.
 * Test Pull Request From Tom- 13012481
 */
package counterapplication;

import java.util.Scanner;

public class CounterApplication {

        public static void main(String[] args) {
        int choice;
        Counter sheep = new Counter();
        FancyCounter goats = new FancyCounter();
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to the Tally Counter application");
        System.out.println("1 = Increment, 2 = Decrement, 3 = Reset, 0 = Exit");
        do {
            System.out.println("Number of sheep = " + sheep);
            System.out.println("Number of goats = " + goats);
            System.out.print("Next action: ");
            choice = stdin.nextInt();
            if (choice == 1) {
                sheep.increment();
                goats.increment();
            } else if (choice == 2) {
                goats.decrement();
            } else if (choice == 3) {
                sheep.reset();
                goats.reset();
            } else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }
}
