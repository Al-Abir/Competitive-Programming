package Sorting;

public class Counting {
    public static void main(String[] args) {
        
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        // Step 1: Find the largest element
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Frequency calculation
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3: Sorting using frequency array
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {  // Changed 'if' to 'while'
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Step 4: Print the sorted array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
