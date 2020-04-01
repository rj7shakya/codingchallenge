import java.util.Arrays;

public class Common {
    static String CommnPrefix(String[] str){
        if(str.length==0){
            return "";
        }
        if(str.length==1){
            return str[0];
        }
        Arrays.sort(str);

        int end = Math.min(str[0].length(), str[str.length-1].length());

        int i=0;
        for( i=0;i<end;i++){
            if(str[0].charAt(i) == str[str.length-1].charAt(i)){
                i++;
            }
        }
        return str[0].substring(0,i);
    }

    public static void main(String[] args) {
        Common c = new Common();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(c.CommnPrefix(input));
    }
}
