package hwJava;

public class Hw4 {

    public static int a = 30;
    public static int b = 20;
    public static double c = 3.14;
    public static int age = 17;

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

        if (age >= 0 && age <= 12) {
            System.out.print("\nРебенок");
        } else if (age >= 13 && age <= 17) {
            System.out.println("\nПодросток");
        } else if (age >= 18 && age <= 64) {
            System.out.println("\nВзрослый");
        } else if (age >= 65) {
            System.out.println("\nПенсионер");
        } else {
            System.out.println("\nНекоректный возраст");
        }

        System.out.println("3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой\n" +
                "(какие максимальные и минимальные значения есть, как их получить) и переполнение");

        // Максимально и минимальное значение для чисел с плавающей точкой
        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);
        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble);

        float maxFloat = Float.MAX_VALUE;
        System.out.println(maxFloat);
        float minFloat = Float.MIN_VALUE;
        System.out.println(minFloat);

        // Переполнение вещественных чисел
        double maxDouble1 = Double.MAX_VALUE;
        double overDouble1 = maxDouble1 * 2;
        System.out.println(overDouble1);

        int maxInt1 = Integer.MAX_VALUE;
        int overInt1 = maxInt1 * 2;
        System.out.println(overInt1);


        System.out.println("\n4)получить переполнение при арифметической операции");

        // Арифмитическое переполнение
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt++;
        System.out.println(maxInt);

        long maxLong = Long.MAX_VALUE;
        long overflowLong = maxLong++;
        System.out.println(maxLong);

        short maxShort = Short.MAX_VALUE;
        short overflowShort = maxShort++;
        System.out.println(maxShort);

        byte maxByte = Byte.MAX_VALUE;
        byte overflowByte = maxByte++;
        System.out.println(maxByte);


    }
}


