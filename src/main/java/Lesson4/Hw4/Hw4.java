package Lesson4.Hw4;

public class Hw4 {

//0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
//1) применить несколько арифметических операций над int и double в одном выражении
//2) применить несколько логических операций ( < , >, >=, <= )
//3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
// (какие максимальные и минимальные значения есть, как их получить) и переполнение
//4) получить переполнение при арифметической операции

    public static int a = 30;
    public static int b = 20;
    public static double c = 3.14;

    public static void main(String[] args) {

        System.out.println("\n0) Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        int addition = a + b;
        System.out.println(addition);

        int subtraction = a - b;
        System.out.println(subtraction);

        int multiplication = a * b;
        System.out.println(multiplication);

        int division = a / b;
        System.out.println(division);

        System.out.println("\n1) Применить несколько арифметических операций над int и double в одном выражении");
        double floating = a + c * division / multiplication;
        System.out.println(floating);

        System.out.println("\n2) применить несколько логических операций ( < , >, >=, <= )");

        if (b < a) {
            System.out.print("B меньше А, ");
            if (b > 15) {
                System.out.println("но больше 15");
            }else{
                System.out.println("А равно Б");

                }

            if (a >= b && a <= b) {
                System.out.println("А больше, но не равно б");
            }else{
                System.out.println("Б больше, но не равно а");

            }

            }

        }
    }
