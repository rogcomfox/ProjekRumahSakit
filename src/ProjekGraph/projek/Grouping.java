package ProjekGraph.projek;

public class Grouping {
    // CPP program to count number of existing
// groups and number of new groups that can
// be formed.
/*#include <bits/stdc++.h>
    using namespace std;

    class Graph {
        int V; // No. of vertices

        // Pointer to an array containing
        // adjacency lists
        list<int>* adj;

        int countUtil(int v, bool visited[]);
        public:
        Graph(int V); // Constructor

        // function to add an edge to graph
        void addRelation(int v, int w);
        void countGroups();
    };

    Graph::Graph(int V)
    {
        this->V = V;
        adj = new list<int>[V];
    }

    // Adds a relation as a two way edge of
// undirected graph.
    void Graph::addRelation(int v, int w)
    {
        // Since indexing is 0 based, reducing
        // edge numbers by 1.
        v--;
        w--;
        adj[v].push_back(w);
        adj[w].push_back(v);
    }

    // Returns count of not visited nodes reachable
// from v using DFS.
    int Graph::countUtil(int v, bool visited[])
    {
        int count = 1;
        visited[v] = true;
        for (auto i=adj[v].begin(); i!=adj[v].end(); ++i)
            if (!visited[*i])
        count = count + countUtil(*i, visited);
        return count;
    }

    // A DFS based function to Count number of
// existing groups and number of new groups
// that can be formed using a member of
// every group.
    void Graph::countGroups()
    {
        // Mark all the vertices as not visited
        bool* visited = new bool[V];
        memset(visited, 0, V*sizeof(int));

        int existing_groups = 0, new_groups = 1;
        for (int i = 0; i < V; i++)
        {
            // If not in any group.
            if (visited[i] == false)
            {
                existing_groups++;

                // Number of new groups that
                // can be formed.
                new_groups = new_groups *
                        countUtil(i, visited);
            }
        }

        if (existing_groups == 1)
            new_groups = 0;

        cout << "No. of existing groups are "
                << existing_groups << endl;
        cout << "No. of new groups that can be"
        " formed are " << new_groups
                << endl;
    }

    // Driver code
    int main()
    {
        int n = 6;

        // Create a graph given in the above diagram
        Graph g(n); // total 6 people
        g.addRelation(1, 2); // 1 and 2 are friends
        g.addRelation(3, 4); // 3 and 4 are friends
        g.addRelation(5, 6); // 5 and 6 are friends

        g.countGroups();

        return 0;
    }*/
}
