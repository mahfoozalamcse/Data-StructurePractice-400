public class LeaderinArray {
    
    
    // Leader in array Neive method O(n^2) 
    public static void leader(int arr[]){

        for (int i = 0; i < arr.length; i++)  {
            boolean flag = false;
             for (int j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
             }
             if (flag == false) {
                System.out.print(arr[i]+" ");
             }
        }
        
    }

    // efficient method find leader in array
    // but print output from last 
    public static void printLeader(int arr[]){
        int n = arr.length;
        int curr_leader = arr[n-1];
        System.out.print(curr_leader+" ");

        for (int i = n-2; i >= 0; i--) {
            if (curr_leader < arr[i]) {
                curr_leader = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }

    
    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 6, 5, 2};
        printArray(arr);
        System.out.println();
        leader(arr);

        System.out.println();
        printLeader(arr);

    }
}
