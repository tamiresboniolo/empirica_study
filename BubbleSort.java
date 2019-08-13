
package empiricalstudy;

/**
 *
 * @author Tamires D Boniolo
 */
public class BubbleSort {
    
    /**
     * Bubble sort method
     * @param array to sort
     */
    public static void bubbleSort(int[] array) {
        int lastPos; //position of the last element to compare
        int index; //index of an element to compare
        int temp; //used to swap to elements

        //the outer loop positions lastPos at the last element
        //to compare during each pass through the array. Initially
        //lastPos is the index of the last element in the array.
        //during each iteration, it is decresed by one.
        for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {
            
            //the inner loop steps through the array, comparing
            //each element with its neighbor. All of the elements
            //from index 0 through lastPos are involved in the
            //comparison. If two elements are out of order, they are swapped.
            for (index = 0; index <= lastPos - 1; index++) {
                
                //compare an element with its neighbor
                if (array[index] > array[index + 1]) {
                    //swap the two elements
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }
}
