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
            if (abbr.charAt(ptr2)<='0' || abbr.charAt(ptr2)>='9'){
                return false;
            }

            int start = ptr2;
            while (ptr2 < abbr.length()
                    && abbr.charAt(ptr2)>='0'&& abbr.charAt(ptr2)<='9') {
                ptr2++;
            }
            int num = Integer.valueOf(abbr.substring(start,ptr2));
            System.out.println(num);
            ptr1 +=num;
//            System.out.println(ptr1+' '+ptr2);

        }
        System.out.println(ptr1);
        System.out.println(ptr2);
        return ptr1==s.length() && ptr2==abbr.length();
    }


    public static void main(String[] args) {
        String s = "apple", abbr = "a2e";
        System.out.println(valid(s,abbr));

    }
}
