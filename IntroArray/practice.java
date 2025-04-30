public class practice {

    // search element 
    public static int search(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    // push element at end of the array
    
    public static void main(String[] args) {
       int arr[] = {12, 89, 90, 9, 77};
       int x = 9;
       System.out.print("Element present at => "+search(arr, x));
       System.out.println();
    }
}
