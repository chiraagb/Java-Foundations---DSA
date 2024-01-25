import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before: "+Arrays.toString(arr));

        reverse(arr,size);
        System.out.println("After: "+Arrays.toString(arr));

    }

    static void reverse(int[] arr, int size){
        int i = 0;
        int j = size-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
