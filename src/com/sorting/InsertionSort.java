package com.sorting;

public class InsertionSort<E extends Comparable<E>> {

    public void insertionSortAlgorithm(E[] array){
        int length=array.length;
        for(int i=1;i<length;i++){
            E element=array[i];
            int j=i-1;
            while (j>=0 && (array[j].compareTo(element))>0) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=element;
        }
        sortingDisplay(array);
    }

    public void sortingDisplay(E[] array){
        System.out.println("\nsorting array:");
        for(E i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        String[] array={"7","2","5","1","8"};
        System.out.println("array before sort:");
        for(String i:array){
            System.out.print(i+" ");
        }
        InsertionSort<String> insertionSort=new InsertionSort<>();
        insertionSort.insertionSortAlgorithm(array);


    }
}

