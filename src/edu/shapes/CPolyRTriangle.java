package edu.shapes;

import java.awt.*;

public class CPolyRTriangle extends CPoly{
    protected int A;
    protected int B;

    public CPolyRTriangle(int x0, int y0, Color fillColor, Color borderColor, int a, int b) {
        super(x0, y0, fillColor, borderColor, 3);
        this.A=a;
        this.B=b;
    }
    @Override
    protected void updateCordinates() {
        px[0]=X0; py[0]=Y0;
        px[1]=X0+A; py[1]=Y0;
        px[2]=X0; py[2]=Y0-B;
    }

}
