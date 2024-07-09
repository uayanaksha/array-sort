package com.arraysort;
import java.util.Arrays; 
class TestSortAlgorithms{
    interface Algo {
        void execute(int[] array);
    }

    private static void testing(int[] array, Algo algo){
        int[] copy = Arrays.copyOf(array, array.length);
        algo.execute(copy);
        System.out.println(Arrays.toString(copy));
    }

    public static void main(String[] args){
        int[] array = {11, 5, 6, 16, 0, -2, 7, 17, -11, 3, -8, 23, 14, -13};
        System.out.println(Arrays.toString(array));
        Algo[] algos = {
            SortAlgorithms::bubbleSort,
            SortAlgorithms::selectionSort,
            SortAlgorithms::insertionSort,
            SortAlgorithms::mergeSort,
            SortAlgorithms::quickSort,
            SortAlgorithms::countingSort,
        };
        for (Algo algo: algos){
            testing(array, algo);
        }
    }
}
