package ProjekGraph.projek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GraphNode {

}

public class MainTwitty {

}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        MainTwitty mt = new MainTwitty();
        int U;
        int C;
        int nVertex = 100;
        U = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        String[][] adjacency = new String[100][4];
        String[][] connect = new String[100][2];

        for (int i = 0; i < U; i++) {
            String input = in.readLine();
            String[] inp = input.split(" ");
            if (inp.length != 4) {
                System.out.println("WRONG FORMAT");
            } else {
                adjacency[i][0] = inp[0];
                adjacency[i][1] = inp[1];
                adjacency[i][2] = inp[2];
                adjacency[i][3] = inp[3];
            }
        }
        for (int i = 0; i < C; i++) {
            String input = in.readLine();
            String[] inp1 = input.split(" ");
            if (inp1.length != 2) {
                System.out.println("WRONG FORMAT");
            } else {
                connect[i][0] = inp1[0];
                connect[i][1] = inp1[1];
            }
        }
        String input = "";
        while (in.readLine() != null) {
            input = in.readLine();
            String[] arr = input.split(" ");
            arr[0] = arr[0].toUpperCase();
            switch (arr[0]) {
                case "INSERT":
                    for (int i = 0; i < nVertex; i++) {
                        if (adjacency[i][0] == null) {
                            adjacency[i][0] = arr[1];
                            adjacency[i][1] = arr[2];
                            adjacency[i][2] = arr[3];
                            adjacency[i][3] = arr[4];
                        }
                    }
                    break;
                case "CONNECT":
                    for(int i = 0; i < nVertex; i++){
                        if(connect[i][0] == null){
                            connect[i][0] = arr[1];
                            connect[i][1] = arr[2];
                        }
                    }
                    break;
                case "MOSTFOLLOWED":
                    /*
                    int[] freq = new int[adjacency.length];
                    for(int i=0; i<adjacency.length; i++){
                        freq[i] = 1;
                        for(int j = i+1; j<adjacency.length; j++){
                            if(adjacency[i][0] == adjacency[j][0]){
                                freq[i]++;
                            }
                        }
                    }
                    for(int i=0; i<freq.length; i++){
                        System.out.println(adjacency[i][0]+" - " + freq[i]);
                    }
                    */
                    break;
                case "MINRT":
                    break;
                case "GROUPING":
                    break;
                case "GROUPTOPIC":
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