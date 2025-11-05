package Strings;

public class Permutations {
    public static void main(String[] args) {
        String str = "hariprasath";

        for(int i = 0; i < str.length(); i++){
            String st = "";
            for (int j = i; j < str.length(); j++){
                st += str.charAt(j);
                System.out.println(st);
            }
        }
    }
}
