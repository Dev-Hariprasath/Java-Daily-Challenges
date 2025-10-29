package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter str 1 : ");
        String s = sc.nextLine();

        System.out.println("Enter Str 2 :");
        String r = sc.nextLine();
        int l = s.length();

         if(s.length() == r.length()){
             char[] arr1 = s.toCharArray();
             Arrays.sort(arr1);
             char[] arr2 = r.toCharArray();
             Arrays.sort(arr2);

             for(int i = 0; i < l; i++){
                 if(arr1[i] != arr2[i]){
                     System.out.println("Not a anagram");
                     System.exit(1);
                 }
             }

             System.out.println("Anagram");
         } else {
             System.out.println("Not a Anagram");
         }

    }
}
