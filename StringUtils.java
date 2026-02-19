package week05;
import java.util.Arrays;

public class StringUtils{
    public static String reverse(String s) { 
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.substring(beginIndex: 0, i+1));
        }
        return sb.toString();
    }

    public static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);

    }

    public static boolean anagram(String s1, String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);

        return n_s1.equals(n_s2);
    }

    public static String swap(String s) {
        StringBuilder sb= new StringBuilder();
        String[] s_array=s.split(regex:" ");
        for(int i=0;i<s_array.length;i++){
            char[] c=s_array[i].toCharArray();
            char temp=c[0];
            c[0] = c[c.length-1];
            c[c.length-1]=temp;
            sb.append(c);
            sb.append(str:" ");
        }

    }

    public static void main(String[] args) {
        String s1= "";
        System.out.println(sort(s1));

        
    }
}