package ProjekGraph.projek;

import java.util.Scanner;

public class MainTwitty {
    public static void main(String[] args) {
       Twitty tw = new Twitty();
       int count = 0;
       Scanner in = new Scanner(System.in);
       while (in.hasNextLine()){
           String input = in.nextLine();
           if (count == 0){
               count = Integer.parseInt(input);

           } else {
               String [] arr = input.split(" ");
               arr[0] = arr[0].toLowerCase();
               switch (arr[0]){
                   case "insert":
                       break;
                   case "connect":
                       break;
                   case "mostfollowed":
                       break;
                   case "minrt":
                       break;
                   case "numgroup":
                       break;
                   case "grouptopic":
                       break;
               }
           }
           if (input.isEmpty()){
               break;
           }
       }
       in.close();
    }
}
