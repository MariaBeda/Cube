package com.company;

import java.awt.*;
import java.awt.geom.Path2D;

//грань
public class Facet {
    private R3Vector[] vertex;
    private Color color;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4, Color colorget) {
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
        color=colorget;
    }


    public void out() {
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].out();
        }
    }

    public void rotate(double ux, double uy, double uz) {
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].rotateAll(ux, uy, uz);
        }
    }

    public void scale(double scalenumber1){
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].scale(scalenumber1);
        }
    }

    public void trans(double transnumberX, double transnumberY,double transnumberZ){
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].trans(transnumberX, transnumberY,transnumberZ);
        }
    }

    public static R3Vector Vect(R3Vector a,R3Vector b){
        return new R3Vector(a.getY() * b.getZ() - a.getZ() * b.getY(), a.getZ() * b.getX() - a.getX()* b.getZ(), a.getX() * b.getY() - a.getY() * b.getX());
    }

    public double FacetDir(R3Vector a,R3Vector b){
        double dir;
        double B=0;
        R3Vector c = Vect( a, b);
        dir = (a.getX()*b.getY()*c.getZ() + a.getY()*b.getZ()*c.getX()+a.getZ()*b.getX()*c.getY())-(a.getX()*b.getZ()*c.getY()+a.getY()*b.getX()*c.getZ()+a.getZ()*b.getY()*c.getX());
        if (dir>0)
            B=1;
        if (dir<0)
            B=-1;
        System.out.println(dir);
        return B;
    }
/*
    public double CheckVis(R3Vector a,R3Vector b){
        double dir;
        double B=0;
        R3Vector c = Vect( a, b);
        dir =;
        if (a.getX()<b.getX() || a.getY()<b.getY() || )
        if (dir>0)
            B=1;
        if (dir<0)
            B=-1;
        System.out.println(dir);
        return B;

    }
*/
    public void draw(Graphics2D g) {
        if (FacetDir(vertex[0],vertex[1])  > 0) {
        //if(CheckVis(vertex[0],vertex[2])  > 0 && CheckVis(vertex[1],vertex[3])  > 0){
            Path2D p = new Path2D.Double();
            g.setColor(this.color);
            p.moveTo(vertex[0].getX(), -vertex[0].getY());
            p.lineTo(vertex[1].getX(), -vertex[1].getY());
            p.lineTo(vertex[2].getX(), -vertex[2].getY());
            p.lineTo(vertex[3].getX(), -vertex[3].getY());
            p.lineTo(vertex[0].getX(), -vertex[0].getY());
            g.fill(p);
         }
    }



/*
    public void draw(Graphics2D g){
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].draw(Graphics2D g);
        }
    }
    */
}