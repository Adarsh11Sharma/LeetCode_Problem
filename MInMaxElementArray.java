
public class MInMaxElementArray {

    // Method to find the maximum element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum element
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 2, 69};
        
        // Using custom methods
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
    }
}