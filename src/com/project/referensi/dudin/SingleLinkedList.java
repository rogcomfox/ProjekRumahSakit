package com.project.referensi.dudin;

class Node {

    String nama, problem;
    public int privilege;
    Node next, prev;

    public Node() {

    }

    public Node(String nama, String problem, int privilege) {
        this.nama = nama;
        this.problem = problem;
        this.privilege = privilege;
    }

    public int getPrivilege() {
        return privilege;
    }
}

public class SingleLinkedList {

    Node head, tail;
    int size = 0;

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(String nama, String problem, int privilege) {
        Node input = new Node(nama, problem, privilege);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.next = head;
            head.prev = head;
            head = input;
        }
        size++;
    }

    void addLast(String nama, String problem, int privilege) {
        Node input = new Node(nama, problem, privilege);
        if (isEmpty()) {
            head = tail = input;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void addTengah(String nama, String problem, int privilege) {
        Node input = new Node(nama, problem, privilege);
        Node current = head;

        do {
            if (current.privilege <= privilege) {
                input.prev = current;
                input.next = current.next;
                current.next.prev = input;
                current.next = input;
                size++;
                break;
            }
        } while (current!=null);
    
    }

    String removeFirst() {
        String hapus = null;
        if (!isEmpty()) {
            if (head == tail) {
                hapus = "Nama \t\t: " + head.nama + "\nProblem \t: " + head.problem;
                head = tail = null;
            } else {
                head = head.next;
                hapus = "Nama \t\t: " + head.nama + "\nProblem \t: " + head.problem;
            }
            size--;
        }
        return hapus;
    }

}
