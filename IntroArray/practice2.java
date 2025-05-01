public class practice2 {
   
    // largest element value
    public static int largest(int arr[]){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      return max;
    }

    // second largest
    public static int secLarge(int arr[]){
        int largest = largest(arr);
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (largest == arr[i]) {
                continue;
            }
            if (arr[i] > max && arr[i] <largest) {
                max = arr[i];
            }

        }
        return max;
    }

    // Reverse array
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // remove duplicate from sorted array
    public static int removeDuplicate(int arr[]){
        int res = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }

        }
        return res;
    }


    // remove last duplicate
    public int removeDuplicatesExceptLast(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[res++] = nums[i];
            }
        }

        // Always include the last element
        nums[res++] = nums[nums.length - 1];

        // If the last element was a duplicate of the element before it,
        // we need to potentially reduce the count.
        if (res > 1 && nums[res - 1] == nums[res - 2]) {
            // Check if there were more occurrences of this last element.
            // If so, we keep only one.
            int lastUniqueIndex = res - 2;
            while (lastUniqueIndex >= 0 && nums[lastUniqueIndex] == nums[res - 1]) {
                lastUniqueIndex--;
            }
            if (lastUniqueIndex < res - 2) {
                // Shift the last element to the correct unique position
                nums[lastUniqueIndex + 1] = nums[res - 1];
                res = lastUniqueIndex + 2;
            }
        }

        return res;
    }

    // left rotate by one
    public static void leftRotateByOne(int arr[]){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    // left rotate by D nive approach
    public static void leftRotateByD(int arr[], int d){
       int n = arr.length;
        // create space
       int temp[] = new int[d];
        
       // loop d to length store temp
       
       for (int i = 0; i < d; i++) {
           temp[i] = arr[i];
           
       }
       // loop d to n and store in array
       for(int i=d; i<n; i++){
           arr[i-d] = arr[i];
           
       }

       // copy
       for (int i = 0; i < temp.length; i++) {
            arr[n-d+i] = temp[i];
        
    // int n = arr.length;
    // int temp[] = new int[n];

    // // Copy the first d elements to temp
    // for (int i = 0; i < d; i++) {
    //     temp[i] = arr[i];
    // }

    // // Shift the remaining elements of arr to the left
    // for (int i = d; i < n; i++) {
    //     arr[i - d] = arr[i];
    // }

    // // Copy the first d elements from temp to the end of arr
    // for (int i = 0; i < d; i++) {
    //     arr[n - d + i] = temp[i];
       }
    }


    // method 2
    public static void leftRotateD(int arr[], int d){
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);
        }
    }

    // method 3
    public static void leftRotate3(int arr[], int d){
        int n = arr.length;
        reverse1(arr, 0, d);
        reverse1(arr, d, n-1);
        reverse1(arr, 0, n-1);
    }

    // support function leftRotate3
    public static void reverse1(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // print array
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
  public static void main(String[] args) {
    int arr[] = {78, 78, 90, 98, 99};
    // System.out.println();
    // System.out.println(largest(arr));


    // System.out.println(); 
    // System.out.print(secLarge(arr));

    // reverse(arr);
    // print(arr);
    // System.out.println();
    // System.out.println(removeDuplicate(arr));
    // print(arr);

    // leftRotateByOne(arr);
    // print(arr);

    // leftRotateByD(arr, 2);
    // print(arr);

    // leftRotateD(arr, 3);
    // print(arr);

    System.out.println();
    leftRotate3(arr, 3);
    print(arr);
    
  }
}
