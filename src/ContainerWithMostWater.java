public class ContainerWithMostWater {
    public int maxWater(int arr[]) {
        // Code Here
        if(arr.length==1){
            return 0;
        }
        int i=0;int j=arr.length-1;
        int res=0;
        while(i<j){
            int area=Math.min(arr[i],arr[j])*(j-i);
            res=Math.max(res,area);
            if(arr[i]>arr[j]){
                j--;
            }else if(arr[i]<arr[j]){
                i++;
            }else{
                i++; j--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxWater(new int[]{1, 5, 4, 3}));
        System.out.println(containerWithMostWater.maxWater(new int[]{3, 1, 2, 4, 5}));
        System.out.println(containerWithMostWater.maxWater(new int[]{2, 1, 8, 6, 4, 6, 5, 5}));
    }
}
