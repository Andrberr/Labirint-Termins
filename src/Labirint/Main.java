package Labirint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void find(Floor floor, int xs, int ys){
        floor.mas[xs][ys] = -2;
        floor.solution();
        do{
            floor.path(floor.mas);
        }while(floor.X!=floor.xs || floor.Y!=floor.ys);
        floor.route[floor.ind][0] = xs;
        floor.route[floor.ind][1] = ys;

    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("You are on the spaceship. This spaceship has 3 floors. You are on the one of three.");
        System.out.println("To be free, you should find exit from this ship.");
        System.out.println("So, first of all, tell what is the color of walls in your room? Press '1' if orange, Press '2' if blue, Press '3' if pink.");
        int color = in.nextInt();
        if (color==1){
           System.out.println("You are on the 1 floor. You should find exit from this spaceship.");
           System.out.println("What do you see?\n Press '1' if toilet\n Press '2' if TV or big sofa\n " +
                   "Press '3' if picture of Mars\n Press '4' if picture of Moon\n Press '5' if picture of Earth\n" +
                   " Press '6' if picture of Sun.");
           int place = in.nextInt();
           int xs=0,ys=0;
           switch (place){
               case 1:
                     xs = 1;
                     ys = 4;
                     break;

               case 2:
                   xs = 4;
                   ys = 9;
                   break;
               case 3:
                   xs = 2;
                   ys = 8;
                   break;
               case 4:
                   xs = 6;
                   ys = 23;
                   break;
               case 5:
                   xs = 8;
                   ys = 16;
                   break;
               case 6:
                   xs = 3;
                   ys = 6;
                   break;
           }
            Floor floor = new Floor1(9,25,xs,ys,5,0);
            find(floor,xs,ys);
            new Draw(floor.route,1);
        }
        else if (color==2){
            System.out.println("You are on the 2 floor. First of all you should find elevator to go to the 1 floor.");
            System.out.println("What do you see?\n Press '1' if kitchen\n Press '2' if dining room with a lot of tables and chairs \n " +
                    "Press '3' if toilet\n Press '4' if big screen with many buttons on it\n Press '5' if medical equipment\n" +
                    " Press '6' if picture of Venera \n Press '7' if picture of Upiter");
            int place = in.nextInt();
            int xs=0,ys=0;
            switch (place){
                case 1:
                    xs = 2;
                    ys = 5;
                    break;

                case 2:
                    xs = 1;
                    ys = 16;
                    break;
                case 3:
                    xs = 2;
                    ys = 23;
                    break;
                case 4:
                    xs = 8;
                    ys = 11;
                    break;
                case 5:
                    xs = 8;
                    ys = 5;
                    break;
                case 6:
                    xs = 5;
                    ys = 19;
                    break;
                case 7:
                    xs = 4;
                    ys = 8;
                    break;
            }
            Floor floor = new Floor2(9,25,xs,ys,8,2);
            find(floor,xs,ys);
            new Draw(floor.route,2);

        }
        else if (color==3){
            System.out.println("You are on the 3 floor. First of all you should find elevator to go to the 1 floor.");
            System.out.println("What do you see?\n Press '1' if 3 beds\n Press '2' if 4 beds\n " +
                    "Press '3' if toilet\n Press '4' if weapon\n Press '5' if flasks and test tubes\n" +
                    " Press '6' if picture of Saturn \n Press '7' if picture of Neptun");
            int place = in.nextInt();
            int xs=0,ys=0;
            switch (place){
                case 1:
                    xs = 2;
                    ys = 7;
                    break;

                case 2:
                    xs = 2;
                    ys = 20;
                    break;
                case 3:
                    xs = 4;
                    ys = 5;
                    break;
                case 4:
                    xs = 4;
                    ys = 17;
                    break;
                case 5:
                    xs = 5;
                    ys = 22;
                    break;
                case 6:
                    xs = 8;
                    ys = 18;
                    break;
                case 7:
                    xs = 3;
                    ys = 1;
                    break;
            }
            Floor floor = new Floor3(9,25,xs,ys,8,2);
            find(floor,xs,ys);
            new Draw(floor.route,3);
        }
    }

}
