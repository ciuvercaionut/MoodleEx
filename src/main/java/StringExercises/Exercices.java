package StringExercises;

import java.util.Scanner;

public class Exercices {

    //7
    static void printDetailsofSB(StringBuffer stringBuffer){
        System.out.println("Value of stringBuffer: " + stringBuffer.toString());
        System.out.println("Length of stringBuffer is: " + stringBuffer.length());
        System.out.println("Capacity of stringBuffer is: " + stringBuffer.capacity());
    }

    //8 Write a Java program to get the character at the given index within the String

    void getCharact(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input your string : ");
        String string = scanner.nextLine();

        System.out.println("input the index you want to delete from : ");
        int index = scanner.nextInt();
        System.out.println(string.charAt(index));
    }


}
