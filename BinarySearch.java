public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 5;
        int result = bs(nums, target); // Calling the binary search function

        if (result != -1) {
            System.out.println("Element found at Index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int bs(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow by calculating mid this way

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // If target is not found, return -1
    }
}

