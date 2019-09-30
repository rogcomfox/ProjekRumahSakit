package com.project.referensi.randi;
// 185150201111013 - YUSUF GLADIENSYAH BIHANDA
// 185150200111026 - JOSEPH ANANDA SUGIHDHARMA
// 185150207111012 - MUHAMMAD NAJMI FAISAL

public class DTunggu {

        private Node head, tail;
        private int size = 0;

        public DTunggu() {
            head = tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public String removeFirst() {
            Node hapus = head;
            if (head == tail) {
                head =tail = null;
                size--;
            }else{
                while(hapus!=tail){
                hapus.data=hapus.next.data;
                hapus=hapus.next;
            }
            tail.prev=tail;
            tail.next=null;
            size--;
            }
            return hapus.data;
        }

        public void addLast(String data) {
            Node temp = new Node();
            temp.data = data;
            if (this.size==0) {
                head = tail=temp;
            }else{
                tail.next = temp;
                temp.prev=tail;
                tail=temp;
            }
            size++;
        }
        public void cetak(){
            Node temp = head;
            while(temp!= null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
            if (head==null) {
                System.out.print(" -");
            }
            System.out.println("");
        }
    }
