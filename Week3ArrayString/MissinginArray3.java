package Week3ArrayString;

public class MissinginArray3 {
     public static int missingNum2(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
           sum += arr[i];
        }

        int exactSum = ((n+1)*(n+2))/2;

        int diff = exactSum - sum;

        return diff;
    }
    public static void main(String[] args) {
        
    }
}
