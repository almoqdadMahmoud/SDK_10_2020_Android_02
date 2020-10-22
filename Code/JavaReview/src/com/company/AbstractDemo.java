package com.company;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class AbstractDemo {

    // abstract keyword can be used with

    // 1) Instance methods : abstract method is a method without any body
    // Abstract methods in the super class must be implemented by any concrete (non abstract sub-class) sub-class

    // 2) classes : is a class that may have an abstract methods

    //


    static abstract class Shape {

        public Shape() {
            System.out.println("Shape()");
        }

        private int x,y,z;

        abstract public double area();

        @Override
        public String toString() {
            return "Shape{}";
        }


    }


    static class Rectangle extends Shape {
        private int width, Height;

        public Rectangle() {
            this(0, 0);

        }

        public Rectangle(int width, int height) {
            setHeight(height);
            setWidth(width);
        }

       


        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return Height;
        }

        public void setHeight(int height) {
            Height = height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", Height=" + Height +
                    '}';
        }

        @Override
        public double area() {
            return width * Height;
        }

        Rectangle SomeFunction(Rectangle rectangle){
            return new Rectangle(rectangle.width = 5,rectangle.Height = 4);
        }


    }

    static class Triangle extends Shape {

        @Override
        public String toString() {
            return "Triangle{" +
                    "Width=" + Width +
                    ", Base=" + Base +
                    '}';
        }

        private int Width, Base;

        public Triangle() {
            this(0, 0);
        }

        public Triangle(int width, int base) {
            setWidth(width);
            setBase(base);
        }

        public int getWidth() {
            return Width;
        }

        public void setWidth(int width) {
            Width = width;
        }

        public int getBase() {
            return Base;
        }

        public void setBase(int base) {
            Base = base;
        }

        @Override
        public double area() {
            return Width * Base * 0.5;
        }
    }

    public static void main(String[] args) {

//        Shape shape = null;
//        //shape = new Shape();              // Can;t create an object directly from abstract class
//        // shape.area() ;
//
//        shape = new Rectangle();
//        shape.area();
//
//        shape = new Shape() {
//            @Override
//            public double area() {
//                return 0;
//            }
//        };
//        shape.area();
//
//
//        Shape[] shapes = new Shape[10];
//        Random r = new Random();
//        for (int i = 0; i < shapes.length; i++) {
//            switch (r.nextInt(2)) {
//                case 0:
//                    shapes[i] = new Rectangle(r.nextInt(10), r.nextInt(10));
//                    break;
//                case 1:
//                    shapes[i] = new Triangle(r.nextInt(10), r.nextInt(10));
//                    break;
////                default:
////                    shapes[i] = new Shape();            // if Shape is abstract class, then you can't create an object of it directly using new operator
////                    break;
//            }
//
//            System.out.printf(Locale.getDefault(), "The area of the shapes %-50s with index :%d is: %6.2f%n", shapes[i], i, shapes[i].area());
//        }
//
//        // if Shape is abstract class, then you can't create an object of it directly using new operator
////         Shape s = new Shape();
////         s.area();
//
//        System.out.println("------------------------");
//        Shape s = new Rectangle();      // this will create an object of shape then an object of Rectangle
//        System.out.println("s.area() = " + s.area());         // Rectangle:area()
//
//
//        // anonymous inner type
//
//        Shape s1 = new Shape() {
//            @Override
//            public double area() {
//                return 5;
//            }
//        };
//        System.out.println("s1.area() = " + s1.area());           // 5 Anonymous:method()


        Rectangle rectangle = new Rectangle();
        rectangle.SomeFunction(rectangle);
        System.out.println(rectangle.area());


    }

}
