package com.company;

import java.awt.*;
import java.awt.geom.Path2D;

//радиус-вектор
public class R3Vector {
    private double x, y, z;
    public R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector(){
    }

    public void out(){
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
    public R3Vector sum(R3Vector a){
// System.out.println("(" + a.x + x + ", " + a.y + y +", " + a.z + z + ")");
        return new R3Vector(x +a.x, y + a.y, z + a.z);
    }
    public static R3Vector sum(R3Vector a, R3Vector b){
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public void scale(double k){
        this.x *= k;
        this.y *= k;
        this.z *= k;
    }
    public void trans(double dx, double dy, double dz){
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }
    public void Scal(R3Vector a){
        double c = (a.x * x + a.y * y + a.z * z);
        System.out.println(c);
    }
/*
    public static R3Vector Vect(R3Vector a,R3Vector b){
        return new R3Vector(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }


    public double FacetDir(R3Vector a,R3Vector b){
        double dir;
        double B=0;
        R3Vector c = Vect( a, b);
        dir = (a.x*b.y*c.z + a.y*b.z*c.x+a.z*b.x*c.y)-(a.x*b.z*c.y+a.y*b.x*c.z+a.z*b.y*c.x);
        if (dir>0)
            B=1;
        if (dir<0)
            B=-1;
        return B;
    }
    */
    public void rotateZ (double u){
        double c = u * Math.PI /180;
        double x1 = x;
        x = x1* Math.cos(c) - y* Math.sin(c);
        y = x1* Math.sin(c) + y* Math.cos(c);
    }
    public void rotateY (double u){
        double c = u * Math.PI /180;
        double x1 = x;
        x = x1* Math.cos(c) - z* Math.sin(c);
        z = x1* Math.sin(c) + z* Math.cos(c);
    }
    public void rotateX (double u){
        double c = u * Math.PI /180;
        double z1 = z;
        z = z1* Math.cos(c) - y* Math.sin(c);
        y = z1* Math.sin(c) + y* Math.cos(c);
    }
    public void rotate(char k, double u){
        switch (k){
            case 'x':
                rotateX(u);
                break;
            case 'y':
                rotateY(u);
                break;
            case 'z':
                rotateZ(u);
                break;
        }
    }
    public void rotateAll(double u, double v, double t){
        rotateX(u);
        rotateY(v);
        rotateZ(t);
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ(){
        return this.z;
    }


}
