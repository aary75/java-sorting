// Creation of InsertionSort class to sort the array using insertion sort
import java.util.*;

class InsertionSort {
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
        
        for(int i = 1; i< size; i++){
            int curr = arr[i];
            int prev = i - 1;
            
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
             
        System.out.print("\nArray after insertion sorting:\n");
        for(int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


// Enter the size of array: 10
// 5
// 8
// 78
// 698
// 55
// 8
// 975
// 82
// 9
// 45
// Array before sorting:
// 5 8 78 698 55 8 975 82 9 45 
// Array after insertion sorting:
// 5 8 8 9 45 55 78 82 698 975 
