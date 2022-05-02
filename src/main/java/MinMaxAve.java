public class MinMaxAve {
    public int[] minMaxAve(int[] arr, int a, int b) {
        //Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
        // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.
        if(a==b || a < 0 || b < 0 || a> arr.length || b > arr.length) {
            return new int[] {};
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ave = 0;
        for (int i = a; i <= b; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int j = a; j <= b; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        for (int k = a; k <= b; k++) {
            sum += arr[k];
            ave = sum / (b - a + 1);


        }


        int[] minMaxAve = new int[]{min, max, ave};
        return minMaxAve;
    }
}
