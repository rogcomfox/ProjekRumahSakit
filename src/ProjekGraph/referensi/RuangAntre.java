package ProjekGraph.referensi;

public class RuangAntre {

    Node front, rear;
    int size;
    int itemCount = 0;
    DaftarTunggu waitQueue = new DaftarTunggu();

    public RuangAntre() {
        front = null;
        rear = null;
    }

    public void setSize(int ukuran) {
        size = ukuran;
    }

    public String enqueue(String nama) {
        Node temp = new Node();
        temp.nama = nama;
        if (itemCount != size) {
            if (front == null) {
                front = rear = temp;
            } else {
                temp.next = null;
                temp.prev = rear;
                rear.next = rear = temp;
            }
            itemCount++;
            return ("ANTRE " + nama);
        } else {
            waitQueue.enqueue(nama);
            return ("WAIT " + nama);
        }
    }

    public String dequeue() {
        String popNama = front.nama;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        itemCount--;
        if (!waitQueue.isEmpty()) {
            enqueue(waitQueue.dequeue());
            itemCount++;
        }
        itemCount--;
        return "SELESAI " + popNama;
    }

    public void chgSize(int num) {
        Node temp = front;
        if (size > num) {
            for (int i = 1; i <= size; i++) {
                if (i == (num)) {
                    rear = temp;
                }
                if (i > num) {
                    waitQueue.enqueue(temp.nama);
                    itemCount--;
                }
                temp = temp.next;
            }
            rear.next = null;
            size = num;
        } else {
            if (waitQueue.isEmpty()) {
                return;
            } else {
                if (num - size >= waitQueue.itemCount) {
                    size = num;
                    move(waitQueue.itemCount);

                } else {
                    size = num;
                    move(num - size);
                }
            }
        }
    }

    public void move(int n) {
        for (int i = 0; i < n; i++) {
            enqueue(waitQueue.dequeue());
        }
    }

    public String skip(int n) {
        if (isEmpty()) {
            return "SKIP GAGAL";
        } else {
            for (int i = 0; i < n; i++) {
                rear.next = front;
                front.prev = rear;
                front = front.next;
                front.prev.next = null;
                rear = rear.next;
            }
            return "SKIP SUKSES";
        }
    }

    public String printStatus() {
        Node temp = front;
        StringBuilder antre = new StringBuilder("LIST_ANTRE ");

        do {
            antre.append(temp.nama).append(" ");
            temp = temp.next;
        } while (temp != null);
        antre.append("\nLIST_WAIT ");

        if (waitQueue.isEmpty()) {
            antre.append("-");
        } else {
            antre.append(waitQueue.returnToTail());
        }
        return antre.toString();

    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

}
