public int[] rotateLeft3(int[] nums) {
  int n = nums[0];
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = n;
  return nums;
}
