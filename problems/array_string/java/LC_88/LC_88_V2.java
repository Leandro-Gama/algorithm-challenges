class SolutionV2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexM = m - 1;
        int indexN = n - 1;
        int indexMerged = m + n - 1;

        while(indexN >= 0){
            if (indexM >= 0 && nums1[indexM] > nums2[indexN])
                nums1[indexMerged--] = nums1[indexM--];
            else
                nums1[indexMerged--] = nums2[indexN--];
        }
    }
}