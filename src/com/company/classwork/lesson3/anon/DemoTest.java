package com.company.classwork.lesson3.anon;

public class DemoTest {

    private static Demo demo;
    private static DemoChild demoChild;
    private static Demo demoChild2 = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Show anonymous");
        }
    };


    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();

        System.out.println("_______________");

        DemoChild demoChild = new DemoChild();
        demoChild.show();

        System.out.println("_______________");

        demoChild2.show();

        System.out.println("_______________");

        final int showCount = 0;
        Demo demoChild3 = new Demo() {
            @Override
            public void show() {


                System.out.println("DemoChild3");
            }
        };

        demoChild3.show();

    }

}
