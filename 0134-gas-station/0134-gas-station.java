class Solution {
    public int canCompleteCircuit(int[] gas,int[] cost) {
        int g=0;
        int c=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(g<c)
            return -1;
        return start;
    }
}