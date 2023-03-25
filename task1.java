public class task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2020)); // Високосный, т.е. true

        printArray(createArray(5, 5));

        //int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        //int x = array[2][3];
    }

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int res = a + b;
        if (res >= 10 && res <= 20){
            return true;
        } else {
        return false;
        }
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) {
            return true;
        } else {
        return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String s = "abcd";
        String strNew = s.repeat(repeat);
        System.out.println(strNew);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
        return false;
        }
    }

    // по массиву 2 метода
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    
}