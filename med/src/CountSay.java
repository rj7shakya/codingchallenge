public class CountSay {

    static String count(int n){
        if (n == 1)     return "1";
        if (n == 2)     return "11";
        String str = "11";
        for(int i=3;i<=n;i++){
            str+='$';
            int len = str.length();
            int cnt =1;
            String tmp ="";
            char[] arr = str.toCharArray();

            for(int j=1;j<len;j++){
                if(arr[j] != arr[j-1]){
                    tmp +=cnt+0;
                    tmp +=arr[j-1];
                    cnt=1;
                }
                else cnt++;

            }
            str = tmp;

        }
        return str;
    }

    public static void main(String[] args) {
        int N = 7;
        System.out.println(count(N));
    }
}

//1  one 1 =11
//11 two 1 =21
//21 one2 one1 =1211
//1211 one1 one2 two1 = 111221