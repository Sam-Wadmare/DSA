import java.util.Scanner;
public class reversearray {
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
        scn.nextLine(); // consume leftover newline
        reverseArray(arr, 0, n-1);
        System.out.println("reversed array: ");
        for (int num  : arr) {
            System.out.print(num + " ");
            
        }
    }

    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return ;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1,end-1);
    }
}
