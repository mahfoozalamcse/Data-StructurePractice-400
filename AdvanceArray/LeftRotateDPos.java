public class LeftRotateDPos {

    // left rotate by d posion array time O(N) space O(d)
    public static void leftRotateDPos1(int arr[], int d, int n){
        
        int temp[] = new int[n]; 
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }

    }

    // approch 2 using shifting
    // helper method
    public static void leftRotateOne(int arr[],int n){
        int temp = arr[0];
       
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }

       arr[n-1] = temp;
    }

    public static void leftRotateDPos2(int arr[], int d, int n){
          for (int i = 0; i < d; i++) {
               leftRotateOne(arr, n);
          }
    }

    // approch 3 solution use traversal  
    // helper reverse method

    public static void reverse(int arr[], int first, int last){
        

        while (first < last) {
            int temp = arr[first];
                arr[first] = arr[last];
                arr[last]  = temp;

                first++;
                last--;
        }
    }

   // main method
   public static void leftRotateDPos3(int arr[], int d, int n){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
   }
    

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      int d = 2;
      int n = 5;
    //   leftRotateDPos1(arr, d, n);
    //   printArray(arr);

        //  leftRotateDPos2(arr, d, n);
        //  printArray(arr);

        leftRotateDPos3(arr, d, n);
        printArray(arr);

    }
}
