package com.test.exam02;

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class Point4D extends Point3D {
    int w = 40;

    Point4D() {
        this(100, 200, 300, 400);
    }

    Point4D(int x, int y, int z, int w) {
        super(x, y, z);
        this.w = w;
    }
}

public class SuperExam {
    public static void main(String[] args) {
        Point4D point4d = new Point4D();
        System.out.println("Point4D의 x, y, z, w = " + point4d.x + " " + point4d.y + " " + point4d.z + " " + point4d.w);
    }
}
