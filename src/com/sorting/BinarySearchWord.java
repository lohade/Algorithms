package com.sorting;
import java.util.Scanner;

public class BinarySearchWord<T extends Comparable<T>> {
    public int binarySearchWord(T[] array,T word){
        int left=0;
        int length=array.length;

        while (left<length){
            int middle=left+(length-left)/2;
            int result= word.compareTo(array[middle]);

            if(result==0)
                return middle;

            if(result>0){
                left=middle+1;
            }
            else
                length=middle-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array={"integer","array","string","float","double"};
        BinarySearchWord<String> binarySearchWord=new BinarySearchWord<>();
        System.out.println("enter word to be search");
        String word=scanner.next();
        int res=binarySearchWord.binarySearchWord(array,word);
        if(res==-1){
            System.out.println("word is not present");
        }
        else
            System.out.println(word+" is present in list at:"+res);
    }
}
