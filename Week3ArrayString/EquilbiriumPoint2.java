package Week3ArrayString;

public class EquilbiriumPoint2 {
    // approach 1
    public static int equlibirium1(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int leftSum = 0, rightSum = 0;

            for(int j=0; j<i; j++){
                leftSum += arr[j];
            }

            for(int j=i+1; j<n; j++){
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    // approach 2
    public static int equlibirium2(int arr[]){
        int n = arr.length;

        int preSum[] = new int[n];
        preSum[0] = arr[0];
        for(int i=1; i<n; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        int totalSum = preSum[n-1];
        for(int i=0; i<n; i++){
            int leftSum = (i == 0) ? 0 : preSum[i-1];
            int rightSum = totalSum - preSum[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    // approach 3
    public static int equlibirium3(int arr[]){
        int n = arr.length;
        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i=0; i<n; i++){
            totalSum -= arr[i]; // now total sum is right sum
  
            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(" Equilibirium : " + equlibirium1(arr));
        System.out.println(" Equilibirium : " + equlibirium1(arr));
        System.out.println(" Equilibirium : " + equlibirium3(arr));
    }
}
