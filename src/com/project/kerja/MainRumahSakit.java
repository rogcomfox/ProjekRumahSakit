package com.project.kerja;

class SingleNode{
    SingleNode next;
    String isi;

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

}

class CircleSingleLinkedList{
    private SingleNode Head = null;
    private SingleNode Tail = null;
    private int size; //size of linkedlist

    public CircleSingleLinkedList() {

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

    }
}

class Antrian{

}

class Tunggu{

}

public class MainRumahSakit {

}
