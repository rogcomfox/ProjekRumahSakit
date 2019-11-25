package ProjekRumahSakit.kerja;

public class SingleLinkedList {
    private Node head = null;
    private Node tail = null;
    private int ukuran = 0; //ukuran default

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    private void addFirst(String isi){
        Node node = new Node();
        node.setIsi(isi);
        if (head == null){
            head = tail = node;
            head.setNext(tail);
            ukuran++;
        }else{
            node.setNext(head);
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            head = node;
            ukuran++;
        }
    }

    public void addLast(String isi){
        Node node = new Node();
        node.setIsi(isi);
        if (head == null){
            addFirst(isi);
            return;
        }
        node.setNext(head);
        node.setPrev(tail);
        head.setPrev(node);
        tail.setNext(node);
        tail = node;
        ukuran++;
    }

    public void cetak() {
        Node pointer = head;
        RuangAntri antri = new RuangAntri();
        RuangTunggu ruang = new RuangTunggu();
        while (pointer.next != null) {
            String s = pointer.isi;
            String[] word = s.split(" ");
            switch (word[0]) {
                case "BARU":
                    String temp = word[1];
                    if (antri.isFull()) {
                        antri.addAntre(temp);
                        System.out.println("ANTRE " + temp);
                    } else {
                        ruang.addLast(temp);
                        System.out.println("WAIT " + temp);
                    }
                    break;
                case "STATUS":
                    System.out.print("LIST_ANTRE");
                    antri.cetak();
                    System.out.print("LIST_WAIT");
                    ruang.cetak();
                    break;
                case "SELESAI":
                    System.out.println("SELESAI " + antri.dequeAntre(ruang));
                    break;
                case "UKURAN":
                    antri.gantiUkuran(Integer.parseInt(word[1]), ruang);
                    break;
                case "SKIP":
                    antri.pindah(Integer.parseInt(word[1]));
                    System.out.println("SKIP SUKSES");
                    break;
                default:
                    System.out.println("Hello");
                    antri.setLimit(Integer.parseInt(word[0]));
                    break;
            }
            pointer = pointer.next;
        }
        System.out.println(tail.isi);
    }
}
