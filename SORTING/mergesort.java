import java.util.Scanner;


public class mergesort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        mergesort(0,arr.length - 1, arr);

        System.out.println("Sorted array : ");
       for (int num  : arr) {
           System.out.print(num + " ");
       }

    }
    static void mergesort(int low,int high, int[] arr) {
        if(low >= high) {return;}
        int mid = ( low +high )/2;
        mergesort(low,mid,arr);
        mergesort(mid +1,high,arr);
        merge(low,mid,high,arr);
    }
    static void merge(int low, int mid, int high, int[] arr) {
        int left = low;
        int right = mid+1;
        int[] temp = new int[high - low + 1];
        int k =0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++]= arr[left];
                left++;
            } else {
                temp[k++] = arr[right];
                right++;
            }
        }
        while(left <=mid){
            temp[k++] = arr[left];
            left++;
        }
        while (right <= high){
            temp[k++]= arr[right];
            right++;
        }
       for (int i = 0; i < temp.length; i++) {
    arr[low + i] = temp[i];  // offsetting by `low` so it lands in the right place
       }

    }
}

