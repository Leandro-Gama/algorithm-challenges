class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n, indexM=0, indexN=0;
        int[] merged = new int[size];

        // Verificar se o valor m[i] > n[i], mas tem que existir o m[i] e o n[i]

        for (int i = 0; i < size; i++) {
            if (m <= indexM)
                merged[i] = nums2[indexN++];
            else if (n <= indexN)
                merged[i] = nums1[indexM++];
            else if (nums1[indexM] < nums2[indexN])
                merged[i] = nums1[indexM++];
            else
                merged[i] = nums2[indexN++];
        }
        for (int i = 0; i < size; i++) {
            nums1[i] = merged[i];
        }
    }
}