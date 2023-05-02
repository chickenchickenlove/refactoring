package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Rectangle {

    private double perimeter;
    private double area;

    // temp 변수는 그 자체의 이름도 의미가 없으며, 여러 번 재할당 됨.
    public void updateGeometry(double height, double width) {
        double temp = 2 * (height + width);
        System.out.println("Perimeter: " + temp);
        perimeter = temp;

        temp = height * width;
        System.out.println("Area: " + temp);
        area = temp;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
