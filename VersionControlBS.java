public class VersionControlBS {
    //isBadVersion was a boolean supplied in the question
    public int firstBadVersion(int n) {
        if(n == 1) return 1; //controls the 1 length edge case
        //set up my pivot points for the binary search
        int left = 0;
        int right = n - 1;
        //while there are still items to check (left is still left)
        while(left <= right){
            int mid = left + (right - left)/2; //define mid
            if(isBadVersion(mid)){ //check if badversion found
                right = mid - 1; //set as right edge
            } else {
                left = mid + 1; //else move left edge up
            }
        }
        return left + (right - left) /2; //return newly calculated mid val as result 
    }
}
