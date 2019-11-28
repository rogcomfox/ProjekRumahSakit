package ProjekGraph.projek;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

public class Twitty {
    private Node[] root;
    private int JNode;

    public Twitty() {
        root = new Node[JNode];
    }

    public void addAdj(int head, int adj){
        Node n = new Node(adj, root[head]);
        root[head] = n;
    }

    public void print(){

    }
}
