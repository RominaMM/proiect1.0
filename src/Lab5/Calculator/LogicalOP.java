package Lab5.Calculator;

import org.jetbrains.annotations.NotNull;

public class LogicalOP {

// Ex. 1  Creati o metoda care sa returneze al doilea cel mai mic numar dintr-un array.
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


}