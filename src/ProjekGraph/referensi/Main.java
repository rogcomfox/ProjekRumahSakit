package ProjekGraph.referensi;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        RuangAntre antrian = new RuangAntre();
        DaftarTunggu output = new DaftarTunggu();
        int x = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String inp = in.nextLine();
            if (x == 0) {
                x = Integer.parseInt(inp);
                antrian.setSize(x);
            } else {
                String[] arr = inp.split(" ");
                arr[0] = arr[0].toUpperCase();
                switch (arr[0]) {
                    case "BARU":
                        output.enqueue(antrian.enqueue(arr[1]));
                        break;
                    case "STATUS":
                        output.enqueue(antrian.printStatus());
                        break;
                    case "UKURAN":
                        int a = antrian.getSize();
                        antrian.chgSize(Integer.parseInt(arr[1]));
                        output.enqueue("SUKSES UBAH " + a + " " + arr[1]);
                        break;
                    case "SKIP":
                        output.enqueue(antrian.skip(Integer.parseInt(arr[1])));
                        break;
                    case "SELESAI":
                        output.enqueue(antrian.dequeue());
                        break;
                }
            }
            if (inp.isEmpty()) {
                break;
            }
        }
        in.close();
        output.printToTail();
    }
}
