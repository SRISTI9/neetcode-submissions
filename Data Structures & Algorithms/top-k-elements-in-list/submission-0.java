class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] count = new int[2001];
        for (int n : nums) {
            count[n + 1000]++;
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            int max = 0;
            int index = 0;

            for (int j = 0; j < 2001; j++) {
                if (count[j] > max) {
                    max = count[j];
                    index = j;
                }
            }

            ans[i] = index - 1000;
            count[index] = 0;
        }

        return ans;
    }
}