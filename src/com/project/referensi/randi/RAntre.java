package com.project.referensi.randi;
/**
 *
 * @author 
 *  // 185150200111069 - AHYA ZHILALIKBAR AMIN //
    // 185150200111071 - MUHAMMAD HAMAAS TAQIYUDDIN AL MUSTADJABI //
    // 185150200111073 - MUHAMMAD NAUFAL HABIBIE DWIHAR //
    // 185150207111001 - RANDI JULIUS ONG //
 */
class RAntre {
    
        private Node head, tail;
        private int batas = 0;
        private int size = 0;
        public RAntre() {
            head = tail = null;
        }

        public void setBatas(int batas) {
            this.batas = batas;
        }

        public int getBatas() {
            return this.batas;
        }
        public void gantiUkuran(int batas, DTunggu data){
            int batasLama = this.batas;
            setBatas(batas);
            if (size<batas) {
                addAntre(data.removeFirst());
            }else if(size > batas){
                data.addLast(removeLast());
            }
            System.out.println("SUKSES UBAH "+batasLama+" "+getBatas());
        } 
        public void addAntre(String data) {
            Node temp = new Node();
            temp.data=data;
            if (this.size==0) {
                head = tail=temp;
            }else{
                temp.prev = tail;
                tail.next = temp;
                tail=temp;
            }
            size++;
        }
        public boolean isFull(){
            boolean full = false;
            Node temp;
            temp=head;
            int counter = 0; 
            for (int i = 1; i < batas; i++) {
                if (temp!=null) {
                    temp=temp.next;
                    counter++;
                }
            }
            if (counter == size) {
                full=true;
            }
            return full;
        }
        public String dequeAntre(DTunggu data){
            String nilai = head.data;
            Node temp = head;
            head.data=null;
            while(temp!=tail){
                temp.data=temp.next.data;
                temp=temp.next;
            }
            tail.data=data.removeFirst();
            if (tail.data==null) {
                size--;
            }
            return nilai;
        }
        public String removeLast(){
            String akhir = tail.data;
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
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
            if (head == null) {
                System.out.print(" -");
            }
            System.out.println("");
        }
    }

