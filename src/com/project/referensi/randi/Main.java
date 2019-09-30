package com.project.referensi.randi;
 // 185150201111013 - YUSUF GLADIENSYAH BIHANDA
 // 185150200111026 - JOSEPH ANANDA SUGIHDHARMA
 // 185150207111012 - MUHAMMAD NAJMI FAISAL

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        SinglyLinkedList sll = new SinglyLinkedList();
        do {
            while(true) {
                String input = in.nextLine();
                sll.addLast(input);
                if (input.isEmpty()) {
                    counter++;
                    break;
                }
            }
            if (counter == 1) {
                sll.cetak();
            }
        } while (counter == 1);
    }
}
