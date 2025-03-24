// Creating the CountSort class to sor the array using counting sort
import java.util.*;

public class CountingSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        // find maximum element
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

         // array to count the number of each element
        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }

    public static void main(String[] args) {
        
        // Scanner class to get user's input 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Array before sorting: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        
        int[] outputArray = countSort(arr);

        System.out.print("\nArray after counting sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}


// Enter the size of array: 10
// 1
// 55
// 7
// 8
// 99
// 5
// 77
// 5
// 66
// 32
// Array before sorting: 1 55 7 8 99 5 77 5 66 32 
// Array after counting sorting: 1 5 5 7 8 32 55 66 77 99 
