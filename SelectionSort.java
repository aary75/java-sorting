// Creating the class SelectionSort to sort array by selection sort
import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input
        
        System.out.print("Enter the size of array: ");    
        int size = scanner.nextInt();
        
        int[] arr = new int[size];  // Initialization of array
        for(int i = 0; i< size; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Array before sorting:\n");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        
        for(int i = 0; i< size - 1; i++){
            for(int j = i+1 ; j < size ; j++){
                if(arr[i] > arr[j]){   //Comparison of elements
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
             
        System.out.print("\nArray after selection sorting:\n");
        for(int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// Enter the size of array: 10
// 1
// 54
// 789
// 654
// 89
// 6
// 8
// 78
// 98
// 2
// Array before sorting:
// 1 54 789 654 89 6 8 78 98 2 
// Array after selection sorting:
// 1 2 6 8 54 78 89 98 654 789 
