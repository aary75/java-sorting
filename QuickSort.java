//Creating the QuickSort classs to sort the array using quick sort
import java.util.*;

class QuickSort {

    public static int quick(int[] arr, int start, int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        
        while(i < j){
            while(arr[i] <= pivot && i <= end - 1){
                i++;
            }
            
            while(arr[j] >= pivot && j >= start + 1){
                j--;
            }
            
            if(i < j){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        
        int tem = arr[start];
        arr[start] = arr[j];
        arr[j] = tem;
        return j;
    }

    public static void quickSort(int[] arr,int start,int end){
        if(end > start){
            
            int pIndex = quick(arr, start, end);
            
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }
    
    public static void main(String[] args) {
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
        
        quickSort(arr,0,size-1);   // calling the function for quick sorting
        
        System.out.print("\nArray after quick sorting: ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}



// Enter the size of array: 10
// 5
// 8
// 45
// 55
// 88
// 9
// 66
// 4
// 12
// 36
// Array before sorting: 5 8 45 55 88 9 66 4 12 36 
// Array after merge sorting: 4 5 8 9 12 36 45 55 66 88 
