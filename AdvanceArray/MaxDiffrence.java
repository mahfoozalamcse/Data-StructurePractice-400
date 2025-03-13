public class MaxDiffrence {

    // Neive approch time O(n^2)
  public static int maxDiffrence(int arr[]){
     
    int maxDiff = arr[1] - arr[0];
    for(int i=0; i<arr.length; i++){ 
        
        for(int j=i+1; j<arr.length; j++){
             
           maxDiff = Math.max(maxDiff, arr[j] - arr[i]); 
        }
    
    } 
    return maxDiff;
  }

  // efficient method time O(n) use minimal element
  public static int maxDiffrence2(int arr[]){
    int n = arr.length;
    int res = arr[1]- arr[0];
    int minValue = arr[0];

    for (int j = 1; j < n; j++) {
        res = Math.max(res, arr[j]-minValue);
    
        minValue = Math.min(minValue, arr[j]);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = {2, 3, 10, 6, 4, 8, 1};
    System.out.print(maxDiffrence(arr)+" ");
    System.out.println(maxDiffrence2(arr));
  }
}
