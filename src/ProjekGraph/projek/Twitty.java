package ProjekGraph.projek;

import java.util.Vector;

class Node {
    String data;
    Node next, prev;

    public Node(){
    }

    public Node(String dt, Node n) {
        data = dt;
        next = n;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

public class Twitty {
    private Node front, rear;
    static int itemCount = 0;

    public Twitty() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null ? true : false;
    }

    public void addAdj(String adj){
        Node node = new Node();
        node.data = adj;
        if (isEmpty()) {
            rear = front = node;
        } else {
            rear.next = node;
            node.prev = rear;
            node.next = null;
            rear = rear.next;
        }
        itemCount++;
    }

    public void connect(String head, String adj){
        String[][] connectArray = new String[itemCount][2];
        for(int i=0; i<itemCount; i++){
            if(connectArray[i][0] == null){
                connectArray[i][0]=head;
                connectArray[i][1]=adj;
                System.out.println("connect " + connectArray[i][0] + " " + connectArray[i][1] + " success");
                break;
            }

        }

/*
        int index = -1, idx = -1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].equals(arr[1])) {
                index = i;
                System.out.println(index);
            }
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i].equals(arr[2])) {
                idx = i;
                System.out.println(idx);
            }
        }
        tw.connect(index, idx);
        Node n = new Node(adj, node[head]);
        node[head] = n;*/
    }

    public void printToTail() {
        Node n = front;
        do {
            System.out.println(n.data);
            n = n.next;
        } while (n != null);
    }
}
