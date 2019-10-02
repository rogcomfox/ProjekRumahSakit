package com.project.referensi.randi;
// 185150201111013 - YUSUF GLADIENSYAH BIHANDA
// 185150200111026 - JOSEPH ANANDA SUGIHDHARMA
// 185150207111012 - MUHAMMAD NAJMI FAISAL

public class SinglyLinkedList {

    Node head = null, tail = null;
    private int size = 0;

    public SinglyLinkedList() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(String data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tail = tmp;
//            head.next = tail;
            size++;
        } else {
            tmp.next = head;
            head = tmp;
            size++;
        }
    }

    public void addLast(String data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            addFirst(data);
            return;
        }
        tail.next = tmp;
        tmp.next = null;
        tail = tmp;
        size++;
    }

    public void cetak() {
        Node pointer = head;
        RAntre antri = new RAntre();
        DTunggu ruang = new DTunggu();
        do {
            String s = pointer.data;
            String word[] = s.split(" ");
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
                    antri.setBatas(Integer.parseInt(word[0]));
                    break;
            }
            pointer = pointer.next;
        }while (pointer.next != null) ;
        System.out.println(tail.data);
    }
}
    

