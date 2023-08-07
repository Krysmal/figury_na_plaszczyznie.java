package edu.shapes;

import java.awt.*;

public class CIbeam extends CPoly{
    protected int A;
    protected int H;
    protected int G;

    public CIbeam(int x0, int y0, Color fillColor, Color borderColor, int a, int h, int g) {
        super(x0, y0, fillColor, borderColor, 12);
        this.A=a;
        this.H=h;
        this.G=g;
    }

    @Override
    protected void updateCordinates() {
        px[0] = X0 ; py[0] = Y0;
        px[1] = X0; py[1] = Y0+G;
        px[2] = X0+A/2-G/2; py[2] = Y0+G;
        px[3] = X0+A/2-G/2; py[3] = Y0+H-G;
        px[4] = X0; py[4] = Y0+H-G;
        px[5] = X0; py[5] = Y0+H;
        px[6] = X0+A; py[6] = Y0+H;
        px[7] = X0+A; py[7] = Y0+H-G;
        px[8] = X0+A/2+G/2; py[8] = Y0 + H-G;
        px[9] = X0+A/2+G/2; py[9] = Y0 +G;
        px[10] = X0+A; py[10] = Y0+G;
        px[11] = X0+A; py[11] = Y0;
    }
}
