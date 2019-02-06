import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{
    Ball ball;
    Paddle ppaddle;
    Paddle cpaddle;
    Timer timer;
    Game game;

    private final int EDGESPACE = 50;

    public Board(Game game){

        setPreferredSize(new Dimension(800,600));

        setBackground(Color.BLACK);
        this.game = game;
        ball = new Ball();
        ppaddle = new Paddle(this.game, this, this.ball);
        cpaddle = new Paddle(this.game, this, this.ball);

    }

    public void init(){

        ball.setPosition(getWidth()/2, getHeight()/2);
        ppaddle.setPosition(EDGESPACE, getHeight()/2);
        cpaddle.setPosition(getWidth()-EDGESPACE, getHeight()/2);

        timer = new Timer(1000/60, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent e){
        ball.move();
        ppaddle.move();
        cpaddle.moveAI();

        repaint();
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.WHITE);
        ball.paint(g);
        ppaddle.paint(g);
        cpaddle.paint(g);

    }

}
