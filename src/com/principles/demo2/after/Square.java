package com.principles.demo2.after;

/**
 * @Author huzc
 * @Description 正方形
 * @Date   12:27
 * @Param * @param null
 * @return * @return {@link null }
 **/

public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
