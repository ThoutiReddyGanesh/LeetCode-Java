import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int x: nums) hs.add(x);

        for(int i=1;i<=nums.length+1;i++){
            if(!hs.contains(i))
                return i;
            
        }
        return -1;
    }
}