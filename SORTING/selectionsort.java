
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");  
        int n = scn.nextInt();
        scn.nextLine(); // consume leftover newline
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
      
        SelectionSort(arr,n);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scn.close();
    }
    public static void SelectionSort(int arr[],int n) {

        for (int i = 0; i <= n-1; i++) {
            int minindex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
                
            }
            int temp = arr[minindex];
                arr[minindex]= arr[i];
                arr[i] = temp;
        }

    }
}
