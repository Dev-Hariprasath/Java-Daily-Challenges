package ShristiAcademy.Strings;

public class Palindrome {
    public static void main(String[] args) {

        String s = "abbac";
        String r = "";

        for(int i = s.length() - 1; i >= 0; i--){
            r += s.charAt(i);
        }

        System.out.println(s.equals(r) ? "Palindrome" : "Not a Palindrome");
    }
}
