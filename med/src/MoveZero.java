public class MoveZero {

    static void push(int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while (count<arr.length){
            arr[count++] =0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,9,6,0,3,4,0};
        push(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
