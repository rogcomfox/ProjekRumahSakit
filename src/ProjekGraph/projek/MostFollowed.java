package ProjekGraph.projek;
import java.util.*;
public class MostFollowed {
    // Java program to find the in and out degrees
// of the vertices of the given graph



        // Function to print the in and out degrees
        // of all the vertices of the given graph
       /* static void findInOutDegree(List<List<Integer> > adjList, int n)
        {
            int in[] = new int[n];
            int out[] = new int[n];

            for (int i = 0; i < adjList.size(); i++) {

                List<Integer> list = adjList.get(i);

                // Out degree for ith vertex will be the count
                // of direct paths from i to other vertices
                out[i] = list.size();
                for (int j = 0; j < list.size(); j++)

                    // Every vertex that has an incoming
                    // edge from i
                    in[list.get(j)]++;
            }

            System.out.println("Vertex\tIn\tOut");
            for (int k = 0; k < n; k++) {
                System.out.println(k + "\t" + in[k] + "\t" + out[k]);
            }
        }

        // Driver code
        public static void main(String args[])
        {
            // Adjacency list representation of the graph
            List<List<Integer> > adjList = new ArrayList<>();

            // Vertices 1 and 2 have an incoming edge
            // from vertex 0
            List<Integer> tmp =
                    new ArrayList<Integer>(Arrays.asList(1, 2));
            adjList.add(tmp);

            // Vertex 3 has an incoming edge from vertex 1
            tmp = new ArrayList<Integer>(Arrays.asList(3));
            adjList.add(tmp);

            // Vertices 0, 5 and 6 have an incoming
            // edge from vertex 2
            tmp =
                    new ArrayList<Integer>(Arrays.asList(0, 5, 6));
            adjList.add(tmp);

            // Vertices 1 and 4 have an incoming edge
            // from vertex 3
            tmp = new ArrayList<Integer>(Arrays.asList(1, 4));
            adjList.add(tmp);

            // Vertices 2 and 3 have an incoming edge
            // from vertex 4
            tmp = new ArrayList<Integer>(Arrays.asList(2, 3));
            adjList.add(tmp);

            // Vertices 4 and 6 have an incoming edge
            // from vertex 5
            tmp = new ArrayList<Integer>(Arrays.asList(4, 6));
            adjList.add(tmp);

            // Vertex 5 has an incoming edge from vertex 6
            tmp = new ArrayList<Integer>(Arrays.asList(5));
            adjList.add(tmp);

            int n = adjList.size();
            findInOutDegree(adjList, n);
        }*/
    }

