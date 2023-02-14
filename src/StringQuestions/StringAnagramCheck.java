package StringQuestions;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagramCheck {
    public static void main(String[] args) {

        String str = "sonu";
        String str1 = "sonu";

       str = str.toLowerCase(Locale.ROOT);
       str1 = str1.toLowerCase(Locale.ROOT);

       if(str.length()==str1.length()){

           char[] strArray = str.toCharArray();
           char[] str1Array = str1.toCharArray();


           //sort car array
           Arrays.sort(strArray);
           Arrays.sort(str1Array);


          boolean result = Arrays.equals(strArray, str1Array);


           if(result) {
               System.out.println(str + " and " + str1 + " are anagram.");
           }
           else {
               System.out.println(str + " and " + str1 + " are not anagram.");
           }
       }
       else {
           System.out.println(str + " and " + str1 + " are not anagram.");
       }

    }
}
