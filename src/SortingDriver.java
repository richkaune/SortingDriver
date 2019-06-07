/*
 * SortingDriver.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 1 Question 2
 * This application modifies the Sorting.java class listed in Chapter 18 
 * by adding code to each to tally the total number of 
 * comparisons and total execution time of each algorithm.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * SortingDriver driver for testing an array of Integer objects with various sorts.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class SortingDriver
{       
    // global varibles to be used for execution time
    int start,stop,elapsed;
        
    /**
     * Creates an array of Integer objects, sorts them, then 
     * outputs the elapsed time and total number of comparisons
     */
    public static void main(String[] args)
    {
        // variable declaration area
        int number = 1000;
        long start,end,elapsed;
        Integer[] selectionData;
        Integer[] insertionData;
        Integer[] bubbleData;
        Integer[] quickData;
        Integer[] mergeData;
        String[] values = new String [number];
        Integer [] data = new Integer[number];
        Random generator = new Random();
        
        String fileName= "NonUniqueSortedSortingData.csv";
        File file= new File(fileName);

        // read file contents into Integer array
        try
        {
            Scanner inputStream= new Scanner(file);
            while(inputStream.hasNext())
            {
                String dataRead= inputStream.next();
                values = dataRead.split(",");
                //data = Integer.parseInt(values);
                System.out.println(Arrays.toString(values));
                // convert String array to Integer
                for (int i = 0; i<values.length;i++)
                {
                    data[i] = Integer.parseInt(values[i]);
                }
                //System.out.println(Arrays.toString(data));
            }
            //System.out.println(Arrays.toString(values));
             inputStream.close();
         }
        catch (FileNotFoundException e) 
        {
             e.printStackTrace();
        }
        

        
        //System.out.println(Arrays.toString(values));
        //generate random integers and place them in the array
//        for (int i = 0; i<data.length;i++)
//        {
//            data[i] = generator.nextInt(10);
//        }

        // deep copy the data for each sort
        selectionData = data.clone();
        insertionData = data.clone();
        bubbleData = data.clone();
        quickData = data.clone();
        mergeData = data.clone();

        // print contents of the array prior to sorting
//            for (Integer element : data)
//                    System.out.print(element + " ");
//            System.out.println(" ");

        // access Selection sort and display comparisons and elapsed time
        start = System.currentTimeMillis(); // get starting time
        //Sorting.selectionSort(selectionData);
        end = System.currentTimeMillis(); // get ending time
        elapsed = end - start;
        System.out.println("Selection elapsed time is " + elapsed + " ms");
        System.out.println("Comparisons are " + Sorting.comparisons);

        // access Insertion sort and display comparisons and elapsed time
        start = System.currentTimeMillis(); // get starting time
        //Sorting.insertionSort(insertionData);
        end = System.currentTimeMillis(); // get ending time
        elapsed = end - start;
        System.out.println("Insertion elapsed time is " + elapsed + " ms");
        System.out.println("Comparisons are " + Sorting.comparisons);

        // access Bubble sort and display comparisons and elapsed time
        start = System.currentTimeMillis(); // get starting time
        //Sorting.bubbleSort(bubbleData);
        end = System.currentTimeMillis(); // get ending time
        elapsed = end - start;
        System.out.println("Bubble elapsed time is " + elapsed + " ms");
        System.out.println("Comparisons are " + Sorting.comparisons);

        // access Quick sort and display comparisons and elapsed time
        start = System.nanoTime(); // get starting time
        //Sorting.quickSort(quickData);
        end = System.nanoTime(); // get ending time
        elapsed = (end - start)/1000000;
        System.out.println("Quick elapsed time is " + elapsed + " ms");
        System.out.println("Comparisons are " + Sorting.comparisons);

        // access Merge sort and display comparisons and elapsed time
        start = System.nanoTime(); // get starting time
        //Sorting.mergeSort(mergeData);
        end = System.nanoTime(); // get ending time
        elapsed = (end - start)/1000000;
        System.out.println("Merge elapsed time is " + elapsed + " ms");
        System.out.println("Comparisons are " + Sorting.comparisons);

        // print contents of the array prior to sorting
//            for (Integer element : mergeData)
//                    System.out.print(element + " ");
//            System.out.println(" ");
    }
    
    
}

