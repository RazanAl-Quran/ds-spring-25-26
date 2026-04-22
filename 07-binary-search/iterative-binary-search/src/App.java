public class App {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        // int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate middle index to avoid integer overflow
            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid; // Found the target, return its index
            } else if (arr[mid] < target) {
                low = mid + 1; // Discard left half
            } else {
                high = mid - 1; // Discard right half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) throws Exception {

        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 91;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
