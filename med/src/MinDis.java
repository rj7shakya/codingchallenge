public class MinDis {

//    static int dist(String s, String w1, String w2){
//        if(w1.equals(w2)){
//            return 0;
//        }
//        String words[] = s.split(" ");
//        int mindist = words.length+1;
//
//        for (int i=0;i<words.length;i++){
//            if(words[i].equals(w1)){
//                for(int j=0;j<words.length;j++){
//                    if(words[j].equals(w2)){
//                        int d = Math.abs(i-j)-1;
//                        if(d<mindist){
//                            mindist=d;
//                        }
//                    }
//                }
//            }
//        }
//        return mindist;
//    }

    static int dist(String s, String w1, String w2){
        if(w1.equals(w2)){
            return 0;
        }
        String words[] = s.split(" ");
        int mindist = words.length+1;
        int i=0,j=0;
        for(i=0;i<words.length;i++){
            if (words[i].equals(w1) || words[i].equals(w2)) {
                j = i;
                break;
            }
        }
        while (i < words.length) {
            if (words[i].equals(w1) || words[i].equals(w2)) {
                if ((!words[j].equals(words[i])) && (i - j) < mindist) {
                    mindist = i - j - 1;
                    j = i;
                } else {
                    j = i;
                }

            }
            i += 1;

        }
        return mindist;

    }

    public static void main(String[] args) {
        String s = "geeks for geeks contribute practice";
        String w1 = "geeks" ;
        String w2 = "practice" ;

        System.out.print( dist(s, w1, w2) );
    }
}
