package Problems;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void isAnagram(String str1,String str2){
        boolean status=true;
        if(str1.length()!=str2.length()){
            status=false;

        }
        else{
            char[] array1=str1.toLowerCase().toCharArray();
            char[] array2=str2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            for(int i=0;i< array1.length;i++){
                if(array1[i]!=array2[i]){
                    status= false;
                }
            }
        }
        if(status){
            System.out.println(str1+" and "+str2+" is anagram ");
        }
        else{
            System.out.println(str1+" and "+str2+" is not anagram ");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first string:");
        String str1= scanner.next();
        System.out.println("enter second string:");
        String str2= scanner.next();
        isAnagram(str1,str2);
    }
}
