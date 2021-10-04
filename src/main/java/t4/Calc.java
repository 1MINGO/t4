package t4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calc
{
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        System.out.print(add(x,y)+"\n");
        System.out.print(subtract(x,y));
    }
}
