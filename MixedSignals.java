package week05;

public class MixedSignals {
    public static String swap (String s) {
        StringBuilder sb = new StringBuilder();
        String[] s_array = s.split(regex: " ");
    for (int i = 0; i < s_array.length; i++) {
        char [] c = s_array[i].toCharArray();
        char temp = c [0];
        c[0] = c[c.length - 1];
        c[c.length - 1] = temp;
        sb. append (c) ;
        sb.append (str:" ");
    }
    return sb.toString();
}
