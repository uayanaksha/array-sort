package com.arraysort;

import java.util.Arrays; 
import java.util.Random; 
class SortAlgorithms{
    public static void bubbleSort(int[] array){
        int size = array.length, tmp;
        for(int i = 0; i < size - 1; i++){
            for(int j = i+1; j < size; j++){
                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int[] array){
        int size = array.length, minIdx, tmp;
        for(int i = 0; i < size - 1; i++){
            minIdx = i;
            for(int j = i+1; j < size; j++){
                if(array[j]<array[minIdx]) 
                    minIdx = j;
            }
            if (i != minIdx){
                tmp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = tmp;
            }
        }
    }

    public static void insertionSort(int[] array){
        int size = array.length, key;
        for(int i = 0; i < size; i++){
            key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }   j++;
            array[j] = key;
        }
    }

   public static void mergeSort(int[]array){
       mergeSortRec(array, 0, array.length-1);
   } 

   private static void mergeSortRec(int[]array, int start, int end){
       if(start>=end) return;
       int mid = start + (end - start)/2;
       mergeSortRec(array, start, mid);
       mergeSortRec(array, mid+1, end);
       merge(array, start, mid, end);
   }

   private static void merge(int[]array, int start, int mid, int end){
       int[] larr = Arrays.copyOfRange(array, start, mid+1);
       int[] rarr = Arrays.copyOfRange(array, mid+1, end+1);
       int i, j, k;
       for(i = 0, j = 0, k = start; i < larr.length && j < rarr.length; k++){
           if(larr[i]<=rarr[j]){
               array[k] = larr[i];
               i++;
           } else {
               array[k] = rarr[j];
               j++;
           }
       }
       while(i<larr.length){
           array[k] = larr[i];
           i++;
           k++;
       }
       while(j<rarr.length){
           array[k] = rarr[j];
           j++;
           k++;
       }
   }

   public static void quickSort(int[] array){
       quickSortRec(array, 0, array.length - 1);
   }
   
   private static void quickSortRec(int[] array, int start, int end){
       if(start>=end) return;
       int pivot = partition(array, start, end);
       quickSortRec(array, start, pivot-1);
       quickSortRec(array, pivot+1, end);
   }

   private static int partition(int[] array, int low, int high){
       int randIdx = low + new Random().nextInt(high - low + 1);
       int pivot = array[randIdx], i = low - 1, j = low, temp;
       temp = array[randIdx];
       array[randIdx] = array[high];
       array[high] = temp;
       while(j < high){
           if(array[j]<pivot){
               i++;
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
           }    j++;
       }
       ++i;
       temp = array[i];
       array[i] = array[high];
       array[high] = temp;
       return i;
   }
}
