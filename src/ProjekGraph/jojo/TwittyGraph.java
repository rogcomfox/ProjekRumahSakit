package ProjekGraph.jojo;
//Joseph Ananda Sugihdharma (185150200111026)
//Yusuf Gladiensyah Bihanda (185150201111013)
//Muhammad Najmi Faisal (185150207111012)

class Vertex {

    String user;
    String[] minat = new String[3];
    int followed;
    //Parameter yang dibutuhkan setiap vertex
    public Vertex(String user, String minat1, String minat2, String minat3) {
        this.user = user;
        minat[0] = minat1;
        minat[1] = minat2;
        minat[2] = minat3;
    }
}

public class TwittyGraph {
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;
    String[][] group = new String[][]{};
    private int connect;
    private int groups;
    private int alone;

    //Membuat adjacency matriks
    public TwittyGraph() {
        int MAX_VERTS = 25;
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    //Menambahkan user baru (inisialisasi awal)
    public void addUser(String user, String minat1, String minat2, String minat3) throws Exception {
        try {
            vertexList[nVerts++] = new Vertex(user, minat1, minat2, minat3);
            alone++;
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Menambahkan user baru (tambahan melalui switch case) + mencetak status ketika berhasil ditambahkan
    public void addUser2(String user, String minat1, String minat2, String minat3) throws Exception{
        try {
            vertexList[nVerts++] = new Vertex(user, minat1, minat2, minat3);
            System.out.println(user + " inserted");
            alone++;
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Menambahkan koneksi baru antar user (inisialisasi awal)
    public void addConnect(String following, String followed) throws Exception{
        try {
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
            connect++;
            grouping(following, followed);
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Menambahkan koneksi baru antar user(tambahan melalui switch case) + mencetak status ketika berhasil ditambahkan
    public void addConnect2(String following, String followed) throws Exception{
        try {
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
            connect++;
            grouping(following, followed);
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Mengetahui user yang difollow paling banyak
    public void mostfollowed() throws Exception{
        try {
            Vertex comparator = vertexList[0];
            String[] mostfollowed = new String[]{};
            for (int i = 1; i < nVerts; i++) {
                if (vertexList[i].followed == comparator.followed) {
                    String[] temporary = mostfollowed;
                    mostfollowed = new String[temporary.length + 1];
                    System.arraycopy(temporary, 0, mostfollowed, 0, temporary.length);
                    mostfollowed[mostfollowed.length - 1] = vertexList[i].user;
                    //Sorting
                    for (int k = 0; k < mostfollowed.length; k++) {
                        for (int l = k + 1; l < mostfollowed.length; l++) {
                            if (mostfollowed[k].compareTo(mostfollowed[l]) > 0) {
                                String temporary1 = mostfollowed[k];
                                mostfollowed[k] = mostfollowed[l];
                                mostfollowed[l] = temporary1;
                            }
                            System.out.println(mostfollowed);
                        }
                    }
                }
                if (vertexList[i].followed > comparator.followed) {
                    mostfollowed = new String[1];
                    mostfollowed[0] = vertexList[i].user;
                    comparator = vertexList[i];
                }
            }
            System.out.println(String.join(", ", mostfollowed));
        } catch (Exception e){
            throw  new Exception("WRONG FORMAT");
        }
    }

    //Mengetahui minimum retweet
    public void minrt(String user1, String user2) throws Exception {
        try{

        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Mengetahui jumlah circle/group
    public void grouping(String user1, String user2) throws Exception {
        try{

            alone-=2;
            String[][] temp = group;
            group = new String[groups+1][nVerts];
            System.arraycopy(temp, 0, group, 0, temp.length);
            if (group[0][0] == "") {
                group[0][0] = user1;
                group[0][1] = user2;
            } else {
                alone++;
                for (int i = 0; i < groups; i++) {
                    for(int j=0; j < nVerts; j++) {
                        if (group[i][j].equals(user1) || group[i][j].equals(user2)) {
                            if (group[i][j].equals(user1)) {
                                group[i][group[i].length - 1] = user2;
                                break;
                            } else {
                                group[i][group[i].length - 1] = user1;
                                break;
                            }
                        }
                    }
                }
                groups++;
                group[groups-1][0] = user1;
                group[groups-1][1] = user2;
            }
            for(int k=0; k<group.length; k++){
                for(int l=0; l<group[k].length; l++){
                    System.out.println(group[k][l]);
                    System.out.println(k);
                    System.out.println(l);
                }
            }
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Pemanggilan hasil dari method grouping untuk mengetahui jumlah circle
    public void numgroup() throws Exception{
        try {
            System.out.println(group.length + alone);
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }

    //Mengetahui jumlah topic dari masing masing group
    public void grouptopic() throws Exception{
        try {
            String[] arr1 = new String[5];
            int[] arr2 = new int[5];
        } catch (Exception e){
            throw new Exception("WRONG FORMAT");
        }
    }
}
