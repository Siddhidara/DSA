import java.util.*;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0;
        for(int i=citations.length-1;i>=0;i--)
        {
            count++;
            if(count>citations[i])
            {
                return count-1;
            }
        }
        return count;
    }
}