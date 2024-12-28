public class JavaArrays1 {
    public String average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        return String.format("%.2f", avg);
    }

    public static void main(String[] args) {
        JavaArrays1 obj = new JavaArrays1();
        System.out.println(obj.average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(obj.average(new int[]{2, 55, 85, 656, 52, 554, 545, 5, 2}));
    }
}
