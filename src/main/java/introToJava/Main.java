package introToJava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IntroEx ex = new IntroEx();
        // ****************************** Intro to Java*****************
        //1.
        System.out.println("Exercise 1.1***");
        ex.printHelloandName("John");
        //2.
        System.out.println("Exercise 2.1***");
        System.out.println(ex.computeSum(25, 50000));
        //3.
        System.out.println("Exercise 3.1***");
        System.out.println(ex.divide(15, 2));
        //4.
        System.out.println("Exercise 4.1***");
        System.out.println(Arrays.toString(ex.computeOperations()));


        

        // ****************************** Intro to java(2)*****************
        //1. - see intro to java ex 1;
        //2.
        System.out.println("Exercise 2.2***");
        // At symbol choose one of the following : '-',
        //                                        '+',
        //                                         '*',
        //                                         '/'
        ex.compute('+', 15, 6);

        //3.
        System.out.println("Exercise 3.2***");
        System.out.println("          J      a     v       v  a" + "\n"
                + "          J     a a     v     v  a a" + "\n" +
                "      J   J    aaaaa     V   V  aaaaa" + "\n" +
                "       JJ     a     a      V   a     a" + "\n" +
                "        _ _ _ _     _");

        //4.
        System.out.println("Exercise 4.2***");
        System.out.println(ex.getAverage(1, 2, 3));

        //6.
        System.out.println("Exercise 6.2***");
        System.out.println(ex.caluclateModulo(15, 2));
    }
}
