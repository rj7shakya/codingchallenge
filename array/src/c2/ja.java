package c2;
//difference between sums of two diagonals

public class ja {
    public static int difference(int arr[][]){
        int d1=0,d2=0;
        for(int i=0;i<arr.length;i++){
            d1 += arr[i][i];
            d2 += arr[i][arr.length-i-1];
        }
        return Math.abs(d1-d2);
    }

    public static void main(String[] args) {
        int arr[][] = {{11,2,4},
                        {4,5,6},
                        {10,8,-12}};
        System.out.println(difference(arr));
    }
}
