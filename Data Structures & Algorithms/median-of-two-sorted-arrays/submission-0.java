class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smaller = nums1.length >= nums2.length ? nums2 : nums1;
        int[] larger  = nums1.length >= nums2.length ? nums1 : nums2;

        int total = nums1.length + nums2.length;

        int l = 0, r = smaller.length;

        while (l <= r) {
            int px = (l + r) / 2;
            int py = (total + 1) / 2 - px;

            int l1 = px == 0 ? Integer.MIN_VALUE : smaller[px - 1];
            int r1 = px == smaller.length ? Integer.MAX_VALUE : smaller[px];

            int l2 = py == 0 ? Integer.MIN_VALUE : larger[py - 1];
            int r2 = py == larger.length ? Integer.MAX_VALUE : larger[py];

            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } 
            else if (l1 > r2) {
                r = px - 1;
            } 
            else {
                l = px + 1;
            }
        }

        return 0;
    }
}
