
package empiricalstudy;
import java.util.Random;

/**
 *
 * @author Tamires D Boniolo
 */

/*
QuickSort Computed in 18 seconds
QuickSort Computed in 0 minutes

Selection Sort Computed in 265 seconds
Selection Sort Computed in 4 minutes

Bubble Sort Computed in 1549 seconds
Bubble Sort Computed in 25 minutes

QuickSort for 100000000 Computed 532800 in seconds
QuickSort for 100000000 Computed 8880 in minutes
//1.48 hour
*/

public class EmpiricalStudy {

    public static void main(String[] args) {

        //creating 3 arrays
        int[] array1 = new int[1000000];
        int[] array2 = new int[1000000];
        int[] array3 = new int[1000000];
        int[] array4 = new int[100000000];
        
        Random r = new Random();

        for (int i = 1; i < array1.length; i++) {
            array1[i] = r.nextInt(1000000)+1;
            System.out.print(array1[i] + "  ");
        }
        
        for (int i = 1; i < array4.length; i++) {
            array4[i] = r.nextInt(Integer.MAX_VALUE)+1;
            System.out.print(array4[i] + "  ");
        }

         array2 = array1.clone();
         array3 = array1.clone();
         
            //Recursive Fibonacci Timer
            //QuickSort    
            long currentTime = System.currentTimeMillis();
            long previousTime;
            long elapsedTime;
                 /* 
            previousTime = currentTime;
            System.out.print("The Quicksort term at position ");
            QuickSort.doQuickSort(array1, 0,array1.length-1);
            System.out.println();

            currentTime = System.currentTimeMillis();
            
            //elapsedTime in seconds
            elapsedTime = (currentTime - previousTime) / 1000; //Second
            System.out.println("QuickSort Computed in " + elapsedTime + " seconds");
            System.out.println("QuickSort Computed in " + elapsedTime/60 + " minutes");
            
           
             // SelectionSort
            currentTime = System.currentTimeMillis();
            previousTime=0;
            elapsedTime=0;
        
            previousTime = currentTime;
            System.out.print("The  Selection Sort term at position ");
            SelectionSort.selectionSort(array2);
            System.out.println();

            currentTime = System.currentTimeMillis();
            
            //elapsedTime in seconds
            elapsedTime = (currentTime - previousTime) / 1000; //Second
            System.out.println("Selection Sort Computed in " + elapsedTime + " seconds");
            System.out.println("Selection Sort Computed in " + elapsedTime/60 + " minutes");
                  
            
            //Bubble Sort
            currentTime = System.currentTimeMillis();
            previousTime=0;
            elapsedTime=0;
        
            previousTime = currentTime;
            System.out.print("The Bubble Sort term at position ");
            BubbleSort.bubbleSort(array3);
            System.out.println();

            currentTime = System.currentTimeMillis();
            
            //elapsedTime in seconds
            elapsedTime = (currentTime - previousTime) / 1000; //Second
            System.out.println("Bubble Sort Computed in " + elapsedTime + " seconds");
            System.out.println("Bubble Sort Computed in " + elapsedTime/60 + " minutes");
              */
             //QuickSort for 100000000
            currentTime = System.currentTimeMillis();
            previousTime=0;
            elapsedTime=0;
                  
            previousTime = currentTime;
            System.out.print("The Quicksort term at position ");
            QuickSort.doQuickSort(array4, 0,array4.length-1);
            System.out.println();

            currentTime = System.currentTimeMillis();
            
            //elapsedTime in seconds
            elapsedTime = (currentTime - previousTime) / 1000; //Second
            System.out.println("QuickSort for 100000000 Computed in " + elapsedTime + " seconds");
            System.out.println("QuickSort for 100000000 Computed in " + elapsedTime/60 + " minutes");
            
           

    }
}
