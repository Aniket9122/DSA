package BinarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        int k = 6;
        int lb = LowerAndUpperBound.lowerBound(nums, k);
        int ub = LowerAndUpperBound.upperBound(nums, k);

        if (lb == nums.length || nums[lb] != k) {
            System.out.println("Element not present.");
        } else {
            System.out.println("First Occurance : " + lb + " Last Occurance : " + (ub - 1));
        }
    }
}
