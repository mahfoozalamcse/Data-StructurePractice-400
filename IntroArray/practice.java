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
    public static void push(int arr[], int x){
       
        arr[arr.length-1]= x;

    }

    // push at given location
    public static int push2(int arr[],int pos, int x){
       int n = arr.length;
       for (int i = n-1; i > pos; i--) {
        
          arr[i] = arr[i-1];
          
       }
       if (pos >= 0  && pos < n) {
        arr[pos] = x;
      }
       
       return n;

    }

    public static void main(String[] args) {
    //    int arr[] = {12, 89, 90, 9, 77};
    //    int x = 9;
    //    System.out.print("Element present at => "+search(arr, x));
    //    System.out.println();

    // int arr[] = new int[5];
    //  arr[0] = 12;
    //  arr[1] = 13;
    //  arr[2] = 14;
    //  arr[3] = 15;
     
    //  int x  = 17;

    //  push(arr, x);

    //  for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i]+" ");
    //  }
    // System.out.println();

     int arr[] = new int[5];
     arr[0] = 12;
     arr[1] = 13;
     arr[2] = 14;
     arr[3] = 15;

     int pos = 2;
     int x = 9;
     System.out.println(push2(arr, pos, x));
     
     for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
     }
      System.out.println();

}

}
