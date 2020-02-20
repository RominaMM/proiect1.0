package Lab6;

import java.util.List;

public class LogicalOP {

    // Ex 1. Scrieti o metoda Java, care sa primeasca doi parametrii:
    //  un parametru sa fie o lista de numere,
    //  si celalalt un numar (real sau intreg). Metoda sa adauge
    //  numarul primit ca si parametru la final de lista.

    public void addValue(List<Integer> list, int number) {
        list.add(number);
    }

    // Ex 2. Scrieti o metoda Java, care sa primeasca parametru o Lista,
    //  si sa afiseze,pe rand, toate valorile din lista,
    //  fiecare pe rand nou

     public void printList(List<String> myList) {
         for (int i = 0; i < myList.size(); i++) {
             System.out.println(myList.get(i));
         }
   // Metoda varianta 2
//         for(String element: myList){
         //        System.out.println(element);
 //    }

    }

  // Ex 3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru
    // de tip Lista, iar celalalt un numar intreg. Sa se parcurga lista
  //  si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
  //  pornind de la numarul intreg primit ca si parametru.


    public void printEx3(List<String> myList, int number ) {
        for (int i = number; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

   // Ex 5. Scrieti o metoda Java, care sa primeasca trei parametrii:
   // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
   // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul
   // de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void printEx5(List<String> list, int pos , String text) {
        list.add(pos , text);
        System.out.println();
    }



}
