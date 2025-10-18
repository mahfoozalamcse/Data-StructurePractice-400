package Week2SortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortByFrequency20 {
    public static void sortByFrequency(int arr[]){

      Map<Integer, Integer> freq = new HashMap<>();
      // count frequency
      for(int num : arr){
         freq.put(num, freq.getOrDefault(num, 0)+1);
      }

      List<Integer> list = new ArrayList<>();
      for(int num : arr){
        list.add(num);
      }

      // custom comparator to compare
      Collections.sort(list, (a, b) ->{
         if (!freq.get(a).equals(freq.get(b))) { // basis of frequency
            return freq.get(b) - freq.get(a);
         }else{
            return a-b; // smaller first
         }
      });

      for(int num : list){
        System.out.print(num+" ");
      }
    }

    // approach 2
    public static void sortByFrequency(int[] arr, int n) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b)))
                return freq.get(b) - freq.get(a);
            return a - b;
        });

        for (int num : list) {
            for (int i = 0; i < freq.get(num); i++)
                System.out.print(num + " ");
        }
        System.out.println();
    }


    // approach 3 for sort range
    public static void sortByFrequency3(int arr[]){
        int[] freq = new int[61]; // Ai <= 60
        for(int num : arr){
            freq[num]++;
        }

        // find max
        int maxFreq = 0;
        for(int num : freq){
            maxFreq = Math.max(maxFreq, num);
        }

        // print from max frequency to lower 
        for(int f=maxFreq; f>=1; f--){
          for(int num =1; num <= 60; num++){
              if (freq[num] == f) {
                 for(int k=0; k<f; k++){
                     System.out.print(num+" ");
                 }
              }
          }
        }

        System.out.println();
    }
    public static void main(String[] args) {
         int[] arr = {5, 5, 4, 6, 4};
        sortByFrequency(arr);
        System.out.println();
        sortByFrequency3(arr);
    }
}
