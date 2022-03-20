package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        if (weight < 30) {
            isExpress = true;
        }
        return xLength + yLength + zLength < 300 && xLength > 30 && yLength > 30 && zLength > 30 && isExpress;
    }
}
