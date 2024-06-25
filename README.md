# Array Sorting Algorithms

File Structure:
```
array-sort/
├── README.md
├── out
│   ├── SortAlgorithms$Algo.class
│   ├── SortAlgorithms.class
│   └── com
│       └── arraysort
│           ├── SortAlgorithms.class
│           ├── TestSortAlgorithms$Algo.class
│           └── TestSortAlgorithms.class
├── run.sh
├── src
│   └── main
│       └── java
│           └── com
│               └── arraysort
│                   └── SortAlgorithms.java
└── test
    └── java
        └── com
            └── arraysort
                └── TestSortAlgorithms.java
```

## Bubble Sort

* *Description*: Sort by comparing each adjacent pair of items in a list in turn, swapping the items if necessary, and repeating the pass through the list until no swaps are done. 
* *Time complexity*: O(n^2^)
* *Space complexity*: O(1)

## Selection Sort

* *Description*: A sort algorithm that repeatedly searches remaining items to find the least one and moves it to its final location.
* *Time complexity*: O(n^2^)
* *Space complexity*: O(1)

## Insertion Sort

* *Description*: A sort algorithm in which the sorted items occupy the same storage as the original ones. These algorithms may use o(n) additional memory for bookkeeping, but at most a constant number of items are kept in auxiliary memory at any time. 
* *Time complexity*: O(n^2^)
* *Space complexity*: O(1)

## Merge Sort

* *Description*: A sort algorithm that splits the items to be sorted into two groups, recursively sorts each group, and merges them into a final, sorted sequence. 
* *Time complexity*: O(n log n)
* *Space complexity*: O(n)

## Quick Sort 

* *Description*: Pick an element from the array (the pivot), partition the remaining elements into those greater than and less than this pivot, and recursively sort the partitions. There are many variants of the basic scheme above: to select the pivot, to partition the array, to stop the recursion or switch to another algorithm for small partitions, etc. 
* *Time complexity*:  O(n log n); O(n^2^) [Worst]
* *Space complexity*: O(log n); O(n) [Worst]

