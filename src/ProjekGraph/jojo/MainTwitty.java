package ProjekGraph.jojo;
//Joseph Ananda Sugihdharma (185150200111026)
//Yusuf Gladiensyah Bihanda (185150201111013)
//Muhammad Najmi Faisal (185150207111012)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTwitty {
    //Main claass
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        TwittyGraph tg = new TwittyGraph();
        //Meminta input user untuk jumlah user awal
        int U = Integer.parseInt(in.readLine());
        //Meminta input user untuk jumlah connect awal
        int C = Integer.parseInt(in.readLine());
        for (int i = 0; i < U; i++) {
            String input = in.readLine();
            String[] inp = input.split(" ");
            if (inp.length == 4) {
                tg.addUser(inp[0], inp[1], inp[2], inp[3]);
            } else {
                throw new Exception("Salah Format");
            }
        }
        for (int i = 0; i < C; i++) {
            String input = in.readLine();
            String[] con = input.split(" ");
            if (con.length == 2) {
                tg.addConnect(con[0], con[1]);
            } else {
                throw new Exception("Salah Format");
            }
        }
        String input;
        while ((input = in.readLine()) != "") {
            String[] arr = input.split(" ");
            arr[0] = arr[0].toLowerCase();
            switch (arr[0]) {
                //Menambahkan user baru
                case "insert":
                    tg.addUser2(arr[1], arr[2], arr[3], arr[4]);
                    break;
                //Menambahkan koneksi baru
                case "connect":
                    tg.addConnect2(arr[1], arr[2]);
                    break;
                //Melihat user dengan follower terbanyak
                case "mostfollowed":
                    tg.mostfollowed();
                    break;
                //Melihat minimum retweet
                case "minrt":
                    tg.minrt(arr[1], arr[2]);
                    break;
                //Melihat jumlah circle/group
                case "numgroup":
                    tg.numgroup();
                    break;
                //Melihat topic dari tiap group
                case "grouptopic":
                    tg.grouptopic();
                    break;
            }
            if (input.equals("")) {
                break;
            }
        }
        in.close();
    }
}