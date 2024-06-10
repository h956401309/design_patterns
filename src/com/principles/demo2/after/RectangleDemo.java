package com.principles.demo2.after;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        print(rectangle);
        System.out.println("==============================");
        Square s= new Square();
        // 设置长和宽
        s.setSide(10);
        // 正方形 不能使用这个函数 违反了里氏代换原则
//        resize(s);
        print(s);

    }
    // 扩宽方法
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void print(Quadrilateral rectangle){
        System.out.println("长"+rectangle.getLength());
        System.out.println("宽"+rectangle.getWidth());
    }
}
