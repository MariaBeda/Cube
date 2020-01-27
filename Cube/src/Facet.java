import java.awt.*;
import java.awt.geom.Path2D;

public class Facet {
    private R3Vector[] vertex;
    private Color color;

    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4, Color color){
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
        this.color = color;

    }
    public void out(){
        for(int i = 0; i < vertex.length; i++){
            vertex[i].out();
        }
    }
    public void rotate(double ux, double uy, double uz){
        for(int i = 0; i < vertex.length; i++){
            vertex[i].rotate(ux, uy, uz);
        }
    }
    public void  scale(double k){
        for(int i = 0; i < vertex.length; i++){
            vertex[i].scale(k);
        }
    }
    public void translate(double dx, double dy, double dz){
        for(int i = 0; i < vertex.length; i++){
            vertex[i].translate(dx, dy, dz);
        }
    }
    public void draw(Graphics2D g){
        Path2D p = new Path2D.Double();
        p.moveTo(vertex[0].getX(), vertex[0].getY());
        p.lineTo(vertex[1].getX(), vertex[1].getY());
        p.lineTo(vertex[2].getX(), vertex[2].getY());
        p.lineTo(vertex[3].getX(), vertex[3].getY());
        p.lineTo(vertex[0].getX(), vertex[0].getY());
        p.closePath();
        g.setColor(color);
        g.draw(p);
        g.fill(p);
    }
    public double normal(){
        R3Vector a = new R3Vector(vertex[0].getX() - vertex[1].getX(), vertex[0].getY() - vertex[1].getY(), vertex[0].getZ() - vertex[1].getZ());
        R3Vector b = new R3Vector(vertex[2].getX() - vertex[1].getX(), vertex[2].getY() - vertex[1].getY(), vertex[2].getZ() - vertex[1].getZ());
        R3Vector c = a.vec(a, b);
        return c.getZ()*(-1);
    }


}
