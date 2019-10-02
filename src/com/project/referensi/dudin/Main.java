package com.project.referensi.dudin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        boolean cek = true;
        Scanner in = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        while(cek){
            System.out.println("PROGRAM ANTRIAN RUMAH SAKIT");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Ambil Antrian");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            String pil = in.nextLine();
            switch(pil){
                case "1":
                    System.out.print("\nMasukkan Nama \t\t: ");
                    String nama = in.nextLine();
                    System.out.print("Masukkan Problem \t: ");
                    String probl = in.nextLine();
                    System.out.println("Masukkan Status Privillege");
                    System.out.println("1. Darurat");
                    System.out.println("2. Urgent tapi tidak darurat");
                    System.out.println("3. Pemeriksaan biasa");
                    System.out.print("Pilihan : ");
                    int priv = inInt.nextInt();
                    q.enqueue(nama,probl,priv);
                    break;
                case "2":
                    System.out.println("\nAntrian Terambil");
                    System.out.println("Data Pasien Sekarang\n");
                    System.out.println(q.dequeue());
                    break;
                case "3":
                    cek = false;
                default : System.out.println("\nPilihan anda salah");
            }
            System.out.println("=================================================");
        }
    }
}
