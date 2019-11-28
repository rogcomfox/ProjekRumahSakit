package ProjekGraph.referensi;

public class DaftarTunggu {

    Node front, rear;
    int itemCount = 0;

    public DaftarTunggu() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null ? true : false;
    }

    public void enqueue(String nama) {
        Node tmp = new Node();
        tmp.nama = nama;
        if (isEmpty()) {
            rear = front = tmp;
        } else {
            rear.next = tmp;
            tmp.prev = rear;
            tmp.next = null;
            rear = rear.next;
        }
        itemCount++;
    }

    public String dequeue() {
        Node tmp = front;
        if (isEmpty()) {
            return "Waiting List is Empty";
        } else {
            if (front == rear) {
                front = rear = null;
                itemCount--;
                return tmp.nama;
            } else {
                front.next.prev = null;
                front = front.next;
                itemCount--;
                return tmp.nama;
            }
        }
    }

    public String returnToTail() {
        Node tmp = front;
        String a = new String();
        while (tmp != null) {
            a = a + tmp.nama + " ";
            tmp = tmp.next;
        }
        return a;
    }

    public void printToTail() {
        Node tmp = front;
        do {
            System.out.println(tmp.nama);
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void print(Node a) {
        System.out.println(a);
    }

}
