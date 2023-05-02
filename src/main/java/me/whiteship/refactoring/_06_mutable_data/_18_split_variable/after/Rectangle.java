package me.whiteship.refactoring._06_mutable_data._18_split_variable.after;

public class Rectangle {

    private double perimeter;
    private double area;

    // temp 변수는 그 자체의 이름도 의미가 없으며, 여러 번 재할당 됨.
    public void updateGeometry(double height, double width) {
        final double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

        final double area = height * width;
        System.out.println("Area: " + area);
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
