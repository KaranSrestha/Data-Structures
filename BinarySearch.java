public class BinarySearch {
    public static int bSearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] < num){
                //shift the left pointer
                left = mid + 1;
            }else{
                //shift the right pointer
                right = mid - 1;
            }
        }
        return -1; //not found
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,43,5,7,10};
        int num = 8;  //number to be searched
        int i = bSearch(arr, num);
        System.out.println(i);
    }
}
