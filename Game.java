import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Game extends JFrame implements KeyListener {

    private Board board;
    private boolean upPressed, downPressed;

    public Game(){

        setResizable(false);
        //************************
        setVisible(true);
        //************************
        setFocusable(true);
        setTitle("PONG");
        //setIcon is also a property for your own discovery and usage
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board = new Board(this);

        add(board);
        addKeyListener(this);

        pack();
        //Sets the frame in the middle of the screen
        setLocationRelativeTo(null);
        board.init();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_UP){
            upPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            downPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_UP){
            upPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            downPressed = false;
        }

    }

    public boolean isUpPressed(){
        return upPressed;
    }

    public boolean isDownPressed(){
        return downPressed;
    }

    public static void main(String[] args){
        new Game();
    }
  
}  
public class Main extends Applet{
   public void paint(Graphics g){
      g.drawString("Welcome in Java Applet.",40,20);
   }
}


