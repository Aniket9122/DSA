package Recursion;

import java.util.ArrayList;

public class SubSequenceWithSumK {

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static void printSequence(int index, int sum, ArrayList<Integer> arr, int seq[]) {
        if (sum(arr) == sum) {
            System.out.println("[");
            for (int element : arr) {
                System.out.println(element);
            }
            System.out.println("]");
        } else if (index < seq.length) {
            arr.add(seq[index]);
            printSequence(index + 1, sum, arr, seq);
            arr.removeLast();
            printSequence(index + 1, sum, arr, seq);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int seq[] = { 1, 1, 1 };
        printSequence(0, 3, arrayList, seq);
    }
}
