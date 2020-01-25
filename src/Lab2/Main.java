package Lab2;

public class Main {


    public static void main(String[] args) {
        //Exercitiu 2

        System.out.println("Exercitiu 2:" );

        int x = sum(15, 89);
        System.out.println(x);

        int y=dif(100, 20);
        System.out.println(y);

        float z=divide(3.5f, 4);
        System.out.println(z);

        int w=multipl(6, 5);
        System.out.println(w);

        //Exercitiu 3
        System.out.println("Exercitiu 3:" );
        printJava();

        //Exercitiu 4
        System.out.println("Exercitiu 4:" );
        System.out.println(calcul(2,3,4));

        //exercitiu 5
        printRobote();

        //Exercitiu 6
        calculR(83, 8, 10 );


        //Exercitiu7
        System.out.println("Exercitiu 7: ");
        System.out.println(gradeC(78));

//Exercitiu 8
        distINCH(100);

        //Exercitiu 9:
        speed(128555, 1, 45, 30);


    }



    //Exercitiu 2
    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;

    }
    public static int dif(int first, int second){
        int dif = first - second;
        return dif;
    }
    public static float divide(float first, float second){
        float divide= first/second;
        return divide;
    }
    public static int multipl(int first, int second){
        int multipl = first * second;
        return multipl;
    }
    //Exercitiu 3
    public static void printJava(){
        System.out.println("   J     a       v     v   a");
        System.out.println("   J    a  a      v   v   a  a");
        System.out.println("J  J   aaaaaa      v v   aaaaaa");
        System.out.println(" JJ   a      a      v   a      a");

    }
    //Exercitiu 4
    public static int calcul(int a, int b, int c) {
        int  k= a + b + c;
        int  calcul = k / 3;
        return calcul;
    }

    //Exercitiu 6
    public static void calculR(int Q, int P, int N) {
        System.out.println(" Exercitiu 6: " + (Q - (P * N)));

    }
//Exercitiu 5
    public static void printRobote() {
            System.out.println("Exercitiu 5: ");
            System.out.println("  +\"\"\"\"\"+  ");
            System.out.println(" [| o o |] ");
            System.out.println("  |  ^  |   ");
            System.out.println("  | '-' |   ");
            System.out.println("  +-----+   ");
    }


    //Exercitiu 7
    public static float gradeC( float F){

        float gradeC = (F-32) * 5 / 9;
        return gradeC;
    }
    //Exercitiu 8
    public static void distINCH( int Inch) {
        System.out.println("Exercitiu 8: \n m= " +  Inch /39.370 );
    }
    //Exercitiu 9
    public static void speed(float dist, int H, int MN, int S){
        int timeSEC= S + (60*MN) + (3600*H);
        System.out.println("Exercitiu 9:  \nSpeed in m/s: " + dist/timeSEC );
        System.out.println("Speed in km/h: " + (dist/1000)/(timeSEC/3600));
        System.out.println("Speed in mile/h" + (dist/1609)/(timeSEC/3600));

    }



     













}

