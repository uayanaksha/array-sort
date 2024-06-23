package com.arraysort;
import java.util.Arrays; 
class TestSortAlgorithms{
    interface Algo {
        void execute(int[] array);
    }

    public static void testing(int[] array, Algo algo){
        int[] copy = Arrays.copyOf(array, array.length);
        algo.execute(copy);
        System.out.println(Arrays.toString(copy));
    }

    public static void main(String[] args){
        int[] array = {11, 5, 6, 16, 0, 2, 7};
        System.out.println(Arrays.toString(array));
        Algo[] algos = {
            SortAlgorithms::bubbleSort,
            SortAlgorithms::selectionSort,
            SortAlgorithms::insertionSort,
            SortAlgorithms::mergeSort,
        };
        for (Algo algo: algos){
            testing(array, algo);
        }
    }
}
