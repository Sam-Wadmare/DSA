import java.util.Scanner;
public class quicksort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array : ");  
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high ) {
            int pindex = partition(arr,low,high);
            quicksort(arr, low, pindex - 1 );
            quicksort(arr,pindex + 1, high);
        }
    }
    public static int   partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low ;
        int j = high;
          while(i<j){
            while (arr[i] <= pivot && i <high){
                i++;
            }
            while (arr[j] > pivot && j >= low){
                j--;
            }
            if(i < j) {
               swap(arr,i,j);
            }
          }
          swap(arr,low,j);
          return j;

    }
    public static void swap(int [] arr,int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}
