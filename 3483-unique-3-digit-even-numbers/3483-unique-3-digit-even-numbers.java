class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;
        for (int num = 100; num <= 998; num += 2) {
            int d1 = num / 100;       // Hundreds place
            int d2 = (num / 10) % 10; // Tens place
            int d3 = num % 10;        // Units place
            int[] req = new int[10];
            req[d1]++;
            req[d2]++;
            req[d3]++;
            boolean canForm = true;
            for (int i = 0; i < 10; i++) {
                if (req[i] > freq[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                count++;
            }
        }

        return count;
    }
}