import java.util.Arrays;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {12,2,3,1,30};

        // method one - brute force
        // TC - O(nlogn)
        // SC - O(1)
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        // method two - comparison
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
