public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int prearr[] = new int[n];
        int suffarr[] = new int[n];
        prearr[0] = arr[0];
        suffarr[n-1] = arr[n-1];
        for(int i = 1;i<n;i++){
            prearr[i] = prearr[i-1] * arr[i];
        }
        for(int i = n-2 ; i>=0;i--){
            suffarr[i] = suffarr[i+1]*arr[i];
        }
        int[] ans = new int[n];

        ans[0] = suffarr[1];
        ans[n-1] = prearr[n-2];

        for(int i = 1;i<n-1;i++){
            ans[i] = prearr[i-1] * suffarr[i+1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] result = productExceptSelf(new int[]{10, 3, 5, 6, 2});
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
