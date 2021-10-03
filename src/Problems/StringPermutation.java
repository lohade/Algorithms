package Problems;


import java.util.Scanner;

public class StringPermutation {

        //string permute method to check string length and recursive permute method
        public  void stringPermute(String str) {
            if (str == null || str.length() == 0)
                return;
            permutation(str.toCharArray(), 0);
        }

        //swap method to interchange the character at pos i and j
        public static void swap(char[] array, int i, int j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // compute the char permute method
        public static void permutation(char array[], int index) {
            if (index == array.length - 1)
                System.out.println(String.valueOf(array));
            for (int i = index; i < array.length; i++) {
                swap(array, index, i);
                permutation(array, index + 1);
                swap(array, index, i);
            }
        }

        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            StringPermutation permutation=new StringPermutation();
            System.out.println("enter string to find permutation");
            String str= scanner.next();
            permutation.stringPermute(str);


        }
    }


