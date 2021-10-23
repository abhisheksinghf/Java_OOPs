public class Arrays {
    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,5};
        int arr[] = {1,3,4,5,7,0};//to avoid error of array Index out of bound exception we use arrayName.length
        int n = arr.length;
        int i;
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
