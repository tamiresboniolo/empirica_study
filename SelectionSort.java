package empiricalstudy;

/**
 *
 * @author Tamires D Boniolo
 */
public class SelectionSort {

    public static void  selectionSort(int[] array) 
    {
        int startScan; //starting position of the scan
        int index; //to hold a subscript value
        int minIndex; //element with smallest value in the scan
        int minValue; //the smallest value found in the scan

        //the startScan marks the position where the scan should begin
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            //assume the first element in the scannable area is the smallest value
            minIndex = startScan;
            minValue = array[startScan];

            //scan the array starting in the second element in
            //the scannable area. We are looking for the smallest value in the scannable area
            for (index = startScan + 1; index < array.length - 1; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            //swap the element with the smallest value
            //with the first element in the scannable area
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
}
