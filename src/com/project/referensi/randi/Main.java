package com.project.referensi.randi;
// 185150201111013 - YUSUF GLADIENSYAH BIHANDA
// 185150200111026 - JOSEPH ANANDA SUGIHDHARMA
// 185150207111012 - MUHAMMAD NAJMI FAISAL

import com.project.kerja.SingleLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        SingleLinkedList sll = new SingleLinkedList();
        do {
            while(true) {
                String input = in.readLine();
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
