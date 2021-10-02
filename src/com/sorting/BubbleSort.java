package com.sorting;

public class BubbleSort {

    public void bubbleSort(int array[]){
        int length=array.length;
        for(int i=0;i<length-1;i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp=array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        displaySort(array);
    }
    public void displaySort(int array[]){
        System.out.println("\narray after sort:");
        for(int k:array){
            System.out.print(k+" ");
        }
    }

    public static void main(String[] args){
        int[] array={74,99,12,3,78,9};
        System.out.println("array before sort:");
        for(int i:array){
            System.out.print(i+" ");
        }
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSort(array);
    }

}
