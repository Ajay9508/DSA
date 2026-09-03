class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        int oddCount = 0, evenCount = 0;

        for (int x : nums1) {
            if (x % 2 == 0) {
                evenCount++;
                minEven = Math.min(minEven, x);
            } else {
                oddCount++;
                minOdd = Math.min(minOdd, x);
            }
        }

        // Agar saare elements already odd ya even hain
        if (oddCount == nums1.length || evenCount == nums1.length) {
            return true;
        }

        // Agar minOdd < minEven, tabhi saare elements ko odd banaya ja sakta hai
        return minOdd < minEven;
    }
}