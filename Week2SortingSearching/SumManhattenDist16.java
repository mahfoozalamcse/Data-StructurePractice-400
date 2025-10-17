package Week2SortingSearching;
// Sum of Manhattan distances between all pairs of points
// Manhattan Distance between (x1, y1) and (x2, y2) is: |x1 - x2| + |y1 - y2|

import java.util.Arrays;

/*

Input : n = 4, p1 = { -1, 5 }, p2 = { 1, 6 }, p3 = { 3, 5 }, p4 = { 2, 3 }
Output : 22
Explanation : 
Distance of { 1, 6 }, { 3, 5 }, { 2, 3 } from { -1, 5 } are 3, 4, 5 respectively. Therefore, sum = 3 + 4 + 5 = 12. 
Distance of { 3, 5 }, { 2, 3 } from { 1, 6 } are 3, 4 respectively. Therefore, sum = 12 + 3 + 4 = 19 
Distance of { 2, 3 } from { 3, 5 } is 3. Therefore, sum = 19 + 3 = 22.


 */
public class SumManhattenDist16 {
    // brute force 
    // O(n2) which too slow for large input

    public static int sumManHatten(int[][] points){
        int n = points.length;
        int sum = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int dis = Math.abs(points[i][0] - points[j][0])
                        + Math.abs(points[i][1] - points[j][1]);

                sum += dis;
            }
        }

        return sum;
    }

    // efficient approach using binary search
    // in O(nlogn) time sort indivisualy x and y than add sum x + y
    public static int sumManHatten2(int[][] points){
        int n = points.length;

        int x[] = new int[n];
        int y[] = new int[n];

        for(int i=0; i<n; i++){
            x[i] = points[i][0];
            y[i] = points[i][1];
        }

        Arrays.sort(x);
        Arrays.sort(y);

        int total = 0;

        for(int i=0; i<n; i++){
            total += (long)x[i]*(2L * i - n + 1);
            total += (long)y[i]*(2L * i - n + 1);
        }

        return total;
    }

    // using prefix sum
    // instead of formula
    public static long sumManHatten3(int[][] points){
        int n = points.length;
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i=0; i<n; i++){
            x[i] = points[i][0];
            y[i] = points[i][1];
        }

        Arrays.sort(x);
        Arrays.sort(y);

        long prefix = 0;
        long sumX = 0, sumY = 0;


        // compute prefix x
        for(int i=0; i<n; i++){
            sumX += (long)x[i] * i - prefix;
            prefix += x[i];
        }

        prefix = 0;
        // compute y
        for(int i=0; i<n; i++){
            sumY += (long)y[i]*i - prefix;
            prefix += y[i];
        }

        return sumX + sumY;
    }


    public static void main(String[] args) {
        int[][] points = { {-1,5}, {1,6}, {3,5}, {2,3} };
        System.out.println(" Sum manHatten : "+sumManHatten3(points)); // Output: 22
    }
    
}
