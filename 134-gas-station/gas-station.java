class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalcost>totalgas)
        {
            return -1;
        }
        int currgas=0;
        int startIdx=0;
        for(int i=0;i<gas.length;i++)
        {
            currgas+=gas[i]-cost[i];
            if(currgas<0)
            {
                startIdx=i+1;
                currgas=0;
            }
        }
        return startIdx;
    }
}