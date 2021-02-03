//给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。 
//
// 
//
// 示例： 
//
// 
//输入：[1,12,-5,-6,50,3], k = 4
//输出：12.75
//解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= n <= 30,000。 
// 所给数据范围 [-10,000，10,000]。 
// 
// Related Topics 数组 
// 👍 130 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int kSum = 0;
        for (int i = 0; i < k; i++) {
            kSum += nums[i];
        }
        int maxSum = kSum;
        for (int i = k; i < nums.length; i++) {
            kSum = kSum - nums[i - k] + nums[i];
            maxSum = Math.max(kSum, maxSum);
        }
        return 1.0*maxSum/k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
