public class FloorOfnum {
    public static int calculateFloorValue(int[]arr, int target){
        int left = 0;
        int right = arr.length - 1;
        boolean isAscen = true;

        if(arr[left] > arr[right]){
            isAscen = false;
        }
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                if(isAscen) left = mid+1;
                else right = mid - 1;
            }else{
                if(isAscen) right = mid-1;
                else left = mid + 1;
            }
        }
        return isAscen?arr[right]:arr[left];
    }
    public static void main(String[] args) {
        int []arr = {1,3,5,7,15,16};
        int f_value = calculateFloorValue(arr, 14);
        System.out.println(f_value);
    }
}
