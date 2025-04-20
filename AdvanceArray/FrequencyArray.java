public class FrequencyArray { 
    
      
  
    // print frequency in sorted array 
    public static void printFrequency(int arr[]){ 
        int freq = 1, i = 1;
        while (i < arr.length) { 
             
         
        while (i < arr.length &&  arr[i] == arr[i-1]) {
            freq++;
            i++;
        }
        System.out.print(arr[i-1] +" " + freq + " ");
        freq = 1;
        i++;
    }

        if (arr.length == 1 || arr[arr.length-1] != arr[arr.length-1]) {
            System.out.print(arr[arr.length-1] + " " + 1);
        }
    }

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) {
     int arr[] = {10, 10, 20, 20, 20, 30, 30, 30};
     printFrequency(arr);
   } 
}
