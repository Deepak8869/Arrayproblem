public class Array2 {
    public static void main(String[] args) {
        int arr[] = { 5,13,44,55,66};
        System.out.println(findmin(arr));
    }
    static int findmin(int [] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
