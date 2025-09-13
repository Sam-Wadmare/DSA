public class insertionsort{
    public static void main(String[] args) {
        java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the array: ");  
        int n = scn.nextInt();
        scn.nextLine(); // consume leftover newline
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        InsertionSort(arr, n);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scn.close();
    }

    public static void InsertionSort(int[] arr, int n) {
        for(int i = 1;i<=n-1;i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;

            }
            arr[j+1] = key;
        }
    }
}