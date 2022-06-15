public class BinarySearch {

    //psvm to walk through binary search problem
    public static void main(String[] args) {
        int[] nums = {-1,3,5,7,9,1000};
        int targ = 13;
        int res = search(nums, targ);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
        // corner case
        if (nums == null || nums.length == 0) return -1; //check corner case
        int left = 0; //use variable for beginning and end of array (left and right)
        int right = nums.length - 1;
        while (left <= right) { //while left is still on the left there are still possible results to search for
            int mid = left + (right - left) / 2; //way of finding mid
            if (nums[mid] == target) return mid; //if solution found return it
            if (nums[mid] > target) right = mid - 1; //if set right to mid - 1(this means the end of the section now being examined is mid-1)
            else left = mid + 1; //else set left to be mid + 1 means the latter half is being examined
        }
        return -1; //if it is not found then -1 is returned.

    }
}
