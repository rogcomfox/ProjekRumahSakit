package ProjekRumahSakit.fix;
class Node {

    Node next;
    Node prev;
    String data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    void setData(String data) {
        this.data = data;
    }
}

public class SingleLinkedList {

    private Node head;
    private Node tail;

    public void enqueue(String data) {
        Node node = new Node();
        node.setData(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setNext(null);
            tail = node;
        }
    }

    public void print() {
        Node pointer = head;
        Ruangan ruangAntre = new Ruangan();
        Ruangan daftarTunggu = new Ruangan();
        while (pointer.next != null) {
            String instruction = pointer.data;
            String[] data = instruction.split(" ");
            switch (data[0]) {
                case "BARU":
                    if (ruangAntre.isFull()) {
                        daftarTunggu.enqueue(data[1]);
                        System.out.println("WAIT " + data[1]);
                    } else {
                        ruangAntre.enqueue(data[1]);
                        System.out.println("ANTRE " + data[1]);
                    }
                    break;
                case "UKURAN":
                    ruangAntre.gantiUkuran(Integer.parseInt(data[1]), daftarTunggu);
                    break;
                case "SELESAI":
                    System.out.print("SELESAI ");
                    System.out.println(ruangAntre.dequeueAntrian(daftarTunggu));
                    break;
                case "SKIP":
                    ruangAntre.lompati(Integer.parseInt(data[1]));
                    System.out.println("SKIP SUKSES");
                    break;
                case "STATUS":
                    System.out.print("LIST_ANTRE ");
                    ruangAntre.list();
                    System.out.print("LIST_WAIT ");
                    daftarTunggu.list();
                    break;
                default:
                    ruangAntre.setMax(Integer.parseInt(data[0]));
                    break;
            }
            pointer = pointer.next;
        }
        System.out.println(tail.data);
    }
}
