public class JavaRelationalOperator {
    static void relationalOperators(int A,int B){
        if (A > B) {
            System.out.println(A +" is greater than " + B);
        } else if (A < B) {
            System.out.println(A + " is less than " + B);
        } else {
            System.out.println(A + " is equal to " + B);
        }
    }

    public static void main(String[] args) {
        int a = 90;
        int b = 5;
        relationalOperators(a, b);
    }
}
