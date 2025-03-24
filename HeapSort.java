// Creating the HeapSort to sort the elements using heap sort
import java.util.*;

public class HeapSort {
    public static void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    // print array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array you want: ");
        int size = scanner.nextInt();
        
        int arr[] = new int[size];
        
        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Array before sorting: ");
        printArray(arr);
        
        HeapSort ob = new HeapSort();
        sort(arr);
 
        System.out.print("Array after heap sorting: ");
        printArray(arr);
    }
}


// Enter the size of array you want: 10
// 1
// 53
// 54
// 8
// 96
// 1
// 5
// 85
// 86
// 74
// Array before sorting: 1 53 54 8 96 1 5 85 86 74 
// Array after heap sorting: 1 1 5 8 53 54 74 85 86 96 
