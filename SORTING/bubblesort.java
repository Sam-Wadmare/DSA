import java.util.Scanner;
public class bubblesort {
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
       
        BubbleSort(arr, n);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scn.close();
    }
    static void BubbleSort(int[] arr, int n){
        for(int i = 0 ;i<= n-1;i++){
            boolean swap = false;
            for(int j = 0; j< n-1-i;j++) {  //n-1-i for already sorted elements
                if(arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
}
