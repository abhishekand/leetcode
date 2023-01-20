class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int mid = len / 2;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums = new int[len];
        while (k <= mid) {
            if (i < len1 && j < len2) {
                if (nums1[i] < nums2[j]) {
                    nums[k] = nums1[i];
                    i++;
                } 
                else
                {
                    nums[k] = nums2[j];
                    j++;
                }
            } 
            else if (i < len1) {
                nums[k] = nums1[i];
                i++;
            } else if (j < len2) {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (len % 2 == 0) {
            return (nums[mid] + nums[mid - 1]) / 2.0;
        } else 
        {
            return nums[mid];
        } 
    }
}