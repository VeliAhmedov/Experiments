package Phase4.array;

public class BubbleSortAlgorithm {
    public static void bubbleSort(int[] array, int length) {
        int i,j;
        int temp;
        boolean swapped;
        for (i =0; i < length -1; i++) {
            swapped = false;
            for (j = 0; j < length - i -1 ; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped ==false){
                break;
            }
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void bubbleSortDescend(int[] array, int length) {
        int i, j;
        int temp;
        boolean swapped;
        for (i = 0; i < length - 1; i++) {  // -1 because we compare with j+1
            swapped = false;
            for (j = 0; j < length - i - 1; j++) {  // -i because after each pass, the last i elements are sorted
                if (array[j] < array[j+1]) {  // Changed < to > for descending order
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {  // Can keep !swapped or swapped == false
                break;
            }
        }
    }
}
