package com.company;


public class Zoo {

    public abstract static class Animal{
        abstract String TinColor();
        void Thinkable(){

        }

    }

    public static class Mammal extends Animal {

        @Override
        String TinColor() {
            return "Colorful";
        }

        @Override
        void Thinkable() {
            super.Thinkable();
        }
    }

    public static class Birds extends Animal{
        @Override
        String TinColor() {
            return "Colorful";
        }

    }

    public static class Insects extends Animal{
        @Override
        String TinColor() {
            return "Black and White";
        }
    }

    public static class Cat extends Mammal{

    }

    public static class Falcon extends Birds{

    }

    public static class Bat extends Mammal implements flyable{

        @Override
        public void flyWay() {
            System.out.println("with wings");
        }
    }

    public static class Penguin extends Birds implements nonFlyable{

        @Override
        public void liveWay() {
            System.out.println("With Legs");
        }
    }

    public static class Bee extends Insects{

    }

    interface flyable{
        // by default public and abstract
        void flyWay();
    }

    interface nonFlyable{
        void liveWay();
    }

}
