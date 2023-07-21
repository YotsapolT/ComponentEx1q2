import java.util.Scanner;

public class Foot {
    FootShape fs;

    public void draw(int num){
        fs = new FootShape();
        switch(num){
            case 1:
                fs.drawAsEllipse();
                break;
            case 2:
                fs.drawASRectangle();
                break;
        }

    }

    public static void main(String[] args) {
        Foot f = new Foot();
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        f.draw(input);
        in.close();
    }
}
