package ProjekGraph.projek;

public class MinimumReTwit {
    // Java program to calculate number
// of nodes between two nodes
/*import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

    public class GFG
    {
        // function to calculate no of nodes
        // between two nodes
        static int totalNodes(Vector<Integer> adjac[],
                              int n, int x, int y)
        {
            // x is the source node and
            // y is destination node

            // visited array take account of
            // the nodes visited through the bfs
            Boolean visited[] = new Boolean[n + 1];

            //filling boolean value with false
            Arrays.fill(visited, false);

            // parent array to store each nodes
            // parent value
            int p[] = new int[n];

            Queue<Integer> q = new LinkedList<>();
            q.add(x);


            // take our first node(x) as first element
            // of queue and marked it as
            // visited through visited[] array
            visited[x] = true;

            int m;

            // normal bfs method starts
            while(!q.isEmpty())
            {
                m = q.peek();
                q.poll();
                for(int i=0; i < adjac[m].size() ; ++i)
                {

                    int h = adjac[m].get(i);

                    if(visited[h] != true )
                    {
                        visited[h] = true;

                        // when new node is encountered
                        // we assign it's parent value
                        // in parent array p
                        p[h] = m;
                        q.add(h);
                    }
                }
            }

            // count variable stores the result
            int count  = 0;

            // loop start with parent of y
            // till we encountered x
            int i = p[y];
            while(i != x)
            {
                // count increases for counting
                // the nodes
                count++;
                i = p[i];
            }
            return count;
        }

        // Driver program to test above function
        public static void main(String[] args)
        {
            // adjacency list for graph
            Vector<Integer> adjac[] = new Vector[7];

            //Initializing Vector for each nodes
            for (int i = 0; i < 7; i++)
                adjac[i] = new Vector<>();

            // creating graph, keeping length of
            // adjacency list as (1 + no of nodes)
            // as index ranges from (0 to n-1)
            adjac[1].add(4);
            adjac[4].add(1);
            adjac[5].add(4);
            adjac[4].add(5);
            adjac[4].add(2);
            adjac[2].add(4);
            adjac[2].add(6);
            adjac[6].add(2);
            adjac[6].add(3);
            adjac[3].add(6);

            System.out.println(totalNodes(adjac, 7, 1, 3));

        }
    }*/
// This code is contributed by Sumit Ghosh
}
