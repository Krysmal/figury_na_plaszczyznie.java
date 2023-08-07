package edu.shapes;

import java.awt.*;

public class CChannel extends CPoly{
    protected int A;
    protected int H;
    protected int G;

    public CChannel(int x0, int y0, Color fillColor, Color borderColor, int a, int h, int g) {
        super(x0, y0, fillColor, borderColor, 8);
        this.A=a;
        this.H=h;
        this.G=g;
    }

    @Override
    protected void updateCordinates() {
        px[0] = X0 ; py[0] = Y0;
        px[1] = X0 + A; py[1] = Y0;
        px[2] = X0 + A; py[2] = Y0 - G;
        px[3] = X0+G; py[3] = Y0 - G ;
        px[4] = X0+G; py[4] = Y0 - H+G ;
        px[5] = X0+A; py[5] = Y0 - H+G;
        px[6] = X0+A; py[6] = Y0 - H;
        px[7] = X0; py[7] = Y0 - H;
    }
}
