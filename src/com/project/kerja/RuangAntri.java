package com.project.kerja;

public class RuangAntri {
    private Node head = null;
    private Node tail = null;
    private int limit = 0;//menentukan batasan ruang antrian
    private int ukuran = 0;//menentukan ukuran ruang antri

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //    private Node head, tail;
//    private int batas = 0;
//    private int size = 0;
//    public RuangAntri() {
//        head = tail = null;
//    }
//
//    public void setBatas(int batas) {
//        this.batas = batas;
//    }
//
//    public int getBatas() {
//        return this.batas;
//    }
//    public void gantiUkuran(int batas, RuangTunggu data){
//        int batasLama = this.batas;
//        setBatas(batas);
//        if (size<batas) {
//            addAntre(data.removeFirst());
//        }else if(size > batas){
//            data.addLast(removeLast());
//        }
//        System.out.println("SUKSES UBAH "+batasLama+" "+getBatas());
//    }
//    public void addAntre(String isi) {
//        Node temp = new Node();
//        temp.isi=isi;
//        if (this.size==0) {
//            head = tail=temp;
//        }else{
//            temp.prev = tail;
//            tail.next = temp;
//            tail=temp;
//        }
//        size++;
//    }
//    public boolean isFull(){
//        boolean full = false;
//        Node temp;
//        temp=head;
//        int counter = 0;
//        for (int i = 1; i < batas; i++) {
//            if (temp!=null) {
//                temp=temp.next;
//                counter++;
//            }
//        }
//        if (counter == size) {
//            full=true;
//        }
//        return full;
//    }
//    public String dequeAntre(DTunggu data){
//        String nilai = head.data;
//        Node temp = head;
//        head.data=null;
//        while(temp!=tail){
//            temp.data=temp.next.data;
//            temp=temp.next;
//        }
//        tail.data=data.removeFirst();
//        if (tail.data==null) {
//            size--;
//        }
//        return nilai;
//    }
//    public String removeLast(){
//        String akhir = tail.data;
//        Node temp = tail;
//        temp = temp.prev;
//        tail = temp;
//        temp.next = null;
//        return akhir;
//    }
//    public void pindah(int kali){
//        Node temp = head;
//        head.prev = tail;
//        tail.next = head;
//        int counter = 0;
//        while(counter!=kali){
//            temp=temp.prev;
//            head=head.next;
//            tail=tail.next;
//            counter++;
//        }
//        head.prev=null;
//        tail.next=null;
//
//    }
//    public void cetak(){
//        Node temp = head;
//        while(temp!= null){
//            System.out.print(" "+temp.data);
//            temp=temp.next;
//        }
//        if (head == null) {
//            System.out.print(" -");
//        }
//        System.out.println("");
//    }
}
