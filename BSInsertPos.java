public class BSInsertPos {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1; //uses low/high in this example
        while(low<=high){ //searched until left is no longer left (the <= is what makes you able to return low in the end)
            int mid = (low+high)/2; //calc mid
            //check conditions and pivot
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
