package com.sorting;

public class MergeSort {

    public static void merge(String[] array,int start,int mid,int end){
        int left=mid-start+1;
        int right=end-mid;

        String[] leftArray=new String[left];
        String[] rightArray=new String[right];

        for (int i=0;i<left;i++)
           leftArray[i]=array[start+i];

        for(int j=0;j<right;j++){
            rightArray[j]=array[mid+1+j];
        }
        int i=0,j=0;
        int k=start;
        while(i<left && j<right){
            if(leftArray[i].compareTo(rightArray[j])<0){
                array[k]=leftArray[i];
                i++;
            }
            else {
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<left){
            array[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<right){
            array[k]=rightArray[j];
            j++;
            k++;
        }
    }



    public void merging(String[] array,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            merging(array,start,mid);
            merging(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }

    public static void main(String[] args){

        String[] array={"90","23","10","45","65","93","67","89","34","43"};
        System.out.println("array before sort:");
        for(String i:array){
            System.out.print(i+" ");
        }
        MergeSort mergeSort=new MergeSort();
        mergeSort.merging(array,0,array.length-1);
        System.out.println("\nsorted array:");
        for (String j:array) {
            System.out.print(j+" ");
        }
    }



}
