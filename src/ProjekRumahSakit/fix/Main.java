package ProjekRumahSakit.fix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedList datasave = new SingleLinkedList();
        int count = 0;
        do {
            while (true) {
                String input = in.nextLine();
                datasave.enqueue(input);
                if (input.isEmpty()) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                datasave.print();
            }
        } while (count == 1);
    }
}
