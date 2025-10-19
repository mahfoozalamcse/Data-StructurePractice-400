package Week3ArrayString;
public class MissingNum4 {

   public static int missingNum(int arr[]) {
       // approach 1
    /*
      Arrays.sort(arr);
      int count = 1; 
      for(int i=0; i<arr.length; i++){
          if(arr[i] != count){
              return count;
          }
          
          count++;
      }
      
      
      return count;
      
      */

      // approach 2
      
        int i=1,s=0,t=0;
        
        while(i<=arr.length+1)
        {
            s+=i;
            i++;
        }
        for(int j=0;j<arr.length;j++)
        {
            t+=arr[j];
        }
        return s-t;
    }

    // approach 3
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

    // approach 4
    // xor to find missing
    /*
     * a ^ a = 0;
     * a ^ 0 = a;
     * a ^ b ^ c = c ^ b ^ a;
     */
    public static int missingNum3(int arr[]){
        int n = arr.length;
        int xor1 = 0, xor2 = 0;

        // xor for all 1 to n number
        for(int i=1; i<=n+1; i++){
            xor1 ^= i;
        }

        // xor for all element
        for(int num : arr){
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Answer missing number : "+ missingNum2(arr));
         System.out.println("Answer missing number xor : "+ missingNum3(arr));
    }
}
