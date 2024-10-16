//Ceiling value of a number means the number just greater than or wual to the number present in array

public class CeilingOfaNum {
    public static int celingOfNum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        boolean isAscen = true;
        if(arr[left] > arr[right]) isAscen = false;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] > target){
                if(isAscen) right = mid-1;
                else left = mid + 1;
            }else{
                if(isAscen) left = mid + 1;
                else right = mid - 1;
            }
        }
        return isAscen?arr[left]:arr[right]; //if number is not present then the number just greater than target is in the left pointer
    }
    public static void main(String[] args) {
        int []arr = {50, 20, 15, 11, 5};
        int c_value = celingOfNum(arr, 14);
        System.out.println(c_value);
    }
}
