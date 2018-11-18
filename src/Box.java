import java.awt.*;

public class Box {

    int x1;
    int y1;
    int x2;
    int y2;

    Box (int x1, int y1,int x2, int y2) { // konstruktor
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    Box (Point topLeft, Point bottomRight) { // konstruktor
        this(topLeft.x, topLeft.y,bottomRight.x,bottomRight.y);
        System.out.println("konstruktor point, point");


    }

    Box (Point topLeft, int w, int h){ // konstr
        this (topLeft.x, topLeft.y,topLeft.x+w,topLeft.y+w);

    }

    void printBox(){
        System.out.println("Box: <" + x1 + " ," + y1 + " ," + x2 + " ," + y2 + " >");



    }


    public static void main(String[] args) {
        Box rect;
        System.out.println("Wywołanie buildBox z punktami (10,10) i (20,20)");
        Point a = new Point(10,10);
        Point b = new Point(20,20);
        rect = new Box(a,b);
        rect.printBox();

        System.out.println("Wywołanie buildBox z punktem (10,10) i szerok 50 i  wys 50");
        rect = new Box (a, 50,50);
        rect.printBox();

        System.out.println("Wywołanie buildBox z e współrz (25,25) i (50,50)");
        rect = new Box(25,25,50,50);
        rect.printBox();




    }
}
