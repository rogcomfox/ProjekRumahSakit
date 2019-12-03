package ProjekGraph.projek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GraphNode{

}

public class MainTwitty {

}

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        MainTwitty mt = new MainTwitty();
        int U = 0;
        int C = 0;
        U = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        String [][] adjency = new String[U][4];
        String [][] connect = new String[C][2];

        for (int i = 0; i < U;i++){
            String input = in.readLine();
            String[] inp = input.split(" ");
            if (inp.length != 4){
                System.out.println("WRONG FORMAT");
            } else {
                adjency[i][0] = inp[0];
                adjency[i][1] = inp[1];
                adjency[i][2] = inp[2];
                adjency[i][3] = inp[3];
            }
        }
        for (int i = 0; i < C; i++) {
            String input = in.readLine();
            String[] inp1 = input.split(" ");
            if (inp1.length != 2){
                System.out.println("WRONG FORMAT");
            } else {
                connect [i][0] = inp1[0];
                connect [i][1] = inp1[1];
            }
        }
    }
}