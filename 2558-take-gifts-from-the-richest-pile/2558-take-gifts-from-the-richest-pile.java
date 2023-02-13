import java.util.Arrays;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        for(int i=1; i<=k; i++)
        {
            int x=gifts.length-1;
            if(gifts[x]==1)
            {
                break;
            }
            int y=(int)(Math.sqrt(gifts[x]));
            gifts[x]=y;
            Arrays.sort(gifts);
        }
        long result=0;
        for(int i = 0; i< gifts.length; i++)
        {
            result += gifts[i];
        }
        return result;
    }
}