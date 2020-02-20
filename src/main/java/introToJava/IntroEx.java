package introToJava;

public class IntroEx {

    //1.   Printati "Hello" in consola, iar pe rand nou, printati numele vostru.

    public void printHelloandName(String name){
        System.out.println("Hello ");
        System.out.println(name);
    }

    //2. Printati rezultatul sumei a doua numere(orice numere)
     double computeSum(double a, double b){
        return a + b;
    }

    //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula
     double divide(double a, double b){
        return a / b;
    }

    //4. Printati rezultatul urmatoarelor operatiuni:

     double[] computeOperations(){
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + (-3) * 5 / 8;
        int d = 5 + 15/ 3 * 2 - 8 % 3;
        double [] results = new double[]{a, b, c, d};

        return  results;
    }


    // ****************************** Intro to java(2)*****************

    //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

     void compute(char symbol, double a, double b){
        switch (symbol){
            case  '-' :
                System.out.println(a - b);
                break;
            case '+' :
                System.out.println(a + b);
                break;
            case '*' :
                System.out.println(a * b);
                break;
            case '/' :
                System.out.println(a / b);
                break;
        }
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
     double getAverage(double a, double b, double c){
        return (a + b + c) / 3;
    }

    //6..Scrieti o metoda java, care sa returneze restul impartirii a doua numere
     double caluclateModulo(double a, double b){
        return a % b;
    }
}
