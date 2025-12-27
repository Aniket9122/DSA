package PrefixSums;

public class EqualSidesOfAnArray {
    //BruteForce
//     public static int sum(int[] arr, int start, int end){
//         int sum = 0;
//         for(int i = start; i< end; i++){
//             sum = sum + arr[i];
//         }
//         return sum;
//     }
//     public static int findEvenIndex(int[] arr) {

//         int l = 0;
//         int r = arr.length - 1;
//         int sumLeft;
//         int sumRight;
//         for(int i = 0; i < arr.length; i++){
//             sumLeft = sum(arr,l,i);
//             sumRight = sum(arr,i+1,r+1);

//             if(sumLeft == sumRight){
//                 return i;
//             }
//         }

//         return -1;
//   }

//Optimal
    public static int findEvenIndex(int[] arr) {

        int total = 0;

        for(int i : arr){
            total = total + i;
        }

        int sumLeft = 0;
        int sumRight;
        for(int i = 0; i < arr.length; i++){
            sumRight = total - sumLeft - arr[i];
            if(sumLeft == sumRight){
                return i;
            }
            sumLeft = sumLeft + arr[i];      
        }

        return -1;
    }

  public static void main(String[] args) {
    int index = findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094});
    System.out.println(index);
  }
}
