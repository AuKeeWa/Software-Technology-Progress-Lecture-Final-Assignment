import java.util.Arrays;

public class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long sum = 0;
        for(int i:batteries){
            sum+=i;
        }
        for (int i = batteries.length-1; i >=0 ; i--) {
            if(batteries[i] > sum/n){

            }
        }
        return 0;
    }
}
