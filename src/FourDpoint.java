import java.awt.*;

public class FourDpoint extends Point {

    int w;
    int h;

    public FourDpoint(int x, int y, int w, int h){
        super(x, y);
        this.w = w;
        this.h = h;

    }

    public static void main(String[] args) {
        FourDpoint fourDpoint = new FourDpoint (5,4,3,2);
        fourDpoint.show(fourDpoint);


    }

    void show(FourDpoint fourDpoint) {
        System.out.println("x wynosi: " + fourDpoint.x);
        System.out.println("y wynosi: " + fourDpoint.y);
        System.out.println("w wynosi: " + fourDpoint.w);
        System.out.println("h wynosi: " + fourDpoint.h);


    }




    }



