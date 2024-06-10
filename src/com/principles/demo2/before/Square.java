package com.principles.demo2.before;
/**
 * @Author huzc
 * @Description 正方形
 * @Date   12:27
 * @Param * @param null
 * @return * @return {@link null }
 **/

public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
