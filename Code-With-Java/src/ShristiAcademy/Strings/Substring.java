package ShristiAcademy.Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "Hariprasath";
        String subString = "aria";

        int ptr = 0;
        int pivot = 0;
        boolean isSubstring = false;

        while (ptr < str.length()) {
            if (str.charAt(ptr) == subString.charAt(pivot)) {
                pivot++;
                if (pivot == subString.length()) {
                    isSubstring = true;
                    break;
                }
            } else {
                if (pivot > 0) {
                    ptr -= pivot;
                }
                pivot = 0;
            }
            ptr++;
        }

        System.out.println(isSubstring ? "Substring" : "Not a Substring");
    }
}
