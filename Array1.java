//Given an array .find the x exists in array or not...
public class Array1 {
    static int find(int [] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = { 1,13,44,55,66};
        int x = 44;
        System.out.println(find(arr, x));
    }  
}
