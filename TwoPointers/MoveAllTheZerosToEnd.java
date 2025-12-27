package TwoPointers;

public class MoveAllTheZerosToEnd {
    public static void moveZerosToEnd(int[] arr){
        int i = 0;
        int j = 0;
        while(i < arr.length - 1){
            if(arr[i] != 0){
                i++;
            }
            else{
                break;
            }
        }
        j = i;
        i++;
        while(i < arr.length){
            if(arr[i] != 0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
                i++;
            }
            else{i++;}
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZerosToEnd(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
