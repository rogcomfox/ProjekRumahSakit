package ProjekGraph.jojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainTwitty {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        TwittyGraph tg = new TwittyGraph();
        int U = Integer.parseInt(in.readLine());
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
                case "insert":
                    tg.addUser2(arr[1], arr[2], arr[3], arr[4]);
                    break;
                case "connect":
                    tg.addConnect2(arr[1], arr[2]);
                    break;
                case "mostfollowed":
                    tg.mostfollowed();
                    break;
                case "minrt":
                    break;
                case "numgroup":
                    break;
                case "grouptopic":
                    //tg.grouptopic();
                    break;
            }
            if (input.equals("")) {
                break;
            }
        }
        in.close();
        //printToTail();
    }
}