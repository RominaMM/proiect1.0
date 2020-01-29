package lab4;

public class LogicalOP {

    public String textComparation(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public String exercitiul5(String text, int x) {

        if (text.equals("FastTrackIT") && x <= 3) {
            return (text + "  " + x);
        } else if (text.equals("FastTrackIT") && x >= 4) {
            return (x + "   " + text);
        } else {
            return null;
        }
    }

    public String exercitiul6(int x) {
        if (x >= 8 && x == 6) {
            return "The amount of snow this winter was(cm):" + x;
        } else {
            return "The forecast snow is(cm):" + x;
        }
    }

    public String exercitiul7(int x) {
        if (x > 3 && x != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    public boolean isNumberEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int x) {
        if (x > 18) {
            return true;
        } else {
            return false;
        }
    }

    public int exercitiul11(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }


    }


    //// LAB 4


    //Using For Loops write a program called SumAndAverage to produce the sum of 1, 2, 3 ...,to 100.
    //Also compute and display the average.
    public void printToHundred(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
            System.out.println("Numarul este: " + i);

        }
        System.out.println("Media este:" + sum / count);

    }

    //(x % 2 == 0)
///faceti o afisare de numere pare de la 0 la -100
    public void printEvenNumbers(int number) {
        for (int i = number; i >= -100; i--) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }

    }

    public float getAverage(int first, int second) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        while (first <= second) {
            sum += first;
            first++;
            counter++;

        }

        average = sum / counter;
        return average;
    }


    ///Tema Lab4

    //Exercitiu 1
    public void printToHundredEx1(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println("Exercitiul 1: " + i);

        }

    }

    //Exercitiu 2
    public void printToHundredEx2(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println("Exercitiul 2: " + i);
        }
    }

    public void printEx3(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println("Exercitiu 3: " + i);
        }
    }

    public void printEx4(int x, int y) {
        for (int i = x; i < y; i++) {
            System.out.println("Exercitiul 4: " + i );
        }
        for (int i = y; i < x; i++){
        System.out.println("Exercitiul 4: " + i );
        }


        }

    public void printEx5(int x) {
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Exercitiu 4: " + i);

            }
        }

    }

    public void printEx6( int y) {
        for ( int i=y; i < 100; i ++){
            if ( i % 2 != 0) {
                System.out.println("Exercitiu 6: " + i);
            }
        }
    }


    public int exercitiu7(int x) {
        int suma = 0;
        for (int i = x; i < 100; i++) {
            suma = suma + i;
        }
        return suma;

        }

    public float exercitiu8(int x, int y) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        while (x <= y) {
            sum += x;
            x++;
            counter++;

        }

        average = sum / counter;
        return average;
    }

    public void exercitiu9() {
        for ( int i = 7; i>0; i--){

            for (int j = 0; j < i; j++){
                System.out.println("*" );
            }

    }
    }

 /// TEMA LAB4 : WHILE
 public void exWhile1(int x) {

     do {
         System.out.println("Ex 1: " + x);
         x++;
     }
     while (x <= 100);
 }

    public void exWhile2(int x) {
        do {
            System.out.println("Ex 2: " + x);
            x--;
        }
        while (x >= -100);
    }

    public void exWhile3(int x, int y) {
        do {
            System.out.println("Ex 3: " + x);
            x++;
        }
        while (x < y);
        do {
            System.out.println("Ex 3: " + y);
            y++;
        }
        while (y < x);
    }

    public void exWhile4(int x, int y) {
        while (x < y) {
            System.out.println("Ex 4: " + x);
            x++;
        }

        while (y <= x) {
            System.out.println("Ex 4: " + y + " ");
            y++;
        }
    }

    public void exWhile5() {
        int i = 0;
        do {

            i++;
            if (i % 2 == 0) {
                System.out.println("Ex 5: " + i + " ");
            }
        }
        while (i <= 100);
    }

    public void exWhile6() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println("Ex 6: " + i + " ");
            }
        }
        while (i <= 100);
    }

    public void exWhile7() {
        int x = 111;
        int sum = 0;
        int count = 0;
        int intCount = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        intCount = sum / count;

        System.out.println("Ex 7: " + sum + " ");
        System.out.println("\n" + intCount + " ");

    }
    public float exWhile8(int x, int y){
        int aux;
        float sum = 0;
        int count = 0;
        if(y<x) {
            aux = y;
            y=x;
            x=aux;
        }

        while(x<=y){
            if(x % 7 == 0){
                sum = sum + x;
                count++;
            }
            x++;
        }
        return sum / count;
    }

    public void exWhile9() {
        int x = 1;
        int y = 0;
        int z = 1;
        while (x <= 20) {
            System.out.println("Ex 9: " + y + " ");
            int sum = y + z;
            y = z;
            z = sum;
            x++;
        }
    }

    public void exWhile10() {
        int n = 1;
        do {


            if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
                System.out.println("Ex 10: \n " );
                System.out.println(" " + "CozaLozaWoza"  );
            }

            else if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(" " + "CozaLoza" );
            }

            else if (n % 5 == 0 && n % 7 == 0) {
                System.out.println(" " + "wozaLoza" );
            }

            else if (n % 3 == 0 && n % 7 == 0) {
                System.out.println(" " + "cozaWoza" );
            }

            else if (n % 3 == 0) {
                System.out.println(" " + "coza"  );
            }

            else if (n % 5 == 0) {
                System.out.println(" " + "loza" );
            }

            else if (n % 7 == 0) {
                System.out.println(" " + "woza" );
            } else {
                System.out.println(" " + n );
            }
            n++;
        } while (n <= 110);
    }








}


















