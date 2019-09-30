package com.project.referensi.randi;
/**
 *
 * @author 
 *  // 185150200111069 - AHYA ZHILALIKBAR AMIN //
    // 185150200111071 - MUHAMMAD HAMAAS TAQIYUDDIN AL MUSTADJABI //
    // 185150200111073 - MUHAMMAD NAUFAL HABIBIE DWIHAR //
    // 185150207111001 - RANDI JULIUS ONG //
 */
public class SinglyLinkedList {

    Node head = null, tail = null;
    private int sizeMax = 0;
    private int size = 0;
    private int antreTerisi = 0;

    public SinglyLinkedList() {

    }

    public void setSizeMax(int sizeMax) {
        this.sizeMax = sizeMax;
    }

    public int getSizeMax() {
        return sizeMax;
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

//    public void cetak() {
//        Node pointer = head;
//        if (head == null) {
//            System.out.print(" - \n");
//        } else {
//            while (pointer.next != null) {
//                System.out.print(pointer.data + " ");
//                pointer = pointer.next;
//            }
//            System.out.println(tail.data);
//        }
//
//    }

    public String getDataNodeN(int n) {
//        list indexing start dari 1
        Node tmp = head;
        String data;
        if (size == 1) {
            return tmp.data;
        } else {
            for (int i = 0; i < n - 1; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public void antreIsiBertambah() {
        antreTerisi++;
    }

    public void antreIsiBerkurang() {
        antreTerisi--;
    }

    public int getAntreTerisi() {
        return antreTerisi;
    }

    public void setAntreTerisi(int antreTerisi) {
        this.antreTerisi = antreTerisi;
    }

    public Node getHead() {
        return head;
    }

    public void removeFirst() {
        head = head.next;
        size--;
    }
public void cetak() {
        Node pointer = head;
        RAntre antri = new RAntre();
        DTunggu ruang = new DTunggu();
        while (pointer.next != null) {
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
                    System.out.println("SKIP SUSKSES");
                    break;
                default:
                    antri.setBatas(Integer.parseInt(word[0]));
                    break;
            }
            pointer = pointer.next;
        }
        System.out.println(tail.data);
    }
}
    

