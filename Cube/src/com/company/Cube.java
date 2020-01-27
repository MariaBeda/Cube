package com.company;

import java.awt.*;

public class Cube {
    private Facet[] facets;

    public Cube(){
        facets = new Facet[6];
        facets[0]=new Facet(new R3Vector(0,0,0),new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(0,1,0), Color.blue);
        facets[1]=new Facet(new R3Vector(0,0,0),new R3Vector(0,0,1), new R3Vector(1,0,1), new R3Vector(1,0,0), Color.red);
        facets[2]=new Facet(new R3Vector(0,0,0),new R3Vector(0,1,0), new R3Vector(0,1,1), new R3Vector(0,0,1),Color.getHSBColor(70,200,70));
        facets[3]=new Facet(new R3Vector(0,1,0),new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(0,1,1),Color.yellow);
        facets[4]=new Facet(new R3Vector(0,1,1),new R3Vector(1,1,1), new R3Vector(1,0,1), new R3Vector(0,0,1),Color.orange);
        facets[5]=new Facet(new R3Vector(1,1,1),new R3Vector(1,1,0), new R3Vector(1,0,0), new R3Vector(1,0,1),Color.lightGray);
    };
    public void rotate(double ux, double uy, double uz) {
        for (int i = 0; i < facets.length; i++) {
            facets[i].rotate(ux, uy, uz);
        }
    }

    public void scale(double scalenumber){
        for (int i = 0; i < facets.length; i++) {
            facets[i].scale(scalenumber);
        }
    }

    public void trans(double transnumberX, double transnumberY,double transnumberZ){
        for (int i = 0; i < facets.length; i++) {
            facets[i].trans(transnumberX, transnumberY,transnumberZ);
        }
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < facets.length; i++) {
            facets[i].draw(g);
        }

    }
}
