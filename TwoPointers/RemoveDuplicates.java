package TwoPointers;
public class RemoveDuplicates {
    public void removeDuplicatesFromSortedArray(int[] nums){
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        i++;
        while(i < nums.length){
            nums[i] = -1;
            i++;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1,1,2,2,3,3,3,4};
        removeDuplicates.removeDuplicatesFromSortedArray(nums);
        for(int i = 0; i< nums.length -1; i++){
            System.out.println(nums[i]);
        }
    }
}
