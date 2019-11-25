package ProjekRumahSakit.referensi.dudin;

public class Queue {

    private SingleLinkedList listAntrian;

    public Queue() {
        listAntrian = new SingleLinkedList();
    }

    public void enqueue(String nama, String problem, int privilege) {
        if (privilege == 1) {
            listAntrian.addFirst(nama, problem, privilege);
        }
        if (privilege == 2) {
            listAntrian.addTengah(nama, problem, privilege);
        } else {
            listAntrian.addLast(nama, problem, privilege);
        }
    }

    public String dequeue() {
        return listAntrian.removeFirst();
    }

    public boolean kosong() {
        return listAntrian.isEmpty();
    }
}
