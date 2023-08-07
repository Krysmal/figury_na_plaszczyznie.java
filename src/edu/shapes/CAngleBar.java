package edu.shapes;

import java.awt.*;

public class CAngleBar extends CPoly{
    protected int A;
    protected int B;
    protected int G;

    public CAngleBar(int x0, int y0, Color fillColor, Color borderColor, int a, int b,int g) {
        super(x0, y0, fillColor, borderColor, 6);
        this.A=a;
        this.B=b;
        this.G=g;
    }

    @Override
    protected void updateCordinates() {
        px[0] = X0 ; py[0] = Y0;
        px[1] = X0 + A; py[1] = Y0;
        px[2] = X0 + A; py[2] = Y0 - G;
        px[3] = X0+G; py[3] = Y0 - G ;
        px[4] = X0+G; py[4] = Y0 - B ;
        px[5] = X0; py[5] = Y0 - B ;
    }

}
