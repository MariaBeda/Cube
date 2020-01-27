package com.company;
import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    private Cube c;
    public MyWindow(Cube c){
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.c=c;

    }
    public void paint(Graphics g2)
    {
        Graphics2D g=(Graphics2D)g2;
        //super.paint(g);
        g.translate(getWidth()/2,getHeight()/2); // Смещение точки начала координат

        g.drawLine(-getWidth()/2, 0 ,getWidth()/2, 0);
        // g.setColor(new Color(0,0,0));
        g.drawLine(0,-getHeight()/2,0,getHeight()/2);
        // g.translate(-getWidth()/2,-getHeight()/2);
        c.draw(g);
        //g.translate(-getWidth()/2,-getHeight()/2); // Возврат точки начала координат в исходное значение (нужно для положительных значений генерирующихся координат "птиц" и их отображения на экране)

    }

}