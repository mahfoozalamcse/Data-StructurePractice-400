package Test8;
// Dijkstra: Shortest Reach 2

// import java.io.*;
// import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;





public class Diskastra {
// public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
//         // Step 1: Build adjacency list
//         Map<Integer, List<int[]>> graph = new HashMap<>();
//         for (List<Integer> e : edges) {
//             int u = e.get(0);
//             int v = e.get(1);
//             int w = e.get(2);
//             graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
//             graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
//         }

//         // Step 2: Initialize distance array
//         int[] dist = new int[n + 1];
//         Arrays.fill(dist, Integer.MAX_VALUE);
//         dist[s] = 0;

//         // Step 3: Min-heap for {distance, node}
//         PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
//         pq.offer(new int[]{0, s});

//         // Step 4: Dijkstra's main loop
//         while (!pq.isEmpty()) {
//             int[] curr = pq.poll();
//             int d = curr[0], node = curr[1];

//             if (d > dist[node]) continue;

//             for (int[] edge : graph.getOrDefault(node, new ArrayList<>())) {
//                 int neighbor = edge[0], weight = edge[1];
//                 if (dist[node] + weight < dist[neighbor]) {
//                     dist[neighbor] = dist[node] + weight;
//                     pq.offer(new int[]{dist[neighbor], neighbor});
//                 }
//             }
//         }

//         // Step 5: Prepare output
//         List<Integer> result = new ArrayList<>();
//         for (int i = 1; i <= n; i++) {
//             if (i == s) continue;
//             result.add(dist[i] == Integer.MAX_VALUE ? -1 : dist[i]);
//         }
//         return result;
//     }




public static void main(String[] args){
       
    }
}


