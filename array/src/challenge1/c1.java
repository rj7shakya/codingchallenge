package challenge1;

import java.util.HashMap;
//sum to k (challenge 1)
public class c1 {
    public static void main(String[] args) {
        int[] arr= new int[]{1,5,7,-1,5};
        System.out.println(getPair(arr,6));
    }

    public static int getPair(int arr[], int sum){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],0);
            }
            hm.put(arr[i],hm.get(arr[i])+1);
        }

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(hm.get(sum-arr[i]) != null){
                System.out.println(arr[i]+"+"+(sum-arr[i])+'='+sum);
                count += hm.get(sum-arr[i]);
            }
            if(sum-arr[i] == arr[i]){
                count --;
            }
        }
        return count/2;
    }
}
