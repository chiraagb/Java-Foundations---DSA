import java.util.Arrays;

public class Array_Methods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        // get an element
        System.out.println(arr[3]);

        // set
        arr[2] = 91;
        System.out.println(Arrays.toString(arr));

        // length
        System.out.println(arr.length);

        // traverse
        for (int i=0;i< arr.length;i++){
            System.out.println("arr["+ i + "] = " +arr[i]);
        }

    }
}