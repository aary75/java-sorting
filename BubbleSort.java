// Creating the BubbleSort class to sort integers according to bubble sort
import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input
        
        System.out.print("Enter the size of array: ");    
        int size = scanner.nextInt();
        
        int[] arr = new int[size];  // initialization of array
        for(int i = 0; i< size; i++){
            arr[i] = scanner.nextInt(); 
        }
        
        boolean swapped;   // to checked swapping is happening or not
        System.out.print("Array before sorting:\n");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        
        for(int i = 0; i< size - 1; i++){
            swapped = false;
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1]){   // comparison of integers
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                    swapped = true;
                }
            }
        if(!swapped) break;
        }
        
        
        System.out.print("\nArray after swapping:\n");
        for(int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}



// Enter the size of array: 10
// 3
// 76
// 5
// 3
// 8
// 90
// 78
// 11
// 2
// 134
// Array before sorting:
// 3 76 5 3 8 90 78 11 2 134 
// Array after swapping:
// 2 3 3 5 8 11 76 78 90 134 
