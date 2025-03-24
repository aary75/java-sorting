//Creating the MergeSort classs to sort the array using merge sort
import java.util.*;

class Main {
    public static void merge(int[] arr,int start, int end, int mid){
        int len1 = mid - start + 1;
        int len2 = end - mid;
        
        int[] first = new int[len1];
        int[] second = new int[len2];
        
        // add elements of first half of array in new array
        int mainArrayIndex = start;
        for(int i = 0; i<len1; i++){
            first[i] = arr[mainArrayIndex++];
        }
        
        // add elements of second half of array in new array
        mainArrayIndex = mid + 1;
        for(int i = 0;i<len2;i++){
            second[i] = arr[mainArrayIndex++];
        }
        
        // comparing the elements of both arrays
        mainArrayIndex = start;
        int index1 = 0;
        int index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(first[index1] < second[index2]){
                arr[mainArrayIndex++] = first[index1++];
            }
            else{
                arr[mainArrayIndex++] = second[index2++];
            }
        }
        
        // fill the remaining elements into main array
        while(index1 < len1){
            arr[mainArrayIndex++] = first[index1++];
        }
        
        while(index2 < len2){
            arr[mainArrayIndex++] = second[index2++];
        }
    }
    
    public static void mergeSort(int[] arr,int start,int end){
        if(start >= end) return ;
        
        int mid = (end - start)/2 + start;  // finding mid of array
        mergeSort(arr, start, mid);   // divinding the array upto its mid
        mergeSort(arr, mid+1, end);
        
        merge(arr,start,end, mid); // merge both array divided upto theirs mid
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
        
        mergeSort(arr,0,size-1);   // calling the function for merge sorting
        
        System.out.print("\nArray after merge sorting: ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// Enter the size of array: 10
// 1
// 5
// 7
// 7
// 7
// 1
// 22
// 55
// 88
// 14
// Array before sorting: 1 5 7 7 7 1 22 55 88 14 
// Array after merge sorting: 1 1 5 7 7 7 14 22 55 88 
