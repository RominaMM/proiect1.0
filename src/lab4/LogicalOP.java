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








}


















