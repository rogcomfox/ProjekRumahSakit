package ProjekGraph.jojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Vertex {

    String user;
    String minat[] = new String[3];
    int followed;
    boolean wasVisited;

    public Vertex(String user, String minat1, String minat2, String minat3) {
        this.user = user;
        minat[0] = minat1;
        minat[1] = minat2;
        minat[2] = minat3;
    }
}

public class TwittyGraph {
    private final int MAX_VERTS = 100;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public TwittyGraph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    }

    public void addUser(String user, String minat1, String minat2, String minat3) {
        vertexList[nVerts++] = new Vertex(user, minat1, minat2, minat3);
    }

    public void addUser2(String user, String minat1, String minat2, String minat3) {
        vertexList[nVerts++] = new Vertex(user, minat1, minat2, minat3);
        System.out.println(user + " inserted");
    }

    public void addConnect(String following, String followed) {
        int user1 = -1;
        int user2 = -1;
        for (int i = 0; i < nVerts; i++) {
            if (vertexList[i].user.equals(following)) {
                user1 = i;
            }
            if (vertexList[i].user.equals(followed)) {
                user2 = i;
            }
        }
        adjMat[user1][user2] = 1;
        vertexList[user2].followed++;
    }

    public void addConnect2(String following, String followed) {
        int user1 = -1;
        int user2 = -1;
        for (int i = 0; i < nVerts; i++) {
            if (vertexList[i].user.equals(following)) {
                user1 = i;
            }
            if (vertexList[i].user.equals(followed)) {
                user2 = i;
            }
        }
        adjMat[user1][user2] = 1;
        vertexList[user2].followed++;
        System.out.println("connect " + following + " " + followed + " success");
    }

    public void mostfollowed() {
        Vertex comparator = vertexList[0];
        String[] mostfollowed = new String[]{};
        for (int i = 1; i < nVerts; i++) {
            if (vertexList[i].followed > comparator.followed) {
                mostfollowed = new String[1];
                mostfollowed[0] = vertexList[i].user;
                comparator = vertexList[i];
            }
            if (vertexList[i].followed == comparator.followed) {
                String[] temporary = mostfollowed;
                mostfollowed = new String[temporary.length + 1];
                System.arraycopy(temporary, 0, mostfollowed, 0, temporary.length);
                mostfollowed[mostfollowed.length - 1] = vertexList[i].user;
                //Sorting
                for (int k = 0; k < mostfollowed.length; i++) {
                    for (int l = k + 1; l < mostfollowed.length; l++) {
                        if (mostfollowed[k].compareTo(mostfollowed[l]) > 0) {
                            String temporary1 = mostfollowed[k];
                            mostfollowed[k] = mostfollowed[l];
                            mostfollowed[l] = temporary1;
                        }
                    }
                }
            }
        }
    }

    public void displayVertex() {
        for (int i = 0; i < nVerts; i++) {
            System.out.println(vertexList[i].user);
            for (String minat : vertexList[i].minat) {
                System.out.print(" " + minat);
            }
        }
    }


}
