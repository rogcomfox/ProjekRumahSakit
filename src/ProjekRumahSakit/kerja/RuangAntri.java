package ProjekRumahSakit.kerja;

class RuangAntri {
    private Node head = null;
    private Node tail = null;
    private int limit = 0;//menentukan batasan ruang antrian
    private int ukuran = 0;//menentukan ukuran ruang antri

    private int getLimit() {
        return limit;
    }

    void setLimit(int limit) {
        this.limit = limit;
    }

    void gantiUkuran(int batas, RuangTunggu data){
        int batasLama = this.limit;
        setLimit(batas);
        if (ukuran<batas) {
            addAntre(data.removeFirst());
        }else if(ukuran > batas){
            data.addLast(removeLast());
        }
        System.out.println("SUKSES UBAH "+batasLama+" "+getLimit());
    }
    void addAntre(String isi) {
        Node temp = new Node();
        temp.isi=isi;
        if (this.ukuran==0) {
            head = tail=temp;
        }else{
            temp.prev = tail;
            tail.next = temp;
            tail=temp;
        }
        ukuran++;
    }
    public boolean isFull(){
        boolean full = false;
        Node temp;
        temp=head;
        int counter = 0;
        for (int i = 1; i < limit; i++) {
            if (temp!=null) {
                temp=temp.next;
                counter++;
            }
        }
        if (counter == ukuran) {
            full=true;
        }
        return full;
    }
    public String dequeAntre(RuangTunggu data){
        String nilai = head.isi;
        Node temp = head;
        head.isi=null;
        while(temp!=tail){
            temp.isi=temp.next.isi;
            temp=temp.next;
        }
        tail.isi=data.removeFirst();
        if (tail.isi==null) {
            ukuran--;
        }
        return nilai;
    }
    public String removeLast(){
        String akhir = tail.isi;
        Node temp = tail;
        temp = temp.prev;
        tail = temp;
        temp.next = null;
        return akhir;
    }
    public void pindah(int kali){
        Node temp = head;
        head.prev = tail;
        tail.next = head;
        int counter = 0;
        while(counter!=kali){
            temp=temp.prev;
            head=head.next;
            tail=tail.next;
            counter++;
        }
        head.prev=null;
        tail.next=null;

    }
    public void cetak(){
        Node temp = head;
        while(temp!= null){
            System.out.print(" "+temp.isi);
            temp=temp.next;
        }
        if (head == null) {
            System.out.print(" -");
        }
        System.out.println("");
    }
}
