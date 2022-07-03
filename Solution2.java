public class Solution2 {
    public long maxRunTime(int n, int[] batteries) {
        long left = 0;
        long right = 0;
        for (int b : batteries) {
            right += b;
        }
        right = right / n;
        while (left < right) {
            long mid = (right - left + 1) / 2 + left;
            long sum = 0L;
            for (int battery : batteries) {
                sum += Math.min((long) battery, mid);
            }

            if (sum >= n * mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
