public class zadacha3 {
// Создать квадратный двумерный целочисленный массив 
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: 
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// Также заполнить элементы побочной диагонали
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillDiagonal(arr);
        printDiagonal(arr);
    }
    private static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr.length - 1; j < arr.length; j++, k--) {
                if (i == j || i == k) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void printDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\b\b]");
            System.out.println();
        }
        System.out.println();
    }
}
