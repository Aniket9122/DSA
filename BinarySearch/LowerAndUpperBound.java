package BinarySearch;

public class LowerAndUpperBound {
    public static int lowerBound(int nums[], int k) {
        int lb = nums.length;
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] >= k) {
                lb = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return lb;
    }

    public static int upperBound(int nums[], int k) {
        int ub = nums.length;
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > k) {
                ub = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ub;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        System.out.println("Lower Bound : " + lowerBound(nums, 8));
        System.out.println("Upper Bound : " + upperBound(nums, 8));
    }
}
