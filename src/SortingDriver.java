
import java.util.Random;

/**
 * SortingDriver driver for testing an object selection sort.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class SortingDriver
{       
        int start,stop,elapsed;
        
	/**
	 * Creates an array of Integer objects, sorts them, then 
	 * outputs the elapsed time and total number of comparisons
	 */
	public static void main(String[] args)
	{
            int number = 1000;
            long start,end,elapsed;
            Integer[] selectionData;
            Integer[] insertionData;
            Integer[] bubbleData;
            Integer[] quickData;
            Integer[] mergeData;
            Integer [] data = new Integer[number];
            Random generator = new Random();
            
            for (int i = 0; i<data.length;i++){
                data[i] = generator.nextInt(10);
            }

            selectionData = data.clone();
            insertionData = data.clone();
            bubbleData = data.clone();
            quickData = data.clone();
            mergeData = data.clone();
            
//            for (Integer element : data)
//                    System.out.print(element + " ");
//            System.out.println(" ");
            
            start = System.currentTimeMillis(); // get starting time
            Sorting.selectionSort(selectionData);
            end = System.currentTimeMillis(); // get starting time
            elapsed = end - start;
            System.out.println("Selection elapsed time is " + elapsed + " ms");
            System.out.println("Comparisons are " + Sorting.comparisons);
            
            start = System.currentTimeMillis(); // get starting time
            Sorting.insertionSort(insertionData);
            end = System.currentTimeMillis(); // get starting time
            elapsed = end - start;
            System.out.println("Insertion elapsed time is " + elapsed + " ms");
            System.out.println("Comparisons are " + Sorting.comparisons);
                      
            start = System.currentTimeMillis(); // get starting time
            Sorting.bubbleSort(bubbleData);
            end = System.currentTimeMillis(); // get starting time
            elapsed = end - start;
            System.out.println("Bubble elapsed time is " + elapsed + " ms");
            System.out.println("Comparisons are " + Sorting.comparisons);
            
            start = System.nanoTime(); // get starting time
            Sorting.quickSort(quickData);
            end = System.nanoTime(); // get starting time
            elapsed = (end - start)/1000000;
            System.out.println("Quick elapsed time is " + elapsed + " ms");
            System.out.println("Comparisons are " + Sorting.comparisons);
           
            start = System.nanoTime(); // get starting time
            Sorting.mergeSort(mergeData);
            end = System.nanoTime(); // get starting time
            elapsed = (end - start)/1000000;
            System.out.println("Merge elapsed time is " + elapsed + " ms");
            System.out.println("Comparisons are " + Sorting.comparisons);
                        
//            for (Integer element : mergeData)
//                    System.out.print(element + " ");
//            System.out.println(" ");
	}
}

