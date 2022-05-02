public class OddIndices {
    //  Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    public int[] oddIndices(int[] arr) {
        if (arr.length == 0) {
            return arr;
        } else {
            int ind = 0;
            int[] oddArr = new int[arr.length / 2];
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    oddArr[ind]= arr[i] ;
                    ind++;
                }
            }
            return oddArr;
        }

    }
}
