public class InfArrrSearch {
    public static int searchInfArr(int[] arr, int target){
        int start = 0;
        int end = 1;
        try {
            while (target > arr[end]) {
                int temp = start;
                start = end + 1;
                end = end + (end - temp + 1) * 2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            
            end = start + (end - start) / 2; 
        }
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid-1;
            }            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,24,26};
        int num = 18;
        System.out.println(searchInfArr(arr, num));
    }
}
