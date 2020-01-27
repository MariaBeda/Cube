import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class Viewer extends JFrame {
    private Cube cube;
    public static final int width = 800, height = 800;
    public Viewer(Cube cube) {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.cube = cube;
    }
@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(getWidth()/2,getHeight()/2);
        g2d.drawLine(-getWidth()/2, 0 ,getWidth()/2, 0);
        g2d.drawLine(0,-getHeight()/2,0,getHeight()/2);

        cube.draw(g2d);
    }
}
