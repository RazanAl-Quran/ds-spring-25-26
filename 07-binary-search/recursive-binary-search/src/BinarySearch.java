// Java implementation of recursive Binary Search
class BinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1

    // int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                "Element " + x + " is not present in array");
        else
            System.out.println(
                "Element " + x + " is present at index " + result);
    }
}
/* This code is contributed by Rajat Mishra */