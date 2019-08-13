package empiricalstudy;

/**
 *
 * @author Tamires D Boniolo
 */
public class QuickSort {

    /**
     * 
     * @param array
     * @param start of the list
     * @param end of the list
     */
    public static void doQuickSort(int[] array, int start, int end) {
                
        int pivotPoint;

        if (start < end) {
            //get the pivot point
            pivotPoint = partition(array, start, end);

            //sort the left sublist
            doQuickSort(array, start, pivotPoint - 1);

            //sort the right sublist
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    /**
     * 
     * @param array
     * @param start of the list
     * @param end of the list
     * @return the pivot value
     */
    private static int partition(int[] array, int start, int end) {
        int pivotValue; //to hold the pivot value
        int endOfLeftList; //last element in the left sublist
        int mid; //to hold the mid-point subscript

        //find the middle point. It will be the pivot
        mid = (start + end) / 2;

        //swap the middle element with the first element (pivot to the start of the list)
        swap(array, start, mid);

        //save the pivot value for comparisons
        pivotValue = array[start];

        endOfLeftList = start;

        //scan the entire list and move the values 
        //that are less than the pivot value to the left
        for (int scan = start + 1; scan <= end; scan++) {
            if (array[scan] < pivotValue) {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }
        //move the pivot to the end of the left
        swap(array, start, endOfLeftList);

        //return the pivot value
        return endOfLeftList;

    }

    /**
     * Swap the values found in any two elements of the array
     * @param array
     * @param a
     * @param b 
     */
    private static void swap(int[] array, int a, int b) {
        int temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
