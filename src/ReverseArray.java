import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;
        for(int i=0; i<halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
    }
}
