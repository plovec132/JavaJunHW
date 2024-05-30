import java.util.Scanner;

public class Main {
    // Массивы римских чисел и их соответствующих значений

    private static final int[] valuesRoman = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] symbolsRoman = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public static void main(String[] args) {
//        compareNumbers(5, 8);
//        evenCheck(666);
//        howTimeZone(1);
//        howTimeZone(7);
//        howTimeZone(13);
//        howTimeZone(18);
//        calculator();
//        convertToRomanNumeralSystem(48);
        System.out.println(isSimpleNumber(283));

    }

    //    Сравнение чисел
    public static void compareNumbers(int number1, int number2) {
        //        Сравнение чисел: Напишите программу, которая сравнивает два числа и определяет, равны ли они или одно больше другого.
        //        Входные данные 5 8    //        Результат Первое число больше второго.

        if (number1 > number2) {
            System.out.println("Первое число больше второго.");
        } else if (number1 < number2) {
            System.out.println("Первое число меньше второго.");
        } else {
            System.out.println("Оба числа равны.");
        }
    }


    //    Проверка на четность
    public static void evenCheck(int number1) {
//    Проверка на четность: Напишите программу, которая определяет, является ли введенное число четным или нечетным.
//    Входные данные 12     //    Результат Число четное.

        String result = (number1 % 2 == 0) ? "Число четное" : "Число нечетное";
        System.out.println(result);
    }


    //    Определение времени суток
    public static void howTimeZone(int number1) {
//        Определение времени суток: Пользователь вводит текущее время (часы), программа должна определить, утро, день, вечер или ночь.
//        Входные данные 14     //        Результат День

        if (number1 >= 18) System.out.println("Вечер");
        else if (number1 >= 12) System.out.println("День");
        else if (number1 >= 6) System.out.println("Утро");
        else System.out.println("Ночь");
    }

    //    Калькулятор
    private static void calculator() {
//    Напишите программу-калькулятор, которая выполняет арифметические операции
//    (сложение, вычитание, умножение, деление) над двумя числами
//    в зависимости от выбора пользователя.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число:");
        Double number1 = sc.nextDouble();

        System.out.print("Введите второе число:");
        Double number2 = sc.nextDouble();

        System.out.print("Введите оерацию + - * /:");
        String operation = sc.next();

        switch (operation) {
            case "+" -> System.out.println(number1 + number2);
            case "-" -> System.out.println(number1 - number2);
            case "/" -> System.out.println(number1 / number2);
            case "*" -> System.out.println(number1 * number2);
            default -> System.out.println("Где-то ошибка");
        }

    }


    //    Перевод числа в римскую систему
    private static void convertToRomanNumeralSystem(int number) {
//          Перевод числа в римскую систему: Напишите программу, которая преобразует введенное число в римскую систему счисления.
//          Входные данные 47     //        Результат Римское представление: XLVII

        StringBuilder roman = new StringBuilder();

        // Проходим по каждому значению и символу
        for (int i = 0; i < valuesRoman.length; i++) {
            // Пока текущий number больше или равен значению
            while (number >= valuesRoman[i]) {
                // Добавляем соответствующий римский символ
                roman.append(symbolsRoman[i]);
                // Уменьшаем number на это значение
                number -= valuesRoman[i];
            }
        }

        System.out.println(roman);
    }


    //    Проверка на простое число
    public static String isSimpleNumber(int num) {
//    Проверка на простое число: Напишите программу, которая определяет, является ли заданное число простым.
//    Входные данные 17         //    Результат Число является простым.

        int absNumber = Math.abs(num);
        // Простые числа должны быть больше 1
        if (absNumber <= 1) {
            return "Число " + num + " не является простым.";
        }

        // Проверяем делимость числа на любые значения от 2 до квадратного корня из num
        for (int i = 2; i <= Math.sqrt(absNumber); i++) {
            if (num % i == 0) {
                return "Число " + num + " не является простым."; // Если делится без остатка, значит число не простое
            }
        }
        return "Число " + num + " является простым."; // Если ни одно из значений не подошло, число простое
    }
}