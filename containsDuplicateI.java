import java.util.HashSet;
import java.util.Scanner;

class containsDuplicateI {
    public boolean containsDuplicateI(int[] nums) {
        //  Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;
   
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        containsDuplicateI solution = new containsDuplicateI();
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (separated by spaces):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        boolean hasDuplicate = solution.containsDuplicateI(nums);
        System.out.println("The array " + (hasDuplicate ? "contains" : "does not contain") + " duplicates.");
        
        scanner.close();
    }
}