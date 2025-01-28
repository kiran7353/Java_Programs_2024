package Arrays_Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given List of Strings Encode it into a Single String and Decode it to List of Strings.
 * Ensure that the encoding and decoding is done correctly.
 *
 */
public class EncodeAndDecode_Strings {


    private static String strencode(List<String> list) {
        StringBuilder sb =new StringBuilder();
        for(String s:list){
            int i=0;
            while(i<s.length()){
                if(s.charAt(i)==';'){
                    sb.append("/;");
                } else if (s.charAt(i)=='/') {
                    sb.append("//");
                }else{
                    sb.append(s.charAt(i));
                }
                i++;
            }
            sb.append(";");
        }
        return sb.toString();
    }

    private static List<String> decodeStr(String encodedStr) {
        List<String> l = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<encodedStr.length()){
            if(encodedStr.charAt(i)=='/'){
                sb.append(encodedStr.charAt(i+1));
                i+=2;
            } else if (encodedStr.charAt(i)!=';') {
                sb.append(encodedStr.charAt(i));
                i++;
            }else{
                l.add(sb.toString());
                sb.setLength(0);
                i++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        List<String> list= List.of(new String[]{"Kiran", "K","a;b/c"});
        String encodedStr=strencode(list);
        System.out.println("Encoded String :"+encodedStr);
        List<String> output=decodeStr(encodedStr);
        System.out.println("Decoded List of Strings :"+output);
    }
}