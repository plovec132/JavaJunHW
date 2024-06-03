public class TwoHW {

    public static void main() {
        int[] array = {3, 2, 3};
        int[][] twoArray = {
                {13, 22, 33},
                {31, 21, 31},
                {3, 2, 0}
        };
//        System.out.println(findElementInArray(1, array));

        int[] twoTask = findMinIndexInTwoArray(twoArray);

        int n = 46; // Номер элемента ряда Фибоначчи
        int result = fibonacci(n);
        System.out.println("Элемент номер " + n + " в ряде Фибоначчи: " + result);


    }

    //    1. Написать программу для проверки нахождения заданого элемента в массиве.
    //    Программа на вход принимает целое число и непустой, неотсортированный массив уникальных целых чисел
    //    и возвращает логическое значение (true/false).
    //    Где true - говорит о том, что число находится в массиве, а
    //    false - говорит о том, что число отсутствует в массиве.
    public static boolean findElementInArray(int num, int[] array) {
        if (array.length == 0) return false;

        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) return true;
        }
        return false;

//        for (int oneArray : array){
//            if (oneArray == num) return true;
//        }
    }


    //    2. Написать программу для нахождения индекса минимального элемента в массиве.
//    Программа на вход принимает непустой, неотсортированный массив уникальных целых чисел
//    и возвращает индекс минимального числа в массиве.
    public static int findMinIndexInArray(int[] array) {
        int result = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) result = i;
        }

        return result;
    }


    //    3. Написать программу для нахождения индексов минимального элемента в двумерном массиве.
//    Программа на вход принимает непустой, неотсортированный двумерный массив уникальных целых чисел и возвращает массив индексов минимального числа в массиве.
//    Длина возвращаемого массива всегда будет равна двум.
    public static int[] findMinIndexInTwoArray(int[][] twoArray) {
        int[] result = {0, 0};
        int min = twoArray[0][0];

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++)
                if (min > twoArray[i][j]) {
                    result[0] = i;
                    result[1] = j;
                }
        }
        return result;

    }


//    4. Реализовать программу для расчета положительного n-го ряда числа Фибоначчи с помощью цикла.
//    Программа на вход принимает номер элемента ряда числа Фибоначчи и возвращает посчитанный элемент числа ряда Фибоначчи,
//    которое находится под заданным номером. Предполагается, что ряд Фибоначчи начинается с единицы, а не с нуля.

    // Метод для вычисления n-го элемента ряда Фибоначчи
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        // Инициализация первых двух элементов ряда
        int a = 1;
        int b = 1;
        int fib = 1;

        // Вычисление n-го элемента ряда
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }


}

