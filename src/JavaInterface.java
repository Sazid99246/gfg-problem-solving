import java.util.Scanner;

interface in1 {
    void display(int p);
}

public class JavaInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            testClass p = new testClass();
            p.display(k);

            System.out.println("~");
        }
    }
}

class testClass implements in1 {
    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void display(int k) {
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) count++;
        }
        System.out.println(count);
    }
}
