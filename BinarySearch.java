public class BinarySearch {
    //for ascending order
    public static int bSearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2; //left+right may go out of range of integers
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
    public static int orderAgnosticBS(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;

        boolean isAscen = true;
        if(arr[left] > arr[right]){
            isAscen = false;
        }

        while(left <= right){
            int mid = left + (right-left)/2; //left+right may go out of range of integers
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] < num){
                //shift the left pointer
                if(isAscen) left = mid + 1;
                else right = mid - 1;
            }else{
                //shift the right pointer
                if(isAscen) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4};
        int num = 1;  //number to be searched
        int i = orderAgnosticBS(arr, num);
        System.out.println(i);
    }
}
