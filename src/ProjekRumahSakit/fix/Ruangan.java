package ProjekRumahSakit.fix;

public class Ruangan {

    private Node head;
    private Node tail;
    private int size = 0;
    private int max = 0;

    void setMax(int max) {
        this.max = max;
    }

    private int getMax() {
        return this.max;
    }

    boolean isFull() {
        Node node = head;
        int counter = 0;
        for (int i = 0; i < max; i++) {
            if (node != null) {
                node = node.next;
                counter++;
            }
        }
        return counter == max;
    }

    private String removeLast() {
        Node node = tail;
        node.setPrev(node);
        tail = node;
        node.setNext(null);
        return tail.data;
    }

    public void enqueue(String data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setNext(null);
            tail = node;
        }
        size++;
    }

    private String dequeue() {
        String value = head.data;
        Node node = head;
        head.setData(null);
        if (head == tail) {
            head = tail = null;
        } else {
            while (node != tail) {
                node.data = node.next.data;
                node = node.next;
            }
            tail.setPrev(tail);
            tail.setNext(null);
        }
        return value;
    }

    String dequeueAntrian(Ruangan daftarTunggu) {
        String value = head.data;
        Node node = head;
        head.setData(null);
        while (node != tail) {
            node.data = node.next.data;
            node = node.next;
        }
        tail.data = daftarTunggu.dequeue();
        return value;
    }

    void lompati(int skip) {
        Node node = head;
        head.setPrev(tail);
        tail.setNext(head);
        int counter = 0;
        while (counter != skip) {
            node = node.next;
            head = head.next;
            tail = tail.next;
            counter++;
        }
        head.setPrev(null);
        tail.setNext(null);
    }

    void gantiUkuran(int max, Ruangan daftarTunggu) {
        int prevMax = this.max;
        setMax(max);
        if (this.size < this.max) {
            enqueue(daftarTunggu.dequeue());
        } else if (this.size > this.max) {
            daftarTunggu.enqueue(removeLast());
        }
        System.out.println("SUKSES UBAH " + prevMax + " " + getMax());
    }

    public void list() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if (head == null) {
            System.out.print("-");
        }
        System.out.println(" ");
    }
}
