package Test8;

import java.util.PriorityQueue;
import java.util.Scanner;
// 2. QHEAP1
public class Heep1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt(); // number of queries
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int val = sc.nextInt();
                pq.add(val);
            } else if (type == 2) {
                int val = sc.nextInt();
                pq.remove(val); // removes specific element (O(n))
            } else if (type == 3) {
                System.out.println(pq.peek()); // min element
            }
        }
        sc.close();
    }
}
