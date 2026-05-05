// Java program for implementation of Insertion Sort

// Time O(n^2) Space O(1)

// Credit goes to  https://www.geeksforgeeks.org/insertion-sort/

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        // int arr[] = { 12, 11, 13, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;          
            while (j >= 0 && arr[j] > currentValue) { 
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        // int n = 5;
        // System.out.println(n++);
        // System.out.println(n);
        // System.out.println(++n);
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
};


/* This code is contributed by Rajat Mishra. */
