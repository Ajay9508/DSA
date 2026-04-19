import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        mergeSort(nums, start, end);
        return nums;
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        // left subarray
        mergeSort(arr, start, mid);
        // right subarray
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start, right = mid + 1, index = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // remaining left part
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // remaining right part
        while (right <= end) {
            temp[index++] = arr[right++];
        }

        // copy back to original array
        index = 0;
        while (start <= end) {
            arr[start++] = temp[index++];
        }
    }
}