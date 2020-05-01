import java.util.Scanner;

public class MinimumElement {
    public static int[] readIntegers(int count){
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int arr[] = new int[count];
        do{
            System.out.print("Enter a number for " + (counter+1) + ". element : ");
            if(s.hasNextInt()) {
                arr[counter] = s.nextInt();
                counter++;
            } else {
                System.out.println("Wrong type.Please enter the element again.");
                s.nextLine();
            }
        }while(counter<count);
        return arr;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min)  min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr;
        int size;
        boolean control = false;
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Please enter the size of array : ");
            if(s.hasNextInt()){
                size = s.nextInt();
                if(size <= 0) {
                    System.out.println("Size less then or equal 0. Please enter the size again.");
                } else {
                    arr = readIntegers(size);
                    System.out.println("Min element in array : " + findMin(arr));
                    control = true;
                }
            } else {
                System.out.println("Wrong type. Please enter the size again.");
                s.nextLine();
            }
        }while(control == false);
    }
}
