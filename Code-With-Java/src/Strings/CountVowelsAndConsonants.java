package Strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "abcdefgh";

        int vowelsCount = 0;
        int consonantsCount = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowelsCount += 1;
            }else {
                consonantsCount += 1;
            }
        }

        System.out.println("Vowels count " + vowelsCount + " Consonants Count " + consonantsCount);
    }
}
