package edu.shapes;

import java.awt.*;

public abstract class CPoly extends CShape{

    protected int [] px;
    protected int [] py;
    protected int pointCount;

    protected abstract void updateCordinates();

    public CPoly(int x0, int y0, Color fillColor, Color borderColor,int points) {
        super(x0, y0, fillColor, borderColor);
        pointCount=points;
        px=new int[pointCount];
        py=new int[pointCount];
    }

    @Override
    protected boolean isPointInside(int xk, int yk) {
        updateCordinates();
        Polygon p =new Polygon(px,py,pointCount);
        return p.contains(xk,yk);
    }

    @Override
    protected void drawShape(Graphics2D g2d) {
        updateCordinates();
        g2d.setColor(fillColor);
        g2d.fillPolygon(px,py,pointCount);
        g2d.setColor(borderColor);
        g2d.drawPolygon(px,py,pointCount);
    }

    @Override
    public void moveTo(int x,int y){
        updateCordinates();
        super.moveTo(x,y);
    }

}
