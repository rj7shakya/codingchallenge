package c3;

import java.util.Arrays;

//check if two string are anagram of not
public class challenge3 {
//    method1

//    static boolean Isanagram(char[] str1, char[] str2){
//        int n1 = str1.length;
//        int n2 = str2.length;
//
//        if(n1!=n2){
//            return false;
//        }
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//
//        for(int i=0;i<n1;i++){
//            if(str1[i] != str2[i]){
//                return false;
//            }
//        }
//        return true;
//    }

//    method2
    static int NO_OF_CHARS = 256;

    static boolean Isanagram(char str1[],char str2[]){
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1,0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2,0);

        for(int i=0;i<str1.length && i<str1.length; i++){
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        for(int i=0;i<NO_OF_CHARS;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        char str1[] = { 't', 'e', 'w', 't' };
        char str2[] = { 't', 't', 'e', 'w' };

        System.out.println(Isanagram(str1,str2));
    }
}
