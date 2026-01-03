package Recursion;

import java.util.ArrayList;

public class PrintingSubsequences {

    public static void printSubSequence(int n, ArrayList<Integer> arrayList, int seq[]) {
        if (n >= seq.length) {
            System.out.println("[");
            for (int element : arrayList) {
                System.out.println(element);
            }
            System.out.println("]");
        } else {
            arrayList.add(seq[n]);
            printSubSequence(n + 1, arrayList, seq);
            arrayList.removeLast();
            printSubSequence(n + 1, arrayList, seq);
        }
    }

    public static void main(String[] args) {
        int seq[] = { 3, 1, 2 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        printSubSequence(0, arrayList, seq);
    }
}
