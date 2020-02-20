package Lab5.Calculator;

import org.jetbrains.annotations.NotNull;

public class LogicalOP {

// Ex. 1  Creati o metoda care sa returneze
// al doilea cel mai mic numar dintr-un array.

    public int secondSmallestnumb(int array[]) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        //int[] array = { 8, -2, 6, 19};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];  //-2
            }
            if (array[i] > smallest && array[i] < secondSmallest) {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;

    }

    // 2. Creati o metoda care sa insereze un element pe o pozitie
    // specifica intr-un array.

    public int[] insertElement(int array[], int pos, int num) {

        int[] temp = new int[array.length + 1];
        //pos= 1; num= 30

        for (int i = 0; i < pos; i++) {
            temp[i] = array[i];
        }
        temp[pos] = num;

        for (int i = pos + 1; i < temp.length; i++) {
            temp[i] = array[i - 1];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        return temp;

    }


    // 3. Creati o metoda care sa gaseasca cel mai mare si cel
    // mai mic numar dintr-un array.

    public void findNumber(int[] array2) {
        int minim = array2[0];
        int maxim = array2[0];
        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < minim) {
                minim = array2[i];
                indexOfMin = i;
            }

            if (array2[i] > maxim) {
                maxim = array2[i];
                indexOfMax = i;
            }
        }


        System.out.println(" Minim este: " + minim);
        System.out.println(" Maxim este: " + maxim);
        System.out.println(" Index of Min: " + indexOfMin);
        System.out.println(" Index of Max: " + indexOfMax);

    }

    // 4. Creati o metoda care sa inverseze valorile unui array de int-uri.

    public void reverseNumbers(int[] array3) {
        for (int i = 0; i < array3.length/2 ; i++) {
            int temp = array3[i];

                array3[i] = array3[array3.length - 1 - i];
                array3[array3.length - 1 - i] = temp;
            }
            System.out.println(array3);
        }
    }



