#!/bin/sh

mkdir -p out
javac -d out src/main/java/com/arraysort/SortAlgorithms.java
javac -d out -cp out test/java/com/arraysort/TestSortAlgorithms.java
java -cp out com.arraysort.TestSortAlgorithms
