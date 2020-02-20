package StringExercises;

public class Main {

    public static void main(String[] args) {

        Exercices ex = new Exercices();

        //1.Strings-Create an empty StringBuffer
        System.out.println("Exercise 1 from Strings : ");
        StringBuffer sb = new StringBuffer();
        System.out.println("String buffer is emtpy");

        //2.Strings-Append “blessings”
        System.out.println("Exercise 2 from Strings : ");
        sb.append("blessings");
        System.out.println(sb.toString());

        //3.Strings-Insert"Good " in the beggining
        System.out.println("Exercise 3 from Strings : ");
        sb.insert(0,"Good ");
        System.out.println(sb.toString());

        //4.Strings - Delete the first "o"\
        System.out.println("Exercise 4 from Strings : ");
        sb.deleteCharAt(1);
        System.out.println(sb.toString());

        //5.Strings - Append " be with you"
        System.out.println("Exercise 5 from Strings : ");
        sb.append(" be with you");
        System.out.println(sb.toString());

        //6.Strings - Set length to 3
        System.out.println("Exercise 6 from Strings : ");
        sb.setLength(3);
        System.out.println(sb.toString());

        //7.Strings - Create a print Details method that takes a StringBuilder parameter and prints the content,length and capacity of SB on different lines
        System.out.println("Exercise 7 from Strings : ****");

        ex.printDetailsofSB(sb);

        //8.Strings - Write a Java program to get the character at the given index within the String

        ex.getCharact();
    }


}
