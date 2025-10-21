package Week4RecursionBackTracking;

import java.util.ArrayList;
import java.util.List;

public class ReadBinaryWatch3 {
    public static List<String> binaryWatch(int turnedOn){
        List<String> list = new ArrayList<>();

        for(int hours=0; hours<12; hours++){
            for(int minutes=0; minutes<60; minutes++){
                if (Integer.bitCount(hours) + Integer.bitCount(minutes) == turnedOn) {
                    list.add(String.format("%d:%02d", hours, minutes));
                }
            }
        }
            
        return list;
    }

    // approach 2

    static List<String> list = new ArrayList<>();
    public static List<String> binaryWatch2(int turnedOn){
        list.clear();
        backTrack(turnedOn, 0, 0, 0);
        return list;
    }

    public static void backTrack(int ledLeft, int index, int hours, int minutes){
        // if hours and minutes go out of range stop early
        if (hours > 11 || minutes > 59) {
           return;
       }

       // Base case no more led turned on 
       if (ledLeft == 0) {
          list.add(String.format("%d:%02d", hours, minutes));
          return;
       }

       // we have 10 index , 0 - 3 hours, 4-9 for minute
       for(int i=index; i<10; i++){
          // for hours set bit
          if (i < 4) {
             // turned on hours led
             backTrack(ledLeft-1, index+1, hours + (1 << i), minutes);
           }
           // for minutes
           else{
            // turned on minute
              backTrack(ledLeft-1, index+1, hours, minutes + ( 1 << (i - 4)));
            }
        }  
    }
    public static void main(String [] args){
        int turnedOn = 1;
        
        System.out.println(" Result : "+ binaryWatch(turnedOn));
        System.out.println(" Result 2 : "+ binaryWatch2(turnedOn));
    }

}
