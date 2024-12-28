import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSwitchCase {
    static double switchCase(int choice, List<Double> arr) {
        double result = 0;
        if (arr.isEmpty()) {
            System.out.println("The list is empty. Please provide valid input.");
            return result;
        }
        switch (choice) {
            case 1:
                double r = arr.get(0); // First element is radius for circle
                result = Math.PI * Math.pow(r, 2);
                break;
            case 2:
                if (arr.size() < 2) {
                    System.out.println("Not enough elements for length and breadth.");
                    return result;
                }
                double l = arr.get(arr.size() - 2); // Second last element is length for rectangle
                double b = arr.get(arr.size() - 1); // Last element is breadth for rectangle
                result = l * b;
                break;
            default:
                System.out.println("Invalid choice.");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (1 for Circle Area, 2 for Rectangle Area):");
        int choice = sc.nextInt();

        List<Double> arr = new ArrayList<>();
        arr.add(5.0);
        arr.add(10.0);
        arr.add(20.0);

        double result = switchCase(choice, arr);
        System.out.println("Result: " + result);

        sc.close();
    }
}
