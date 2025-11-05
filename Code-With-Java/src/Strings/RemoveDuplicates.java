package Strings;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hariprasath";
        Set<Character> st = new HashSet<>();
        String result = "";

        for(char ch : str.toLowerCase().toCharArray()){
            if(!st.contains(ch)){
                result += ch;
                st.add(ch);
            }
        }

        System.out.println("The word without duplicate Letters " +result);
    }
}
