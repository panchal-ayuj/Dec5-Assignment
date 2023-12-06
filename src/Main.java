import java.util.Arrays;

public class Main {
    static int n = 10;
    static int size = 10;

    public static int[] addElement(int arr[], int x){
        int i = 0;
        // adding 0 case
        if(size>=n){
            int newarr[] = new int[2*n];
            for(i=0; i < n/2; i++)
                newarr[i] = arr[i];
            newarr[i] = x;
            size = i+1;
            n = n*2;
            return newarr;
        } else {
            arr[size] = x;
            size++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("INIT Array: " + Arrays.toString(arr));
        int x = 0;
        arr = addElement(arr, x);
        System.out.println("Final Array: " + Arrays.toString(arr));
        int x2 = 60;
        arr = addElement(arr, x2);
        System.out.println("Final Array: " + Arrays.toString(arr));
    }
}