import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs for car brands
        ArrayList<String> cars = new ArrayList<>();
        System.out.print("How many car brands you want to enter? ");
        int carCount = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < carCount; i++) {
            System.out.print("Enter car brand " + (i + 1) + ": ");
            String brand = sc.nextLine();
            cars.add(brand);
        }

        // User inputs for numbers
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("\nHow many numbers you want to enter? ");
        int numCount = sc.nextInt();

        for (int i = 0; i < numCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num.add(sc.nextInt());
        }

        // Iterate through numbers and remove 4
        System.out.println("\nNumbers (removing 4):");
        Iterator<Integer> nums = num.iterator();
        while (nums.hasNext()) {
            int n = nums.next();
            if (n == 4) {
                nums.remove();
            } else {
                System.out.println(n);
            }
        }

        // Iterate through car brands
        System.out.println("\nCar Brands:");
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close(); // close the scanner
    }
}
