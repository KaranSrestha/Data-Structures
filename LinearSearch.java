public class LinearSearch{
    public static int linearSearch(int[]arr, int num){
        for(int i=0; i < arr.length; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,43,5,7,10};
        int num = 5;
        int i = linearSearch(arr, num);
        System.out.println(i);
    }
}