package Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        System.out.println("The Reversed String is " +reversedStr);
    }
}
