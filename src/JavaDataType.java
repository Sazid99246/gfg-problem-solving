import java.util.Scanner;

public class JavaDataType {
    int javaIntType(Scanner sc) {
        return sc.nextInt();
    }

    String javaStringType(Scanner sc) {
        sc.nextLine(); // Consume the leftover newline character
        return sc.nextLine();
    }

    float javaFloatType(Scanner sc) {
        return sc.nextFloat();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaDataType javaDataType = new JavaDataType();

        int intValue = javaDataType.javaIntType(sc);
        String stringValue = javaDataType.javaStringType(sc);
        float floatValue = javaDataType.javaFloatType(sc);
        System.out.println(intValue);
        System.out.println(stringValue);
        System.out.println(floatValue);

        sc.close(); // Close the scanner to free resources
    }
}
