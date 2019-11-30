package ProjekGraph.projek;

public class Connect {
    /*public class Graph {

        private class Node {

            private int data;
            private Node next;

            public Node(int dt, Node n) {
                data = dt;
                next = n;
            }

            public int getDt() {
                return data;
            }

            public Node getNext() {
                return next;
            }
        }
        private Node[] node;
        private int jNode;

        public Graph(int n) {
            jNode = n;
            node = new Node[jNode];
        }

        public void addAdj(int head, int adj) {
            Node n = new Node(adj, node[head]);
            node[head] = n;
        }

        public void cetak(String komentar) {
            System.out.println(komentar);
            for (int i = 0; i < jNode; i++) {
                System.out.print("[" + i + "]");
                Node n = node[i];
                while (n != null) {
                    System.out.print("->" + n.getDt());
                    n = n.getNext();
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Graph g = new Graph(5);
            g.addAdj(0, 3);
            g.addAdj(0, 1);
            g.addAdj(1, 4);
            g.addAdj(1, 2);
            g.addAdj(2, 4);
            g.addAdj(2, 1);
            g.addAdj(4, 3);
            g.cetak("Kondisi awal");
        }
    } */

    /*
    // Java implementation of the approach
import java.util.*;

class GFG
{
    static int N = 100000;

    // To keep correct and reverse direction
    @SuppressWarnings("unchecked")
    static Vector<Integer>[] gr1 = new Vector[N];
    @SuppressWarnings("unchecked")
    static Vector<Integer>[] gr2 = new Vector[N];

    static boolean[] vis1 = new boolean[N];
    static boolean[] vis2 = new boolean[N];

    static {
        for (int i = 0; i < N; i++)
        {
            gr1[i] = new Vector<>();
            gr2[i] = new Vector<>();
        }
    }

    // Function to add edges
    static void Add_edge(int u, int v)
    {
        gr1[u].add(v);
        gr2[v].add(u);
    }

    // DFS function
    static void dfs1(int x)
    {
        vis1[x] = true;
        for (int i : gr1[x])
            if (!vis1[i])
                dfs1(i);
    }

    // DFS function
    static void dfs2(int x)
    {
        vis2[x] = true;
        for (int i : gr2[x])
            if (!vis2[i])
                dfs2(i);
    }

    static boolean Is_connected(int n)
    {

        // Call for correct direction
        Arrays.fill(vis1, false);
        dfs1(1);

        // Call for reverse direction
        Arrays.fill(vis2, false);
        dfs2(1);

        for (int i = 1; i <= n; i++)
        {

            // If any vertex it not visited in any direction
            // Then graph is not connected
            if (!vis1[i] && !vis2[i])
                return false;
        }

        // If graph is connected
        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 4;

        // Add edges
        Add_edge(1, 2);
        Add_edge(1, 3);
        Add_edge(2, 3);
        Add_edge(3, 4);

        // Function call
        if (Is_connected(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

     */
}
