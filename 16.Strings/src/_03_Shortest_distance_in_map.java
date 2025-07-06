import java.util.*;

public class _03_Shortest_distance_in_map {
    public static float Shortdist(String str){
        int x=0;
        int y= 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            switch (dir) {
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNNESWESWNNNESWNNNEWSWENNNESNSSSSSSEWSWEWSWENSESSSWWWWWWWWWWEEEEEWEWN";
        System.out.println(Shortdist(path));
    }
}
