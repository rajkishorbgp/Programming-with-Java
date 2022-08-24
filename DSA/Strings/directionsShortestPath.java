/*
 *    Given a route Containing 4 directions( E , W , N , S ) , 
 *    find the shortest path to reach destination.
 *        route Containing: [ "WNEENESENNN" ]
 */
import java.util.*;
public class directionsShortestPath {
    
    public static double shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c=='E'){
                x++;
            }
            else if(c=='W'){
                x--;
            }
            else if(c=='N'){
                y++;
            }
            else if(c=='S'){
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
       return (double)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {

        String route="WNEENESENNN";
        System.out.print(shortestPath(route));
    }
}