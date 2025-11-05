package Strings;

public class ConvertCase {
    public static void main(String[] args) {
        String str = "HarIpRAsaTh";
        String result = "";

        for (char ch : str.toCharArray()){
            if(ch > 'Z') result += (char) (ch - 32);
            else result += (char) (ch + 32);
        }

        System.out.println(str + "< --- >" + result);
    }
}
