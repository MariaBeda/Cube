import java.awt.*;
import java.util.ArrayList;

public class Cube{
    private Facet[] facets;
    public Cube(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0),new R3Vector(0,1,0), Color.cyan);
        facets[1] = new Facet(new R3Vector(0,0,0), new R3Vector(0,0,1), new R3Vector(1,0,1),new R3Vector(1,0,0), Color.black);
        facets[2] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(0,1,1),new R3Vector(0,0,1),Color.magenta);
        facets[3] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0),new R3Vector(1,0,1), Color.red);
        facets[4] = new Facet(new R3Vector(1,1,1), new R3Vector(1,0,1), new R3Vector(0,0,1),new R3Vector(0,1,1), Color.blue);
        facets[5] = new Facet(new R3Vector(1,1,1), new R3Vector(0,1,1), new R3Vector(0,1,0),new R3Vector(1,1,0), Color.green);
    }
    public void rotate(double x_degree, double y_degree, double z_degree){
        for(int i = 0; i < facets.length; i++){
            facets[i].rotate(x_degree, y_degree, z_degree);
        }
    }
    public void  scale(double k){
        for(int i = 0; i < facets.length; i++){
            facets[i].scale(k);
        }
    }
    public void translate(double dx, double dy, double dz){
        for(int i = 0; i < facets.length; i++){
            facets[i].translate(dx, dy, dz);
        }
    }
    public void draw(Graphics2D g){
        for(int i = 0; i < facets.length; i++){
            if(facets[i].normal() > 0){
                facets[i].draw(g);
            }

        }
    }
}
