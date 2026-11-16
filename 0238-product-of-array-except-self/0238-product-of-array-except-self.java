
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        int leftMultiplication = 1;

        // First traversal: Left to right
        for (int i = 0; i < n; i++) {

            answer[i] = leftMultiplication;

            leftMultiplication =
                leftMultiplication * nums[i];
        }

        int rightMultiplication = 1;

        // Second traversal: Right to left
        for (int i = n - 1; i >= 0; i--) {

            answer[i] =
                answer[i] * rightMultiplication;

            rightMultiplication =
                rightMultiplication * nums[i];
        }

        return answer;
    }
}
