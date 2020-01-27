package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        R3Vector a = new R3Vector(0,0,0);
        R3Vector b = new R3Vector(0,1,0);
        R3Vector c = new R3Vector(1,1,0);
        R3Vector d = new R3Vector(1,0,0);
        Cube c1 = new Cube();
        c1.rotate(45, 45, 15);
        c1.scale(150);
        MyWindow v = new MyWindow(c1);
    }
}
