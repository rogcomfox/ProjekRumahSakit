package com.project.kerja;

public class RuangTunggu {
    private Node head = null;
    private Node tail = null;
    private int ukuran = 0;
    private SingleLinkedList list;

    RuangTunggu() {
        list = new SingleLinkedList();
    }

    public boolean isTungguEmpty(){
        return list.getHead() == null;
    }

    public String removeFirst(){
        Node node = head;
        if (head.equals(tail)){
            head = tail = null;
            ukuran--;
        }else {
           do {
               node.isi = node.next.isi;
               node = node.next;
           }while (node!=tail);

           tail.setPrev(tail);
           tail.setNext(null);
           ukuran--;
        }
        return node.isi;
    }

    public void addLast(String isi){
        Node node = new Node();
        node.setIsi(isi);
        if (this.ukuran==0){
            head = tail = node;
            ukuran++;
        }else{
            tail.next = node;
            node.setPrev(tail);
            ukuran++;
        }
    }
    public void cetak(){
        Node temp = head;
        while(temp!= null){
            System.out.print(" "+temp.isi);
            temp=temp.next;
        }
        if (head==null) {
            System.out.print(" -");
        }
        System.out.println(" ");
    }
}
