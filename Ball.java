
import java.awt.*;

public class Ball {

    private final int diameter = 50;
    private int x, y;

    private final int SPEED = 3;
    private double dx = SPEED, dy = SPEED;

    public Ball(){
        x = 0;
        y = 0;
    }

    public void setPosition(int x, int y){

        this.x = x - diameter/2;
        this.y = y - diameter/2;

    }

    public void move(){
        x += dx;
        y += dy;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDiameter(){
        return diameter;
    }

    public void paint(Graphics g){
        g.fillOval(x, y, diameter, diameter);
    }

}
