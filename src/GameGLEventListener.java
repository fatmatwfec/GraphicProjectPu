import javax.media.opengl.GLAutoDrawable;
import java.awt.event.KeyEvent;

public class GameGLEventListener extends GameListener{

    private double xBall=0;
    private double yBall=0;
    private double dxBall=0.02;
    private double dyBall=0.01;
    private double xmax=350;
    private double xmin=-350;
    private double ymax=350;
    private double ymin=-350;
    @Override
    public void init(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }

    @Override
    public void displayChanged(GLAutoDrawable glAutoDrawable, boolean b, boolean b1) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void updateball(){
        xBall += dxBall;
        yBall += dyBall;
        //تغيير الاتجاه لو الكرة خبطت فى الحواف
        if(xBall >= xmax ||xBall <= xmin){
            dxBall = -dxBall;
        }
        if(yBall >= ymax ||yBall <= ymin){
            dyBall = -dyBall;
        }
    }
}

