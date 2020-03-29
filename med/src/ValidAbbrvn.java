public class ValidAbbrvn {

    static boolean valid(String s, String abbr){
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1<s.length() && ptr2<abbr.length()){
            if(s.charAt(ptr1) == abbr.charAt(ptr2)){
                ptr1++;
                ptr2++;
                continue;
            }
            if (abbr.charAt(ptr2)>='0' && abbr.charAt(ptr2)<='9'){
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s = "internationalization", abbr = "i12iz4n";


    }
}
