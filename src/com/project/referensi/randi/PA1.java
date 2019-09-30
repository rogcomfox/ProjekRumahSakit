package com.project.referensi.randi;
/**
 *
 * @author 
 *  // 185150200111069 - AHYA ZHILALIKBAR AMIN //
    // 185150200111071 - MUHAMMAD HAMAAS TAQIYUDDIN AL MUSTADJABI //
    // 185150200111073 - MUHAMMAD NAUFAL HABIBIE DWIHAR //
    // 185150207111001 - RANDI JULIUS ONG //
 */
import java.util.Scanner;
public class PA1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean state = true;
        int counter = 0;
        SinglyLinkedList input = new SinglyLinkedList();
        do {
            do {
                String in = s.nextLine();
                input.addLast(in);
                if (in.isEmpty()) {
                    counter++;
                    break;
                }
            } while (state);
            if (counter <2) {
                input.cetak();
            }
        } while (counter != 2);
    }

}
