import java.awt.*;

public class Paddle {

    private int x, y;
    private final int WIDTH = 20, HEIGHT = 100;

    private Game game;
    private Ball ball;
    private Board board;

    public Paddle(Game game,Board board, Ball ball){
        x = 0;
        y = 0;
        this.game = game;
        this.ball = ball;
        this.board = board;
    }

    public void move(){
        if(game.isUpPressed()){
            y -= 5;
        }
        if(game.isDownPressed()){
            y += 5;
        }
    }

    public void moveAI(){
        //Start moving towards the ball, after it crosses the halfway point
        if(ball.getX() + ball.getDiameter() > board.getWidth()/2){
            if(ball.getY() > (y + HEIGHT)/2){
                y += 3;
            }
            if(ball.getY() < (y + HEIGHT)/2){
                y -= 3;
            }
        }
    }

    public void setPosition(int x, int y){

        this.x = x - WIDTH/2;
        this.y = y - HEIGHT/2;

    }



    public void paint(Graphics g){ g.fillRect(x,y,WIDTH, HEIGHT); }

}
