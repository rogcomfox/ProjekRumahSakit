package com.project.kerja;

class SingleNode{
    SingleNode next;
    String isi;

    public String getIsi() {
        return isi;
    }

    void setIsi(String isi) {
        this.isi = isi;
    }

    SingleNode getNext() {
        return next;
    }

    void setNext(SingleNode next) {
        this.next = next;
    }

}

class CircleSingleLinkedList{
    private SingleNode Head = null;
    private SingleNode Tail = null;
    private int size; //ukuran linked list

    public CircleSingleLinkedList() {

    }

    public SingleNode getHead() {
        return Head;
    }

    public void setHead(SingleNode head) {
        Head = head;
    }

    public SingleNode getTail() {
        return Tail;
    }

    public void setTail(SingleNode tail) {
        Tail = tail;
    }

    public void addFirst(String isi){
        SingleNode node = new SingleNode();
        node.setIsi(isi);
        //menambah pada posisi pertama
        if (Head == null){
            Head = Tail;
            size++;
        }else {
            node.setNext(Head);
            size++;
        }
    }

    public void addLast(String isi){
        SingleNode node = new SingleNode();
        node.setIsi(isi);
        Tail.setNext(node);
        Tail = node;
        Tail.setNext(Head);
    }

    public void print(){
        SingleNode node = Head;
        Antrian antrian = new Antrian();
        Tunggu tunggu = new Tunggu();
        do {
            String masukkan = node.isi;
            String[] output = masukkan.split(" ");
            switch (output[0]){
                case "BARU":
                    String tmp = output[1];
            }
        }while (node.next != null);
    }
}

class Antrian{
    CircleSingleLinkedList circle;
    private SingleNode Head = null;
    private SingleNode Tail = null;
    private int limit = 0;
    private int size = 0;

    public Antrian(SingleNode head, SingleNode tail) {
        Head = head;
        Tail = tail;
    }

    Antrian() {

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFull(){
        int counter = 0;
        SingleNode tmp;
        tmp = Head;
        for (int i = 1;i < limit; i++){
            if (Head != null){
                tmp = tmp.getNext();
                counter++;
            }
            if (counter == size){
                return true;
            }
        }
        return false;
    }
}

class Tunggu{
}

public class MainRumahSakit {

}
