import java.util.Arrays;

public class Merge {
    public static void srtMerge(int[] arrA, int[] arrB){
        int [] srtMergeArr = merge(arrA, arrB);
        bubbleSort(srtMergeArr, arrA.length);
        for(int num: srtMergeArr) {
            System.out.print(num + " ");
        }
    }

    private static int[] merge(int[] arrA, int[] arrB) {
        int capacity = arrA.length;
        int[] mergedArr = new int[capacity];
        Arrays.sort(arrA);
        for (int i = 0; i < capacity; i++) {
            mergedArr[i] = arrA[i];
        }
        Arrays.sort(arrB);
        for (int i = 0; i < arrB.length; i++) {
            if (mergedArr[i] == 0) {
                mergedArr[i] = arrB[i];
            }
        }
        return mergedArr;
    }

    private static void bubbleSort(int[] arr, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) {
            for (inner = 0; inner < outer; inner++) {
                if (arr[inner] > arr[inner + 1]) {
                    temp = arr[inner + 1];
                    arr[inner + 1] = arr[inner];
                    arr[inner] = temp;
                }
            }
        }
    }
}
